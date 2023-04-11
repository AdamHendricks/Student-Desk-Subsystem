
package za.ac.cput.calcapsgui2;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RunCalcApsGui {
    public static void main(String[] args) {
        
        CalcApsGui guiTest = new CalcApsGui();
        guiTest.pack();
        guiTest.setSize(900, 500);
        guiTest.setVisible(true);
        guiTest.setDefaultCloseOperation(EXIT_ON_CLOSE);
        guiTest.setGUI();
    }
}
