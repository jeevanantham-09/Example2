public class interfaceJ implements Jeeva,Jeeva1,Jeeva2{

    @Override
    public void display() {
        System.out.println("hiii");
    }

    @Override
    public void showe() {

    }

    @Override
    public void show() {
        System.out.println("welcome");
    }

    @Override
    public void disc() {
        System.out.println("to java");
    }
public void exfunc(){
        System.out.println("sample function");
}
    public static void main(String[] args) {
        interfaceJ obj =new interfaceJ();
        interfaceJ[] obj1=new interfaceJ[2];
        obj.display();
        obj.show();
        obj.disc();
        obj.showe();
        obj.exfunc();
    }
}
