package seminar03dz.OCP;

public class BoshVCwater extends VacuumCleaner {
    public BoshVCwater(double maxVacuumPower) {
        super("Bosh", "BrD2000", maxVacuumPower);
    }

    @Override
    public String operatingModes() {
        return "Выполняет операции: вакуумный пылесос + влажная уборка";
    }

    @Override
    public double calcMaxVacuumPower() {
        return maxVacuumPower * 1.5;
    }
}
