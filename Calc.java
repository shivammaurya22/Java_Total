public class Calc {
    public static void main(String[] args) {
       SuperAdvCalc adv = new SuperAdvCalc();
       int r1 = adv.add(5,7);
       int r2 = adv.sub(5,2);
       int r3 = adv.multi(30, 6);
       int r4 = adv.division(9, 2);
       double r5 = adv.powers(2, 4);
       System.out.println(r1+" "+r2 +" "+r3+" "+r4+" "+ r5);
    }
}
