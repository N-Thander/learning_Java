public class conditionalstatement
{
    public static void main(String[] args)
    {
        /*
        int x = 1;
        int y = 2;
        int z = 3;

        if (x > y && x > z)
        {
            System.out.println(x);
        }
        else if (y > z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
        */

        /*
        // Ternary Operator ?:

        int a = 4;
        int result = 0;
        
        result = n%2==0 ? 10:20;
        System.out.println(result);
        */

       // Switch Statement

       int day = 4;
       switch(day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturnday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Plz enter a vaild number");

       }
       
       


    }
}
