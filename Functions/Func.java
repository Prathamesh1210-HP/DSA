package DSA.Functions;

import java.util.Scanner;

public class Func {
    public static void printMyname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyname(name);

    }
}
