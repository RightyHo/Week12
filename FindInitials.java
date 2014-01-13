public class FindInitials {
	public static void main(String[] args){
		FindInitials fi = new FindInitials();
		fi.launch();
	}
	public void launch(){
		System.out.println("Now running the FindInitials Class");
	}
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" +");  //changed from " " to fix bug when name has two spaces between words
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
}