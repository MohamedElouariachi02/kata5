package ulpgc.software.View;

import ulpgc.software.Control.Adapters.ImageAdapter;
import ulpgc.software.Model.User;

import javax.swing.*;
;

public class ImageDisplay extends JLabel implements Display {
    @Override
    public void show(User user) {
        ImageIcon icon = ImageAdapter.adapt(user.picture());
        setIcon(icon);
    }
}
