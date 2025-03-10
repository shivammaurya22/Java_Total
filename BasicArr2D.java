public class BasicArr2D {
    public static void main(String[] args) {
        String[][] names = {
            {"Shivam","Shubham","Julee"},
            {"Maurya","Satyam","Shivans"},
            {"Pankaj","Ayan","Rajkomal"}
        };
        for(int i = 0; i<names.length;i++){
            System.out.println();
            for(int j = 0; j < names[i].length;j++){
                System.out.print(names[i][j]+" ");
            }
        }
    }
}
