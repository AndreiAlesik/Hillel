public class Car {

    private boolean engineStatus;
    private boolean fuelSystem;
    private boolean electricitySystem;
    private boolean turnTheKey;

    private boolean isEngineStatus() {
        return engineStatus;
    }

    private boolean isFuelSystem() {
        return fuelSystem;
    }

    private boolean isElectricitySystem() {
        return electricitySystem;
    }

    private boolean isTurnTheKey() {
        return turnTheKey;
    }

    private void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    private void setFuelSystem(boolean fuelSystem) {
        this.fuelSystem = fuelSystem;
    }

    private void setElectricitySystem(boolean electricitySystem) {
        this.electricitySystem = electricitySystem;
    }

    private void setTurnTheKey(boolean turnTheKey) {
        this.turnTheKey = turnTheKey;
    }

    private void startElectricity(boolean electricitysystem){
        setElectricitySystem(true);
    }
    private void startCommand(boolean turnthekey){
        setTurnTheKey(true);
    }
    private void fuelSystem(boolean fuelsystem){
        setFuelSystem(true);
    }

    public void start(){
        try {
            startCommand(isTurnTheKey());
            fuelSystem(isFuelSystem());
            startElectricity(isElectricitySystem());
            if(isEngineStatus() && isTurnTheKey() && isFuelSystem() && isElectricitySystem()) setEngineStatus(true);
        }
        catch (Exception e) {System.out.println(e);}

        System.out.println("Car has been started");
    }

    public void stop(){
        try {
            if(isEngineStatus()){
            setTurnTheKey(false);
            setEngineStatus(false);
            setFuelSystem(false);
            setElectricitySystem(false);}
            else System.out.println("Car already started");
        }
        catch (Exception e) {System.out.println(e);}

        System.out.println("Car has been stopped");
    }
}
