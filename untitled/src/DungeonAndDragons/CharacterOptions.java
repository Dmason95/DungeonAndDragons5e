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


    final static String characterSelectionFileCSV = "C:\\Users\\Apex Gaming\\Documents\\GitHub\\DungeonAndDragons5e\\untitled\\src\\DungeonAndDragons\\assets\\DropDownResourceFile.txt";

    static ArrayList<String> possibleCharacterRaces = new ArrayList<>();
    static ArrayList<String> possibleCharacterAlignments = new ArrayList<>();
    static ArrayList<String> possibleCharacterClasses = new ArrayList<>();
    static ArrayList<String> possibleCharacterBackgrounds = new ArrayList<>();


    public static void main(String[] args) {

        try {
            buildCharacterRacesArrays(characterSelectionFileCSV,possibleCharacterRaces);
            buildCharacterAlignmentArrays(characterSelectionFileCSV,possibleCharacterAlignments);
            buildCharacterBackgroundsArrays(characterSelectionFileCSV,possibleCharacterBackgrounds);
            buildCharacterClassesArrays(characterSelectionFileCSV,possibleCharacterClasses);

            // System testing output
            // System.out.println(possibleCharacterRaces.toString() + " " + possibleCharacterAlignment.toString() + " " + possibleCharacterClasses.toString() + " " + possibleCharacterBackgrounds.toString());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    /**
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterAlignments
     */
    private static ArrayList<String> buildCharacterAlignmentArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterAlignments) throws FileNotFoundException,IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try {
            while ((line = reader.readLine()) != null) {
                String[] output = line.split(",");

                if (output.length != 0) {
                    possibleCharacterAlignments.add(output[1].trim());
                }
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
        return possibleCharacterAlignments;

    }
    /**
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterAlignment
     */
    private static ArrayList<String> buildCharacterClassesArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterClasses) throws FileNotFoundException,IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try {
            while ((line = reader.readLine()) != null) {
                String[] output = line.split(",");

                if (output.length != 0) {
                    possibleCharacterClasses.add(output[2].trim());
                }
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
        return possibleCharacterClasses;

    }

    /**
     *
     * @param characterSelectionFileCSV
     * @param possibleCharacterAlignment
     */
    private static ArrayList<String> buildCharacterBackgroundsArrays(String characterSelectionFileCSV, ArrayList<String> possibleCharacterBackgrounds) throws FileNotFoundException,IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(characterSelectionFileCSV));

        try {
            while ((line = reader.readLine()) != null) {
                String[] output = line.split(",");

                if (output.length != 0) {
                    possibleCharacterBackgrounds.add(output[3].trim());
                }
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
        return possibleCharacterBackgrounds;

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

                if (output[0].trim().length() != 0) {
                    System.out.println(output[0].trim());
                    possibleCharacterRaces.add(output[0].trim());
                }
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
