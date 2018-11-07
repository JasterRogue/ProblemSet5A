import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ageFrame extends JFrame {

    JFrame ageJFrame = new JFrame("Age Frame Boi");
    JLabel enterAgeLabel;
    JLabel ageYearLaterLabel;
    JTextField ageTextField;
    JButton quitButton;
    FlowLayout flow = new FlowLayout();

    public ageFrame()
    {
        setLocation(500,300);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(flow);

        EventHandler handler = new EventHandler();

        enterAgeLabel = new JLabel("Enter Age");
        add(enterAgeLabel);

        ageTextField = new JTextField(30);
        add(ageTextField);
        ageTextField.addActionListener(handler);

        ageYearLaterLabel = new JLabel();
        ageYearLaterLabel.setVisible(false);
        add(ageYearLaterLabel);

        quitButton = new JButton("Quit");
        quitButton.addActionListener(handler);
        add(quitButton);

        setVisible(true);

    }

    public static void main(String[] args)
    {
        ageFrame age = new ageFrame();

    }

    private class EventHandler implements ActionListener
    {
        int ageLater;
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==quitButton)
            {
                JOptionPane.showMessageDialog(null,"Closing");
                System.exit(0);
            }

            ageLater = Integer.parseInt(ageTextField.getText());
            ageYearLaterLabel.setText("Age in a year: " + (ageLater+1) );
            ageYearLaterLabel.setVisible(true);



        }
    }
}
