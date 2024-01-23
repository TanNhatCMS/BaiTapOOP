import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

public class MainMethodTest {

    @Test
    public void testMainMethods() {
        // Thay đổi gói và classNames tùy thuộc vào cấu trúc dự án của bạn
        String packageName = "com.example";
        String[] classNames = {"Class1", "Class2"};

        for (String className : classNames) {
            try {
                Class<?> clazz = Class.forName(packageName + "." + className);
                Method mainMethod = clazz.getMethod("main", String[].class);

                // Kiểm tra nếu phương thức main được tìm thấy
                if (mainMethod != null) {
                    System.out.println("Found main method in class: " + className);
                    // Thực hiện các bước kiểm thử khác tùy thuộc vào yêu cầu của bạn
                    // ...
                } else {
                    System.out.println("No main method found in class: " + className);
                }
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
