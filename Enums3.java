public class Enums3 {
    enum Status {
        Running, Failed, Pending, Success
    }
    public static void main(String[] args) {
        Status st = Status.Pending;

        if(st == Status.Running){
            System.out.println("Running your work.");
        }else if(st == Status.Failed){
            System.out.println("Failed your Status");
        }else if (st == Status.Pending) {
            System.out.println("Status will be Pending.");
        }else{
            System.out.println("Status will be Success.");
        }
    }
}
