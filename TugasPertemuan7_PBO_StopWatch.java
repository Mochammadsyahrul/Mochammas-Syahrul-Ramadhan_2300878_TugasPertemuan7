package Tugas_Tugas;

public class TugasPertemuan7_PBO_StopWatch {
    private long startTime;
    private long endTime;

    public TugasPertemuan7_PBO_StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
