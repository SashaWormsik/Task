package lesson6.Task24;

public class Iron extends SmallHouseholdAppliances {
    private boolean steamer;
    private int numberOfModes;

    public Iron(String company, int powerConsumption, boolean stationary, boolean portable, boolean steamer, int numberOfModes) {
        super(company, powerConsumption, stationary, portable);
        this.steamer = steamer;
        this.numberOfModes = numberOfModes;
    }

    public boolean isSteamer() {
        return steamer;
    }

    public void setSteamer(boolean steamer) {
        this.steamer = steamer;
    }

    public int getNumberOfModes() {
        return numberOfModes;
    }

    public void setNumberOfModes(int numberOfModes) {
        this.numberOfModes = numberOfModes;
    }
}
