import java.util.Scanner;

public class Session4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please key in your name: > ");
//        String name  = scanner.nextLine();
//        System.out.println("Enter your languge");
//        String lang = scanner.nextLine();
//        String greet = greeting(name, lang);
//        System.out.println(greet);

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

         int choice = -1;
         while(choice!=0){
             //present menu

             System.out.println("----------------------------------------");
             System.out.println("1 -  Sum of two numbers");
             System.out.println("2 -  Substraction of two numbers");
             System.out.println("3 -  Multiplication of two numbers");
             System.out.println("4 -  Division of two numbers");
             System.out.println("0 -  Exit from program");
             System.out.println("#########################################");
             System.out.println();
             System.out.println();

             choice = scanner.nextInt();

             if(choice==1){
                 System.out.println("Keyin first number");
                 int num1 = scanner.nextInt();
                 System.out.println("Keyin second number");
                 int num2 = scanner.nextInt();
                 int total = sum(num1,num2);
                 System.out.println("Here is the sum" + total);
             }
             if(choice==2){
                 System.out.println("Keyin first number");
                 int num1 = scanner.nextInt();
                 System.out.println("Keyin second number");
                 int num2 = scanner.nextInt();
                 int total = substract(num1,num2);
                 System.out.println("Here is the substraction" + total);
             }
             if(choice==3){
                 System.out.println("Keyin first number");
                 int num1 = scanner.nextInt();
                 System.out.println("Keyin second number");
                 int num2 = scanner.nextInt();
                 int total = multipication(num1,num2);
                 System.out.println("Here is the multiplication" + total);
             }
             if(choice==4){
                 System.out.println("Keyin first number");
                 int num1 = scanner.nextInt();
                 System.out.println("Keyin second number");
                 int num2 = scanner.nextInt();
                 int total = divde(num1,num2);
                 System.out.println("Here is the division" + total);
             }
         }

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


    //sum start here
    public static int sum(int a, int b){
        return a+b;
    }
    //sum end here

    // substraction start here
    public static int substract(int a, int b){
        return a-b;
    }
    // end here


    // multiplication start here
    public static int multipication(int a, int b){
        return a*b;
    }
    // end here

    // division start here
    public static int divde(int a, int b){
        return a/b;
    }
}
