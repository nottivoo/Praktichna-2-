import java.util.Scanner;

public class Task2 {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть a:");
        double a = sc.nextDouble();
        System.out.print("Введіть b:");
        double b = sc.nextDouble();
        System.out.print("Введіть x:");
        double x = sc.nextDouble();

        double f;
        if (x > -2 && x <10){
            f = Math.sqrt(b * x + 3);

        }else if (x == 10){
            f = Math.abs(x * x - a  * b * x + 7);
        }else{
            f = Math.cos(x - 1);
        }
        System.out.println("f(x) =" + f);

    }
}
