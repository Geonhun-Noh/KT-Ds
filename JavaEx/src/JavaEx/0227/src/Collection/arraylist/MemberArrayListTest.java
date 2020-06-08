package Collection.arraylist;

import Collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이청용");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박지성");
		Member memberKi = new Member(1004,"기성용");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberKi);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberKi.getMemberID());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(memberKi, 3);
		memberArrayList.showAllMember();
	}

}
