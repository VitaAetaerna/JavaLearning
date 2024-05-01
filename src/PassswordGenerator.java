
import java.util.Random;
import java.util.Scanner;
public class PassswordGenerator {

    // Create Method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password length: ");
        int passwordLength = scanner.nextInt();



        String[] passwordArray = createPassword(passwordLength);
        // Output password
        System.out.print("Your Password is: ");
        // Print every value of passwordArray
        for (int i = 0; i<passwordLength; i++){
            System.out.print(passwordArray[i]);
        }

    }
    // new Static Method that takes a int Passwordlength and gives an Array back
    public static String[] createPassword(int passwordLength){
        // Create new Random object
        Random rnd = new Random();
        // CharacterSet
        String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",  "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        // Create String Array that is as long as the PW length
        String[] password = new String[passwordLength];

        // Add Value of Random Index of chars to PW array
        for(int i=0; i<passwordLength; i++){
            password[i] = chars[rnd.nextInt(chars.length)];
        }
        // Return Password to main
        return password;
    }



}
