import javax.swing.*;
import java.awt.event.*;

public class _p140_AreaTrianguloGUI extends JFrame implements ActionListener {
    JLabel lblBase, lblAltura, lblResultado;
    JTextField txtBase, txtAltura;
    JButton btnCalcular, btnSalir;

    public _p140_AreaTrianguloGUI() {
        super("Calcular el área de un triángulo");
        setLayout(null);
        lblBase = new JLabel("Base :");
        lblBase.setBounds(10, 20, 200, 30);
        add(lblBase);
        txtBase = new JTextField();
        txtBase.setBounds(80, 20, 200, 30);
        add(txtBase);
        lblAltura = new JLabel("Altura :");
        lblAltura.setBounds(10, 50, 200, 30);
        add(lblAltura);
        txtAltura = new JTextField();
        txtAltura.setBounds(80, 50, 200, 30);
        add(txtAltura);
        lblResultado = new JLabel(" [Resultado Aqui]");
        lblResultado.setBounds(90, 80, 200, 30);
        add(lblResultado);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 110, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 110, 100, 40);
        add(btnSalir);
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }
}
