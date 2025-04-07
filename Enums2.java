public class Enums2 {
    enum Colours {
        Red, Green, Yellow, Pink, Purple
    }
    public static void main(String[] args) {
        // creating a object os this enum
       // Colours col = Colours.Red;  // like this behave like a object but it's not behave like a class.
       // Colours col = Colours.Green;
      //  System.out.println(col.ordinal()); // its gives the index values like array indexing starts from 0,1,2,3,4
      Colours[] col = Colours.values(); // its returns an array of these constants.
      for(Colours i : col){
        System.out.println(i + " : "+ i.ordinal());
      }
    }
}
