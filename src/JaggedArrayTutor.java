public class JaggedArrayTutor {
    public static void main(String[] args) {
        int num[][]= new int[3][]; // we know the NUmber of Columns but Don't know how much value it have 3= column ;value == ?
        num[0] = new int[2]; //Assigned the values column = 3 ;;; Values = 2
        num [1] = new int[3]; //Assigned the values column = 3 ;;; Values = 2
        num[2] = new int[4]; //Assigned the values column = 3 ;;; Values = 2
        //Size of the array = 3 so we assigned the value using the index number 0,1,2;

        for(int i =0;i< num.length;i++){       // Accesing or Travesing the Array Using the .Lemght keyword
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10);
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}
