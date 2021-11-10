package DungeonAndDragons;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CharacterOptions {

    /**
     * the file layout of the file should be:
     * Races first
     * Aligments second
     * Classes third
     * Backgrounds fourth
     * Races,Alignments,Classes,Backgrounds
     */
    final static String characterSelectionFileCSV = "C:\\Program Files (x86)\\Notepad++\\testingFile.csv";

    static ArrayList<String> possibleCharacterRaces = new ArrayList<>();
    static ArrayList<String> possibleCharacterAlignment = new ArrayList<>();
    static ArrayList<String> possibleCharacterClasses = new ArrayList<>();
    static ArrayList<String> possibleCharacterBackgrounds = new ArrayList<>();


    public static void main(String[] args) {

        try {
            buildCharacterRacesArrays(characterSelectionFileCSV,possibleCharacterRaces);
            buildCharacterAlignmentArrays(characterSelectionFileCSV,possibleCharacterAlignment);
            buildCharacterBackgroundsArrays(characterSelectionFileCSV,possibleCharacterBackgrounds);
            buildCharacterClassesArrays(characterSelectionFileCSV,possibleCharacterClasses);

            System.out.println(possibleCharacterRaces.toString() + " " + possibleCharacterAlignment.toString() + " " + possibleCharacterClasses.toString() + " " + possibleCharacterBackgrounds.toString());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    /**
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterAlignment
     */
    private static ArrayList<String> buildCharacterAlignmentArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterAlignment) throws FileNotFoundException,IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try {
            while ((line = reader.readLine()) != null) {
                String[] output = line.split(",");
                possibleCharacterAlignment.add(output[1].trim());
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ee){
            System.out.println(ee);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return possibleCharacterAlignment;

    }
    /**
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterAlignment
     */
    private static ArrayList<String> buildCharacterClassesArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterAlignment) throws FileNotFoundException,IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try {
            while ((line = reader.readLine()) != null) {
                String[] output = line.split(",");
                possibleCharacterAlignment.add(output[2].trim());
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ee){
            System.out.println(ee);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return possibleCharacterAlignment;

    }

    /**
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterAlignment
     */
    private static ArrayList<String> buildCharacterBackgroundsArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterAlignment) throws FileNotFoundException,IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try {
            while ((line = reader.readLine()) != null) {
                String[] output = line.split(",");
                possibleCharacterAlignment.add(output[3].trim());
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ee){
            System.out.println(ee);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return possibleCharacterAlignment;

    }

    /**
     * This Method builds character Races choice array to be used by the JFrame
     *
     * The file is expected from the
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterRaces
     * @Author Dave Mason
     */
    private static ArrayList<String> buildCharacterRacesArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterRaces) throws FileNotFoundException, IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try{
            while((line = reader.readLine()) != null) {

                String[] output = line.split(",");
                possibleCharacterRaces.add(output[0].trim());
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ee){
            System.out.println(ee);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return possibleCharacterRaces;
    }
}
