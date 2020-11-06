package ListTime;

import java.time.Duration;
import java.time.Instant;


public class Time {

    private Instant start;
    private Instant finish;
    private long elapsed;
    Time(){
        elapsed = 0;
    }
    public void start()
    {
        start = Instant.now();
    }

    public void restart(){
        elapsed = 0;
        start = Instant.now();
    }
    public void stop()
    {
        finish = Instant.now();
        elapsed = elapsed + Duration.between(start, finish).toMillis();
    }

    public long  getElapsed(){
        return elapsed;
    }
    public void getTime()
    {
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}
