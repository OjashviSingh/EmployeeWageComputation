import java.util.Random;
public class UC {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int x = randomNum.nextInt(2);
        if (x == 0){
            System.out.println("Employee is present.");
        }
        else {
            System.out.println("Employee is absent.");
        }
    }
}
