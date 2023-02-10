public class Main {

    public static void main(String[] args){
        /* //Person
        Person p1 = new Person("David", 18, "spanish");
        System.out.println(p1.toString());
        Person p2 = new Person("David", 18, "spanish");
        System.out.println(p2.toString());

        if (p1.equals(p2)){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }
        */

        //Product
        System.out.println("Product");
        System.out.println();
        Product pr1 = new Product("Banana", 1.1, 13);
        pr1.printProduct();

        //Multiplier
        System.out.println();
        System.out.println("Multiplier");
        System.out.println();
        Multiplier v1 = new Multiplier(2);
        System.out.println(v1.multiply(5));

        //NumberStatistics
        System.out.println();
        System.out.println("NumberStatistics");
        System.out.println();
        NumberStatistics st = new NumberStatistics();
        System.out.println(st.amountOfNumbers());
        st.addNumber(5);
        System.out.println(st.amountOfNumbers());
        st.addNumber(7);
        System.out.println(st.amountOfNumbers());
        System.out.println(st.showStatistics());

        //Circumference
        System.out.println();
        System.out.println("Circumference");
        System.out.println();
        Circumference c1 = new Circumference(5.0, "red");
        System.out.println(c1.area());
        c1.printPerimeter();
        System.out.println(c1.isBig());
        Circumference c2 = new Circumference(5.0, "blue");
        System.out.println(c1.isEqualTo(c2));
        c1.show();
        c2.show();

        //Library
        System.out.println();
        System.out.println("Library");
        System.out.println();
        System.out.println(Library.isEven(5));
        System.out.println(Library.digitAmount(107));
        System.out.println(Library.isLong(98123));
        System.out.println(Library.multipleOf10());

        //Point
        System.out.println();
        System.out.println("Point");
        System.out.println();
        Point p1 = new Point(2, -5);
        System.out.println("Quadrant :" + p1.quadrant());
        p1.show();

        //Straight
        System.out.println();
        System.out.println("Straight");
        System.out.println();
        Straight str1 = new Straight(2.5, 1.0, 3.0, 4.0, 3.0);
        str1.show();
        Point p2 = new Point(2.0, -9.0);
        Straight str2 = new Straight(4.1, p1, p2);
        str2.show();
        System.out.println(str1.isHorizontal());
        System.out.println(str2.isHorizontal());
        System.out.println(str1.isVertical());
        System.out.println(str2.isVertical());
        str1.highestPoint().show();
        str2.highestPoint().show();
        System.out.println("The length of the first straight is :" + str1.length());
        System.out.println("The length of the second straight is :" + str2.length());
        (str1.longest(str2)).show();

        /*  //BankAccount v1
        System.out.println();
        System.out.println("BankAccount v1");
        System.out.println();
        BankAccount ba1 = new BankAccount("David");
        BankAccount ba2 = new BankAccount("Mikel", 503.2);
        ba1.deposit(432.7);
        ba2.withdraw(154.2);
        ba1.show();
        ba2.show();
        */

        /*
        //BankAccount v2
        System.out.println();
        System.out.println("BankAccount v2");
        System.out.println();
        Person p4 = new Person("David", 18, "spanish");
        Person p5 = new Person("Mikel", 23, "italian");
        Person p6 = new Person("Rubén", 35, "french");
        BankAccount ba1 = new BankAccount(p4);
        BankAccount ba2 = new BankAccount(p5, 453.21);
        ba1.deposit(342.6);
        ba2.withdraw(564.2);
        System.out.println(ba1.show());
        System.out.println(ba2.show());

        System.out.println();

        BankManager_v2 bm1 = new BankManager_v2(ba1);
        bm1.show();
        bm1.addBankAccount(ba2);
        bm1.show();
        BankAccount ba3 = new BankAccount(p6);
        bm1.addBankAccount(ba3);
        bm1.show();
        bm1.deleteBankAccount();
        bm1.show();

        */

        //PalindromicNumber
        System.out.println();
        System.out.println("PalindromicNumber");
        System.out.println();
        PalindromicNumber pn = new PalindromicNumber(44L);
        if (pn.isPalindromic()){
            System.out.println("IS Palindromic");
        }else{
            System.out.println("IS NOT Palindromic");
        }
        System.out.println(pn.countDigits());
        System.out.println(pn.digitAtPositionN(3));

        //Author
        System.out.println();
        System.out.println("Author");
        System.out.println();
        Author a = new Author("David", "dsanchezre22dw@ikzubirimanteo.com", "masculino");
        a.show();


        //Book
        System.out.println();
        System.out.println("Book");
        System.out.println();
        double[] prices = {45.7, 65.3, 98.2, 34.87, 42.1, 5.02};
        Book b = new Book("Nada", a, prices);
        System.out.println(b.minimumPrice());
        b.printAuthorInfo();
        System.out.println(b.toString());
        System.out.println(Book.sum_min);
        double[] prices2 = {32.1, 15.9, 198.2, 54.27, 42.1, 8.32};
        Book b2 = new Book("Nada", a, prices2);
        System.out.println(Book.sum_min);

    }
}
