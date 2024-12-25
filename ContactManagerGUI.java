import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;


public class ContactManagerGUI {

    private static ArrayList<Contact> list = new ArrayList<>();
    private static JFrame frame;
    private static JTextArea textArea;
    private static JTextField namField;
    private static JTextField phonField;
   

    public static void main (String[] args){
        
        frame = new JFrame("Contact Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setLayout(new BorderLayout());


        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Contact Name"));
        namField = new JTextField();
        panel.add(namField);

        panel.add(new JLabel("Phone Number"));
        phonField = new JTextField();
        panel.add(phonField);


        JButton addButton = new JButton("Add contact");
        JButton viewButton = new JButton("View contact");
        JButton searchButton = new JButton("Serarch contact");
        JButton deleButton = new JButton("Delete contact");
        
        panel.add(addButton);
        panel.add(viewButton);
        panel.add(searchButton);
        panel.add(deleButton);
      
        frame.add(panel , BorderLayout.SOUTH);


        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                addContact();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchContact();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewContact();
            }
        });

        deleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        });


        frame.setVisible(true);
    }

    private static void addContact(){
       String name = namField.getText();
       String phoneNumber = phonField.getText();

       if(!name.isEmpty() && !phoneNumber.isEmpty()){
        list.add(new Contact(name, phoneNumber));
        JOptionPane.showMessageDialog(frame,"Contact added successfully");
       }else{
        JOptionPane.showMessageDialog(frame, "Please enter both name and number ");
       }

       namField.setText("");
       phonField.setText("");
    }

    private static void searchContact(){
        String name = JOptionPane.showInputDialog(frame, "Enter the name ");

        if(name !=null && !name.isEmpty()){
            boolean found = false;
            for(Contact contact : list){
                if(contact.getName().equalsIgnoreCase(name)){
                    textArea.setText("Contact found : " + contact);
                    found = true;
                    break;
                }

                if(!found){
                    textArea.setText("Contact not found");
                }
            }
        }
    }

    private static void viewContact(){
        textArea.setText("");
        if(list.isEmpty()){
            textArea.setText("The contact list is empty");
        }else{
            for(Contact contact : list){
                textArea.setText(contact + "\n");
            }
        }
    }

    private static void deleteContact(){
       
        String name = JOptionPane.showInputDialog(frame, "Enter the name of the contact for delete");

        if(name !=null && !name.isEmpty()){
            boolean find = false;
            for(Contact contact : list){
                if(contact.getName().equalsIgnoreCase(name)){
                    list.remove(contact);
                    JOptionPane.showMessageDialog(frame, "The contact deleted sucessfully");
                    find = true;
                    break;
                }
            }


            if(!find){
                JOptionPane.showMessageDialog(frame, "Contact not found ");
            }
        }

       
    }   

    
}
