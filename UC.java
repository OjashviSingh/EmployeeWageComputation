import java.util.Random;
public class UC {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch.");
        Random rd = new Random();
        Boolean a = rd.nextBoolean();
        if (a){
            System.out.println("Employee is present.");
        }
        else {
            System.out.println("Employee is absent.");
        }
    }
}
