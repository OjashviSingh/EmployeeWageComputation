import java.util.Random;
public class UC {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int x = randomNum.nextInt(2);
        if (x == 0){
            System.out.println("Employee is present.");
            workingHour = 8;
        }
        else {
            System.out.println("Employee is absent.");
            workingHour = 0;
        }
        int salary = workingHour * 20;
        System.out.println("Employee Daily Wage is: "+salary);
    }
}
