import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
/*
        ComuidadEPN miembroepn1 = new ComuidadEPN();

        ComuidadEPN miembroepn2 = new ComuidadEPN("1234567890", "Juan", 25, "Calle B", "555-123", "Juan@epn.com");

        miembroepn1.setNombre("Juan");
        miembroepn1.setEdad(18);
        miembroepn1.setCedula("1234567890");
        miembroepn1.setDireccion("Calle A");
        miembroepn1.setTelefono("123450");
        miembroepn1.setCorreo("Juan@gmail.com");


        miembroepn1.mostrarDatos();
        System.out.println("--------------------------------------");
        miembroepn2.mostrarDatos();


        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor("19374645", "Juan", 33, "Calle D", "19374675", "amigo@gmail.com", "POO", "Sistemas", "Pagado");

        profesor1.setNombre("Juan");
        profesor1.setEdad(20);
        profesor1.setDireccion("Calle C");
        profesor1.setFacultad("Ciencias");
        profesor1.setMateriasdictadas("POO");
        profesor1.setTipocontrato("Pagado");
        profesor1.setTelefono("1234567890");
        profesor1.setCorreo("hola@gmail.com");
        profesor1.setCedula("179366547");

        profesor1.mostrarDatos();
        profesor2.mostrarDatos();

*/

        JFrame frame = new JFrame("EPN");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
    }
}