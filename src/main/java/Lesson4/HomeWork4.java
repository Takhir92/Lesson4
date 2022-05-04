package Lesson4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Сторона a=");
        int a = scanner.nextInt();
        System.out.println("Сторона b=");
        int b = scanner.nextInt();
        System.out.println("Сторона c=");
        int c = scanner.nextInt();

        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь = " + s);
        scanner.close();
        return false;
    }


}


