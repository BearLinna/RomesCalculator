public enum RomeNumbers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private int arabic;
    public static int result;

    RomeNumbers(int arabic) {
        this.arabic = arabic;
    }
    public int getArabic() {
        return arabic;
    }
    public static boolean contains(String s) {
        for (RomeNumbers rn : RomeNumbers.values()) {
            if (rn.name().equals(s)) {
                result = rn.getArabic();
                return true;
            }
        }
        return false;
    }
}
