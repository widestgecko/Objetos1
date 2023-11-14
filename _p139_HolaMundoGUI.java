import javax.swing.*;
import java.awt.Font;

public class _p139_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public _p139_HolaMundoGUI() {
        setLayout(null);
        String texto = ("En la primera era,\n en la primera batalla,.");
        lblSaludo = new JLabel(texto);
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblSaludo.setBounds(20, 20,500, 300);
        add(lblSaludo); 
    }

    public static void main(String[] args) {
        String texto = ("En la primera era, - en la primera batalla,.");
        System.out.println(texto);
        _p139_HolaMundoGUI app = new _p139_HolaMundoGUI();
        app.setBounds(10, 10, 600, 600);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}