public class SetterAndGetter {
    String Name;
    int age;
    int dob;

    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setAge(int Age){

        this.age=Age;
    }

    public void setDob(int dob){
        this.dob=dob;
    }
    public int getDob() {
        return dob;
    }

    public int getAge(){

        return age;
    }
    public static void main(String[] args) {
        SetterAndGetter object=new SetterAndGetter();
        object.setName("jeeva");
        object.setAge(22);
        object.setDob(12-10-2021);
        System.out.println(object.getName());
        System.out.println(object.getAge());
        System.out.println(object.getDob());
    }

}

