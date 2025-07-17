import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.Color;

public class IITDUFootballRegistration {
    static Font Font40 = new Font("Arial", Font.PLAIN, 40);
    static Font Font25 = new Font("Arial", Font.BOLD, 25);

    public static void main(String[] args) {


        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 30));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 25));
        UIManager.put("OptionPane.minimumSize", new Dimension(600, 300));
        UIManager.put("OptionPane.background", Color.orange);
        UIManager.put("Panel.background", Color.white);







        JFrame frame = new JFrame("IITDU Football League Registration");
        frame.setSize(3072, 1920);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(1000, 20, 500, 60);
        nameLabel.setFont(Font25);
        JTextField nameField = new JTextField();
        nameField.setBounds(1000, 80, 500, 50);
        nameField.setFont(Font40);
        frame.add(nameLabel);
        frame.add(nameField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(1000, 140, 500, 60);
        phoneLabel.setFont(Font25);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(1000, 200, 500, 50);
        phoneField.setFont(Font40);
        frame.add(phoneLabel);
        frame.add(phoneField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(1000, 260, 500, 60);
        emailLabel.setFont(Font25);
        JTextField emailField = new JTextField();
        emailField.setBounds(1000, 320, 500, 50);
        emailField.setFont(Font40);
        frame.add(emailLabel);
        frame.add(emailField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(1000, 380, 500, 60);
        addressLabel.setFont(Font25);
        JTextField addressField = new JTextField();
        addressField.setBounds(1000, 440, 500, 50);
        addressField.setFont(Font40);
        frame.add(addressLabel);
        frame.add(addressField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(1000, 500, 500, 60);
        genderLabel.setFont(Font25);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(1000, 560, 150, 40);
        male.setFont(Font25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(1200, 560, 150, 40);
        female.setFont(Font25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);

        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(1000, 620, 500, 60);
        dobLabel.setFont(Font25);
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] years = new String[50];
        for (int i = 0; i < 50; i++) years[i] = String.valueOf(2025 - i);
        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(1000, 680, 100, 40);
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(1110, 680, 150, 40);
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(1270, 680, 150, 40);
        dayBox.setFont(Font25);
        monthBox.setFont(Font25);
        yearBox.setFont(Font25);
        frame.add(dobLabel);
        frame.add(dayBox);
        frame.add(monthBox);
        frame.add(yearBox);

        JLabel degreeLabel = new JLabel("Degree:");
        degreeLabel.setBounds(1000, 740, 500, 60);
        degreeLabel.setFont(Font25);
        String[] degrees = {"Select", "B.Sc in Software Engineering", "M.Sc in Software Engineering"};
        JComboBox<String> degreeBox = new JComboBox<>(degrees);
        degreeBox.setBounds(1000, 800, 500, 50);
        degreeBox.setFont(Font25);
        frame.add(degreeLabel);
        frame.add(degreeBox);

        JLabel positionLabel = new JLabel("Preferred Position:");
        positionLabel.setBounds(1000, 860, 500, 60);
        positionLabel.setFont(Font25);
        String[] positions = {"Select", "Goalkeeper", "Defender", "Midfielder", "Forward", "Winger", "Striker"};
        JComboBox<String> positionBox = new JComboBox<>(positions);
        positionBox.setBounds(1000, 920, 500, 50);
        positionBox.setFont(Font25);
        frame.add(positionLabel);
        frame.add(positionBox);

        JLabel interLabel = new JLabel("Played Inter-Department?:");
        interLabel.setBounds(1000, 980, 500, 60);
        interLabel.setFont(Font25);
        JRadioButton yes = new JRadioButton("Yes");
        yes.setBounds(1000, 1040, 100, 40);
        yes.setFont(Font25);
        JRadioButton no = new JRadioButton("No");
        no.setBounds(1110, 1040, 100, 40);
        no.setFont(Font25);
        ButtonGroup interGroup = new ButtonGroup();
        interGroup.add(yes);
        interGroup.add(no);
        frame.add(interLabel);
        frame.add(yes);
        frame.add(no);

        JLabel expLabel = new JLabel("Football Experience:");
        expLabel.setBounds(1000, 1100, 500, 60);
        expLabel.setFont(Font25);
        String[] experiences = {"Select", "Beginner", "Intermediate", "Advanced", "Semi-Professional", "Professional"};
        JComboBox<String> expBox = new JComboBox<>(experiences);
        expBox.setBounds(1000, 1160, 500, 50);
        expBox.setFont(Font25);
        frame.add(expLabel);
        frame.add(expBox);

        JLabel fileLabel = new JLabel("Upload Photo:");
        fileLabel.setBounds(1000, 1220, 300, 40);
        fileLabel.setFont(Font25);
        JButton fileButton = new JButton("Choose File");
        fileButton.setBounds(1000, 1260, 300, 40);
        fileButton.setFont(Font25);
        JLabel filePathLabel = new JLabel();
        filePathLabel.setBounds(1000, 1300, 500, 40);
        filePathLabel.setFont(Font25);
        frame.add(fileLabel);
        frame.add(fileButton);
        frame.add(filePathLabel);

        final String[] selectedFilePath = {""};
        fileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                selectedFilePath[0] = file.getAbsolutePath();
                filePathLabel.setText(file.getName());
            }
        });

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(1000, 1350, 300, 50);
        submitBtn.setFont(Font40);
        frame.add(submitBtn);

        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            String address = addressField.getText();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
            String dob = dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();
            String degree = (String) degreeBox.getSelectedItem();
            String position = (String) positionBox.getSelectedItem();
            String inter = yes.isSelected() ? "Yes" : (no.isSelected() ? "No" : "");
            String experience = (String) expBox.getSelectedItem();
            String photo = selectedFilePath[0];

            if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || address.isEmpty() || gender.isEmpty() ||
                    degree.equals("Select") || position.equals("Select") || inter.isEmpty() || experience.equals("Select") || photo.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                try (FileWriter writer = new FileWriter("football_registration.txt", true)) {
                    writer.write("Name: " + name + ", Phone: " + phone + ", Email: " + email + ", Address: " + address +
                            ", Gender: " + gender + ", DOB: " + dob + ", Degree: " + degree + ", Position: " + position +
                            ", InterDept: " + inter + ", Experience: " + experience + ", Photo: " + photo + "\n");

                    JOptionPane.showMessageDialog(frame, "Registered Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
