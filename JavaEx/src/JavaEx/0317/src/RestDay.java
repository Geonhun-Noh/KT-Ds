import java.util.*;
import java.text.SimpleDateFormat;

public class RestDay {

	// 토요일, 일요일 인지 확인
	public static boolean isRest(Calendar tod) {
		boolean isRest = false;
		if (tod.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || tod.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			isRest = true;
		}
		return isRest;
	}

	// Calendar를 문자열로 전환
	public static String toYMD(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}

	public static void main(String[] args) {
		System.out.println("휴무일을 확인하세요!");
		Scanner input = new Scanner(System.in);

		System.out.print("년도 : ");
		int year = input.nextInt();

		System.out.print("월 : ");
		int month = input.nextInt();

		System.out.print("일 : ");
		int day = input.nextInt();

		input.close();

		Calendar cal = Calendar.getInstance(); // 오늘의 정보가 저장된 Calendar 생성
		cal.set(year, month, day);

		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 이 달의 마지막 날을 지정
		for (int i = 1; i <= lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); // 1일부터 마지막날까지
			if (isRest(cal)) { // 휴일(토,일) 확인
				System.out.println(toYMD(cal) + "은 휴일입니다.");
			}
		}
	}

}
