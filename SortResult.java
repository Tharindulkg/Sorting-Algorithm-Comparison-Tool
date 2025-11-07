public class SortResult {
    private final long timeTaken:
    private final int steps:

    public SortResult(long timetaken, int steps;){
        this.timeTaken = timetaken;
        this.steps = steps:
    }    

    public long get timeTaken(){
        return timeTaken:
    }

    public int getSeps(){
        return steps:
    }

    @Override
    public String toString(){
        return "Time :" + timeTaken +  "ms  |  Steps: "+ steps;
    }
}
