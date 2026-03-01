/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "00PS"
 * banner using these mappings. This approach enhances code organization and modularity.
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner static class for storing character-to-pattern mappings
     */
    static class CharacterPatternMap {
        private final Character character;  // The character being represented
        private final String[] pattern;     // The ASCII art pattern lines for the character

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public Character getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates the array of CharacterPatternMap objects for '0', 'P', 'S', and space
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('0', new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
            }),
            new CharacterPatternMap('P', new String[] {
                " *****  ",
                " *     * ",
                " *     * ",
                " *****  ",
                " *       ",
                " *       ",
                " *       "
            }),
            new CharacterPatternMap('S', new String[] {
                " *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " *****   "
            }),
            new CharacterPatternMap(' ', new String[] {  // Space for separation
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
            })
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character
     * @param ch character to look up
     * @param charMaps array of CharacterPatternMap objects
     * @return the pattern array for the given character, or space if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // fallback to space if character not found
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     * @param message the message string to display
     * @param charMaps the array of CharacterPatternMap objects
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int lines = 7; // each character pattern has 7 lines
        for (int i = 0; i < lines; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                sb.append(getCharacterPattern(ch, charMaps)[i]).append("  "); // 2 spaces between letters
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main method - Entry point
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Message to display
        String message = "00PS";

        // Print banner
        printMessage(message, charMaps);
    }
}