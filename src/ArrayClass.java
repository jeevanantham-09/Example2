public class ArrayClass {
    public static void main(String[] args) {
        ArrayClass[] object1=new ArrayClass[2];
        Student1 student1=new Student1();
        Student2 student2=new Student2();
        object1[0]=new ArrayClass();
        object1[1]=new ArrayClass();
        student1.setName("jeeva");
        student1.setRollno(57);
        student2.setName("Naveen");
        student2.setRollno(66);
        System.out.println(student1.getName());
        System.out.println(student1.getRollno());
        System.out.println(student2.getName());
        System.out.println(student2.getRollno());
        }
    }