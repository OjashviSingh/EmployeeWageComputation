import java.util.Random;
public class UC {
        public static void main(String[] args) {
                int perHourSalary = 20;
                int workingHour = 0;
                int totalSalary = 0;

                Random randomNum = new Random();
                int x = randomNum.nextInt(3);
                if (x == 0) {
                    System.out.println("Employee is absent");
                    workingHour = 0;
                } else if (x == 1) {
                    System.out.println("Employee is present");
                    workingHour = 8;
                } else {
                    System.out.println("Employee is working as part time.");
                    workingHour = 8;
                }

                int salary = perHourSalary * workingHour;
                totalSalary = totalSalary + salary;
                System.out.println("Employee has earned " + totalSalary +" in a day.");
                }
        }
