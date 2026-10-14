import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int previousReading, currentReading;
    String type;

    double calculateBill(int units) {
        double bill = 0;

        if (type.equalsIgnoreCase("domestic")) {
            if (units <= 100)
                bill = units * 1.5;
            else if (units <= 200)
                bill = 100 * 1.5 + (units - 100) * 3;
            else if (units <= 500)
                bill = 100 * 1.5 + 100 * 3 + (units - 200) * 4.5;
            else
                bill = 100 * 1.5 + 100 * 3 + 300 * 4.5 + (units - 500) * 7;
        } else {
            if (units <= 100)
                bill = units * 2.5;
            else if (units <= 200)
                bill = 100 * 2.5 + (units - 100) * 5;
            else if (units <= 500)
                bill = 100 * 2.5 + 100 * 5 + (units - 200) * 6.5;
            else
                bill = 100 * 2.5 + 100 * 5 + 300 * 6.5 + (units - 500) * 9;
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBill eb = new ElectricityBill();

        System.out.print("Consumer Number: ");
        eb.consumerNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Consumer Name: ");
        eb.consumerName = sc.nextLine();

        System.out.print("Previous Reading: ");
        eb.previousReading = sc.nextInt();

        System.out.print("Current Reading: ");
        eb.currentReading = sc.nextInt();
        sc.nextLine();

        System.out.print("Connection Type (Domestic/Commercial): ");
        eb.type = sc.nextLine();

        int units = eb.currentReading - eb.previousReading;

        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: Rs." + eb.calculateBill(units));
    }
}
