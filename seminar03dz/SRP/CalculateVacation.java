package seminar03dz.SRP;

public class CalculateVacation {
    private int baseVacation = 28;
    private String dop = " + Путёвка в санаторий";
    int experience;

    public CalculateVacation(int experience) {
        this.experience = experience;
    }

    public String calculateVacation() {
        if (experience >= 20) {
            return String.valueOf(baseVacation + 4) + " дней" + dop;
        } else {
            return String.valueOf(baseVacation) + " дней";
        }
    }

    public int getBaseVacation() {
        return baseVacation;
    }

    public void setBaseVacation(int baseVacation) {
        this.baseVacation = baseVacation;
    }
}
