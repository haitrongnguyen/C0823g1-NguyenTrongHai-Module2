package ss04_Class_Obj.bai_tap;

public class Test {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public Test(){
        startTime = System.currentTimeMillis();
    }
    public long start(){
        return startTime=System.currentTimeMillis();
    }
    public long stop(){
        return endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime()-getStartTime();
    }
}
