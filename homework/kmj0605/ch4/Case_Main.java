package homework.kmj0605.ch4;

import java.util.Scanner;

public class Case_Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("===== 자동차 관리 프로그램 =====");
            System.out.println("=================================================================");
            System.out.println("1. 차량 추가 , 2. 차량 조회, 3. 차량 수정, 4. 차량 삭제, 5. 검색, 6. 더미 데이터 추가 5개,  0. 종료");
            System.out.println("=================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    AArray.addCars(scanner);
                    break;
                case 2:
                    AArray.viewCars();
                    break;
                case 3:
                    AArray.updateCars(scanner);
                    break;
                case 4:
                    AArray.deleteCars(scanner);
                    break;
                case 5:
                    AArray.searchCars(scanner);
                    break;
                case 6:
                    AArray.addDummyCars();
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0);

        scanner.close();
    }
}