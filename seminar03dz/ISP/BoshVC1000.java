package seminar03dz.ISP;

public class BoshVC1000 implements RobotVacuumCleaner {
    String name = "brand: Bosh, model: VC1000 ";

    public BoshVC1000() {
    };

    @Override
    public String vacuumCleaner() {
        return "операция - пылесосить пол";
    }
}
