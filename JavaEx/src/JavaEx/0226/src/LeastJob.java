
public class LeastJob implements Scheduler {
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("다음으로 짧은 대기열을 보유한 상담원에게 배분합니다.");
	}

}
