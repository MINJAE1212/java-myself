package ch3;

public class BookManager_Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("\n===== 도서 관리 프로그램 =====");
            System.out.println("=================================================================");
            System.out.println("1. 도서 추가 , 2. 도서 조회, 3. 도서 수정, 4. 도서 삭제, 5. 검색, 6. 더미 데이터 추가 5개, 0. 종료");
            System.out.println("=================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (menu) {
                case 1:
                    BookManager.addBook(scanner);
                    break;
                case 2:
                    BookManager.viewBooks();
                    break;
                case 3:
                    BookManager.updateBook(scanner);
                    break;
                case 4:
                    BookManager.deleteBook(scanner);
                    break;
                case 5:
                    BookManager.searchBook(scanner);
                    break;
                case 6:
                    BookManager.addDummyBooks();
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0);

        System.out.println("=================================================================");
        System.out.println("프로그램이 종료되었습니다.");
    }
}