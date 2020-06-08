package Collection;

public class Member { //Collection ��Ű������ memberID, memberName ������ ������ Member Ŭ���� ����
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {//Member Ŭ������ ���� ����
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberID() {//memberID�� private�̱� ������ getMemberID�� �� ��ȯ
		return memberID;
	}
	public void setMemberID(int memberID) {//setMemberID�� ID�� �Է�
		this.memberID = memberID;
	}
	public String getMemberName() {//getMemberName���� memberID �� ��ȯ
		return memberName;
	}
	public void setMemberName(String memberName) {//setMemberName���� �̸��� �Է�
		this.memberName=memberName;
	}
	
	@Override
	public String toString() {
		//�̹� ��ü ���ǵ� �޼ҵ��̴�. Member�� ������ ȣ���ؼ� ������� �� �ּҰ��� ��������
		//���ϰ��� ������ ���� �����Ͽ� Member Ŭ���� ���� �� ���� ���ϰ����� ��ȯ�ȴ�.
		return memberName + " ȸ������ ���̵�� "+ memberID+"�Դϴ�.";
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
