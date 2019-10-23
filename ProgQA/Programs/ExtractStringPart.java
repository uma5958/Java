package Programs;

public class ExtractStringPart {
	// str = www.erostrum.com
	// www. -> firstfour
	// .com	-> lastfour
	// erostrum -> website
	// str.subString(startIndex,endIndex) -> startIndex - inclusive & endIndex - exclusive 
	public static void main(String[] args) {
		String str = "www.erostrum.com";
		
		String firstFour = str.substring(0, 4);
		System.out.println(firstFour);
		
		String lastFour = str.substring(str.length()-4, str.length());
		System.out.println(lastFour);
		
		String webSite = str.substring(4, str.length()-4);
		System.out.println(webSite);
	}

}
