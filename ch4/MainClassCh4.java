package ch4;

public class MainClassCh4 {
    public static void main(String[] args) {

        // Phone[] phones = new Phone[5];

        // Phone phone1 = new Phone("Galaxy S23", "100만원", "삼성전자");
        // Phone phone2 = new Phone("iPhone 13", "120만원", "Apple");
        // Phone phone3 = new Phone("Pixel 7", "70만원", "Google");
        // Phone phone4 = new Phone("iPhone 11", "80만원", "Apple");
        // Phone phone5 = new Phone("iPhone 12", "70만원", "Apple");
        // // 1. 배열에 객체를 할당
        // // phones[0] = phone1; // 0번째 요소에 phone1 객체 할당
        // // phones[1] = phone2; // 1번째 요소에 phone2 객체 할당
        // // phones[2] = phone3; // 2번째 요소에 phone3 객체 할당
        // // phones[3] = phone4; // 3번째 요소에 phone4 객체 할당
        // // phones[4] = phone5; // 4번째 요소에 phone5 객체 할당

        // // 2. 배열에 직접 할당.
        // // Phone[] phones2 = {
        // // phone1,
        // // phone2,
        // // phone3,
        // // phone4,
        // // phone5
        // // };

        // System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        // System.out.println("phone2 주소: " + System.identityHashCode(phone2));
        // System.out.println("phone3 주소: " + System.identityHashCode(phone3));
        // System.out.println("phone4 주소: " + System.identityHashCode(phone4));
        // System.out.println("phone5 주소: " + System.identityHashCode(phone5));

        // 반복문을 이용해서, 순회해서 출력.
        // for (int i = 0; i < phones.length; i++) {
        // // 각 요소에 있는 객체의 정보를 출력
        // // phones[0] -> phone1 -> showInfo();
        // phones[i].showInfo();
        // System.out.println("-----------------");
        // }

        // ================================================================================================================
        // Phone phone1 = new Phone();
        // phone1.model = "Galaxy";
        // phone1.price = "100만원";
        // phone1.company = "삼성전자";
        // phone1.showInfo();
        // System.out.println("============================");

        // Phone phone2 = new Phone("iPhone");
        // phone2.price = "120만원";
        // phone2.company = "애플";
        // phone2.showInfo();
        // System.out.println("============================");

        // Phone phone3 = new Phone("Pixel", "80만원");
        // phone3.company = "구글";
        // phone3.showInfo();
        // System.out.println("============================");

        // Phone phone4 = new Phone("Pixel", "80만원", "구글");
        // phone4.showInfo();
        // System.out.println("============================");

        // // =========================================================
        // Phone phone5 = new Phone("aabb", "800만원");
        // phone5.showInfo();
        // System.out.println("============================");
        // ===================================================================================================================================

        // 문자열 타입을 요소로 가지는 배열.
        // String[] carModels = { "suv", "k5세단", "아반떼", "소나타", "그랜저" };
        // // 정수 타입을 요소로 가지는 배열.
        // int[] carPrices = { 4000, 3000, 2500, 3500, 5000 }; // 단위 : 만원

        // Car car1 = new Car(); // 기본 생성자 호출

        // car1.model = "suv";
        // car1.price = "4000만원";
        // car1.company = "기아자동차";

        // car1.showInfo();

        // Car car2 = new Car(); // 기본 생성자 호출
        // car2.model = "k5세단";
        // car2.price = "3000만원";
        // car2.company = "기아자동차";
        // car2.showInfo();

    }
}
