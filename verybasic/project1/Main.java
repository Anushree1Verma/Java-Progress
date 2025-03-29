import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String questions[]= {"What was the former name of Java?",
                            "Who is the father of Java?",
                            "Which is not supported by Java?",
                            "why is java robust?"};
        String[][] options= {{"1. Nescafe'","2.Oak","3.DeoDar","4.Deciduous"},
                            {"1.James Rayn","2.Rayn Gosling","3.James Gosling","4.James Rayn"},
                            {"1.Encapsulation","2.Abstraction","3.Predefined datatypes as objects","4.USer defined types as objects"},
                            {"1.it is simple","2.it is case sensitive","3.It has strong memory managment","4.It is based on OOPs concepts"}
                            };

        int[] answers={2,3,3,3};
        int score=0;
        int guess;

        Scanner scanner=new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("WELCOME");
        System.out.println("Test Your JAVA knowledge");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i]);

            for(String option:options[i])
            {
                System.out.println(option);
            }
            System.out.print("enter your guess:");
            guess=scanner.nextInt();
            if(guess==answers[i])
            {
                System.out.println("~~~~~~~~~~~");
                System.out.println("CORRRECCTT");
                System.out.println("~~~~~~~~~~~");
                score+=1;
            }
            else
            {
                System.out.println("~~~~~~~~~~~");
                System.out.println("WRROOONGGG");
                System.out.println("The correct answer is: "+answers[i]);

                System.out.println("~~~~~~~~~~~");
            }
        }
        System.out.println("Your Final score is: "+score+" out of "+questions.length);
        scanner.close();
    }
}
