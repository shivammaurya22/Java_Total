import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month Name: ");
        int month = sc.nextInt();

        final int JAN = 1;
        final int FEB = 2;
        final int MAR = 3;
        final int APR = 4;
        final int MAY = 5;
        final int JUN = 6;
        final int JUL = 7;
        final int AUG = 8;
        final int SEP = 9;
        final int OCT = 10;
        final int NOV = 11;
        final int DEC = 12;

        int numDays = 0;
        switch(month){
            case JAN:case MAR:case MAY:case JUL :case AUG :case OCT :case DEC:
            numDays = 31;
            break;
            case APR:case JUN:case SEP:case NOV:
            numDays = 30;
            break;
            case FEB:
            System.out.println("Enter the Year--> ");
            int year = sc.nextInt();
            if((year % 400 == 0) || (year % 4 ==0 && !(year % 100==0))){
                numDays = 29;
            }else{
                numDays = 28;
            }
            break;
           default:
           System.out.println("Invalid Month "+ month);
           break;
        }
        if(numDays > 0){
            System.out.println("Number of days: "+ month);
        }
    }
}
