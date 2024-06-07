import java.io.Serializable;
import java.nio.file.PathMatcher;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        // Write your solution

        Callable<String> callable = () -> {
            Thread.sleep(100);
            return "hello";
        };

        PathMatcher matcher = path -> {
           if (2 == 2) {

           }
            return false;
        };

    }
}