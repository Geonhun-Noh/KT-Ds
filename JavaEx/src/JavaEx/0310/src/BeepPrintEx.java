//������ ����
// ������ �߻���Ű�鼭 ���ÿ� ����� �Ϸ��� �ϳ��� ���� �����忡��, �׸��� �������� �ٸ� �����忡�� �����ؾ� �Ѵ�.
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
		System.out.println("��");
		try { Thread.sleep(500);
	}catch(Exception e) {}
		}
	}
}
