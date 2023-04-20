import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    // prompt for input
    //System.out.print("Enter the number of integers : ");
    int Integers_num = in.nextInt();
    
    // array for storing integers
    int[] integers = new int[Integers_num];
    
    // loop to get input
    for (int i = 0; i < Integers_num; i++) {
        //System.out.print("Enter integer " + (i+1) + ": ");
        integers[i] = in.nextInt();
    }
    
    // loop to find the mode
    int mode = 0;
    int maxCount = 0;
    for (int i = 0; i < Integers_num; i++) {
        int count = 0;
        for (int j = 0; j < Integers_num; j++) {
            if (integers[j] == integers[i]) {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            mode = integers[i];
        }
    }
    
    // print the mode
    System.out.println(mode);
    
  }
}
