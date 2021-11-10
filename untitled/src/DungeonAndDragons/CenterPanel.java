package DungeonAndDragons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

import  DungeonAndDragons.races.*;
import  DungeonAndDragons.classes.*;
import  DungeonAndDragons.classes.Class;
import  DungeonAndDragons.backgrounds.*;

public class CenterPanel extends JPanel {
    private static final long serialVersionUID = -3135316718219106468L;
    static GridLayout entryGrid = new GridLayout(0,2);
    private static ArrayList race = CharacterOptions.possibleCharacterRaces;
    private static ArrayList alignment = CharacterOptions.possibleCharacterAlignment;
    private static ArrayList characterClass = CharacterOptions.possibleCharacterClasses;
    private static ArrayList backgrounds = CharacterOptions.possibleCharacterBackgrounds;
    private String personalityString = "";
    private String idealsString = "";
    private String bondsString = "";
    private String flawsString = "";


    /**
     * Building the Panel and creating character values based provided information from the user
     *
     * @param args
     *
     * to-do
     * create dice roller with the ability to allocate rolled value to a specific attribute
     */
    public static void main(String[] args){
        CharacterOptions.main(args);

        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);

        JFrame TheTest = new JFrame();
        TheTest.setTitle("Dungeons And Dragons 5e Character Creator");
        TheTest.setVisible(true);
        TheTest.setLayout(entryGrid);

        JLabel characterName = new JLabel("Character Name");
        TheTest.add(characterName);
        characterName.setHorizontalAlignment(JLabel.CENTER);
        JTextField characterNameEntry = new JTextField();
        TheTest.add(characterNameEntry);

        JLabel playerName = new JLabel("Player Name");
        TheTest.add(playerName);
        playerName.setHorizontalAlignment(JLabel.CENTER);
        JTextField playerEntry = new JTextField();
        TheTest.add(playerEntry);


        JLabel racistLabel = new JLabel("Character Race");
        TheTest.add(racistLabel);
        racistLabel.setHorizontalAlignment(JLabel.CENTER);
        JComboBox racistChoice = new JComboBox(race.toArray());
        TheTest.add(racistChoice);
        racistChoice.setSelectedIndex(-1);
        racistChoice.setRenderer(dlcr);

        JLabel Class = new JLabel("Character Class");
        TheTest.add(Class);
        Class.setHorizontalAlignment(JLabel.CENTER);
        JComboBox characterClassChoice = new JComboBox(characterClass.toArray());
        TheTest.add(characterClassChoice);
        characterClassChoice.setSelectedIndex(-1);
        characterClassChoice.setRenderer(dlcr);


        JLabel alignmentLabel = new JLabel("Alignment");
        TheTest.add(alignmentLabel);
        alignmentLabel.setHorizontalAlignment(JLabel.CENTER);
        JComboBox alignmentChoice = new JComboBox (alignment.toArray());
        TheTest.add(alignmentChoice);
        alignmentChoice.setSelectedIndex(-1);
        alignmentChoice.setRenderer(dlcr);

        JLabel backgroundLabel = new JLabel("Background");
        TheTest.add(backgroundLabel);
        backgroundLabel.setHorizontalAlignment(JLabel.CENTER);
        JComboBox backgroundChoice = new JComboBox(backgrounds.toArray());
        TheTest.add(backgroundChoice);
        backgroundChoice.setSelectedIndex(-1);
        backgroundChoice.setRenderer(dlcr);

        JLabel strengthLabel = new JLabel("Strength");
        TheTest.add(strengthLabel);
        strengthLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField StrengthRollField = new JTextField();
        TheTest.add(StrengthRollField);

        JButton Save = new JButton("Save");
        TheTest.add(Save);


        TheTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TheTest.setSize(400,400);




    }

    public CenterPanel(){

        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);

        setLayout(entryGrid);
        JLabel characterName = new JLabel("Character Name");
        add(characterName);
        characterName.setHorizontalAlignment(JLabel.CENTER);
        JTextField characterNameEntry = new JTextField();
        add(characterNameEntry);


    }

}
