public class Jarray3D {
    public static void main(String[] args) {
        // 3D array in java
        int[][][] numbers = new int[3][3][3];

        for(int i=0; i<3;i++){
            System.out.println("Layer " + (i + 1) + ":");
            for(int j=0; j<3; j++){
                for(int k=0; k<3;k++){
                    numbers[i][j][k] = (int)(Math.random()*10);
                    System.out.print(numbers[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
