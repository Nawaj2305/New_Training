package OOPs_Concept.Inheritance.Multilevel_Inheritance;

public class Multilevel_runner {

    public static void main(String[] args) {
        Son sn=new Son();
        sn.son_home();
        sn.SG();
        sn.Father_Home();
        sn.gf();
        sn.home();


        Father f=new Father();
        f.gf();
        f.Father_Home();
        f.home();

        GrandFather gf=new GrandFather();
        gf.gf();
        gf.home();
    }
}
