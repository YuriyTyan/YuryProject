package reviewclass13;

public class Demo1 {

    int x;
    int y;
    int add(){
        return x+y;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
