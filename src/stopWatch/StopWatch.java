package stopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
       this.startTime=System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
        System.out.println(startTime);
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("stop watch: "+this.getElapsedTime()+" milis");
    }
    public long getElapsedTime(){
        return getEndTime()-getStartTime();
    }

}
