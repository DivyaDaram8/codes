class TeaShop{
    public String name;
    public int cupsSold;
    public int pricePerCup;
    public int totalEarnings;
    public TeaShop(String name, int cupsSold, int cupPrice) {
        this.name = name;
        this.cupsSold = cupsSold;
        pricePerCup = cupPrice; // if variable name is same as parameter name, then use the 'this' keyword, if variable name is different to parameter name, then no need to use 'this' keyword
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Cups Sold: " + cupsSold);
        System.out.println("Price per Cup: " + pricePerCup);
        System.out.println("-------------------------");
    }

    public void revenue() {
        totalEarnings = cupsSold * pricePerCup;
        System.out.println("Total Earnings: " + totalEarnings);
    }
    public void increasePrice(int amount) {
        pricePerCup += amount;
        System.out.println("New Price per Cup: " + pricePerCup);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        TeaShop ts1 = new TeaShop("Chaiwala", 100, 10);
        TeaShop ts2 = new TeaShop("Chipswala", 200, 20);
            // if constructor is not created, then we need to set values to the variable like 
            // ts1.name = "Chaiwala";
            // ts1.cupsSold = 100;
            // ts1.pricePerCup = 10;

        System.out.println(ts1.name);
        System.out.println(ts2.name);
        System.out.println("-------------------------");

        ts1.display();
        ts2.display();
        ts1.revenue();
        ts1.increasePrice(20);
        ts1.revenue();
    }
}
