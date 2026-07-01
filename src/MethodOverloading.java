//Method Overloading
class calculator{
    public int add(int num1,int num2){
        return num1+num2;     //same parameter and data type
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3; //different parameter and same data type
    }
    public double add(int num1,double num2,int num3){
        return num1*num2*num3;  // same parameter and different data type
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        int result = obj.add(12,1);
        int result1 = obj.add(1,2,3);
        double result2 = obj.add(1,2.0,2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



    }
}
