class Demo{

    public static int add(int a, int b){
        System.out.println("Hey !!");
        int result = a+b;
        return result;  //Setting the return Value Here
    }
}
public class ObjAndClassTutor {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Demo obj1 = new Demo();
        int sam = obj1.add(a,b);  //// Getting Integer Return Value Here !!
        System.out.println(sam);

    }
}
