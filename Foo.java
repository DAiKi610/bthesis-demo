public class Foo {
    private Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    void printBarData() {
        System.out.println("-------- Bar Data --------");
        printBarWithNullCheck();
    }

    void printBarWithNullCheck() {
        String data = bar.getData();
        if (data != null) {
            System.out.println(data);
        }
    }
}
