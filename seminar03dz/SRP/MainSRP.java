package seminar03dz.SRP;

public class MainSRP {
    public static void main(String[] args) {
        CalculateSalary calcSalary = new CalculateSalary(1);
        System.out.println("Зарплата(стаж = 1):  " + calcSalary.calculateSalary());
        calcSalary = new CalculateSalary(2);
        System.out.println("Зарплата(стаж = 2):  " + calcSalary.calculateSalary());
        calcSalary = new CalculateSalary(10);
        System.out.println("Зарплата(стаж = 10): " + calcSalary.calculateSalary());

        CalculateVacation calcVacation = new CalculateVacation(12);
        System.out.println("Отпуск(стаж = 12): " + calcVacation.calculateVacation());
        calcVacation = new CalculateVacation(21);
        System.out.println("Отпуск(стаж = 21): " + calcVacation.calculateVacation());
    }
}
