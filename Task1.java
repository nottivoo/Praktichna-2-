public class Task1{
    public static void main(String[] args){
        double a = -0.5;
        double b = -1.7;
        double t = 0.44;

        double x = Math.exp(-b * t)* Math.sin(a * t +b) - Math.sqrt(Math.abs(b + a * t));
        double y = b * Math.sin(a *  t * t * Math.cos(2 * t)) - 1;
        System.out.println("x = " + x);
        System.out.println("y = " +y);

    }
}

