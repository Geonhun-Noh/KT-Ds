/*
 * import java.util.Scanner; import java.util.Random;
 * 
 * public class Exit {
 * 
 * public static void main(String[] args) { Scanner input = new
 * Scanner(System.in); Random myTurnNum = new Random(); int outNum =
 * myTurnNum.nextInt(4) + 1; // 게임 시작 System.out.println("지금부터 딸기게임을 시작합니다~~");
 * System.out.println("진행하시려면 '고고'를 멈추시려면 '그만'을 입력해주세요."); for (;;) { String
 * text1 = input.next(); // 게임 종료 명령 if (text1.equalsIgnoreCase("그만")) {
 * System.out.println("게임이 종료되었습니다."); break; // 게임 진행 명령 } else if
 * (text1.equalsIgnoreCase("고고")) { // input 숫자만큼 '딸기'로 반환
 * System.out.println("1~4 사이의 정수를 입력하세요!!"); for (;;) { int number =
 * input.nextInt(); switch (number) { case 1: System.out.println("딸기!\n 내 차례! "
 * + outNum); break; case 2: System.out.println("딸기딸기!\n 내 차례! " + outNum);
 * break; case 3: System.out.println("딸기딸기딸기!\n 내 차례! " + outNum); break; case
 * 4: System.out.println("딸기딸기딸기딸기!\n 내 차례! " + outNum); break; default:
 * System.out.println("1부터 4 사이의 수로 다시 입력하세요!!"); }
 * 
 * }
 * 
 * String textGame = input.next();
 * 
 * switch (outNum) { case 1: if (textGame.equalsIgnoreCase("딸기")) {
 * System.out.println("오올~ 다음 숫자를 입력하세요~"); } break; case 2: if
 * (textGame.equalsIgnoreCase("딸기딸기")) {
 * System.out.println("오올~ 다음 숫자를 입력하세요~"); } break; case 3: if
 * (textGame.equalsIgnoreCase("딸기딸기딸기")) {
 * System.out.println("오올~ 다음 숫자를 입력하세요~"); } break; case 4: if
 * (textGame.equalsIgnoreCase("딸기딸기딸기딸기")) {
 * System.out.println("오올~ 다음 숫자를 입력하세요~"); } break; default:
 * System.out.println("땡!! 다시 내 차례~ " + outNum); }
 * 
 * } else { System.out.println("'고고' 또는 '그만'을 입력해주세요."); } } } }
 * 
 * 
 */