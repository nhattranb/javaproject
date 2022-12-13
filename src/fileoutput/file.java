package fileoutput;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class file {
    public static void main(String args[]) {
        File myObj = new File("users.txt");

        String name, address;
        int age;

        Scanner nmap = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(new FileWriter("src\users.txt", true));

        System.out.println("Enter your name");
        String name = nmap.nextLine();

        System.out.println("Enter your address");
        String address = nmap.nextLine();

        System.out.println("Enter your age");
        int age = nmap.nextInt();

        pw.println(name + "," + address + "," + age);

        pw.flush();
        pw.close();
    }
}
