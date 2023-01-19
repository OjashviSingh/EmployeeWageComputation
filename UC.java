import java.util.Random;
public class UC {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Random rd = new Random();
        Boolean a = rd.nextBoolean();
        int  workingHour;
        if (a){
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
