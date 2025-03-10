public class BasicArr2D2 {
    public static void main(String[] args){
        String[][] names = new String[3][3];
        names[0][0] = "Shivam";
        names[0][1] = "Shivans";
        names[0][2] = "Shubham";
        names[1][0] = "Satyam";
        names[1][1] = "Sandhya";
        names[1][2] = "Shiv";
        names[2][0] = "Sonam";
        names[2][1] = "Shivangi";
        names[2][2] = "Shreyansi";
        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}