import java.util.Scanner;

public class Main {
    //public static final String [] dayOfWeek = { "Mon", "Tue", "Wed"};
    //but we want it to only allow days of week so

    enum DayOfWeek { MON,TUE, WED, THU, FRI, SAT, SUN }; //enum is a lot like a class, can't do everything a class can but most
    //enum name should (but need not) start capitalized
    public static void main(String[] args) {
        //enum is single most important topic of all leftover java topics
        DayOfWeek a = DayOfWeek.MON;
        System.out.println(a);

        switch (a) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Weekday");
                break;
            case SAT:
            case SUN:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unrecognized value in enum"); //in case values in enum have been changed
        }

        for (DayOfWeek token : DayOfWeek.values())
            System.out.println(token.ordinal()); //ordinal returns an index starting at 0

        enum Flavors {PEPPERONI, PINEAPPLE, MUSHROOMS }; //don't have to be all caps but should be bc they're constants

        //display menu in way that you don't have to update code if flavors is updated
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose one of the pizza flavors below (by number):");
        for (Flavors f : Flavors.values())
            System.out.println((f.ordinal() + 1) + ". " + f);
        Flavors answer = Flavors.values()[Integer.parseInt(scan.nextLine()) - 1];
        System.out.println("You chose " +  answer.name().toLowerCase() + ".");


        //
        //using numbers other than ordinals, in this case for jersey numbers
        enum RetiredYankees {
            BabeRuth(3), LouGehrig(4), BillyMartin(1), BernieWilliams(51); //think of these as constructor calls
            private int jerseyNumber;
            private RetiredYankees(int num) { //private because it's only contructed within the enum
                jerseyNumber = num;
            }

            public int getNum() {
                return jerseyNumber;
            }

            enum Flavors { PEPPERONI("Pepperoni"), CHEESE("Cheese"), MUSHROOM("Mushroom");

                private String name;

                private Flavors(String name) {
                    this.name = name;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            

        }

    }

}