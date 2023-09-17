public class Main
{
    public static void main(String[] args)
    {
        final double SALES_TAX = 0.05;
        // simulated user input
        double purchasePrice = 100.0;
        double computedSalesTax = 0.0;
        double totalCost = 0.0;

        computedSalesTax = purchasePrice * SALES_TAX;
        totalCost = purchasePrice + computedSalesTax;

        System.out.println("The sales tax for $" + purchasePrice + " is $" + computedSalesTax + ".");
        System.out.println("The total of the transaction is $" + totalCost);
    }
}