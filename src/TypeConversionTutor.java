public class TypeConversionTutor {
    public static void main(String[] args) {

        //Explicity , Which Means Doing Manually with the help of " (byte) "
        int a = 1000;
        byte b = (byte) a; //byte size 256 and it divides the number and give the remainder 1000%256
        // and then subtracts the remaining value (1000%256) => 232 and then (232-256) => -24
        System.out.println(b);
        //Implicity ,Java Automatically Converts smaller Data into Larger "Widening"

        int e = 11;
        float e1 = e;
        System.out.println(e1);
    }
}
