public class Receipt {
    public static void main(String[] args) {
        String name = "Stacey";
        int numberOfItems = 12 + 2 + 3;
        double totalCost = Math.round(((12*0.60) + (2*3.59) + (3*2*2.20462*1.39)) * 100) / 100.0;
        double averageCost = Math.round((totalCost/numberOfItems) * 100) / 100.0;
        double cashTendered = 40;
        double change = Math.round((cashTendered-totalCost) * 100) / 100.0;
        System.out.println("Customer: " + name);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Average Cost: $" + averageCost + " per item");
        System.out.println();
        System.out.println("Cash Tendered: $" + cashTendered);
        System.out.println("Change Received: $" + change);





}
    
}