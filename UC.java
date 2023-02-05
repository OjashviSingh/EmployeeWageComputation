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
}
