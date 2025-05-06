import java.util.Scanner;
import java.util.InputMismatchException;
public class exception
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter 2 numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b );
        
        }
        catch(InputMismatchException e) //for if user input a string val instead of int or any other datatype.
        {
            System.err.println(("MISMATCH"));
        }
        catch(ArithmeticException e)
        {
            System.out.println("NOT POSSIBLE FOOL");
        }
        catch(Exception e)
        {
            System.out.println("SOmething is wrong");
        }

        finally
        {
            sc.close();
            System.out.println("This part of the code always executes");
        }
    }
}
