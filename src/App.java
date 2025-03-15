import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // instantiate a RockPaperScissorGUI obj
                RockPaperScissorGui rockPaperScissorGui = new RockPaperScissorGui();

                // display the GUI
                rockPaperScissorGui.setVisible(true);
            }
        });
    }
}
