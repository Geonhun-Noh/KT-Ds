

//����ó���� ����ϸ� ���α׷��� ������ ����Ǵ� ���� �����Ѵ�.(Terminate���� �ʰ� ������ ����ǵ��� ��.)
public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try { //try���� �����ϴٰ� ���� �߻��ϸ� catch�� �Ѿ
			for(int i =0;i<=7;i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) { //try���� ���� �߻� �� catch�� �Ѿ�ͼ� ����
			System.out.println(e);
			System.out.println("����ó���κ�");
		}
		System.out.println("���α׷� ����");
	}

}
