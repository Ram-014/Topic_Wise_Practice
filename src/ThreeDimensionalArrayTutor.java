public class ThreeDimensionalArrayTutor {

    public static void main(String[] args) {
        int arr[][][] = new int[3][2][4];
        for(int i = 0;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                for (int k =0;k<arr[i][j].length;k++){
                    arr[i][j][k]=(int)(Math.random()*100) ;
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }

        }
    }
}
