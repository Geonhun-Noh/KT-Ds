//스레드 예제
// 비프음 발생시키면서 동시에 출력을 하려면 하나는 메인 스레드에서, 그리고 나머지는 다른 스레드에서 실행해야 한다.
import java.awt.*;

public class BeepPrintEx {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);
		}catch(Exception e) {}
	}
		for (int i = 0;i<5;i++) {
		System.out.println("띵");
		try { Thread.sleep(500);
	}catch(Exception e) {}
		}
	}
}
