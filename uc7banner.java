
public class uc7banner {


    static class CharacterPatternMap {

        private Character character;
        private String[] pattern;


        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }


        public Character getCharacter() {
            return character;
        }


        public String[] getPattern() {
            return pattern;
        }
    }

  
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        String[] space = {
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        };

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', O);
        maps[1] = new CharacterPatternMap('P', P);
        maps[2] = new CharacterPatternMap('S', S);
        maps[3] = new CharacterPatternMap(' ', space);

        return maps;
    }

  
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // Return space pattern if character not found
        return maps[3].getPattern();
    }

 
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), maps);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}