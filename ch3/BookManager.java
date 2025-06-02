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
        if (bookCount >= MAX_BOOKS) {
            System.out.println("도서 등록이 가득 찼습니다.");
            return;
        }

        System.out.print("도서 제목을 입력하세요: ");
        String title = scanner.nextLine();
        titles[bookCount] = title;

        System.out.print("저자를 입력하세요: ");
        String author = scanner.nextLine();
        authors[bookCount] = author;

        System.out.print("출판사를 입력하세요: ");
        String publisher = scanner.nextLine();
        publishers[bookCount] = publisher;

        registrationDates[bookCount] = DateUtil.getCurrentDateTime();
        bookCount++;

        System.out.println("도서가 추가되었습니다: " + title);
    }

    // 도서 목록 조회
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        System.out.println("\n등록된 도서 목록:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(i + ". " + titles[i] + " / " + authors[i] + " / " + publishers[i] + " / 등록일: "
                    + registrationDates[i]);
        }
    }

    // 도서 수정
    public static void updateBook(Scanner scanner) {
        System.out.print("수정할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // 개행 제거

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.print("수정할 도서 제목: ");
        titles[index] = scanner.nextLine();

        System.out.print("수정할 저자: ");
        authors[index] = scanner.nextLine();

        System.out.print("수정할 출판사: ");
        publishers[index] = scanner.nextLine();

        registrationDates[index] = DateUtil.getCurrentDateTime();

        System.out.println("도서 정보가 수정되었습니다.");
    }

    // 도서 삭제
    public static void deleteBook(Scanner scanner) {
        System.out.print("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // 개행 제거

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.println("삭제할 도서: " + titles[index]);
        for (int i = index; i < bookCount - 1; i++) {
            titles[i] = titles[i + 1];
            authors[i] = authors[i + 1];
            publishers[i] = publishers[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }

        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }

    // 도서 검색 (제목 기준)
    public static void searchBook(Scanner scanner) {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        System.out.print("검색할 도서 제목의 일부 또는 전체를 입력하세요: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("\n검색 결과:");
        for (int i = 0; i < bookCount; i++) {
            if (titles[i].toLowerCase().contains(keyword)) {
                System.out.println(i + ". " + titles[i] + " / " + authors[i] + " / " + publishers[i] + " / 등록일: "
                        + registrationDates[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

}