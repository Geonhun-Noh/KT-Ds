import java.util.*;

public class CalendarTest {
	
	public static void main(String[] args) {
		System.out.println("���� ���� ��ĥ�� ��ƿ�����? ������ �Է��ϼ���!");
		Scanner input = new Scanner(System.in);
		System.out.print("���� : ");
		int year = input.nextInt();
		
		System.out.print("�� : ");
		int month = input.nextInt();
		
		System.out.print("�� : ");
		int day = input.nextInt();
		input.close();
		
		
		long millis = System.currentTimeMillis();//1994.1.1���� ����ð� msec
		System.out.println(millis/1000/24/60/60);//���� ���
		Date d=new Date(); // ����
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);//�Ϸ� ��
		System.out.println(dd);
		
		Calendar cal1994=Calendar.getInstance();
		//cal1994.set(1994.3.29); //0��~11��
		cal1994.set(year,month-1,day); //0��~11��
		Calendar today=Calendar.getInstance();//����
		printCalendar(today);
		long minus = today.getTimeInMillis()-cal1994.getTimeInMillis();
		System.out.println("���ñ��� ��ƿ� �ð�(msec) : "+ minus+" �и� ��");//1994.4.29~���� msec
		System.out.println("���ñ��� ��ƿ� ��¥(day) : "+minus/1000/24/60/60+"��");//1994�� ���� ���� ��������
	}

	public static void printCalendar(Calendar c) {
		System.out.println("----------------------------------------------");
//		System.out.println(c.get(Calendar.YEAR)); //(����)�� ��
//		System.out.println(c.get(Calendar.MONTH)+1); //(����)�� ��
//		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //(����)�� ��
//		System.out.println(c.get(Calendar.AM_PM));// 1:pm, 0:am
//		System.out.println(c.get(Calendar.HOUR_OF_DAY));//�� �� 
//		System.out.println(c.get(Calendar.MINUTE));//�� ��
//		System.out.println(c.get(Calendar.SECOND));//�� ��
	}

}
