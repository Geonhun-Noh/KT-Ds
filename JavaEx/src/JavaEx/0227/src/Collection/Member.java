package Collection;

public class Member { //Collection 패키지에서 memberID, memberName 변수를 가지는 Member 클래스 생성
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {//Member 클래스에 인자 선언
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberID() {//memberID가 private이기 때문에 getMemberID로 값 반환
		return memberID;
	}
	public void setMemberID(int memberID) {//setMemberID로 ID값 입력
		this.memberID = memberID;
	}
	public String getMemberName() {//getMemberName으로 memberID 값 반환
		return memberName;
	}
	public void setMemberName(String memberName) {//setMemberName으로 이름값 입력
		this.memberName=memberName;
	}
	
	@Override
	public String toString() {
		//이미 자체 정의된 메소드이다. Member를 실제로 호출해서 사용했을 때 주소값이 보였지만
		//리턴값을 다음과 같이 정의하여 Member 클래스 실행 시 다음 리턴값으로 반환된다.
		return memberName + " 회원님의 아이디는 "+ memberID+"입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID)
				return true;
			else return false;
				
		}
		return false;
	}

}
