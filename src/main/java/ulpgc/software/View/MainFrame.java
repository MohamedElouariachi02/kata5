package ulpgc.software.View;

import ulpgc.software.Control.Commands.Command;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MainFrame extends JFrame {
    private final HashMap<String, Command> commands;
    private final InfoDisplay info;
    private final ImageDisplay image;
    private JLabel foto;

    public MainFrame() throws HeadlessException {
        getContentPane().setBackground(Color.BLACK);
        commands = new HashMap<>();
        setSize(500, 300);
        setTitle("Random users");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 10, 10));
        setLocationRelativeTo(null);
        info = createInfoDisplay();
        image = createImageDisplay();
        add(imageSide());
        add(info);
    }

    private ImageDisplay createImageDisplay() {
        return new ImageDisplay();
    }

    private InfoDisplay createInfoDisplay() {
        return new InfoDisplay();
    }

    public void put(String name, Command command) {
        commands.put(name, command);
    }


    private Component imageSide() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BorderLayout());
        JButton button = new JButton("Generar");
        button.setBackground(new Color(79, 0, 0));
        button.setForeground(Color.WHITE);
        //button.setBorderPainted(false);
        button.addActionListener(e -> {
            commands.get("generar").execute();
        });
        panel.add(image);
        panel.add(button, BorderLayout.SOUTH);
        return panel;
    }

    public InfoDisplay getInfo() {
        return info;
    }

    public ImageDisplay getImage() {
        return image;
    }

    public JLabel getFoto() {
        return foto;
    }
}
