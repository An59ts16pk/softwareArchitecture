package seminar03dz.SRP;

public class CalculateSalary {
    private double baseSalary = 10000;
    int experience;

    public CalculateSalary(int experience) {
        this.experience = experience;
    }

    public double calculateSalary() {
        if (experience >= 10)
            return baseSalary * 1.8;

        if (experience < 2) {
            return baseSalary * 0.8;
        } else {
            return baseSalary * 1.2;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
