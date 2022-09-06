package DungeonAndDragons;

public class SaveCharacterForm {

    private static String characterName;


    public static void main() {
        // we are going to grab information for all of the information from the main screen and then build data out from there
        characterName = CharacterStorage.getCharacterName();


    }
}
