public class SwitchNew {
    public static void main(String[] args){
        // main method
        String x = "Funday";

        switch (x) {
            case "Monday" -> System.out.println("6 am");
            case "Tuesday" ->
                System.out.println("7 am");
            case "Wednesday"->
                System.out.println("8 am");
            case "Thursday"->
                System.out.println("4 am");
            case "Friday"->
                System.out.println("5 am");
            case "Saturday"->
                System.out.println("6 am");
            case "Sunday"->
                System.out.println("8 am");   
            default ->
                System.out.println("Invalid Number.");
        }
    }
}