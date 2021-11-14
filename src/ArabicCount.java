import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicCount {
    public static int arabicCount (String arabicInput) throws NotRelevantNumException {
        String regExFirstArabic = "^[0-9]{1,2}";
        Pattern firstArabicPattern = Pattern.compile(regExFirstArabic);
        Matcher firstArabicMatcher = firstArabicPattern.matcher(arabicInput);
        firstArabicMatcher.find();
        int firstArabicInt = Integer.parseInt(arabicInput.substring(0, firstArabicMatcher.end()));
        if (firstArabicInt < 1 ^ firstArabicInt > 10) {
            throw new NotRelevantNumException("Arabic number have to match within the bounds from 1 to 10");
        }
        String regExSecondArabic = "[0-9]{1,2}+$";
        Pattern secondArabicPattern = Pattern.compile(regExSecondArabic);
        Matcher secondArabicMatcher = secondArabicPattern.matcher(arabicInput);
        secondArabicMatcher.find();
        int secondArabicInt = Integer.parseInt(arabicInput.substring(secondArabicMatcher.start()));
        if (secondArabicInt < 1 ^ secondArabicInt > 10) {
            throw new NotRelevantNumException("Arabic number have to match within the bounds from 1 to 10");
        }
        char signArabic;
        if (arabicInput.charAt(firstArabicMatcher.end()) == ' ') {
            signArabic = arabicInput.charAt(firstArabicMatcher.end() + 1);
        } else signArabic = arabicInput.charAt(firstArabicMatcher.end());
        int arabicResult = switch (signArabic) {
            case '+' -> firstArabicInt + secondArabicInt;
            case '-' -> firstArabicInt - secondArabicInt;
            case '/' -> firstArabicInt / secondArabicInt;
            case '*' -> firstArabicInt * secondArabicInt;
            default -> 0;
        };
        return arabicResult;
    }
}
