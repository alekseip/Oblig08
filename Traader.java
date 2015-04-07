public class Traader extends Thread {
    private int fra;
    private int til;
    private int teller;
    private String nokkel;
    String[] inndeling;
    Thread thread;

    public Traader(int fra, int til, String nokkel, String[] inndeling, Thread thread) {
        this.fra = fra;
        this.til = til;
        this.nokkel = nokkel;
        this.inndeling = inndeling;
        this.thread = thread;
    }

    public void run() {
        for (int i = fra; i <= til; i++) {
            if (nokkel.equalsIgnoreCase(inndeling[i])) {
                teller++;
            }
        }
    }
    public int getAntall(){
        return teller;
    }
}
