package util;

import java.util.Scanner;

public class UserService {

    public static void registerUser(Scanner scanner) {
        System.out.println("홈페이지 가입");

        System.out.println("이름 입력해주세요: ");
        String name = scanner.nextLine();

        System.out.println("이메일 입력해주세요: ");
        String email = scanner.nextLine();

        System.out.println("패스워드 입력해주세요: ");
        String password = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("패스워드: " + password);

        System.out.println("회원 가입 완료 되었습니다.");

    }

    public static void LoginUser(Scanner scanner) {
        System.out.println("로그인기능");

        System.out.println("로그인 이메일 입력해주세요: ");
        String Loginemail = scanner.nextLine();

        System.out.println("로그인 패스워드 입력해주세요: ");
        String Loginpassword = scanner.nextLine();

        System.out.println("이메일: " + Loginemail);
        System.out.println("패스워드: " + Loginpassword);

        System.out.println("로그인 완료되었습니다.");

    }

}
