import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confirmButton;
    private JTextField textField2;
    private JButton resetButton;
    private JPanel panel;
    private JButton loginButton;

    public Login() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textField1.getText()+
                        " " + new String(passwordField1.getPassword()));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
    }
    public JPanel getMainPanel(){
        return panel;
    }
}
