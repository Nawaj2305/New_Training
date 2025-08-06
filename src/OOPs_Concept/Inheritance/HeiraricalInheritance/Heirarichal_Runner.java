package OOPs_Concept.Inheritance.HeiraricalInheritance;

public class Heirarichal_Runner {

    public static void main(String[] args) {
        Elder_son ES=new Elder_son();
        ES.Home();
        ES.dad_home();

        Younger_son ys=new Younger_son();
        ys.Home();
        ys.dad_home();

        Dad d=new Dad();
        d.dad_home();
    }

}
