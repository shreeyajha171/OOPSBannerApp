import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Utility method to create and return the character pattern map
    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        // Pattern for P
        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        // Pattern for S
        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        // Store patterns in the HashMap
        charMap.put('O', O);
        charMap.put('P', P);
        charMap.put('S', S);

        return charMap;
    }

    // Utility method to render the banner
    public static void renderBanner(String message, Map<Character, String[]> charMap) {

        int rows = 5; // each letter pattern has 5 rows

        for (int i = 0; i < rows; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : message.toCharArray()) {

                String[] pattern = charMap.get(c);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Create the character pattern map
        Map<Character, String[]> charMap = createCharacterPatternMap();

        // Message to display
        String message = "OOPS";

        // Render the banner
        renderBanner(message, charMap);
    }
}