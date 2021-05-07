package intro;

public class Main {

	public static void main(String[] args) {
	
		char harf='A';
		
		switch (harf) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
				 System.out.println("vowel letter");
			 	break;
		default:
			System.out.println("consonant letter");
	
		}
	}
}
