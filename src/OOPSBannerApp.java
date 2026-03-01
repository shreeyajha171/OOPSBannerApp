public class OOPSBannerApp {

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", "  *****  ")
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " *****  "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " *****  "),
            String.join("", " *       "),
            String.join("", " *       "),
            String.join("", " *       ")
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[] {
            String.join("", " *****  "),
            String.join("", " *       "),
            String.join("", " *       "),
            String.join("", "  *****  "),
            String.join("", "       * "),
            String.join("", "       * "),
            String.join("", " *****   ")
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop-based rendering
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}