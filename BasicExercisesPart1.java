package javafundamentals.link150exercitii;

import java.nio.charset.Charset;
import java.util.Scanner;

public class BasicExercisesPart1 {

    public static void main(String[] args) {
//        ex1();
//        ex2(74,36);
//        ex3(50,3);
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
//        ex10();
//        ex11(7.5);
//        ex12(4,5,6);
//        ex13(8.5,5.5);
//        ex14();
//        ex15(3,5);
//        ex16();
//        ex17("10","11");
//        ex18("10","11");
//        ex19(5);
//        ex20(15);
//        ex21(15);
//        ex22("100");
//        ex23("1101");
//        ex24("111");
//        ex25("10");
//        ex26("7");
//        ex27("100");
//        ex28("25");
//        ex29("37");
//        ex30("40");
//        ex31();
//        ex32(25,39);
//          ex33(25);
//          ex34(6);
//          ex35();
//        ex36();
//        ex37("This quick brown fox");\
//        ex38("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
//        ex39();
//        ex40();
    }


    private static void ex1() { //Write a Java program to print 'Hello' on screen and then print your name on a separate line
        System.out.println("Hello\nTanase Mihai");
    }

    public static void ex2(int a, int b) { //Write a Java program to print the sum of two numbers.
        System.out.println(a + b);
    }

    public static void ex3(int a, int b) { // Write a Java program to divide two numbers and print on the screen.
        System.out.println(a / b);
    }

    public static void ex4() { //Write a Java program to print the result of the following operations
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 - 3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a + " " + b + " " + c + " " + d);
    }

    public static void ex5() { //Write a Java program that takes two numbers as input and display the product of two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti 2 nr:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Produsul numerelor introduse este: " + a * b);
    }

    public static void ex6() { //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti 2 nr:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Suma: " + (a + b) + " Produs: " + (a * b) + " Impartire: " + (a / b) + " Scadere: " + (a - b) + " Modulo: " + (a % b));
    }

    public static void ex7() { //Write a Java program that takes a number as input and prints its multiplication table upto 10.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti 1 nr:");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
    }

    public static void ex8() { // Write a Java program to display the following pattern.
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void ex9() {//Write a Java program to compute the specified expressions and print the output.
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }

    private static void ex10() {//Write a Java program to compute a specified formula.
        double r = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(r);
    }

    public static void ex11(double raza) { //Write a Java program to print the area and perimeter of a circle.
        double p = 2 * 3.14 * raza;
        double A = 3.14 * raza * raza;
        System.out.println("Circumferinta cerului: " + p + "\nAria cercului: " + A);
    }

    public static void ex12(int a, int b, int c) { // Write a Java program that takes three numbers as input to calculate and print the average of the numbers
        int media = (a + b + c) / 3;
        System.out.println(media);
    }

    public static void ex13(double lungime, double latime) { // Write a Java program to print the area and perimeter of a rectangle.
        double Aria = lungime * latime;
        double Per = 2 * latime + 2 * lungime;
        System.out.println("Aria: " + Aria + "\nPerimetrul: " + Per);
    }

    public static void ex14() {//Write a Java program to print an American flag on the screen.
        for (int i = 1; i <= 15; i++) {
            if (i <= 7) {
                for (int j = 1; j <= 30; j++) {
                    if (j <= 15) {
                        if (j % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print("=");
                    }
                }
            } else {
                for (int j = 1; j <= 30; j++) {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }

    public static void ex15(int a, int b) {//Write a Java program to swap two variables.
        int swap;
        swap = a;
        a = b;
        b = swap;
        System.out.println("Schimbare variabile intre ele: ");

    }

    public static void ex16() { //Write a Java program to print a face.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1) {
                    if (j == 1 || j == 9) {
                        System.out.print(" ");
                    } else if (j == 2 || j == 8) {
                        System.out.print("+");
                    } else {
                        System.out.print("\"");
                    }
                }
                if (i == 2) {
                    if (j == 1) {
                        System.out.print("[");
                    } else if (j == 9) {
                        System.out.print("]");
                    } else if (j == 2 || j == 8) {
                        System.out.print("|");
                    } else if (j == 4 || j == 6) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i == 3) {
                    if (j == 2 || j == 8) {
                        System.out.print("|");
                    } else if (j == 5) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i == 4) {
                    if (j == 2 || j == 8) {
                        System.out.print("|");
                    } else if (j == 4 || j == 6) {
                        System.out.print("\'");
                    } else if (j == 5) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i == 5) {
                    if (j == 1 || j == 9) {
                        System.out.print(" ");
                    } else if (j == 2 || j == 8) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
        }
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | \'-\' | ");
        System.out.println(" +-----+");
    }

    public static void ex17(String a, String b) { //Write a Java program to add two binary numbers.\Binar
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int sum = b1 + b2;
        String r = Integer.toBinaryString(sum);
        System.out.println(r);
    }

    public static void ex18(String a, String b) { //Write a Java program to multiply two binary numbers.\Binar
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int prod = b1 * b2;
        String r = Integer.toBinaryString(prod);
        System.out.println(r);
    }

    public static void ex19(int a) { //Write a Java program to convert a decimal number to binary number
        String b = Integer.toBinaryString(a);
        System.out.println(b);
    }

    public static void ex20(int a) { //Write a Java program to convert a decimal number to hexadecimal number.
        String r = Integer.toHexString(a);
        System.out.println(r);
    }

    public static void ex21(int a) { //Write a Java program to convert a decimal number to octal number.
        String r = Integer.toOctalString(a);
        System.out.println(r);
    }

    public static void ex22(String binar) { //Write a Java program to convert a binary number to decimal number.
        int r = Integer.parseInt(binar, 2);
        System.out.println(r);
    }

    public static void ex23(String binar) { //Write a Java program to convert a binary number to decimal number.
        int r = Integer.parseInt(binar, 2);
        String t = Integer.toHexString(r);
        System.out.println(t);
    }

    public static void ex24(String binar) { //Write a Java program to convert a binary number to a Octal number.
        int r = Integer.parseInt(binar, 2);
        String t = Integer.toOctalString(r);
        System.out.println(t);
    }

    public static void ex25(String octa) {//Write a Java program to convert a octal number to a decimal number.
        int r = Integer.parseInt(octa, 8);
        System.out.println(r);
    }

    public static void ex26(String octa) {//Write a Java program to convert a octal number to a binary number.
        int r = Integer.parseInt(octa, 8);
        String t = Integer.toBinaryString(r);
        System.out.println(t);
    }


    public static void ex27(String octa) {//Write a Java program to convert a octal number to a hexadecimal number.
        int r = Integer.parseInt(octa, 8);
        String t = Integer.toHexString(r);
        System.out.println(t);
    }

    public static void ex28(String hexa) { //Write a Java program to convert a hexadecimal to a decimal number
        int r = Integer.parseInt(hexa, 16);
        System.out.println(r);

    }

    public static void ex29(String hexa) { //Write a Java program to convert a hexadecimal to a binary number.
        int r = Integer.parseInt(hexa, 16);
        String t = Integer.toBinaryString(r);
        System.out.println(t);
    }

    public static void ex30(String hexa) { //Write a Java program to convert a hexadecimal to a octal number.
        int r = Integer.parseInt(hexa, 16);
        String t = Integer.toOctalString(r);
        System.out.println(t);
    }

    public static void ex31() {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }

    public static void ex32(int a, int b) {
        if (a != b)
            System.out.println(a + " != " + b);
        if (a > b) {
            System.out.println(a + " > " + b);
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
            System.out.println(a + " <= " + b);
        }

    }

    public static void ex33(int a) {
        int sum = 0;
        while ((a % 10) != 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }

    public static void ex34(int s) {
        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + area);
    }

    public static void ex35() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the numer of sides on the polygon: ");
        int a = sc.nextInt();
        System.out.println("Input the length of one of the sides: ");
        int b = sc.nextInt();
        double area = (a * b * b) / (4 * Math.tan(Math.PI / a));
        System.out.println("Area of polygon is: " + area);
    }

    public static void ex36() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1:");
        double x1 = sc.nextDouble();
        x1 = Math.toRadians(x1);
        System.out.println("Input the longitude of coordinate 1:");
        double y1 = sc.nextDouble();
        y1 = Math.toRadians(y1);
        System.out.println("Input the latitude of coordinate 2:");
        double x2 = sc.nextDouble();
        x2 = Math.toRadians(x2);
        System.out.println("Input the longitude of coordinate 2:");
        double y2 = sc.nextDouble();
        y2 = Math.toRadians(y2);
        double radius = 6371.01;
        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between those points is: " + d);
    }

    public static void ex37(String r) {
        String invers = "";
        for (int i = r.length() - 1; i >= 0; i--) {
            invers = invers + r.charAt(i);
        }
        System.out.println(invers);
    }

    public static void ex38(String r) {
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < r.length(); i++) {
            if (Character.isLetter(r.charAt(i))) {
                letter++;
            } else if (Character.isDigit(r.charAt(i))) {
                number++;
            } else if (Character.isSpaceChar(r.charAt(i))) {
                space++;
            } else other++;

        }
        System.out.println("letter: " + letter + "\nspace: " + space + "\nnumber: " + number + "\nother: " + other);
    }

    public static void ex39(){
        int numaratoare=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j&&i!=k&&j!=k){
                        numaratoare+=1;
                        System.out.println(numaratoare+". "+i+""+j+""+k);
                    }
                }
            }
        }
    }
    public static void ex40(){
        Object[] cs=Charset.availableCharsets().values().toArray();
        System.out.println("List of available character sets: ");
        for(int i=0;i<cs.length;i++){
            System.out.println(cs[i].toString());
        }
    }
}



