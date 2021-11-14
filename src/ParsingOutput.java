import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingOutput {
    public static void get (String userInput) {
        String regExRomes = "^(V|I|X){1,4}\s?(\\+|-|\\*|/)\s?(V|I|X){1,4}+$";
        String regExArabic = "^[0-9]{1,2}\s?(\\+|-|\\*|/)\s?[0-9]{1,2}+$";
        Pattern romesPattern = Pattern.compile(regExRomes);
        Pattern arabicPattern = Pattern.compile(regExArabic);
        Matcher romesMatcher = romesPattern.matcher(userInput);
        Matcher arabicMatcher = arabicPattern.matcher(userInput);
        int romesInt;
        if (romesMatcher.find()) {
            try {
                romesInt = RomesCount.romesCount(userInput);
                if (romesInt >= 1) System.out.println(RomesConvert.romesConvert(romesInt));
            } catch (NotRelevantNumException e) {
                System.err.println(e.getMessage());
            }
        }
        else if (arabicMatcher.find()) {
            try {
                System.out.println(ArabicCount.arabicCount(userInput));
            } catch (NotRelevantNumException e) {
                System.err.println(e.getMessage());
            }
        }
        else try {
                throw new UnsuitableInputException("");
            } catch (UnsuitableInputException e) {
                System.err.println("Input have to contain only 2 roman or only 2 arabic numbers and only 1 arithmetic operation");;
            }
    }
}
