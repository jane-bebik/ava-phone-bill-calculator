public class Calculator {
    public static double performCalculation(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("avg")) {
            return (num1 + num2) / 2;
        } else {
            System.out.println("u typed it wrong try again >:c");
            return 0;
        }
    }

    public static void performCalculation2(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "avg":
                System.out.println(num1 + num2 / 2);
                break;

            default:
                System.out.println("wrong stuff try + - or avg");
                break;
        }
    }

    public static void main(String[] avg) {
        double results1 = (performCalculation(2.5, 4.5, "+"));
        double results2 = (performCalculation(2.5, 4.5, "-"));
        double results3 = (performCalculation(2.5, 4.5, "avg"));

        System.out.println("results form - is " + results1);
        System.out.println("results form + is " + results2);
        System.out.println("results form avg is " + results3);
    }

}