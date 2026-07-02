
public class ArrayTutor {
    public static void main(String[] args) {
        // Method 1 For Creating The Array
        System.out.println("---------- Method 1 -------");
        int num [] = {1,2,3};
        num[1] = 12;  /// Now The 2 will become 12...Updates THe Value
        System.out.println(num[1]);
        System.out.println(num[0]);  ///Printing Single Values One BY One...


        System.out.println("---------- Method 2 -------");

        // Method 2 For Creating The Array
        int arr[] = new int[5]; ///Created the array with the size of 2 >> We can Store 2 values "not" 0,1,2 index
        arr[0] =150;
        arr[1] = 2;
        arr[2] = 10;
        arr[3] = 20;
        System.out.println(arr[0]);

        //Using For Loop

        System.out.println("---------------- Printing With For Loop -------");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
