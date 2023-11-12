package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {
    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }

    static void work01Utilitor() {
        System.out.println("##testString##");
        try {
            System.out.println("This is string: " + Utilitor.testString("Hello"));
            System.out.println("This is null:" + Utilitor.testString(null));
            System.out.println("This is blank:" + Utilitor.testString(""));
        } catch (Exception e) {
            System.out.println("This is not String!!!");
        }
        System.out.println("");

        System.out.println("##testPositive##");
        try {
            System.out.println("Positive: " + Utilitor.testPositive(10));
            System.out.println("Negative:" + Utilitor.testPositive(-2));
        } catch (Exception e) {
            System.out.println("This is not Positive!!!");
        }
        System.out.println("");

        System.out.println("##testComputeIsbn10##");
        System.out.println("Compute Isbn10 of 130640615: " + Utilitor.computeIsbn10(130640615));
    }

    static void work02Person() {
        Person p1 = new Person("Somchai", "Deemak");
        Person p2 = new Person("Somying", "Mesuk");
        Person p3 = new Person("Somsak", "Dolsak");

        System.out.println("##toString##");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("");

        System.out.println("##Getter##");
        System.out.println("Somying's id: " + p2.getId());
        System.out.println("Somsak's firstname: " + p3.getFirstname());
        System.out.println("Somchai's firstname: " + p1.getLastname());

        System.out.println("");

        System.out.println("##Setter##");
        p1.setFirstname("Somsri");
        System.out.println("Change Somchai's firstname to " + p1.getFirstname());
    }


    static void work03Account() {
        Person p1 = new Person("Somchai", "Deemak");
        Person p2 = new Person("Somying", "Mesuk");

        Account a = new Account(p1);
        Account b = new Account(p2);

        System.out.println("##deposit##");
        System.out.println("Balance of Somchai: " + a.deposit(200));
        System.out.println("Balance of Somying: " + b.deposit(300));

        System.out.println("");

        System.out.println("##withdraw##");
        System.out.println("Balance of Somchai: " + a.withdraw(42));
        System.out.println("Balance of Somying: " + b.withdraw(30));

        System.out.println("");

        System.out.println("##transfer + toString##");
        a.transfer(20,b);
        System.out.println("Balance of Somchai: " + a.toString());
        System.out.println("Balance of Somying: " + b.toString());

    }
}