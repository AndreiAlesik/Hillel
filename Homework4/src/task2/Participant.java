package task2;

public class Participant implements Overcomming{
    private String name;
    private double runDistanceLimit;
    private double jumpDistanceLimit;

    public Participant(String name, double runDistanceLimit, double jumpDistanceLimit) {
        this.name = name;
        this.runDistanceLimit = runDistanceLimit;
        this.jumpDistanceLimit = jumpDistanceLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public void setRunDistanceLimit(double runDistanceLimit) {
        this.runDistanceLimit = runDistanceLimit;
    }

    public double getJumpDistanceLimit() {
        return jumpDistanceLimit;
    }

    public void setJumpDistanceLimit(double jumpDistanceLimit) {
        this.jumpDistanceLimit = jumpDistanceLimit;
    }
    @Override
    public String overcomeTreadmill(Barrier treadmillN) {
        if(getRunDistanceLimit()>treadmillN.getLengthOrHeight()&& getRunDistanceLimit()>0){
            setRunDistanceLimit(getRunDistanceLimit()-treadmillN.getLengthOrHeight());
            return "Success, participant "+ getName() + " passed the barrier "+treadmillN.getName();
        }
        else return "Fail, participant "+getName()+" dropped out.";
    }

    @Override
    public String overcomeWall(Barrier wallN) {
        if(getJumpDistanceLimit()> wallN.getLengthOrHeight() && getJumpDistanceLimit()>0){
            setJumpDistanceLimit(getJumpDistanceLimit()- wallN.getLengthOrHeight());
            return "Success, participant "+ getName() + " passed the barrier "+wallN.getName();
        }
        else return "Fail, participant "+getName()+" dropped out.";
    }
}
