public class SwitchsJ {
    public static void main(String[] args) {
        String x = "Funday";

        switch (x) {
            case "Monday":
                System.out.println("6 am");
                break;
            case "Tuesday":
                System.out.println("7 am");
                break;   
            case "Wednesday":
                System.out.println("8 am");
                break;     
            case "Thursday":
                System.out.println("4 am");
                break;
            case "Friday":
                System.out.println("5 am");
                break;
            case "Saturday":
                System.out.println("6 am");
                break;
            case "Sunday":
                System.out.println("8 am");
                break;     
            default:
                System.out.println("Invalid Number.");
        }
    }
}
