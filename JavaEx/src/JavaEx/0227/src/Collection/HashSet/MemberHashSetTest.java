package Collection.HashSet;

import Collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();//hash ��ü�� ���� ��
		
		Member memberSo = new Member(1001,"������");
		Member memberLee = new Member(1002,"������");
		Member memberPark = new Member(1003,"������");
		Member memberNoh = new Member(1004,"�����");
		
		memberHashSet.addMember(memberSo);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberNoh);
		memberHashSet.showAllMember();
		
		Member memberChoi = new Member(1003,"������");//���̵� �ߺ�
		memberHashSet.addMember(memberChoi);
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(1003);
		memberHashSet.showAllMember();
	}

}
