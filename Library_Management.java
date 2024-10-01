package Library_Management_System;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.Stack;

public class Library_Management extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel_3;
    private JTextField textField_3;
    private JLabel lblNewLabel_4;
    private JTextField textField_4;
    private JLabel lblNewLabel_5;
    private JPanel panel;
    private JPanel panel_1;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_2;
    private JTextField textField_5;
    private JButton btnSearch;
    private JPanel panel_2;
    private JLabel lblNewLabel_6;
    private JTextField textField_6;
    private JLabel lblNewLabel_7;
    private JTable table;
    
   
    private Stack<Object[]> StackLibrary = new Stack<>();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Library_Management frame = new Library_Management();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Library_Management() {
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 740, 514);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBounds(10, 64, 216, 400);
        contentPane.add(panel);
        panel.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(10, 57, 191, 32);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Book Title");
        lblNewLabel.setBounds(10, 25, 86, 32);
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblNewLabel_1 = new JLabel("ISBN No.");
        lblNewLabel_1.setBounds(10, 90, 80, 32);
        panel.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        textField_2 = new JTextField();
        textField_2.setBounds(10, 123, 191, 32);
        panel.add(textField_2);
        textField_2.setColumns(10);
        
        lblNewLabel_3 = new JLabel("Author");
        lblNewLabel_3.setBounds(10, 155, 80, 32);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        textField_3 = new JTextField();
        textField_3.setBounds(10, 188, 191, 32);
        panel.add(textField_3);
        textField_3.setColumns(10);
        
        lblNewLabel_4 = new JLabel("Genre");
        lblNewLabel_4.setBounds(10, 216, 80, 32);
        panel.add(lblNewLabel_4);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        textField_4 = new JTextField();
        textField_4.setBounds(10, 250, 191, 32);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        btnNewButton_1 = new JButton("Enter");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_1.setBounds(63, 366, 89, 23);
        panel.add(btnNewButton_1);
        
        lblNewLabel_6 = new JLabel("Book No.");
        lblNewLabel_6.setBounds(10, 282, 80, 32);
        panel.add(lblNewLabel_6);
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        textField_6 = new JTextField();
        textField_6.setBounds(10, 311, 191, 32);
        panel.add(textField_6);
        textField_6.setColumns(10);
        
        panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(Color.YELLOW);
        panel_1.setBounds(299, 351, 216, 113);
        contentPane.add(panel_1);
        
        lblNewLabel_5 = new JLabel("Remove");
        lblNewLabel_5.setBounds(10, 11, 80, 32);
        panel_1.add(lblNewLabel_5);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        textField_1 = new JTextField();
        textField_1.setBounds(10, 41, 191, 32);
        panel_1.add(textField_1);
        textField_1.setColumns(10);
        
        JButton btnRemove = new JButton("Enter");
        btnRemove.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnRemove.setBounds(66, 79, 89, 23);
        panel_1.add(btnRemove);
        
        lblNewLabel_7 = new JLabel("(input the book no.)");
        lblNewLabel_7.setBounds(80, 23, 121, 14);
        panel_1.add(lblNewLabel_7);
        
        lblNewLabel_2 = new JLabel("Library Management System");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel_2.setBounds(217, 0, 312, 57);
        contentPane.add(lblNewLabel_2);
        
        panel_2 = new JPanel();
        panel_2.setBackground(Color.YELLOW);
        panel_2.setBounds(341, 64, 373, 35);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        textField_5 = new JTextField();
        textField_5.setBounds(10, 6, 261, 20);
        panel_2.add(textField_5);
        textField_5.setColumns(10);
        
        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSearch.setBounds(281, 5, 82, 23);
        panel_2.add(btnSearch);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(236, 110, 478, 230);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Book No.", "Book Title", "ISBN No.", "Author", "Genre"
            }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(35);
        scrollPane.setViewportView(table);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.YELLOW);
        panel_3.setBounds(236, 64, 95, 35);
        contentPane.add(panel_3);
        
        JButton btnNewButton = new JButton("Undo");
        panel_3.add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        
      
        btnNewButton_1.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                String bookNo = textField_6.getText();
                String bookTitle = textField.getText();
                String isbnNo = textField_2.getText();
                String author = textField_3.getText();
                String genre = textField_4.getText();

                Object[] row = {bookNo, bookTitle, isbnNo, author, genre};
                StackLibrary.push(row); 
                
                updateTable();
                
               
                textField_6.setText("");
                textField.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
            }
        });

        
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!StackLibrary.isEmpty()) {
                    StackLibrary.pop();  
                    updateTable();    
                } else {
                    JOptionPane.showMessageDialog(null, "No Book to Undo", "Undo Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

       
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookNo = textField_1.getText();
                removeBook(bookNo);
                updateTable();
                textField_1.setText("");
            }
        });
        
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchBookNo = textField_5.getText(); 
                searchBook(searchBookNo);  
            }
        });
    }

    
    private void removeBook(String bookNo) {
        StackLibrary.removeIf(row -> row[0].equals(bookNo));
    }

   
    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
        for (Object[] row : StackLibrary) {
            model.addRow(row);
        }
    }

    
    private void searchBook(String bookNo) {
        for (Object[] row : StackLibrary) {
            if (row[0].equals(bookNo)) { 
                String bookDetails = String.format(
                    "Book No: %s\nBook Title: %s\nISBN No: %s\nAuthor: %s\nGenre: %s",
                    row[0], row[1], row[2], row[3], row[4]
                );
                JOptionPane.showMessageDialog(this, bookDetails, "Book Details", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Book not found", "Search Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
