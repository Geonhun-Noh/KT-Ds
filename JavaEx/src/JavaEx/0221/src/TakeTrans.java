
public class TakeTrans {

	public static void main(String[] args) {
		Student std_A = new Student("Pogba",60000);
		Student std_B = new Student("Messi",35000);
		Student std_C = new Student("Son",49000);
		
		Bus bus100= new Bus(100);
		std_A.takeBus(bus100);
		std_A.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2ȣ��");
		std_B.takeSubway(subwayGreen);
		std_B.showInfo();
		subwayGreen.showInfo();
		
		Taxi ��� = new Taxi("Black");
		std_C.takeTaxi(���);
		std_C.showInfo();
		���.showInfo();
	}

}
