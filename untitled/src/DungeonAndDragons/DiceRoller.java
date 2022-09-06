package DungeonAndDragons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleUnaryOperator;

public class DiceRoller {

    static GridLayout diceGrid = new GridLayout(5,1);
    static JFrame D6RollResult = new JFrame();
    static JFrame D10RollResult = new JFrame();

    public static void main(){
        DiceRoller.DiceSelection();


    }

    private static void DiceSelection() {

        JFrame DiceSelections = new JFrame();
        DiceSelections.setTitle("Dice Selection");
        DiceSelections.setVisible(true);
        DiceSelections.setLayout(diceGrid);

        JLabel dndImage = new JLabel(new ImageIcon("C:\\Users\\Apex Gaming\\Documents\\GitHub\\DungeonAndDragons5e\\untitled\\src\\DungeonAndDragons\\assets\\dndLogo.png"));
        dndImage.setPreferredSize(new Dimension(100,100));
        DiceSelections.add(dndImage);





        JButton DiceBlockSix = new JButton("D6");
        DiceSelections.add(DiceBlockSix);
        DiceBlockSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ee) {
                    Double D6RollRandomizer = Math.random() * 6 + 1;
                    Double d6Reformat = Math.floor(D6RollRandomizer);

                    Integer d6Int = d6Reformat.intValue();

                    D6RollResult.setTitle("D6 Result");
                    D6RollResult.setVisible(true);

                    JTextArea D6RollResults = new JTextArea();
                    D6RollResults.setText("You Rolled the D6 and got: " + d6Int);
                    D6RollResult.add(D6RollResults);


            }
        });

        JButton DiceBlockTen = new JButton("D10");
        DiceSelections.add(DiceBlockTen);
        DiceBlockTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer d10Int = 0;
                Double d10RollRandomizer = Math.random() * 10 + 1;
                Double d10Reformat = Math.floor(d10RollRandomizer);

                d10Int = d10Reformat.intValue();

                D10RollResult.setTitle("D10 Result");
                D10RollResult.setVisible(true);

                    JTextArea D10RollResults = new JTextArea();
                    D10RollResults.setText("You rolled the D10 and got: " + d10Int.toString());


                    D10RollResult.add(D10RollResults);




            }

            });




        DiceSelections.setSize(200,200);
        D6RollResult.setSize(500,300);
        D10RollResult.setSize(500,300);



    }

}
