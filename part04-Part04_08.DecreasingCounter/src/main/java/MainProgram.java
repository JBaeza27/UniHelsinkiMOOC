
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(20);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();
    }
}
