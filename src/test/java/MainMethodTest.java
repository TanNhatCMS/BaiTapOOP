import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.stream.Stream;

class MainMethodTest {

    @Test
    void testMainMethods() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String currentPackage = getClass().getPackageName();
            Path basePath = getPathToClasses(classLoader, currentPackage);
            scanAndInvokeMainMethods(basePath, classLoader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Path getPathToClasses(ClassLoader classLoader, String packageName) throws URISyntaxException {
        String packagePath = packageName.replace('.', '/');
        URL resource = classLoader.getResource(packagePath);
        return Paths.get(resource.toURI());
    }

    private void scanAndInvokeMainMethods(Path basePath, ClassLoader classLoader) throws IOException {
        try (Stream<Path> paths = Files.walk(basePath)) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".class"))
                    .forEach(p -> invokeMainMethod(p, classLoader));
        }
    }

    private void invokeMainMethod(Path classFile, ClassLoader classLoader) {
        String className = getClassName(classFile);
        try {
            Class<?> loadedClass = classLoader.loadClass(className);
            Method mainMethod = loadedClass.getMethod("main", String[].class);
            if (mainMethod != null) {
                System.out.println("Running main method for class: " + className);
                mainMethod.invoke(null, (Object) new String[]{});
            }
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Error running main method for class " + className + ": " + e.getMessage());
        }
    }

    private String getClassName(Path classFile) {
        String fileName = classFile.getFileName().toString();
        return fileName.substring(0, fileName.length() - ".class".length()).replace(File.separatorChar, '.');
    }
}
