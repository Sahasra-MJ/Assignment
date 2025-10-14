package Day6;

import java.awt.*;
import java.awt.event.*;

public class AWT {
    Frame frame;
    TextField tf;
    Button btn;
    Label lbl;

    AWT() {
        frame = new Frame("AWT");
        frame.setLayout(null);

        tf = new TextField("Enter your name");
        tf.setBounds(100, 100, 200, 30);

        btn = new Button("Submit");
        btn.setBounds(150, 150, 80, 30);

        lbl = new Label("");
        lbl.setBounds(130, 200, 200, 30);

        frame.add(tf);
        frame.add(btn);
        frame.add(lbl);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText();
                lbl.setText("Hello, " + name + "!");
            }
        });

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWT();
    }
}
