import java.util.*;

public class CalendarTest {
	
	public static void main(String[] args) {
		System.out.println("과연 나는 며칠을 살아왔을까? 생일을 입력하세요!");
		Scanner input = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = input.nextInt();
		
		System.out.print("월 : ");
		int month = input.nextInt();
		
		System.out.print("일 : ");
		int day = input.nextInt();
		input.close();
		
		
		long millis = System.currentTimeMillis();//1994.1.1투버 경과시간 msec
		System.out.println(millis/1000/24/60/60);//몇일 경과
		Date d=new Date(); // 오늘
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);//하루 후
		System.out.println(dd);
		
		Calendar cal1994=Calendar.getInstance();
		//cal1994.set(1994.3.29); //0월~11월
		cal1994.set(year,month-1,day); //0월~11월
		Calendar today=Calendar.getInstance();//오늘
		printCalendar(today);
		long minus = today.getTimeInMillis()-cal1994.getTimeInMillis();
		System.out.println("오늘까지 살아온 시간(msec) : "+ minus+" 밀리 초");//1994.4.29~오늘 msec
		System.out.println("오늘까지 살아온 날짜(day) : "+minus/1000/24/60/60+"일");//1994년 부터 몇일 지났는지
	}

	public static void printCalendar(Calendar c) {
		System.out.println("----------------------------------------------");
//		System.out.println(c.get(Calendar.YEAR)); //(오늘)몇 년
//		System.out.println(c.get(Calendar.MONTH)+1); //(오늘)몇 월
//		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //(오늘)몇 일
//		System.out.println(c.get(Calendar.AM_PM));// 1:pm, 0:am
//		System.out.println(c.get(Calendar.HOUR_OF_DAY));//몇 시 
//		System.out.println(c.get(Calendar.MINUTE));//몇 분
//		System.out.println(c.get(Calendar.SECOND));//몇 초
	}

}
