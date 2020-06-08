package Map.HashMap;

import Collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark=new Member(1001,"박지성");
		Member memberSon=new Member(1002,"손흥민");
		Member memberLee=new Member(1003,"이청용");
		Member memberKi=new Member(1004,"기성용");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKi);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
