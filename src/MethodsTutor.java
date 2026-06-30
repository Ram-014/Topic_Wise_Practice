class Play{
    public void Cricket(){
        System.out.println("PLaying Cricket...");
    }
    public String Tennis(){
        System.out.println("_________");
        return "He is Playing Tennis";
    }
}
public class MethodsTutor {
    public static void main(String[] args) {
        Play obj = new Play();
        obj.Cricket();
        String st = obj.Tennis();
        System.out.println(st);

    }
}
