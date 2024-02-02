package seminar03dz.OCP;

public class BorkVClampUV extends VacuumCleaner {
    public BorkVClampUV(double maxVacuumPower) {
        super("Bork", "MC1500", maxVacuumPower);
    }

    @Override
    public String operatingModes() {
        return "Выполняет операции: вакуумный пылесос + ультрафиолетовая лампа";
    }

    @Override
    public double calcMaxVacuumPower() {
        return maxVacuumPower * 1.8;
    }
}
