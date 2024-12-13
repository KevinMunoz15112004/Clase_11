import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel cedulaTxt;
    private JLabel nombreTxt;
    private JLabel edadTxt;
    private JLabel direccionTxt;
    private JLabel telefonoTxt;
    private JLabel correoTxt;
    private JButton crearbtn;

    public form1() {
        crearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComuidadEPN miembroepn1 = new ComuidadEPN();
                miembroepn1.setCedula(cedulaTxt.getText());
                miembroepn1.setNombre(nombreTxt.getText());
                miembroepn1.setEdad(Integer.parseInt(edadTxt.getText()));
                miembroepn1.setDireccion(direccionTxt.getText());
                miembroepn1.setTelefono(telefonoTxt.getText());
                miembroepn1.setCorreo(correoTxt.getText());
            }
        });
    }
}
