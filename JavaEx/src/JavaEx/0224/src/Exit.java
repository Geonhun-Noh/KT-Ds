/*
 * import java.util.Scanner; import java.util.Random;
 * 
 * public class Exit {
 * 
 * public static void main(String[] args) { Scanner input = new
 * Scanner(System.in); Random myTurnNum = new Random(); int outNum =
 * myTurnNum.nextInt(4) + 1; // ���� ���� System.out.println("���ݺ��� ��������� �����մϴ�~~");
 * System.out.println("�����Ͻ÷��� '���'�� ���߽÷��� '�׸�'�� �Է����ּ���."); for (;;) { String
 * text1 = input.next(); // ���� ���� ��� if (text1.equalsIgnoreCase("�׸�")) {
 * System.out.println("������ ����Ǿ����ϴ�."); break; // ���� ���� ��� } else if
 * (text1.equalsIgnoreCase("���")) { // input ���ڸ�ŭ '����'�� ��ȯ
 * System.out.println("1~4 ������ ������ �Է��ϼ���!!"); for (;;) { int number =
 * input.nextInt(); switch (number) { case 1: System.out.println("����!\n �� ����! "
 * + outNum); break; case 2: System.out.println("�������!\n �� ����! " + outNum);
 * break; case 3: System.out.println("����������!\n �� ����! " + outNum); break; case
 * 4: System.out.println("�������������!\n �� ����! " + outNum); break; default:
 * System.out.println("1���� 4 ������ ���� �ٽ� �Է��ϼ���!!"); }
 * 
 * }
 * 
 * String textGame = input.next();
 * 
 * switch (outNum) { case 1: if (textGame.equalsIgnoreCase("����")) {
 * System.out.println("����~ ���� ���ڸ� �Է��ϼ���~"); } break; case 2: if
 * (textGame.equalsIgnoreCase("�������")) {
 * System.out.println("����~ ���� ���ڸ� �Է��ϼ���~"); } break; case 3: if
 * (textGame.equalsIgnoreCase("����������")) {
 * System.out.println("����~ ���� ���ڸ� �Է��ϼ���~"); } break; case 4: if
 * (textGame.equalsIgnoreCase("�������������")) {
 * System.out.println("����~ ���� ���ڸ� �Է��ϼ���~"); } break; default:
 * System.out.println("��!! �ٽ� �� ����~ " + outNum); }
 * 
 * } else { System.out.println("'���' �Ǵ� '�׸�'�� �Է����ּ���."); } } } }
 * 
 * 
 */