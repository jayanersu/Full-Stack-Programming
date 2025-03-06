package Com.Phani.IsVowel;

public class IsVowel {
	private char ch; // classs level variavble

	public IsVowel(char ch) {
		this.ch = ch;// what ever we are passing in this object that will be assigned to class level
						// varaible.

	}

	public boolean check() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
