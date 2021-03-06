public class Commission extends Hourly {
    private double totalSales = 0;
    private double commissionRate = 0;

    public Commission (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double commissionRate) {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay();
        payment += this.totalSales * this.commissionRate;
        this.totalSales = 0;
        return payment;
    }

    public String toString() {
        String outputBuffer = super.toString();
        outputBuffer += "\nTotal Sales: " + this.totalSales;
        return outputBuffer;
    }
}