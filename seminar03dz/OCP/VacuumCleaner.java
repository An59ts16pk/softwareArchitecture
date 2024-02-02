package seminar03dz.OCP;

public class VacuumCleaner {
    public String brand;
    public String model;
    public double maxVacuumPower;

    public VacuumCleaner(String brand, String model, double maxVacuumPower) {
        this.brand = brand;
        this.model = model;
        this.maxVacuumPower = maxVacuumPower;
    }

    public String operatingModes() {
        return "Выполняет операции: вакуумный пылесос";
    }

    public double calcMaxVacuumPower() {
        return maxVacuumPower;
    }
}
