package util;

import java.util.Scanner;

public class UserService {

    public static void registerUser(Scanner scanner) {
        System.out.println("홈페이지 가입");

        System.out.println("이름 입력해주세요: ");
        String name = scanner.nextLine();

        System.out.println("이메일 입력해주세요: ");
        String email = scanner.nextLine();

        System.out.println("현재 시간을 불러오는 기능 확인.");
        String currentTime = DateUtil.getCurrentDateTime();

        // ============================================================================================
        String password;
        // while 문에서, 패스워드 부분이 입력이 맞으면 다음 단계, 아니면 , 계속 확인하기.
        while (true) {
            System.out.println("패스워드 입력해주세요 > ");
            password = scanner.nextLine(); // 패스워드 입력 받기

            System.out.println("패스워드 확인 입력해주세요 > ");
            String password2 = scanner.nextLine(); // 패스워드 입력 받기

            // 패스워드가 비어있지 않은지 확인
            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
            } else if (password.equals(password2)) { // 패스워드와 확인 입력이 일치하는지 확인
                System.out.println("패스워드가 일치합니다");
                break; // 패스워드가 일치하면 루프 종료
            } else {
                System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        // System.out.println("패스워드 입력해주세요: ");
        // String password = scanner.nextLine();

        // ======================================================================================

        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("현재 시간: " + currentTime);
        System.out.println("패스워드: " + password);
        System.out.println("회원 가입 완료 되었습니다.");

    }

    public static void LoginUser(Scanner scanner) {
        System.out.println("로그인기능");

        String Loginemail = ""; // 이메일 변수 초기화
        String Loginpassword = ""; // 패스워드 변수 초기화
        while (true) {

            System.out.println("이메일 입력해주세요 > ");
            Loginemail = scanner.nextLine(); // 이메일 입력 받기

            if (Loginemail.isEmpty()) {
                System.out.println("이메일은 비워둘 수 없습니다. 다시 입력해주세요.");
                continue; // 다시 입력 받기 -> while 루프의 처음으로 돌아감 -> 계속 반복 진행한다.
            }
            // 순서2, 패스워드 입력 받기
            System.out.println("패스워드 입력해주세요 > ");
            Loginpassword = scanner.nextLine(); // 패스워드 입력 받기

            // 패스워드가 비어있으면, 다시 입력 받기
            if (Loginpassword.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
                continue; // 다시 입력 받기
            }
            if (Loginemail.equals("admin@naver.com") && Loginpassword.equals("1234")) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패, 이메일 또는 패스워드를 확인해주세요.");
                continue; // 다시 입력 받기
            }
            break;

        }

        // System.out.println("로그인 이메일 입력해주세요: ");
        // String Loginemail = scanner.nextLine();

        // System.out.println("로그인 패스워드 입력해주세요: ");
        // String Loginpassword = scanner.nextLine();

        System.out.println("이메일: " + Loginemail);
        System.out.println("패스워드: " + Loginpassword);

        System.out.println("로그인 완료되었습니다.");

    }

}
