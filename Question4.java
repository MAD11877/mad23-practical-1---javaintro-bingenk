import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    //System.out.print("Enter an integer: ");
    int n = in.nextInt();
    
    for (int i = n; i > 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
  }
}
