public class DisplayMessage {
    public static void main(String[] args) {
        // main method in this program
        DisplayMessage dis = new DisplayMessage();
        String s = dis.showMessage("Shivam");
        System.out.println(s);
    }
    public String showMessage(String name){
        return "Hello "+ name;
    }
    public String showMessage(int number){
        return "Your number is: "+ number;
    }
}
