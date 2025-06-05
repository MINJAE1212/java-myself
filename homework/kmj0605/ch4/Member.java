package homework.kmj0605.ch4;

public class Member {

    String model; // 차종, 세단, SUV 등
    String price; // 가격
    String company;
    String regDate; // 제조사

    public Member(String model, String price, String company, String regDate) {
        this.model = model;
        this.price = price;
        this.company = company;
        this.regDate = regDate;
    }

    public void showInfo() {
        // this : 현재 객체를 가리키는 키워드
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
        System.out.println("제조날짜 : " + this.regDate);
    }

    public String getName() {
        return model;
    }

    // 이메일 조회 기능, 게터 getter
    public String getEmail() {
        return company;
    }
}
