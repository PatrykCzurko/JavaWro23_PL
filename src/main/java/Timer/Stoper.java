package Timer;

public class Stoper {
    private boolean isRunning;
    private long startTime;
    
    public void start() {
        if (isRunning)
            return;
        isRunning = true;
        startTime = System.nanoTime();

    }

    public long stop (){
        if (!isRunning)
            return -1;
        long currentTime = System.nanoTime();
        isRunning = false;
        return currentTime - startTime;
    }
}
