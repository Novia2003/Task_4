package ru.vsu.cs.novichikhin;

public class Main {

    public static void main(String[] args) {
        int q = 0;
        int quantity = findQuantity(q);
        printQuantity(quantity);
    }
    static int findQuantity(int q) {
        int num = 99;
        while (num != 1000) {
            num++;
            if (checkCondition(num)) {
               q++; 
            }
            }
        return q;
        }
    static boolean checkCondition(int num) {
        int hundreds = num / 100;
        int dozens = (num/10) % 10;
        int units = num % 10;
        return Math.abs((hundreds - dozens)) >= 3 && Math.abs((hundreds - units)) >= 3 && Math.abs((units - dozens)) >= 3;
    }
    static void printQuantity(int quantity) {
        System.out.println("Колличество чисел от 100 до 999 таких, что каждая цифра числа отличается от других цифр не менее, чем на 3 равно " + quantity);
    }
}
