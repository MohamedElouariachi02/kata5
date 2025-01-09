package ulpgc.software.View;

import ulpgc.software.Control.Adapters.InfoAdapter;
import ulpgc.software.Model.User;

import javax.swing.*;
import java.awt.*;

public class InfoDisplay extends JPanel implements Display {

    public InfoDisplay() {
        setLayout(new GridLayout(6, 1, 10, 10));
        setBackground(Color.BLACK);
    }

    @Override
    public void show(User user) {
        removeAll();
        InfoAdapter.adapt(this, user);
        revalidate();
    }


}
