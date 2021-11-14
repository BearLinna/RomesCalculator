public class RomesConvert {
    public static String romesConvert (int romesInt) {
        RomeNumbers[] romesEnum = RomeNumbers.values();
        String romesResult = "";
        if (romesInt >= 90) {
            romesResult = "C";
            if (romesInt !=100){
                romesResult = "X" + romesResult;
                if (romesInt > 90) romesResult += romesEnum[romesInt % 10 - 1].toString();
            }
        }
        else if (romesInt >= 40 ) {
            romesResult = "L";
            if (romesInt >= 50) {
                for (int i = 0; i < romesInt/10 - 5; i++) romesResult += "X";
                if (romesInt%10 != 0) romesResult += romesEnum[romesInt % 10 - 1].toString();
            } else {
                romesResult = "X" + romesResult;
                if (romesInt%10 != 0) romesResult += romesEnum[romesInt % 10 - 1].toString();
            }
        }
        else if (romesInt >= 10){
            for (int i = 0; i < romesInt/10; i++) romesResult += "X";
            if (romesInt%10 != 0) romesResult += romesEnum[romesInt % 10 - 1].toString();
        } else romesResult = romesEnum[romesInt - 1].toString();

        return romesResult;
    }
}
