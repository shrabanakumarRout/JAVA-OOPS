package StringPractise;

public class Vowel {

	public static void main(String[] args) {
		String s = "Aeroplane";
		System.out.println(countvowel(s));

	}
	
	
	static int countvowel(String s) {
		int  count=0;
		s=s.toLowerCase();
		for(int i =0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
		return count;
	}

}