package Collection.HashSet;
//hashset은 순서와 상관없이 중복을 허용하지 않는다.
//
import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet <String> hashSet = new HashSet<String>();
		hashSet.add(new String("소준형"));
		hashSet.add(new String("박찬규"));
		hashSet.add(new String("곽민지"));
		hashSet.add(new String("이현석"));
		hashSet.add(new String("노건훈"));
		
		System.out.println(hashSet);
	}

}
