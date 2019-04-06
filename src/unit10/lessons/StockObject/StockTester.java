package unit10.lessons.StockObject;

public class StockTester {
    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle Corporation");
        s1.setPreviousPrice(34.50);
        s1.setCurrentPrice(34.35);

        System.out.printf("Change: %.3f%%", s1.getChangePercent());

        Stock s2 = new Stock("XOM", "Exxon");

        System.out.println("\n\nNum Companies: " + Stock.getNumCompanies());
    }
}
