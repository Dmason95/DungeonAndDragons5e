package DungeonAndDragons;

public class CharacterStorage {

    private static String characterName;
    private static String strength;


    public static void setCharacterName(String Characternaming){
        characterName = Characternaming;
    }
    public static String getCharacterName(){
        return characterName;
    }

    public static void setStrengthObject(String Strength) {
         strength = Strength;
    }
    public static String getStrengthObject(){
        return strength;
    }
}
