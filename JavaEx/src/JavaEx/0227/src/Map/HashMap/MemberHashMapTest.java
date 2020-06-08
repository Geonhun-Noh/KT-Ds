package Map.HashMap;

import Collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark=new Member(1001,"������");
		Member memberSon=new Member(1002,"�����");
		Member memberLee=new Member(1003,"��û��");
		Member memberKi=new Member(1004,"�⼺��");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKi);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
