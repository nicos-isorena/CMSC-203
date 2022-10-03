import java.io.IOException;
import java.util.Scanner;



public class CMSC203_ACTIVITY3_ISORENA {
    
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner (System.in);
        boolean done = false;

        do
        {
            System.out.print("\nNO. of Test Cases: ");

            int testcases = scan.nextInt();
            System.out.println("Uber & Grab");


            if (1 <= testcases && testcases <= 10)
            {
                String inputs[] = new String [testcases];
                for ( int i = 0; i < testcases; i++)
                {
                  scan = new Scanner(System.in);

                  inputs[i] = scan.nextLine();

                
                }

                System.out.println();
                System.out.println("\nResult:");
                System.lineSeparator();

                for (String input : inputs)
                
                System.out.println(processInput(input));

                done = true;
            }
                else
                System.out.println ("\nInputs must be 1-10 only");

        }

        while (!done);

        scan.close();
        
    }


    private static String processInput(String input)
    {

        String [] inputs = input.split("\\s+");

        if ( inputs.length !=2)

        return "INVALID INPUT";
        
        try
        {
            int UBER = Integer.parseInt(inputs[0]);
            int GRAB = Integer.parseInt(inputs[1]);

            if (UBER < GRAB)
            return "FIRST";

            else if (UBER > GRAB )
            return ("SECOND");

            else 
            return "ANY";
        }

            catch (Exception e)
            {
                return "INVALID INPUT";
            }

     }
        }

        
    





            

         


    

