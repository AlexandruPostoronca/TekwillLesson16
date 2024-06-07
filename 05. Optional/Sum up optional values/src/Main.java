import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        // write your code here
        // use  to get
        Optional<Integer>[] valuise = provider.getValues();

        long sum=0;
        for (int i = 0; i < valuise.length; i++) {
            Optional<Integer> opt = valuise[i];
            if(opt.isPresent()){
                sum+= opt.get();
            }
        }
        System.out.println(sum);
    }
}

