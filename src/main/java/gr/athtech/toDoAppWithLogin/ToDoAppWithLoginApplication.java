package gr.athtech.toDoAppWithLogin;
// This is a comment
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoAppWithLoginApplication {

    private static boolean firstTime = true;

    public static void main(String[] args) {
        SpringApplication.run(ToDoAppWithLoginApplication.class, args);
    }

    public static boolean isFirstTime() {
        return firstTime;
    }

    public static void setFirstTime(boolean firstTime) {
        ToDoAppWithLoginApplication.firstTime = firstTime;
    }
}
