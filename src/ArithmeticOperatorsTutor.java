public class ArithmeticOperatorsTutor {
    public static void main(String[] args) {
        System.out.println(2+2);
        System.out.println(3-5);
        System.out.println(6/8);
        System.out.println(8%10);
        System.out.println(1*5);
        System.out.println("----------");
        int a =10;
        a +=2;
        int b =10;
        a++;
        int Final = ++a; //Fist Increment and Then Fetch the Value
        System.out.println(Final);

        int F1 = b++;  //Fetch the value and then increment
        System.out.println(F1);

        System.out.println(a);
    }
}
