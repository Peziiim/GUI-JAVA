import javax.swing.*;

void main() {
    JFrame frame = new JFrame("GUI DO EDUARDO");

    frame.setSize(300, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    frame.setVisible(true);

    JTextField textField = new JTextField();
    textField.setBounds(20, 20, 150, 25);

    JButton button = new JButton("Clique Aqui");
    button.setBounds(180, 20, 90, 25);

    JLabel label = new JLabel("Olá!");
    label.setBounds(20, 60, 250, 25);

    frame.add(textField);
    frame.add(button);
    frame.add(label);

    button.addActionListener(e -> {
        String name = textField.getText();
        label.setText("Olá, " + name + "!");
    });
}
