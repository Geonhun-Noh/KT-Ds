
public class ComputerTest {
	
	public static void main(String[] args) {
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.turnOn();
		c2.turnOff();
		c4.turnOn();
		c4.turnOff();
	}

}
