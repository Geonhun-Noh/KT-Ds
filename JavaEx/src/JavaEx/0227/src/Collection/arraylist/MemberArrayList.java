package Collection.arraylist;

import java.util.*;
import Collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;//Array 변수 선언
	
	public MemberArrayList() {//선언된 Array를 객체로 선언
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {//Array에 멤버 값을 추가하는 메소드
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {//Array에서 매개변수 값과 같은 값을 제거
		for(int i=0;i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();
			if (tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");//매개변수가 Array에 없을 때의 예외처리
		return false;
	}
	
	public void showAllMember() {//Array의 모든 값을 출력
		for(Member member : arrayList) {
			//System.out.println(member.toString()); //기존의 정의된 toString의 리턴값을 새롭게 정의해주어 member 정보가 반환
			System.out.println(member);//System.out.println(member.toString());과 결과가 같다.
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index) {//원하는 인덱스에 해당 멤버 값 삽입
		if(index>arrayList.size()) {
			System.out.println("잘못된 인덱스입니다.");
		}
		else {
			arrayList.add(index, member);
		}	
	}
}
