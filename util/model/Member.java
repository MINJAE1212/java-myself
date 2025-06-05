package util.model;

public class Member {

    String name; // 회원 이름
    String email; // 회원 이메일
    String password; // 회원 비밀번호
    String regDate; // 회원 가입 날짜

    public Member(String name, String email, String password, String regDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.regDate = regDate;
    }

    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("이메일: " + this.email);
        System.out.println("비밀번호: " + this.password);
        System.out.println("가입 날짜: " + this.regDate);

    }

}
