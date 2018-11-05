/**
 * Exemplifies what not to do when multithreading.
 *
 * You should get insane values from x++ and x--, like -8, 9, 4... etc.
 */
public class ThreadRipperRunner {

    public static void main(String[] args) {

        ThreadRipper tRipper = new ThreadRipper();

        for (int i = 0; i < 1000; i++) {
            tRipper.rip();
        }
    }


}
