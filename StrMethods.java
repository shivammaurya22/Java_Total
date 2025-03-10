public class StrMethods {
    public static void main(String[] args) {
        String name = "Shivam Maurya";
        String cars = "BMW,Lamborgini,Mustang,Toyota";
        String[] names = cars.split(",");
      // int result = name.length();
      //  boolean result = name.equals("shivam");
     // boolean result = name.equalsIgnoreCase("shivam");
       // String result = name.trim();
       //char result = name.charAt(0);
     //  String result = name.toLowerCase();
     //  String result = name.toUpperCase();
      //  int result = name.compareTo("shivam"); // compare lexicographically matched -- 0 otherwise -1 or other 
     // int result = name.compareToIgnoreCase("shivam");
     //  boolean result = name.contains("vam");
     //  boolean result = name.startsWith("Sh");
     //   boolean result = name.endsWith("am");
    // int result = name.indexOf('v');
   // int result = name.lastIndexOf('v');
   // replace,replaceAll,split,join,valueOf,toCharArray,concat,substring
        String result = name.replace("Maurya","Shivam");
        System.out.println(result);
        for(String exec : names){
          System.out.println(exec);
        }
    }

}
