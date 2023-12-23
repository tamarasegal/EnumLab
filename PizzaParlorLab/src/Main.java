import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        enum Flavors {PLAIN("Plain", 7), VEGGIE("Veggie", 34), MEDITERRANEAN("Mediterranean", 56), GREEK("Greek", 0), MEATLOVERS("Meat Lovers", 1);

            private String printedName;
            private int num;

            private Flavors (String printedName, int num) {
                this.printedName = printedName;
                this.num = num;
            }

            public String getName() {
                return printedName;
            }

            public int getNumber() { return num; }


        }

        //display menu in way that you don't have to update code if flavors is updated
        Scanner scan = new Scanner(System.in);
        System.out.println("Flavors:");
        for (Flavors f : Flavors.values())
            System.out.println((f.getName() + " " + f.getNumber()));
        System.out.println("Enter the flavor you'd like (number)");
        try {
            int answer = Integer.parseInt(scan.nextLine());
            for (Flavors f : Flavors.values()){
                if (f.getNumber() == answer) {
                    System.out.println("You chose " + f.getName());
                    System.exit(1);
                }

            }
            System.out.println("The number entered does not correspond to any flavor");
        }

        catch (Exception e) {
            System.out.println("You did not enter a number");
        }
    }
}