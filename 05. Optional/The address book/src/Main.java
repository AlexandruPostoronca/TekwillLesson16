import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Optional<String> optAddress = AddressBook.getAddressByName(name);

        // write your code here
        if(optAddress.isPresent()) {
            System.out.println(name + " lives at " + optAddress.get());
        }else {
            System.out.println("Unknown");
        }
    }
}

