package Multithreading.Challenges.C3;

public enum Colors {
    RED(6000),YELLOW(4000),GREEN(9000);

    private final int onTimeInMills;

    Colors(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills(){
        return onTimeInMills;
    }
}
