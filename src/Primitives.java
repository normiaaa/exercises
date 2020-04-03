import java.util.Arrays;
import java.util.Scanner;

public class Primitives {


    // https://www.w3resource.com/java-exercises/basic/index1.php

    //151. Write a Java program to find the value of specified expression.

//    public static void main(String[] args) {
//
//
//        int a = (101 + 0) / 3;
//        double b = 3.0e-6 * 10000000.1;
//        boolean c = true && true;
//        boolean d = false && true;
//        boolean e = (false && false) || (true && true);
//        boolean f = (false || false) && (true && true);
//
//        System.out.println("(101 + 0) / 3)-> " + a);
//        System.out.println("(3.0e-6 * 10000000.1)->" + b);
//        System.out.println("(true && true)->" + c);
//        System.out.println("(false && true)->" + d);
//        System.out.println("(false && false) || (true && true)->" + e);
//        System.out.println("(false || false) && (true && true)->" + f);
//
//
//        ex152();
//
//
//        //152. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.
//
//
//
//
//    }
//    public static void ex152 (){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Please enter the first number: ");
//        int nb1 = scanner.nextInt();
//        System.out.print("Please enter the second number: ");
//        int nb2 = scanner.nextInt();
//        System.out.print("Please enter the third number: ");
//        int nb3 = scanner.nextInt();
//        System.out.print("Please enter the forth number:");
//        int nb4 = scanner.nextInt();
//
//        if (nb1 == nb2 && nb2 == nb3 && nb3 == nb4) {
//
//
//            System.out.println("Numbers are equal.");
//
//
//        } else {
//
//            System.out.println("Numbers are not equal.");
//        }
//
//
//    }

    //165. Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers

//   // public static void ex165()
//
//    public static void main(String[] args) {
//
//    int[] originalArray = {-2, 3, 4, -1, -3, 1, 2, -4, 0}, pos, hc;
//        int positive = 0, negative = 0;
//
//        // Check how many positive and/or negative numbers
//        for (int i : originalArray)
//        {
//            if (i >= 0)
//            {
//                positive++;
//            } else
//            {
//                negative++;
//            }
//        }
//
//        // Make exact size arrays
//        pos = new int[positive];
//        hc = new int[negative];
//        int[] array1and2 = new int[negative + positive];
//
//
//        // Reset variables for new purpose
//        positive = 0;
//        negative = 0;
//
//        //Put numbers in correct array
//        for (int i : originalArray)
//        {
//            if (i >= 0)
//            {
//                pos[positive] = i;
//                positive++;
//            } else
//            {
//                hc[negative] = i;
//                negative++;
//            }
//        }
//
//        // Display arrays
//        System.out.print("Original array: ");
//        for (int i: originalArray)
//        {
//            System.out.print(" " + i);
//        }
//
//        System.out.print("\nPositive array: ");
//        for (int i: pos)
//        {
//            System.out.print(" " + i);
//        }
//
//        System.out.print("\nNegative array: ");
//        for (int i: hc)
//        {
//            System.out.print(" " + i);
//        }
//
//        System.arraycopy(hc, 0, array1and2, 0, hc.length);
//        System.arraycopy(pos, 0, array1and2, hc.length, pos.length);
//        System.out.print("\nresult array: ");
//
//        for (int i: array1and2)
//        {
//            System.out.print(" " + i);
//        }
//
//    }
//
// 169. Write a Java program to reverse the content of a sentence (assume a single space between two words) without reverse every word.

//    public static void main(String[] args) {
//
//        String s = "The quick brown fox jumps over the lazy dog";
//        String[] split = s.split(" ");
//        String result = "";
//        for (int i = split.length - 1; i >= 0; i--) {
//            result += (split[i] + " ");
//        }
//        System.out.println(result.trim());
// }
//
    // ------------------------------------------------------


//  1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

//    public static void main(String[] args) {
//
//        double a,c;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter  Fahrenheit temperature: ");
//        a=sc.nextDouble();
//        System.out.println("Celsius temperature is = "+celsius(a));
//    }
//    static double celsius(double f)
//    {
//        return  (f-32)*5/9;
//    }
//    2. Write a Java program that reads a number in inches, converts it to meters.
//
//    public static void main(String[] args) {
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter the inch value: ");
//            double inch = scanner.nextDouble();
//            double meters = inch * 0.0254;
//            System.out.println(inch + " inch is " + meters + " meters");
//
//
//
//    }
//    3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

//
//
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 0 and 1000 : ");
//        int num = scanner.nextInt();
//        int sum = 0;
//
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);
//
//
//    }

//    4. Write a Java program to convert minutes into a number of years and days.

//    public static void main(String[] args) {
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number of minutes : ");
//        int minutes = scanner.nextInt();
//
//        int year = minutes / 525600;
//        int remainingMinutes = minutes % 525600;
//        int day = remainingMinutes / 1440;
//
//        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
//    }
//
//5. Write a Java program that prints the current time in GMT. Go to the editor
//
//    public static void main(String[] args) {
//
//        Scanner scanner= new Scanner(System.in);
//
//        System.out.print("Input the time zone: ");
//        long timeZoneChange = scanner.nextInt();
//
//        long totalMilliseconds = System.currentTimeMillis();
//
//        long totalSeconds = totalMilliseconds / 1000;
//
//        long currentSecond = totalSeconds % 60;
//
//        long totalMinutes = totalSeconds / 60;
//
//        long currentMinute = totalMinutes % 60;
//
//        long totalHours = totalMinutes / 60;
//
//        long currentHour = ((totalHours + timeZoneChange) % 24);
//
//        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
//
//    }



}










