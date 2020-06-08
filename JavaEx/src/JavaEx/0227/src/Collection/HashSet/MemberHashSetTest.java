package Collection.HashSet;

import Collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();//hash 객체로 만들어서 비교
		
		Member memberSo = new Member(1001,"소준형");
		Member memberLee = new Member(1002,"이현석");
		Member memberPark = new Member(1003,"박찬규");
		Member memberNoh = new Member(1004,"노건훈");
		
		memberHashSet.addMember(memberSo);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberNoh);
		memberHashSet.showAllMember();
		
		Member memberChoi = new Member(1003,"최현수");//아이디 중복
		memberHashSet.addMember(memberChoi);
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(1003);
		memberHashSet.showAllMember();
	}

}
