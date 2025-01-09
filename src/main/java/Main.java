
import ulpgc.software.Control.Commands.LoadRandomUserInfoSwingCommand;
import ulpgc.software.Control.Commands.LoadRandomUsersCommand;
import ulpgc.software.Model.User;
import ulpgc.software.View.MainFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.put("generar", new LoadRandomUserInfoSwingCommand(mainFrame.getInfo(), mainFrame.getImage()));
        mainFrame.setVisible(true);
    }
}