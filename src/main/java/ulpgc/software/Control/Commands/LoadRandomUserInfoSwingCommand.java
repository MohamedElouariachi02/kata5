package ulpgc.software.Control.Commands;

import ulpgc.software.View.ImageDisplay;
import ulpgc.software.View.InfoDisplay;
import ulpgc.software.Model.User;


public class LoadRandomUserInfoSwingCommand implements Command {
    private final InfoDisplay info;
    private final ImageDisplay image;

    public LoadRandomUserInfoSwingCommand(InfoDisplay info, ImageDisplay image) {
        this.info = info;
        this.image = image;
    }

    @Override
    public void execute() {
        LoadRandomUsersCommand loadRandomUsersCommand = new LoadRandomUsersCommand(1);
        loadRandomUsersCommand.execute();
        User user = loadRandomUsersCommand.getUsers().getFirst();
        info.show(user);
        image.show(user);

    }
}
