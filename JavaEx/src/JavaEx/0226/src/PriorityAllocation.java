
public class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("상담 전화를 높은 고객 등급에 따라 우선으로 가져옵니다 .");
	}
	public void sendCallToAgent() {
		System.out.println("높은 고객 등급의 전화는 우수 상담원에게 배분합니다.");
	}
	

}
