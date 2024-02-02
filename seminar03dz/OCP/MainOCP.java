package seminar03dz.OCP;

public class MainOCP {
    public static void main(String[] args) {
        VacuumCleaner vCleaner = new VacuumCleaner("standart", "standart", 1000);
        printVC(vCleaner);
        vCleaner = new BorkVClampUV(1200);
        printVC(vCleaner);
        vCleaner = new BoshVCwater(1000);
        printVC(vCleaner);
    }

    public static void printVC(VacuumCleaner vCleaner) {
        System.out.println(
                vCleaner.brand + " " + vCleaner.model + " - " + vCleaner.operatingModes() + ", max Vacuum power = "
                        + vCleaner.calcMaxVacuumPower());
    }
}
