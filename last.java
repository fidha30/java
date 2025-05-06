import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleStudentForm extends JFrame implements ActionListener {

    JTextField nameField, emailField;
    JRadioButton maleBtn, femaleBtn, otherBtn;
    JComboBox<String> courseBox;
    JCheckBox readBox, travelBox, gameBox;
    JButton submitBtn, resetBtn;
    ButtonGroup genderGroup;
     
    public SimpleStudentForm() {
        setTitle("Student Registration");
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Name
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        // Email
        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        // Gender
        add(new JLabel("Gender:"));
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        otherBtn = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        genderGroup.add(otherBtn);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        genderPanel.add(otherBtn);
        add(genderPanel);

        // Course
        add(new JLabel("Course:"));
        String[] courses = {"B.Tech", "B.Sc", "B.Com"};
        courseBox = new JComboBox<>(courses);
        add(courseBox);

        // Hobbies
        add(new JLabel("Hobbies:"));
        readBox = new JCheckBox("Reading");
        travelBox = new JCheckBox("Traveling");
        gameBox = new JCheckBox("Gaming");
        JPanel hobbyPanel = new JPanel();
        hobbyPanel.add(readBox);
        hobbyPanel.add(travelBox);
        hobbyPanel.add(gameBox);
        add(hobbyPanel);

        // Buttons
        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        submitBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        add(submitBtn);
        add(resetBtn);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();

            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name and Email cannot be empty.");
                return;
            }

            String gender = maleBtn.isSelected() ? "Male" :
                            femaleBtn.isSelected() ? "Female" :
                            otherBtn.isSelected() ? "Other" : "Not selected";

            String course = (String) courseBox.getSelectedItem();

            String hobbies = "";
            if (readBox.isSelected()) hobbies += "Reading ";
            if (travelBox.isSelected()) hobbies += "Traveling ";
            if (gameBox.isSelected()) hobbies += "Gaming ";
            if (hobbies.isEmpty()) hobbies = "None";

            String message = "Name: " + name +
                             "\nEmail: " + email +
                             "\nGender: " + gender +
                             "\nCourse: " + course +
                             "\nHobbies: " + hobbies;

            JOptionPane.showMessageDialog(this, message);
        }

        if (e.getSource() == resetBtn) {
            nameField.setText("");
            emailField.setText("");
            genderGroup.clearSelection();
            courseBox.setSelectedIndex(0);
            readBox.setSelected(false);
            travelBox.setSelected(false);
            gameBox.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new SimpleStudentForm().setVisible(true); 
    }
}
 