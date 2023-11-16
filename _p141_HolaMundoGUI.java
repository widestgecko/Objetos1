import javax.swing.*;

public class _p141_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public void _p140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo.");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblSaludo.setBounds(10, 20, 200, 30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        _p141_HolaMundoGUI app = new _p141_HolaMundoGUI();
        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}