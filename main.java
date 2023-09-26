class Main {
    public static void main(String[] args) {
        System.out.println("IF U CAN SEE THIS IT IS WORKING");
        // calculator
        Calculator.performCalculation2(2.5, 4.5, "+");
        Calculator.performCalculation2(2.5, 4.5, "-");
        Calculator.performCalculation2(2.5, 4.5, "avg");

        Phone.callEmergency();

        Customer customer = new Customer("123456789", "John Doe", "123-456-7890");
        double[] workBillAmounts = { 50.0, 55.5, 60.5, 55.0, 58.0, 52.5, 54.0, 56.5, 57.0, 58.5, 59.0, 60.0 };
        double[] personalBillAmounts = { 30.0, 35.5, 25.5, 28.0, 29.0, 32.5, 30.0, 31.5, 32.0, 35.5, 33.0, 30.0 };

        System.out.println("Work bill: " + customer.calculateAverageBillWork(workBillAmounts));
        System.out.println("Personal bill: " + customer.calculateAverageBillPersonal(personalBillAmounts));
        System.out.println("Overall bill: " + customer.calculateOverallAverage(workBillAmounts, personalBillAmounts));

        System.out.println("IF U CAN SEE THIS IT IS WORKING for real");
    }

}

    public static void main(String[] args) {
        System.out.println("IF U CAN SEE THIS IT IS WORKING");
        // calculator
        Calculator.performCalculation2(2.5, 4.5, "+");
        Calculator.performCalculation2(2.5, 4.5, "-");
        Calculator.performCalculation2(2.5, 4.5, "avg");

        Phone.callEmergency();

        Customer customer = new Customer("123456789", "John Doe", "123-456-7890");
        double[] workBillAmounts = { 50.0, 55.5, 60.5, 55.0, 58.0, 52.5, 54.0, 56.5, 57.0, 58.5, 59.0, 60.0 };
        double[] personalBillAmounts = { 30.0, 35.5, 25.5, 28.0, 29.0, 32.5, 30.0, 31.5, 32.0, 35.5, 33.0, 30.0 };

        System.out.println("Work bill: " + customer.calculateAverageBillWork(workBillAmounts));
        System.out.println("Personal bill: " + customer.calculateAverageBillPersonal(personalBillAmounts));
        System.out.println("Overall bill: " + customer.calculateOverallAverage(workBillAmounts, personalBillAmounts));

        System.out.println("IF U CAN SEE THIS IT IS WORKING for real");
    }

}