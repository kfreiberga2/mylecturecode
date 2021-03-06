package lv.kristine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {


	public static void main(String[] args) {
		String inputStr = "abcd74f23u49342_67";
		String regexStrExp = "[a-z]+";
		
		System.out.println(inputStr.charAt(0));
		System.out.println(inputStr.charAt(1));
		
		Pattern pattern = Pattern.compile(regexStrExp);
		Matcher matcher = pattern.matcher(inputStr);
		
		while (matcher.find()){
			System.out.println("method find() found substring "+matcher.group());
		}
		
		String replaceSymbol = "lv";
		String outputStr = matcher.replaceFirst(replaceSymbol);
		
		System.out.println(outputStr);
		
		
	}

}
