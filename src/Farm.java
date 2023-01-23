import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[]cows;
    private Horse[]horses;
    private Sheep[]sheeps;
    private String getOwner;

    public Farm(Cow[] cows, Horse[] horses, Sheep[] sheeps, String getOwner,String address) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.getOwner = getOwner;
    }

    public Farm() {
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", getOwner='" + getOwner + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheeps;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheeps = sheep;
    }

    public String getGetOwner() {
        return getOwner;
    }

    public void setGetOwner(String getOwner) {
        this.getOwner = getOwner;
    }
}
