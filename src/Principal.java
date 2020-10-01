import javax.swing.*;
import java.awt.*;

public class Principal
{
    public static void main(String[] args)
    {
        MarcoTarea mimarco = new MarcoTarea();
    }
}

class MarcoTarea extends JFrame
{
    public MarcoTarea()
    {   add(new real_panel());
        add(new Panel());
        add(new Panel_1_1());
        add(new Panel2());
        add(new real_panel2());
        add(new Panel3());
        add(new Panel4());
        add(new Panel5());
        setTitle("Real Formulario");
        setSize(575,535);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
class real_panel extends JPanel
{
    public real_panel()
    {
        setBounds(320,200,217,58);
        JButton boton = new JButton("Cargar Foto");
        JButton boton2 = new JButton("Cargar Foto");
        JComboBox combobox = new JComboBox();
        combobox.addItem("Seleccionar");
        combobox.addItem("Masculino");
        combobox.addItem("Femenino");
        setLayout(new GridLayout(2,1,3,3));

        add(boton);
        add(combobox);
        //setBackground(Color.WHITE);
    }
}

class Panel extends JPanel
{
    public Panel()
    {
        setBounds(10,10,10,10);

        setBounds(35, 8, 265, 260);
        JLabel a = new JLabel("  Datos Personales: ");
        add(a);
        JLabel b = new JLabel("  Nombre Del Contacto:");
        add(b);
        JTextField c = new JTextField();
        add(c);
        add(new JLabel("  Apellidos Del Contacto:"));
        add(new JTextField());
        add(new JLabel("  Email Del Contacto:"));
        add(new JTextField());
        add(new JLabel("  Celular Del Contacto:"));
        add(new JTextField());
        add(new JLabel("  Direccion Del Contacto:"));
        setLayout(new GridLayout(11,1,9,9));
        add(new JTextField());
        //setBackground(Color.PINK);

    }
}
class Panel_1_1 extends JPanel
{
    public Panel_1_1()
    {

        setBounds(310, 16, 240, 245);
        //setLayout(new FlowLayout());
        //add(new JButton("boton"));

        //setBackground(Color.BLACK);
    }
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g; // ahi que instanciar un objeto de tipo graphics
        g2D.setPaint(Color.GRAY);

        Font mifuente = new Font("Segoe UI",Font.BOLD,16);
        g2D.setFont(mifuente);
        g2D.draw3DRect(10, 10, 215, 180,false);
        g2D.drawString("FOTO", 100, 110);
    }
}
class Panel2 extends JPanel
{
    public Panel2()
    {
        setBounds(35, 270, 510, 25);
        setLayout(new GridLayout(1,2,30,0));
        JButton boton1 = new JButton("Guardar Informacion");
        JButton boton2 = new JButton("Probar Conexion");
        add(boton1);
        add(boton2);
        //setBackground(Color.CYAN);
    }

}

class real_panel2 extends JPanel
{
    public real_panel2()
    {
        setBounds(0, 305, 560, 31);
        setLayout(new FlowLayout());
        add(new JButton("Nombres")).setEnabled(false);
        add(new JButton("Apellidos")).setEnabled(false);
        add(new JButton("Email")).setEnabled(false);
        add(new JButton("Telefono")).setEnabled(false);
        add(new JButton("Direccion")).setEnabled(false);
        add(new JButton("Sexo")).setEnabled(false);
        //setBackground(Color.RED);

    }
}
class Panel3 extends JPanel
{
    public Panel3()
    {
        setBounds(0, 331,560 , 100);
        setLayout(new BorderLayout());
        //setBackground(Color.YELLOW);

    }
    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.draw3DRect(33, -1, 493, 100,false);

    }
}

class Panel4 extends JPanel
{
    public Panel4()
    {
        setBounds(0, 432,560 , 40);
        setLayout(new FlowLayout());

        JButton boton1 = new JButton("Ir");
        JButton boton2 = new JButton("Guardar");
        JButton boton3 = new JButton("Eliminar");
        JButton boton4 = new JButton("Modificar");
        JButton boton5 = new JButton("Limpiar");
        JButton boton6 = new JButton("Salir");
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        //setBackground(Color.GRAY);
    }

}
class Panel5 extends JPanel
{
    public Panel5()
    {

        setBounds(600, 50,200 , 20);
        setLayout(new FlowLayout());


        //setBackground(Color.GREEN);

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        Font mifuente = new Font("Segoe UI",Font.BOLD,16);
        g2D.draw3DRect(5, 5, 550, 298,false);
        g2D.setFont(mifuente);
        g2D.drawString("Program Made With ♥ By Edison J. Padilla ", 120, 485);

    }

}


