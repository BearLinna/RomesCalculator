import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomesCount {
    public static int romesCount(String romesInput) throws NotRelevantNumException {
        String regExFirstRome = "^(V|I|X){1,4}";
        Pattern firstRomePattern = Pattern.compile(regExFirstRome);
        Matcher firstRomeMatcher = firstRomePattern.matcher(romesInput);
        firstRomeMatcher.find();
        String firstRomeNumber = romesInput.substring(0,firstRomeMatcher.end());
        String regExSecondRome = "(V|I|X){1,4}+$";
        Pattern secondRomePattern = Pattern.compile(regExSecondRome);
        Matcher secondRomeMatcher = secondRomePattern.matcher(romesInput);
        secondRomeMatcher.find();
        String secondRomeNumber = romesInput.substring(secondRomeMatcher.start());
        char signRoman;
        if (romesInput.charAt(firstRomeNumber.length()) == ' '){
            signRoman = romesInput.charAt(firstRomeNumber.length() + 1);
        }else signRoman = romesInput.charAt(firstRomeNumber.length());
        int firstRomesInt;
        if (RomeNumbers.contains(firstRomeNumber)) firstRomesInt = RomeNumbers.result;
        else throw new NotRelevantNumException("Romes number have to match within the bounds from I to X");
        int secondRomesInt;
        if (RomeNumbers.contains(secondRomeNumber)) secondRomesInt = RomeNumbers.result;
        else throw new NotRelevantNumException("Romes number have to match within the bounds from I to X");
        int romesResultInt = switch (signRoman) {
            case '+' -> firstRomesInt + secondRomesInt;
            case '-' -> firstRomesInt - secondRomesInt;
            case '*' -> firstRomesInt * secondRomesInt;
            case '/' -> firstRomesInt / secondRomesInt;
            default -> 0;
        };
        if (romesResultInt < 1) {
            try {
                throw new NotRomanNumberException();
            } catch (NotRomanNumberException e) {
                System.err.println("Roman numeral system don't have zero or negative numbers");;
            }
        }

        return romesResultInt;
    }
}
