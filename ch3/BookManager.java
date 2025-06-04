package ch3;

import java.util.Scanner;

import util.date.DateUtil;

public class BookManager {

    static final int MAX_BOOKS = 100;
    static String[] titles = new String[MAX_BOOKS];
    static String[] authors = new String[MAX_BOOKS];
    static String[] publishers = new String[MAX_BOOKS];
    static String[] registrationDates = new String[MAX_BOOKS];
    static int bookCount = 0;

    // 도서 추가
    public static void addBook(Scanner scanner) {
        if (bookCount < MAX_BOOKS) {

            System.out.print("도서 제목을 입력하세요: ");
            String title = scanner.nextLine();
            titles[bookCount] = title;

            System.out.print("저자를 입력하세요: ");
            String author = scanner.nextLine();
            authors[bookCount] = author;

            System.out.print("출판사를 입력하세요: ");
            String publisher = scanner.nextLine();
            publishers[bookCount] = publisher;

            String registrationDate = DateUtil.getCurrentDateTime();
            registrationDates[bookCount] = registrationDate;

            bookCount++;

            System.out.println(
                    "도서가 추가되었습니다: " + title + " / " + author + " / " + publisher + " / 등록일: " + registrationDate);
        } else {
            System.out.println("도서 목록이 가득 찼습니다. 더 이상 추가할 수 없습니다.");
        }

    }

    // 도서 목록 조회
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        System.out.println("등록된 도서 목록:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("인덱스번호" + i + ". " + (i + 1) + ". " + titles[i] + " , " + authors[i] + " , "
                    + publishers[i] + " , 등록일: "
                    + registrationDates[i]);
        }
    }

    // 도서 수정
    public static void updateBook(Scanner scanner) {
        System.out.print("수정할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.print("수정할 도서 제목: ");
        String title = scanner.nextLine();
        titles[index] = title;

        System.out.print("수정할 저자: ");
        String author = scanner.nextLine();
        authors[index] = author;

        System.out.print("수정할 출판사: ");
        String publisher = scanner.nextLine();
        publishers[index] = publisher;

        String registrationDate = DateUtil.getCurrentDateTime();
        registrationDates[index] = registrationDate;

        System.out.println("도서 정보가 수정되었습니다." + titles[index] + ", " + authors[index]);
    }

    // 도서 삭제
    public static void deleteBook(Scanner scanner) {
        System.out.print("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.println("삭제할 도서: " + titles[index] + ", " + authors[index]);
        for (int i = index; i < bookCount - 1; i++) {
            titles[i] = titles[i + 1];
            authors[i] = authors[i + 1];
            publishers[i] = publishers[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }
        titles[bookCount - 1] = null;
        authors[bookCount - 1] = null;
        publishers[bookCount - 1] = null;
        registrationDates[bookCount - 1] = null;

        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }

    // 더미 회원 추가
    public static void addDummyUsers() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_BOOKS) {
                titles[bookCount] = "도서제목" + (i + 1);
                authors[bookCount] = "저자" + (i + 1);
                publishers[bookCount] = "출판사" + (i + 1);
                registrationDates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            } else {
                System.out.println("더미 도서 추가 실패: 최대 도서수 초과");
                break;
            }
        }
        System.out.println("더미 도서 5권이 추가되었습니다.");
    }

    // 도서 검색
    public static void searchBook(Scanner scanner) {

        System.out.print("검색할 도서 제목의 일부 또는 전체를 입력하세요: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].toLowerCase().contains(keyword) || authors[i].toLowerCase().contains(keyword)) {
                System.out.println(
                        "검색결과: " + (i + 1) + ". " + titles[i] + " , " + authors[i] + " , " + publishers[i] + " , 등록일: "
                                + registrationDates[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

}