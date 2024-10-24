import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input.
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

//        System.out.println("To find the sum of mathmatical opreations, please enter two numbers.");
//        System.out.println("Please enter the first number.");
//        int n1 = input.nextInt();
//        System.out.println("Please enter the second number.");
//        int n2 = input.nextInt();
//
//        System.out.println(n1+" + "+n2+" = "+(n1+n2));
//        System.out.println((n1+" - "+n2+" = "+(n1-n2)));
//        System.out.println((n1+" * "+n2+" = "+(n1*n2)));
//        System.out.println(n1+" / "+n2+" = "+ n1/n2);
//        System.out.println((n1+" % "+n2+" = "+(n1%n2)));

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
//        Test Data:
//        Input a number: 8
//        Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//          ...
//        8 x 10 = 80

//        System.out.println("Please enter a number to find it's multiplication.");
//        int n1 = input.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n1+" x "+i+" = "+n1 * i);
//        }

//        3. Write a Java program to print the area and perimeter of a circle.

//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

//        System.out.println("Please ender a Radius to find it's perimeter and area.");
//        double n1 = input.nextDouble();
//
//        System.out.println("Perimeter is = "+2 * Math.PI * n1);
//        System.out.println("Area is = "+Math.PI * n1 * n1);

//        4. Java program to find out the average of a set of integers
//        Enter the count of numbers:
//        5
//        Enter an integer:
//        3
//        Enter an integer:
//        8
//        Enter an integer:
//        6
//        Enter an integer:
//        7
//        Enter an integer:
//        2
//        The average is: 5.2

//        System.out.println("Please enter a set of numbers to find the average.");
//
//        double n1;
//        double countn = 0;
//        double sum = 0;
//
//        do {
//            System.out.println("Please enter an integer. ");
//            n1 = input.nextDouble();
//            if (n1 != -1) countn++;
//             sum = sum + n1;
//        }while (n1 != -1);
//        double avg = sum/countn;
//        System.out.println(countn);
//        System.out.println("The average is : "+avg);

//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.
//
//                Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true  --------
//        Input the first number : 10
//        Input the second number: 20
//        Input the third number : 25
//        The result is: false
//
//        System.out.println("Please enter first number.");
//        int n1 = input.nextInt();
//        System.out.println("Please enter the second number.");
//        int n2 = input.nextInt();
//        System.out.println("Please enter the third number.");
//        int n3 = input.nextInt();
//
//        if ((n1+n2) == n3){
//            System.out.println("The result is: [true]");
//        }else System.out.println("The result is: [false]");

//        6. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd

//          System.out.println("Please enter to reverse it.");
//          String word = input.nextLine();
//
//        StringBuilder revst = new StringBuilder(word);
//        System.out.println(revst.reverse());

//        7 -  Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even

//        System.out.println("Please enter a number to find even or odd.");
//        int n1 = input.nextInt();
//
//        if (n1 % 2 == 0){
//            System.out.println("The number is Even.");
//        }else System.out.println("The number is Odd");

//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        Enter temperature in Centigrade:
//        43
//        Temperature in Fahrenheit is: 109.4

//        System.out.println("Please enter a degree in Centigrade(°C) to convert it to Fahrenheit.");
//        double n1 = input.nextDouble();
//
//        System.out.println("Temperature in Fahrenheit is: "+((n1 * 1.8)+32+"°F"));

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//                Test Data:
//        Input a string: Java Bootcamp
//        Input a number: 1
//        Expected Output:
//        a

//        System.out.println("Please enter a string.");
//        String s1 = input.nextLine();
//        System.out.println("Please enter a number.");
//        int n1 = input.nextInt();
//
//        System.out.println(s1.charAt(n1));

//        10. Write a Java program to print the area and perimeter of a rectangle.
//                Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20

//        System.out.println("Please ender a Width and Height to find it's Perimeter and Area.");
//        System.out.println("Plesae enter Width number.");
//        double n1 = input.nextDouble();
//        System.out.println("Please enter Area number.");
//        double n2 = input.nextDouble();
//
//        System.out.println("Area is = "+n1 * n2);
//        System.out.println("Perimeter is = "+2 *(n1+n2));

//        11. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//        25 != 39
//        25 < 39
//        25 <= 39

//        System.out.println("Please enter two numbers to compare.");
//        System.out.println("Please enter the first number.");
//        int n1 = input.nextInt();
//        System.out.println("Please enter the second number.");
//        int n2 = input.nextInt();
//
//        if (n1 == n2){System.out.println(n1+" == "+n2);}
//        if (n1 != n2){System.out.println(n1+" != "+n2);}
//        if (n1 >= n2){System.out.println(n1+" >= "+n2);}
//        if (n1 > n2){System.out.println(n1+" > "+n2);}
//        if (n1 <= n2){System.out.println(n1+" <= "+n2);}
//        if (n1 < n2){System.out.println(n1+" < "+n2);}

//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59

//        System.out.println("Please enter seconds to convert it to hour,minutes and seconds.");
//        int n = input.nextInt();
//
//        int h1 = n / 3600;
//        int m1 = (n % 3600) / 60;
//        int s1 = n % 60;
//
//        System.out.println(h1+":"+m1+":"+s1);

//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//                Sample Output:
//        Input first number: 25
//        Input second number: 37
//        Input third number: 45
//        Input fourth number: 23
//        Numbers are not equal!

//        System.out.println("Please enter four numbers to check of all numbers are equals.");
//        System.out.println("Please enter the first number.");
//        int n1 = input.nextInt();
//        System.out.println("Please enter the second number.");
//        int n2 = input.nextInt();
//        System.out.println("Please enter the third number.");
//        int n3 = input.nextInt();
//        System.out.println("Please enter the fourth number.");
//        int n4 = input.nextInt();
//
//        if (n1 == n2 && n3 == n4 && n1 == n3){
//            System.out.println("Numbers are  equal!");
//        } else System.out.println("Numbers are not equal!");

//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.
//                Test Data Input a number: 7 Expected Output :
//        Number is positive

//        System.out.println("Please enter a number to check if its negative pr zero or positive.");
//        int n1 = input.nextInt();
//
//        if (n1 >0){
//            System.out.println("Number is postive.");
//        } else if (n1 < 0){
//            System.out.println("Number is negative.");
//        }else System.out.println("Number is Zero.");

//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered  (End loop use -1 ,
//        Don’t count -1).
//        Test data
//        1
//        3
//        0
//        -2
//        -4
//        -1
//        2 positives
//        1 zero
//        2 negatives

//        System.out.println("Please enter a number to find the sum of each number and check if its + or - or zero and -1 to Exit.");
//        int n1 = input.nextInt();
//        int p = 0;
//        int n = 0;
//        int z = 0;
//
//        do {
//            if (n1 > 0){p++;} else if (n1<0) {n++;}else {z++;}
//            System.out.println("Please enter another number or -1 to Exit");
//            n1 = input.nextInt();
//
//
//        }while (n1 != -1);
//
//        System.out.println(p+" Positives.\n" +
//                z+" zero.\n" +
//                n+" Negatives.");

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
//                For example, if the input is 12345, the output should be 54321.

//        System.out.println("Please enter an integer to reverse.");
//        int num = input.nextInt();
//        int revnum = 0;
//        while (num != 0) {
//            revnum = revnum * 10 + num % 10;
//            num /= 10;
//        }
//
//        System.out.println(revnum);

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//                enter the number : 4
//        enter the number : 5
//        enter the number : -1
//        enter the number : 9
//        the large number : 9
//        the small number : -1


//        System.out.println("How many numbers you want to enter?");
//        int count = input.nextInt();
//
//        int newn =0;
//        int hnum =0;
//        int lnum =0;
//
//            for (int i = 1; i <= count; i++){
//                System.out.println("Please enter "+ i +" numbers: ");
//                newn = input.nextInt();
//                if (hnum < newn)
//                    hnum = newn;
//
//                if (lnum ==0)
//                    lnum = newn;
//
//                else if (newn <= lnum)
//                    lnum = newn;
//            }
//
//            System.out.println("The highest number is: "+ hnum);
//            System.out.println("The lowest number is: "+ lnum);

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.
//        Enter String: Java bootcamp
//        Output: Number of a's: 3

//        System.out.println("Please enter a String:");
//        String word = input.nextLine();
//        int count =0;
//
//        for (int i = 0; i < word.length(); i++) {
//
//            if (word.charAt(i) == 'a'){count++;}
//
//        }
//
//        System.out.println("Number of a's: "+count);



        }
        }



