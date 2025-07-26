public class Foo {
    private Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    void printBarData() {
        System.out.println("-------- Bar Data --------");
        System.out.println(bar.getData());
    }
}
