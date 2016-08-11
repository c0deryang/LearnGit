public class Str2Int{
	public static void main(String[] args){
		String s = "232323";
		String s1 = "232323Hello";
		try{
			int i = Integer.parseInt(s1);
			System.out.println(i);
		}
		catch(NumberFormatException e){
			System.out.println("your input is not a number!");
		}
	}
}