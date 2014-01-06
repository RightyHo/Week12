public class HashUtilities {
	public int shortHash(int x){
		int result = 0;
		result = x % 1000;
		return Math.abs(result);
	}
}