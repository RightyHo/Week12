public class UseHashUtilities {
	public static void main(String[] args){
		UseHashUtilities uhu =  new UseHashUtilities();
		uhu.launch();
	}

	public void launch(){
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		System.out.println(String.valueOf(hash));
		HashUtilities myHash = new HashUtilities();
		int smallHash = myHash.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}
}