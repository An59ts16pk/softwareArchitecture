package seminar03dz.ISP;

public class BoshVCL1200 implements RobotVacuumCleanerLampUV {
    String name = "brand: Bosh, model: VCL1200 ";

    public BoshVCL1200() {
    };

    @Override
    public String vacuumCleaner() {
        return "операция - пылесосить пол";
    }

    @Override
    public String vacuumCleanerLampUV() {
        return "операция - ультрафиолетовая обработка";
    }
}
