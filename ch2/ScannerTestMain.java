package ch2;

import java.util.Scanner;

import util.UserService;

public class ScannerTestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService.registerUser(scanner);
        UserService.LoginUser(scanner);
        scanner.close();
    }

}
