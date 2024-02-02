package seminar03dz.ISP;

public class MainISP {
    public static void main(String[] args) {
        BoshVC1000 bVC = new BoshVC1000();
        System.out.println(bVC.name + "\n  Может выполнять: " + bVC.vacuumCleaner());

        BoshVCL1200 bVCL = new BoshVCL1200();
        System.out.println(
                bVCL.name + "\n  Может выполнять: " + bVCL.vacuumCleaner() + ", " + bVCL.vacuumCleanerLampUV());
    }
}
