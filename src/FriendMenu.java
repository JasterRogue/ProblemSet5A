import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendMenu extends JFrame implements ActionListener {

    JFrame friendFrame = new JFrame();
    JMenu friendMenu;
    JMenuItem friend;
    JLabel opinionOfFriend;
    FlowLayout flow = new FlowLayout();

    public static void main(String args[])
    {
        FriendMenu friend = new FriendMenu();
        friend.setVisible(true);
    }

    public FriendMenu()
    {
        //setup jframe
        Container contained;
        contained = getContentPane();

        setTitle("Friend Frame");
        setLocation(300,300);
        setSize(300,300);
        setResizable(false);
        setLayout(flow);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //setup menu
        friendMenu = new JMenu("Friends");

        friend = new JMenuItem("J");
        friend.addActionListener(this);
        friendMenu.add(friend);

        friend = new JMenuItem("Dundee");
        friend.addActionListener(this);
        friendMenu.add(friend);

        friend = new JMenuItem("EB");
        friend.addActionListener(this);
        friendMenu.add(friend);

        //set menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(friendMenu);

        opinionOfFriend = new JLabel("Hello there !" + "\nGeneral Kenobi");
        contained.add(opinionOfFriend);


    }

    public void actionPerformed(ActionEvent e)
    {
        String opinion;
        opinion = e.getActionCommand();
        opinionOfFriend.setText("I only like " + opinion + " because they have lots of money");

    }


}
