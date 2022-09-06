package DungeonAndDragons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

import  DungeonAndDragons.races.*;
import  DungeonAndDragons.classes.*;
import  DungeonAndDragons.classes.Class;
import  DungeonAndDragons.backgrounds.*;

public class CenterPanel extends JPanel {
    private static final long serialVersionUID = -3135316718219106468L;
    private static final Border border = BorderFactory.createLineBorder(Color.BLACK,1);
    private static final String image = "C:\\Users\\Apex Gaming\\Documents\\GitHub\\DungeonAndDragons5e\\untitled\\src\\DungeonAndDragons\\assets\\dndLogo.png";
    static GridLayout entryGrid = new GridLayout(0,2);
    private static ArrayList races = CharacterOptions.possibleCharacterRaces;
    private static ArrayList alignments = CharacterOptions.possibleCharacterAlignments;
    private static ArrayList characterClasses = CharacterOptions.possibleCharacterClasses;
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

        JLabel dndImage = new JLabel(new ImageIcon(image));
        dndImage.setPreferredSize(new Dimension(100,100));
        TheTest.add(dndImage);
        JLabel blank = new JLabel("");
        blank.setBackground(Color.pink);
        blank.setOpaque(true);
        TheTest.add(blank);


        JLabel characterName = new JLabel("Character Name");
        TheTest.add(characterName);
        characterName.setBackground(Color.pink);
        characterName.setOpaque(true);
        characterName.setBorder(border);
        characterName.setHorizontalAlignment(JLabel.CENTER);
        JTextField characterNameEntry = new JTextField();
        TheTest.add(characterNameEntry);

        JLabel playerName = new JLabel("Player Name");
        playerName.setBackground(Color.pink);
        playerName.setOpaque(true);
        playerName.setBorder(border);
        TheTest.add(playerName);
        playerName.setHorizontalAlignment(JLabel.CENTER);
        JTextField playerEntry = new JTextField();
        TheTest.add(playerEntry);


        JLabel racistLabel = new JLabel("Character Race");
        racistLabel.setBackground(Color.pink);
        racistLabel.setOpaque(true);
        racistLabel.setBorder(border);
        TheTest.add(racistLabel);
        racistLabel.setHorizontalAlignment(JLabel.CENTER);
        JComboBox racistChoice = new JComboBox(races.toArray());
        TheTest.add(racistChoice);
        racistChoice.setSelectedIndex(-1);
        racistChoice.setRenderer(dlcr);

        JLabel Class = new JLabel("Character Class");
        Class.setBackground(Color.pink);
        Class.setOpaque(true);
        Class.setBorder(border);
        TheTest.add(Class);
        Class.setHorizontalAlignment(JLabel.CENTER);
        JComboBox characterClassChoice = new JComboBox(characterClasses.toArray());
        TheTest.add(characterClassChoice);
        characterClassChoice.setSelectedIndex(-1);
        characterClassChoice.setRenderer(dlcr);


        JLabel alignmentLabel = new JLabel("Alignment");
        alignmentLabel.setBackground(Color.pink);
        alignmentLabel.setOpaque(true);
        alignmentLabel.setBorder(border);
        TheTest.add(alignmentLabel);
        alignmentLabel.setHorizontalAlignment(JLabel.CENTER);
        JComboBox alignmentChoice = new JComboBox (alignments.toArray());
        TheTest.add(alignmentChoice);
        alignmentChoice.setSelectedIndex(-1);
        alignmentChoice.setRenderer(dlcr);

        JLabel backgroundLabel = new JLabel("Background");
        backgroundLabel.setBackground(Color.pink);
        backgroundLabel.setOpaque(true);
        backgroundLabel.setBorder(border);
        TheTest.add(backgroundLabel);
        backgroundLabel.setHorizontalAlignment(JLabel.CENTER);
        JComboBox backgroundChoice = new JComboBox(backgrounds.toArray());
        TheTest.add(backgroundChoice);
        backgroundChoice.setSelectedIndex(-1);
        backgroundChoice.setRenderer(dlcr);

        JLabel strengthLabel = new JLabel("Strength");
        strengthLabel.setBackground(Color.pink);
        strengthLabel.setOpaque(true);
        strengthLabel.setBorder(border);
        TheTest.add(strengthLabel);
        strengthLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField StrengthRollField = new JTextField();
        TheTest.add(StrengthRollField);

        JLabel dexterityLabel = new JLabel("Dexterity");
        dexterityLabel.setBackground(Color.pink);
        dexterityLabel.setOpaque(true);
        dexterityLabel.setBorder(border);
        TheTest.add(dexterityLabel);
        dexterityLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField dexterityRollField = new JTextField();
        TheTest.add(dexterityRollField);

        JLabel constitutionLabel = new JLabel("Constitution");
        constitutionLabel.setBackground(Color.PINK);
        constitutionLabel.setOpaque(true);
        constitutionLabel.setBorder(border);
        TheTest.add(constitutionLabel);
        constitutionLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField constitutionRollField = new JTextField();
        TheTest.add(constitutionRollField);

        JLabel intelligenceLabel = new JLabel("Intelligence");
        intelligenceLabel.setBackground(Color.PINK);
        intelligenceLabel.setOpaque(true);
        intelligenceLabel.setBorder(border);
        TheTest.add(intelligenceLabel);
        intelligenceLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField intelligenceRollField = new JTextField();
        TheTest.add(intelligenceRollField);

        JLabel WisdomLabel = new JLabel("Wisdom");
        WisdomLabel.setBackground(Color.PINK);
        WisdomLabel.setOpaque(true);
        WisdomLabel.setBorder(border);
        TheTest.add(WisdomLabel);
        WisdomLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField wisdomRollField = new JTextField();
        TheTest.add(wisdomRollField);

        JLabel charismaLabel = new JLabel("Charisma");
        charismaLabel.setBackground(Color.PINK);
        charismaLabel.setOpaque(true);
        charismaLabel.setBorder(border);
        TheTest.add(charismaLabel);
        charismaLabel.setHorizontalAlignment(JLabel.CENTER);
        JTextField charismaRollField = new JTextField();
        TheTest.add(charismaRollField);

        /**
         * TO DO FIX THE SHIT
         */
        JButton Dice = new JButton("Dice");
        TheTest.add(Dice);
        Dice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DiceRoller.main();
            }
        });

        JButton Next = new JButton("Next");
        TheTest.add(Next);
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CharacterNameValue = characterNameEntry.getText();
                CharacterStorage.setCharacterName(CharacterNameValue);

                String PlayerNameValue = playerName.getText();
                CharacterStorage.setPlayerName(PlayerNameValue);

                String racistChoiceValue = racistChoice.getSelectedItem().toString();
                CharacterStorage.setCharacterRace(racistChoiceValue);

                String StrengthValue = StrengthRollField.getText();
                CharacterStorage.setStrengthValue(StrengthValue);

                System.out.println(CharacterStorage.getCharacterName());
                System.out.println(CharacterStorage.getPlayerName());
                System.out.println(CharacterStorage.getCharacterRace());
                System.out.println(CharacterStorage.getStrengthValue());
            }
        });


        JButton Save = new JButton("Save");
        TheTest.add(Save);
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveCharacterForm.main();
            }
        });


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