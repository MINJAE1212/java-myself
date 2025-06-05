package homework.kmj0605.ch4;

import java.util.Scanner;
import util.date.DateUtil;
import homework.kmj0605.ch4.Member;

public class AArray {

    static final int MAX_USERS = 100;

    static Member[] members = new Member[MAX_USERS];

    static int userCount = 0;

    // 추가 메서드
    public static void addCars(Scanner scanner) {
        if (userCount < MAX_USERS) {
            System.out.println("차량이름을 입력하세요: ");
            String model = scanner.nextLine();

            System.out.println("차량가격을 입력하세요: ");
            String price = scanner.nextLine();

            System.out.println("제조사명을 입력하세요: ");
            String company = scanner.nextLine();

            String regDate = DateUtil.getCurrentDateTime();

            Member member = new Member(model, price, company, regDate);

            members[userCount] = member;

            userCount++;
            System.out.println("차량이 추가되었습니다: " + model + ", " + price + ", " + company + ", " + regDate);
        } else {
            System.out.println("차량 수가 최대치를 초과했습니다.");
        }
    } // 추가 메서드

    // 조회 메서드
    public static void viewCars() {
        if (userCount == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        System.out.println("등록된 차량 목록:");
        for (int i = 0; i < userCount; i++) {

            members[i].showInfo();
        }
    } // 조회 메서드

    // 수정 메서드
    public static void updateCars(Scanner scanner) {
        System.out.println("수정할 차량의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 차량의 이름을 입력하세요: ");
        String model = scanner.nextLine();

        System.out.println("수정할 차량의 가격을 입력하세요: ");
        String price = scanner.nextLine();

        System.out.println("수정할 차량의 제조사명를 입력하세요: ");
        String company = scanner.nextLine();

        String regDate = DateUtil.getCurrentDateTime();
        Member member = new Member(model, price, company, regDate);
        members[index] = member;
        System.out.println("차량 정보가 수정되었습니다: " + model + ", " + price + ", "
                + regDate);
    } // 수정 메서드

    // 삭제 메서드
    public static void deleteCars(Scanner scanner) {
        System.out.println("삭제할 차량의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        Member member = members[index];
        System.out.println("삭제할 차량 정보: ");
        member.showInfo(); // 회원 정보 출력

        for (int i = index; i < userCount - 1; i++) {
            members[i] = members[i + 1]; // 다음 인덱스의 회원 정보를 현재 인덱스로 이동
        }
        // 마지막 인덱스의 회원 정보는 null로 설정
        members[userCount - 1] = null; // 마지막 인덱스의 회원 정보 삭제

        // 회원 수 감소
        userCount--;
        System.out.println("차량이 삭제되었습니다.");
    }
    // 삭제 메서드

    // 더미 데이터 5개 추가하는 메서드
    public static void addDummyCars() {
        for (int i = 0; i < 5; i++) {
            if (userCount < MAX_USERS) {

                Member dummyMember = new Member(
                        "더미회원" + (i + 1),
                        "password" + (i + 1),
                        "dummy" + (i + 1) + "@example.com",
                        DateUtil.getCurrentDateTime());

                members[userCount] = dummyMember;

                userCount++;
            } else {
                System.out.println("더미  추가 실패: 최대 회원 수 초과");
                break;
            }
        }
        System.out.println("더미 차량 5 추가되었습니다.");
    }
    // 더미 데이터 5개 추가하는 메서드

    // 검색 기능
    public static void searchCars(Scanner scanner) {
        System.out.println("검색할 차량의 이름 또는 가격을 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            // 변경, Member , getName(), getEmail() 메서드 사용, 이용해서 검색 기능 구현하기.
            if (members[i].getName().contains(searchQuery) || members[i].getEmail().contains(searchQuery)) {
                // System.out.println("검색 결과: " + (i + 1) + ". " + names[i] + ", " + emails[i] +
                // ", "
                // + registrationDates[i]);
                members[i].showInfo(); // 회원 정보 출력
                found = true;
            }
        }

        if (!found) { // 검색 결과가 있을 경우, 실행이 안됨, found = true; -> false;
            System.out.println("검색 결과가 없습니다.");
        }
    }
    // 검색 기능

}
