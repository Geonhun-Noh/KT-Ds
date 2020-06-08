package Map.HashMap;

import java.util.*;
import Collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;//hashMap 변수 선언
	
	public MemberHashMap() {
		hashMap=new HashMap<Integer,Member>(); // 객체 선언
	}
	
	public void addMember(Member member) { //Member를 추가하는 메소드 선언
		hashMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) { // Member를 삭제하는 메소드 선언
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // Iterator를 사용하여 전체 Member 출력
		Iterator <Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	

}
