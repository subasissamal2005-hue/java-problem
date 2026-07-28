import java.util.Scanner;

// Custom Exception for Too Old
class TooOldException extends Exception { TooOldException(String message) {
super(message);
}
}
// Custom Exception for Too Young
class TooYoungException extends Exception { TooYoungException(String message) {
super(message);
}
}

public class AgeCheck {
public static void main(String[] args) { Scanner sc = new Scanner(System.in);

System.out.print("Enter your age: "); int age = sc.nextInt();

try {
if (age > 60) {
throw new TooOldException("You are too old for this process.");
}
else if (age < 18) {
throw new TooYoungException("You are too young for this process.");
}
else {
System.out.println("You are eligible.");
}
}
catch (TooOldException e) { System.out.println(e.getMessage());
 
}
catch (TooYoungException e) { System.out.println(e.getMessage());
}
sc.close();
}
}
