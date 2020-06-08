package Collection.arraylist;

import java.util.*;
import Collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;//Array ���� ����
	
	public MemberArrayList() {//����� Array�� ��ü�� ����
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {//Array�� ��� ���� �߰��ϴ� �޼ҵ�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {//Array���� �Ű����� ���� ���� ���� ����
		for(int i=0;i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();
			if (tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");//�Ű������� Array�� ���� ���� ����ó��
		return false;
	}
	
	public void showAllMember() {//Array�� ��� ���� ���
		for(Member member : arrayList) {
			//System.out.println(member.toString()); //������ ���ǵ� toString�� ���ϰ��� ���Ӱ� �������־� member ������ ��ȯ
			System.out.println(member);//System.out.println(member.toString());�� ����� ����.
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index) {//���ϴ� �ε����� �ش� ��� �� ����
		if(index>arrayList.size()) {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
		else {
			arrayList.add(index, member);
		}	
	}
}
