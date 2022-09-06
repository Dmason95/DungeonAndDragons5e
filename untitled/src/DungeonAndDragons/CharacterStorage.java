package DungeonAndDragons;

public class CharacterStorage {

    private static String characterName;
    private static String playerName;
    private static String characterRace;
    private static String characterClass;
    private static String Alignment;
    private static String strength;
    private static String dexerity;


    public static void setCharacterName(String Characternaming) {
        characterName = Characternaming;
    }

    public static String getCharacterName() {
        return characterName;
    }

    public static void setPlayerName(String PlayerName){
        playerName = PlayerName;
    }

    public static String getPlayerName(){
        return playerName;
    }

    public static void setCharacterRace(String CharcterRace){
        characterRace = CharcterRace;
    }

    public static String getCharacterRace(){
        return characterRace;
    }

    public static void setCharacterClass(String CharacterClass) {
        characterClass = CharacterClass;
    }

    public static String getCharacterClass(){
        return characterClass;
     }

    public static void setAlignment(String Alignment){

    }
    public static void setStrengthValue(String Strength) {
        strength = Strength;
    }

    public static String getStrengthValue() {
        return strength;
    }

    public static void setDexerityValue(String Dexerity) {
        dexerity = Dexerity;
    }

    public static String getDexerityValue() {
        return dexerity;
    }
}