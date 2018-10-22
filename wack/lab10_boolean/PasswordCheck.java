package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -
import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck {

    private String password;

    public PasswordCheck() {
        password = "mchammergohammer";
    }

    public void check() {
        String guess = "";
        Scanner keyboard = new Scanner(System.in);
        while (!guess.equals(this.password)) {
            System.out.print("Enter the password :: ");
            guess = keyboard.next();
            if (guess.equals(this.password)) {
                System.out.println("VAILD");
            } else {
                System.out.println("INVALID");
            }
        }

    }
}
