public class loops
{   
    public static void main(String[] args) {

        /* while loop
        int i = 1;
        while (i <= 10) {
            System.out.println("Hello");
            i++;
        }
        */

        /*
        // do while
        int  x = 1;

        do {
            System.out.println("Hello" + x);
            x ++;
            
        } while (x <= 5);
         */

        // For loops
        for (int i = 1; i <= 5; i++) {
                System.out.println("DAY "  +  i);

                for (int j = 1; j <= 9; j++)
                {
                    System.out.println(" " + (j + 8) + " - " + (j + 9));
                }
        }

    }
}
