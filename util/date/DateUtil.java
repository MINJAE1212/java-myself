
package util.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String getCurrentDateTime() {

        LocalDateTime now = LocalDateTime.now(); // 현재 날짜와 시간 가져오기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분");
        // 반환하기.
        String result = now.format(formatter); // 현재 날짜와 시간을 지정된 형식으로 포맷팅
        return result; // 포맷을 적용하여 문자열로 변환하여 반환

    }

}
