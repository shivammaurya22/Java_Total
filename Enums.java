public class Enums{
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
    };

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today : "+ today);
        switch (today) {
            case MONDAY:
                System.out.println("today is Monday");
                break;
            case TUESDAY:
                System.out.println("today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is Wednesday");
                break;
            case THRUSDAY:
                System.out.println("today is Thursday");
                break;
            case FRIDAY:
                System.out.println("today is Friday");
                break;
            case SATURDAY:
                System.out.println("today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("today is Sunday");
                break;    
            default:
                System.out.println("Invalid data.");
                break;
        }
    }
}