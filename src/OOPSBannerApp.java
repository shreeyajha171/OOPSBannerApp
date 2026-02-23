public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] bannerParts = {
            String.join("", "  *****      *****      *****     ******"),
            String.join("", " *     *    *     *    *     *    *     "),
            String.join("", " *     *    *     *    *     *    *     "),
            String.join("", " *     *    *     *    *****      ******"),
            String.join("", " *     *    *     *    *               *"),
            String.join("", " *     *    *     *    *               *"),
            String.join("", "  *****      *****     *          ******")
        };

     
        for (String line : bannerParts) {
            System.out.println(line);
        }
    }
}