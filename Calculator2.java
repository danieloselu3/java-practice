import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("What operation do you want to perform? ");
            String operation = scanner.nextLine();
            
            // if (operation.equals("sum")) {
            //     System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
            // }else if (operation.equals("mul")) {
            //     System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
            // }else if (operation.equals("sub")) {
            //     System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
            // }else if (operation.equals("div")) {
            //     if (number2 == 0){
            //         System.out.println("Cannot divide by zero");
            //     } else {
            //         System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            //     }
            // }else {
            //     System.out.printf("%s is not a supported operation.", operation);
            // }
            
            // conditions using Switch cases
            switch (operation) {
                case "sum" -> System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                case "sub" -> System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                case "mul" -> System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                case "div" -> {
                    if (number2 == 0){
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                    }
                }
                default -> System.out.printf("%s is not a supported operation.", operation);
            }
        }
    }
}
