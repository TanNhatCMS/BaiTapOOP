import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FindJavaFiles {
    private static final String OUTPUT_FILE = "javaFiles.txt";

    public static void main(String[] args) {
        File projectDir = new File(args[0]);
        findAndWriteJavaFiles(projectDir);
    }

    private static void findAndWriteJavaFiles(File directory) {
        try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
            if (directory.isDirectory()) {
                findAndWriteJavaFiles(directory, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findAndWriteJavaFiles(File directory, FileWriter writer) throws IOException {
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".java") && !name.equals("MainMethodTest.java"));
        if (files != null) {
            for (File file : files) {
                String path = file.getAbsolutePath();
                System.out.println("Found Java file: " + path);
                writer.write(path + System.lineSeparator());
            }
        }

        File[] subdirectories = directory.listFiles(File::isDirectory);
        if (subdirectories != null) {
            for (File subdirectory : subdirectories) {
                findAndWriteJavaFiles(subdirectory, writer);
            }
        }
    }
}
