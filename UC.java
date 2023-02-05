<<<<<<< HEAD
public class UC {
    int wagePerHour;
    int numberOfWorkingDays;
    int workingHoursPerMonth;

    public UC(int wagePerHour, int numberOfWorkingDays, int workingHoursPerMonth) {
        this.wagePerHour = wagePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public int computeWage() {
        return wagePerHour * numberOfWorkingDays * workingHoursPerMonth;
    }

    public static void main(String[] args) {
        UC company1 = new UC(20, 22, 8);
        System.out.println("Employee wage for company 1: " + company1.computeWage());

        UC company2 = new UC(30, 25, 10);
        System.out.println("Employee wage for company 2: " + company2.computeWage());
    }
=======
import java.util.Random;
public class UC {
    public static void main(String[] args) {
        int perHourSalary = 20;
        int workingHour = 0;
        int totalSalary = 0;
        int days = 1;

        while (days <= 20 || workingHour <= 100) {
            Random randomNum = new Random();
            int x = randomNum.nextInt(3);
            if (x == 0) {
                System.out.println("Employee is absent");
                workingHour += 0;
            } else if (x == 1) {
                System.out.println("Employee is present");
                workingHour += 8;
            } else {
                System.out.println("Employee is working as part time.");
                workingHour += 8;
            }
            int salary = perHourSalary * workingHour;
            totalSalary = totalSalary + salary;
            days++;
        }
        System.out.println("Employee has earned a total of " + totalSalary + " in a month.");
        System.out.println(workingHour);
    }
>>>>>>> 0f3349fcc565064cf230b9fb059a19a26f65934f
}
