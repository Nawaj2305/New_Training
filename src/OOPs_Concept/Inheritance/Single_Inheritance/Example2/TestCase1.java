package OOPs_Concept.Inheritance.Single_Inheritance.Example2;

public class TestCase1 extends Common_base_test {

    public TestCase1() {

        System.out.println("DC - Child");
    }

    public void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
