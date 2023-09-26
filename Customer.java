public class Customer {
    private String SIN;
    private String Name;
    private String Contact_No;

    public Customer(String SIN, String Name, String Contact_No) {
        this.SIN = SIN;
        this.Name = Name;
        this.Contact_No = Contact_No;
    }

    public double calculateAverageBillWork(double[] billAmounts) {
        double total = 0;
        for (int month = 0; month < 12; month++) {
            total += billAmounts[month];
        }
        return total / 12;
    }

    public double calculateAverageBillPersonal(double[] billAmounts) {
        double total = 0;
        int month = 0;
        while (month < 12) {
            total += billAmounts[month];
            month++;
        }
        return total / 12;
    }

    public double calculateOverallAverage(double[] workBillAmounts, double[] personalBillAmounts) {
        double averageWork = calculateAverageBillWork(workBillAmounts);
        double averagePersonal = calculateAverageBillPersonal(personalBillAmounts);
        return Calculator.performCalculation(averageWork, averagePersonal, "avg");
    }
}
