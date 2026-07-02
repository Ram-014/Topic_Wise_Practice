class ObjArray{
    String name;
    int RollNo;
    Double Percentage;

}
public class ArrayOfObjectTutor {
    public static void main(String[] args) {
        ObjArray obj = new ObjArray();
        ObjArray obj1 = new ObjArray();
        ObjArray obj2 = new ObjArray();
        obj.name = "Ramu";
        obj.RollNo = 104033;
        obj.Percentage = 93.5;

        obj1.name = "Somu";
        obj1.RollNo = 8129;
        obj1.Percentage = 97.5;

        obj2.name = "Yemu";
        obj2.RollNo = 2168;
        obj2.Percentage = 89.2;
        ObjArray num[] = new ObjArray[3];
        num[0] = obj;
        num[1] = obj1;
        num[2]= obj2;

        for(int i=0;i<num.length;i++){
            System.out.println("Name: "+num[i].name+" Roll No: "+num[i].RollNo+" Percentage: "+num[i].Percentage);

        }


    }
}
