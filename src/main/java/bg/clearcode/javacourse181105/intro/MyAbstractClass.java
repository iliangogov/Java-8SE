package bg.clearcode.javacourse181105.intro;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 05.11.2018,
 * a significant bit of leva.bg project.
 */
public abstract class MyAbstractClass {
    public MyAbstractClass(int value) {
    }

    abstract void test();

    public final void test1() {
        System.out.println("test1");
    }
}
