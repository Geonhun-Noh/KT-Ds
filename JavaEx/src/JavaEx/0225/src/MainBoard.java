/*
 * 2020.02.25
 * 노건훈
 * 추상클래스 실습예제
 */

import java.util.*;

public class MainBoard {
	public static void main(String[] args) {

		System.out.println("플레이할 레벨을 선택해주세요."); // 레벨 입력 받기
		System.out.println("(Beginner, Advanced, Super 중 선택)");
		Scanner a = new Scanner(System.in);
		String level = a.next();

		System.out.println("플레이 횟수를 입력하세요."); // 플레이 횟수 입력 받기
	
		int num = a.nextInt();
		a.close();
		if (level.equalsIgnoreCase("beginner")) { // 초보자 레벨일 경우
			Player player = new Player();// player 객체 생성
			player.play(num);// 플레이 횟수만큼 진행
		} else if (level.equalsIgnoreCase("advanced")) { // 중급자 레벨일 경우
			Player player = new Player(); // player 객체 생성
			AdvancedLevel aLevel = new AdvancedLevel(); // Advanced 레벨 객체 생성
			player.upgradeLevel(aLevel); // Advanced 레벨로 레벨 설정
			player.play(num); // 플레이 횟수만큼 진행
		} else if (level.equalsIgnoreCase("super")) { // 고급자 레벨일 경우
			Player player = new Player(); // player 객체 생성
			SuperLevel bLevel = new SuperLevel(); // Super 레벨 객체 생성
			player.upgradeLevel(bLevel); // Super 레벨로 레벨 설정
			player.play(num); // 플레이 횟수만큼 진행

		} else { // 예외 처리
			System.out.println("잘못 입력하였습니다.");
		}

	}

}
