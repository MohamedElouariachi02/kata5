package ulpgc.software.Control.Adapters;

import ulpgc.software.Model.User;
import ulpgc.software.View.InfoDisplay;

import javax.swing.*;
import java.awt.*;

public class InfoAdapter {
    public static void adapt(InfoDisplay infoDisplay, User user) {
        infoDisplay.add(createLabel("Name", user.name()));
        infoDisplay.add(createLabel("Gender", user.gender().name()));
        infoDisplay.add(createLabel("Age", String.valueOf(user.age())));
        infoDisplay.add(createLabel("Email", user.email()));
        infoDisplay.add(createLabel("Phone", user.phone()));
        infoDisplay.add(createLabel("Country", user.country()));
    }

    private static JLabel createLabel(String title, String result) {
        JLabel jLabel = new JLabel(title + ": " + result);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setForeground(Color.WHITE);
        return jLabel;
    }
}
