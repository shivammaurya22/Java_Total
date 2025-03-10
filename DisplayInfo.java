public class DisplayInfo {
    public static void main(String[] args) {
        // main method
        DisplayInfo dis = new DisplayInfo();
        String x = dis.displayInfo(24,"Shivam");
        System.out.println(x);
    }   
    public String displayInfo(String name, int age){
        return "Name: " + name + " Age: "+ age;
    } 
    public String displayInfo(int age, String name){
        return "Age: "+ age + " Name: " + name;
    } 
}
