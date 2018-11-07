import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class BookScreen extends JFrame {

    JFrame bookFrame = new JFrame();
    FlowLayout flow = new FlowLayout();
    JMenu file;
    JMenu book;
    JMenuItem item;
    JLabel displayLabel;
    String bookTitle;
    int numberOfPages;

    public BookScreen()
    {
        setTitle("Booklist");
        setLocation(300,350);
        setSize(300,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        displayLabel = new JLabel("No book added");
        add(displayLabel);

        EventHandler handler = new EventHandler();

        file = new JMenu("File");
        book = new JMenu("Book");

        item = new JMenuItem("Quit");
        item.addActionListener(handler);
        file.add(item);

        item = new JMenuItem("Add");
        item.addActionListener(handler);
        book.add(item);

        item = new JMenuItem("Display");
        item.addActionListener(handler);
        book.add(item);

        //menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(book);

    }

    private class EventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String itemClicked;
            itemClicked = e.getActionCommand();

            if(itemClicked.equals("Quit"))
            {
                JOptionPane.showMessageDialog(null,"Window Closing");
                System.exit(0);
            }

            if(itemClicked.equals("Add"))
            {
                //add book
                bookTitle = JOptionPane.showInputDialog("Enter book name");
                numberOfPages = Integer.parseInt(JOptionPane.showInputDialog("Enter number of pages"));


            }

            if(itemClicked.equals("Display"))
            {
                //display books
                displayLabel.setText("Title: " + bookTitle +
                        "\nNumber of Pages: " + numberOfPages);
            }

        }

    }
}
