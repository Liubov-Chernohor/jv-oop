package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Exavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Exavator stopped its work");
    }
}