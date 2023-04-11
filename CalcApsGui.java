
package za.ac.cput.calcapsgui2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;

public class CalcApsGui extends JFrame implements ActionListener{
    private JPanel panelWest, panelWestInner, panelEast, panelEastInner, panelEastInnerNorth, panelNorth,
            resultPane, centerPane, panelEastInner2, panelEastInner3, panelEastInner4,
            panelEastInner5, panelEastInner6, panelEastInner7, panelEastInner8;
    private JMenuBar menuBar;
    private JMenu menu;
    private JButton btnLinks, btnFaq, downloads, calcBtn, clearBtn;
    private JTextField textEast1, textEast2, textEast3, textEast4, textEast5, textEast6, textEast7, textEast8, resultText;
    private JLabel lblTop, lblResult, lblLang, lblMath, lblLo, lblNextBest1, lblNextBest2, lblNextBest3, 
            additionalSub1, additionalSub2, lblBlank, percentage1, percentage2, percentage3, percentage4, percentage5,
            percentage6, percentage7, percentage8;
    private JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5, comboBox6,
            comboBox7, comboBox8;
    
    public CalcApsGui(){
        super("Calculate APS");

        panelWest = new JPanel();
        panelWestInner = new JPanel();
        panelEast = new JPanel();
        panelEastInner = new JPanel();
        panelEastInner2 = new JPanel();
        panelEastInner3 = new JPanel();
        panelEastInner4 = new JPanel();
        panelEastInner5 = new JPanel();
        panelEastInner6 = new JPanel();
        panelEastInner7 = new JPanel();
        panelEastInner8 = new JPanel();
        panelEastInnerNorth = new JPanel();
        panelNorth = new JPanel();
        resultPane = new JPanel();
        centerPane = new JPanel();
        
        panelWestInner.setPreferredSize(new Dimension(150,300));
        panelEast.setPreferredSize(new Dimension(700, 600));
        
        menu = new JMenu("Menu");
        
        btnLinks = new JButton("Useful Links");
        btnFaq = new JButton("FAQ's");
        calcBtn = new JButton("Go");
        clearBtn = new JButton("Clear");
        downloads = new JButton("Downloads");
        
        textEast1 = new JTextField(6);
        textEast2 = new JTextField(6);
        textEast3 = new JTextField(6);
        textEast4 = new JTextField(6);
        textEast5 = new JTextField(6);
        textEast6 = new JTextField(6);
        textEast7 = new JTextField(6);
        textEast8 = new JTextField(6);
        resultText = new JTextField(6);
        
        lblTop = new JLabel("Calculate APS");
        lblResult = new JLabel("Result: ");
        lblLang = new JLabel("First language: ");
        lblLang.setPreferredSize(new Dimension(222, 20));
        lblMath = new JLabel("Mathematics or Mathematics Literacy: ");
        lblMath.setPreferredSize(new Dimension(222, 20));
        lblLo = new JLabel("Life Orientation: ");
        lblLo.setPreferredSize(new Dimension(222, 20));
        lblNextBest1 = new JLabel("Next best subject 1: ");
        lblNextBest1.setPreferredSize(new Dimension(222, 20));
        lblNextBest2 = new JLabel("Next best subject 2: ");
        lblNextBest2.setPreferredSize(new Dimension(222, 20));
        lblNextBest3 = new JLabel("Next best subject 3: ");
        lblNextBest3.setPreferredSize(new Dimension(222, 20));
        additionalSub1 = new JLabel("Additional subject 1: ");
        additionalSub1.setPreferredSize(new Dimension(222, 20));
        additionalSub2 = new JLabel("Additional subject 2: ");
        additionalSub2.setPreferredSize(new Dimension(222, 20));
        percentage1 = new JLabel("Percentage acheived: ");
        percentage2 = new JLabel("Percentage acheived: ");
        percentage3 = new JLabel("Percentage acheived: ");
        percentage4 = new JLabel("Percentage acheived: ");
        percentage5 = new JLabel("Percentage acheived: ");
        percentage6 = new JLabel("Percentage acheived: ");
        percentage7 = new JLabel("Percentage acheived: ");
        percentage8 = new JLabel("Percentage acheived: ");
        
        String subjectComboItem1 [] = {"Afrikaans", "English", "isiXhosa"};
        String subjectComboItem2 [] = {"Mathematical Literacy", "Mathematics",};
        String subjectComboItem3 [] = {"Accounting", "Agricultural Science", "Business Studies",
        "Consumer studies", "Dramatic Arts", "Economics", "Engineering graphics and Arts",
        "Geography", "History", "Information Technology", "Life Sciences",  "Music", 
        "Physical Science", "Religion Studies", "Visual arts"};
        comboBox1 = new JComboBox(subjectComboItem1);
        comboBox2 = new JComboBox(subjectComboItem2);
        comboBox3 = new JComboBox(subjectComboItem3);
        comboBox4 = new JComboBox(subjectComboItem3);
        comboBox5 = new JComboBox(subjectComboItem3);
        comboBox6 = new JComboBox(subjectComboItem3);
        comboBox7 = new JComboBox(subjectComboItem3);
        
        
        panelWest.setBackground(Color.GRAY);
    }
    
    public void setGUI(){
        panelWest.setLayout(new GridLayout(1,1));
        panelWestInner.setLayout(new GridLayout(3,1));
        panelEast.setLayout(new GridLayout(10, 1));
        panelEastInner.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner4.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner5.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner6.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner7.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEastInner8.setLayout(new FlowLayout(FlowLayout.LEFT));
       //panelEastInnerNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        resultPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        centerPane.setLayout(new BoxLayout(centerPane, BoxLayout.Y_AXIS));
        super.setJMenuBar(menuBar);
        
        //menuBar.add(menu);
        
        centerPane.add(panelWest);
        centerPane.add(panelEast);
        centerPane.add(resultPane);
        panelWest.add(panelWestInner);
        panelWestInner.add(btnLinks);
        panelWestInner.add(btnFaq);
        panelWestInner.add(downloads);
        panelNorth.add(lblTop);
        //panelEastInnerNorth.add(lblTop);
        //panelEast.add(panelEastInnerNorth);
        
        panelEast.add(lblLang);
        panelEast.add(comboBox1);
        panelEast.add(textEast1);
        
        panelEast.add(panelEastInner2);
        panelEast.add(panelEastInner);
        panelEast.add(panelEastInner3);
        panelEast.add(panelEastInner4);
        panelEast.add(panelEastInner5);
        panelEast.add(panelEastInner6);
        panelEast.add(panelEastInner7);
        panelEast.add(panelEastInner8);
        panelEast.add(resultPane);
        panelEastInner.add(lblLang);
        panelEastInner.add(comboBox1);
        panelEastInner.add(percentage1);
        panelEastInner.add(textEast1);
        panelEastInner2.add(lblMath);
        panelEastInner2.add(comboBox2);
        panelEastInner2.add(percentage2);
        panelEastInner2.add(textEast2);
        panelEastInner3.add(lblLo);
        //panelEastInner3.add(lblBlank);
        panelEastInner3.add(percentage3);
        panelEastInner3.add(textEast3);
        panelEastInner4.add(lblNextBest1);
        panelEastInner4.add(comboBox3);
        panelEastInner4.add(percentage4);
        panelEastInner4.add(textEast4);
        panelEastInner5.add(lblNextBest2);
        panelEastInner5.add(comboBox4);
        panelEastInner5.add(percentage5);
        panelEastInner5.add(textEast5);
        panelEastInner6.add(lblNextBest3);
        panelEastInner6.add(comboBox5);
        panelEastInner6.add(percentage6);
        panelEastInner6.add(textEast6);
        panelEastInner7.add(additionalSub1);
        panelEastInner7.add(comboBox6);
        panelEastInner7.add(percentage7);
        panelEastInner7.add(textEast7);
        panelEastInner8.add(additionalSub2);
        panelEastInner8.add(comboBox7);
        panelEastInner8.add(percentage8);
        panelEastInner8.add(textEast8);
        resultPane.add(clearBtn);
        resultPane.add(calcBtn);
        resultPane.add(lblResult);
        resultPane.add(resultText);
        
        
        this.add(centerPane, BorderLayout.CENTER);
        //this.add(panelWest, BorderLayout.WEST);
        this.add(panelWestInner, BoxLayout.Y_AXIS);
        this.add(panelEast, BorderLayout.EAST);
        //this.add(panelEastInnerNorth, FlowLayout.CENTER);
        this.add(panelNorth, BorderLayout.NORTH);

        calcBtn.addActionListener(this);
        clearBtn.addActionListener(this);
    }

    double mathNscPercent, languageNscPercent, loNscPercent, firstBestPercent, 
    secondBestPercent, thirdBestPercent, additionalSub1Percent, additionalSub2Percent;

    UWCPointsCalculation results = new UWCPointsCalculation(mathNscPercent, languageNscPercent,
    loNscPercent, firstBestPercent, secondBestPercent, thirdBestPercent, additionalSub1Percent, 
    additionalSub2Percent);

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Go")){
            mathNscPercent = Double.parseDouble(textEast1.getText());
            results.uwcMathPoint(mathNscPercent);

            languageNscPercent = Double.parseDouble(textEast2.getText());
            results.uwcLanguagePoint(languageNscPercent);

            loNscPercent = Double.parseDouble(textEast3.getText());
            results.uwcLoPoint(loNscPercent);

            firstBestPercent = Double.parseDouble(textEast4.getText());
            results.uwcFirstBestNscPoint(firstBestPercent);

            secondBestPercent = Double.parseDouble(textEast5.getText());
            results.uwcSecondBestNscPoint(secondBestPercent);

            thirdBestPercent = Double.parseDouble(textEast6.getText());
            results.uwcThirdBestNscPoint(thirdBestPercent);

            additionalSub1Percent = Double.parseDouble(textEast7.getText());
            results.uwcAdditionalSub1NscPoint(additionalSub1Percent);

            additionalSub2Percent = Double.parseDouble(textEast8.getText());
            results.uwcAdditionalSub2NscPoint(additionalSub2Percent);

            double result = results.pointTotal();
            resultText.setText(String.valueOf(result));

        }else if(e.getActionCommand().equals("Clear")){
            textEast1.setText("");
            textEast2.setText("");
            textEast3.setText("");
            textEast4.setText("");
            textEast5.setText("");
            textEast6.setText("");
            textEast7.setText("");
            textEast8.setText("");
            resultText.setText("");
        }
    }
    
}
