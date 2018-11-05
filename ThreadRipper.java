import java.util.ArrayList;

public class ThreadRipper {

    private int x;
    private ArrayList<Integer> intList;

    public ThreadRipper() {

        intList = new ArrayList<>();
        x = 4;
    }

    public void rip() {

        Thread t1 = new Thread( this::threadOneAction );

        Thread t2 = new Thread( this::threadTwoAction );

        t1.start();
        t2.start();
    }

    private void threadOneAction() {
        x++;
        System.out.println(x);
    }

    private void threadTwoAction() {
        x--;
        System.out.println(x);
    }

}
