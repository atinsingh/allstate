import java.util.Scanner;

public class Session4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please key in your name: > ");
        String name  = scanner.nextLine();
        System.out.println("Enter your languge");
        String lang = scanner.nextLine();
        String greet = greeting(name, lang);
        System.out.println(greet);

//
//        System.out.println("Ennter principal amount");
//        double amount = scanner.nextDouble();
//        System.out.println("Enter for roi");
//        double roi = scanner.nextDouble();
//        System.out.println("Please enter period (in years)");
//        int time = scanner.nextInt();
//
//        double intrest = calcSimpleIntrest(amount,roi,time); // calling a method
//        System.out.println(intrest);

    }



    public static double calcSimpleIntrest(double amt, double rate, int period){
        return amt*rate*period/100;
    }

    // Start of greet method
    public static String greeting(String name, String lang) {
        if(lang.equals("en")){
            return "Hello,  how are you " + name;
        }
        if(lang.equals("es")) {
            return "Hola,  Comoestas "+ name;
        }
        if(lang.equals("fr")) {
            return "Bonjour , C'mon cava "+ name;
        }
        return "Hello,  how are you " + name;
    }
    // end of greet
}
