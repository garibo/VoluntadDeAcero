import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class aplicacion extends JFrame implements ActionListener, ItemListener{
    
    JLabel FondoMenu = new JLabel( new ImageIcon( "imagenes/portada.png" ) );
    JMenuBar barra;
    JMenu home,altas,eliminar,editar;
    JMenuItem altasAlumnos,altasDocentes,AltasTutores,portada,salir,reportes;
    JMenuItem eliminarAlumnos,eliminarDocentes,eliminarTutor,eliminarReporte;
    JMenuItem editarAlumnos, editarDocentes, editarTutor,editarReporte;
    JTextField campo1,campo2,campo3,campo4,campo5,campo6,campo7;
    JTextField campo8,campo9,campo10,campo11,campo12,campo13,campo14;
    JTextField campo15,campo16,campo17,campo18,campo19,campo20,campo21;
    JComboBox sexo,semestre,tipoSangre;
    JButton generarAltasAlumnos, generarAltasDocentes, generarAltasTutores, generarAltasReportes;
    JButton buscarAlumnos, deleteAlumnos,buscarDocente,deleteDocente,buscarTutor,deleteTutor;
    JButton editBuscarAlumnos, editGuardarAlumnos,editBuscarDocentes,editGuardarDocentes,deleteReporte;
    JButton editBuscarTutor,editGuardarTutor,editBuscarReporte,editGuardarReporte,buscarReporte;
    
    Reportes reportar = new Reportes();
    Alumnos alumnos = new Alumnos();
    Docentes docente = new Docentes();
    Tutores tutor = new Tutores();
    
    
     Object[][] data = {{"", "","",""}};
    String[] columnNames = {"ID","Nombre","Apellido paterno","Apellido materno"};
    JTable tabla;
    JPanel panel;
    JScrollPane scrollPane;
    
    Object[][] dataR = {{"","","","",""}};
    String[] columnaR = {"ID","Causa","Fecha ","ID alumno","ID Asesor"};
    JTable tablaR;
    JPanel panelR;
    JScrollPane scrollPaneR;
    
    
    public aplicacion()
    {
         
        
        barraMenu();
        camposTexto();
        comboBoxes();
        botones();
        tablas();
        
        FondoMenu.setBounds(0,0,715,625);
        FondoMenu.setVisible(true);
        add( FondoMenu );
        
        
        setLayout(null);    
        setSize( 720, 680);
        setVisible( true );
        setLocationRelativeTo( null );
        setResizable(false);
        setTitle("Colegio voluntad de acero");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   
    }
    
    public void barraMenu()
    {
        barra=new JMenuBar();
        setJMenuBar(barra);
        
        home=new JMenu("Principal");
        barra.add(home);        
        
        portada=new JMenuItem("Home");
        portada.addActionListener(this);
        home.add(portada);
        
        salir=new JMenuItem("Salir");
        salir.addActionListener(this);
        home.add(salir);
        
        altas=new JMenu("altas");
        barra.add(altas);
        
        altasAlumnos=new JMenuItem("Alumnos");
        altasAlumnos.addActionListener(this);
        altas.add(altasAlumnos);
        
        altasDocentes=new JMenuItem("Docentes");
        altasDocentes.addActionListener(this);
        altas.add(altasDocentes);
        
        AltasTutores=new JMenuItem("Tutores");
        AltasTutores.addActionListener(this);
        altas.add(AltasTutores);
        
        reportes=new JMenuItem("Reportes");
        reportes.addActionListener(this);
        altas.add(reportes);
        
        
        eliminar=new JMenu("Eliminar");
        barra.add(eliminar);
        
        eliminarAlumnos=new JMenuItem("Alumnos");
        eliminarAlumnos.addActionListener(this);
        eliminar.add(eliminarAlumnos);
        
        eliminarDocentes=new JMenuItem("Docentes");
        eliminarDocentes.addActionListener(this);
        eliminar.add(eliminarDocentes);
        
        eliminarTutor=new JMenuItem("Tutores");
        eliminarTutor.addActionListener(this);
        eliminar.add(eliminarTutor);
        
        eliminarReporte=new JMenuItem("reportes");
        eliminarReporte.addActionListener(this);
        eliminar.add(eliminarReporte);
        
        
        
        editar=new JMenu("Editar");
        barra.add(editar);
        
        editarAlumnos=new JMenuItem("Alumnos");
        editarAlumnos.addActionListener(this);
        editar.add(editarAlumnos);
        
        editarDocentes=new JMenuItem("Docentes");
        editarDocentes.addActionListener(this);
        editar.add(editarDocentes);
        
        editarTutor=new JMenuItem("Tutores");
        editarTutor.addActionListener(this);
        editar.add(editarTutor);
        
        editarReporte=new JMenuItem("Reportes");
        editarReporte.addActionListener(this);
        editar.add(editarReporte);
    }

    public void camposTexto()
    {
        campo1 = new JTextField();
        campo1.reshape(190,87,120,20);
        campo1.setVisible(false);
        add(campo1);

        campo2 = new JTextField();
        campo2.reshape(190,137,120,20);
        campo2.setVisible(false);
        add(campo2);
        
        campo3 = new JTextField();
        campo3.reshape(190,185,120,20);
        campo3.setVisible(false);
        add(campo3);
        
        campo4 = new JTextField();
        campo4.reshape(190,235,120,20);
        campo4.setVisible(false);
        add(campo4);
        
        campo5 = new JTextField();
        campo5.reshape(190,285,120,20);
        campo5.setVisible(false);
        add(campo5);
        
        campo6 = new JTextField();
        campo6.reshape(190,330,120,20);
        campo6.setVisible(false);
        add(campo6);
        
        campo7 = new JTextField();
        campo7.reshape(190,380,120,20);
        campo7.setVisible(false);
        add(campo7);
        
        campo8 = new JTextField();
        campo8.reshape(190,428,120,20);
        campo8.setVisible(false);
        add(campo8);
        
        campo9 = new JTextField();
        campo9.reshape(190,476,120,20);
        campo9.setVisible(false);
        add(campo9);
        
        campo10 = new JTextField();
        campo10.reshape(190,524,120,20);
        campo10.setVisible(false);
        add(campo10);
        
        campo11 = new JTextField();
        campo11.reshape(190,572,120,20);
        campo11.setVisible(false);
        add(campo11);
        
        
        campo12 = new JTextField();
        campo12.reshape(505,87,120,20);
        campo12.setVisible(false);
        add(campo12);
        
        campo13 = new JTextField();
        campo13.reshape(505,137,120,20);
        campo13.setVisible(false);
        add(campo13);
        
        campo14 = new JTextField();
        campo14.reshape(505,185,120,20);
        campo14.setVisible(false);
        add(campo14);
        
        campo15 = new JTextField();
        campo15.reshape(505,235,120,20);
        campo15.setVisible(false);
        add(campo15);
        
        campo16 = new JTextField();
        campo16.reshape(505,275,120,20);
        campo16.setVisible(false);
        add(campo16);
        
        campo17 = new JTextField();
        campo17.reshape(505,476,120,20);
        campo17.setVisible(false);
        add(campo17);
        
        campo18 = new JTextField();
        campo18.reshape(505,524,120,20);
        campo18.setVisible(false);
        add(campo18);
      
        

    }
    
    public void comboBoxes()
    {
        tipoSangre=new JComboBox();
        tipoSangre.setBounds(505,330,80,20);
        tipoSangre.setVisible(false);
        add(tipoSangre);
        
        tipoSangre.addItem("O+");
        tipoSangre.addItem("A+");
        tipoSangre.addItem("B+");
        tipoSangre.addItem("AB+");
        tipoSangre.addItem("O-");
        tipoSangre.addItem("A-");
        tipoSangre.addItem("B-");
        tipoSangre.addItem("AB-");
        tipoSangre.addItemListener(this);
        
        sexo=new JComboBox();
        sexo.setBounds(505,380,100,20);
        sexo.setVisible(false);
        add(sexo);
        
        sexo.addItem("Masculino");
        sexo.addItem("Femenino");
        sexo.addItemListener(this);
        
        
        semestre=new JComboBox();
        semestre.setBounds(505,428,80,20);
        semestre.setVisible(false);
        add(semestre);
        
        semestre.addItem("1");
        semestre.addItem("2");
        semestre.addItem("3");
        semestre.addItem("4");
        semestre.addItem("5");
        semestre.addItem("6");
        semestre.addItemListener(this);
    }
    
    public void botones()
    {
         Border thickBorder = new LineBorder(Color.WHITE, 0);
         
        generarAltasAlumnos= new JButton("");
        generarAltasAlumnos.setIcon(new ImageIcon( "imagenes/agregar.png" ) );
        generarAltasAlumnos.setVisible(false);
        generarAltasAlumnos.reshape(298,608,120,45);
        generarAltasAlumnos.addActionListener(this);
        generarAltasAlumnos.setBorder(thickBorder);
        generarAltasAlumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(generarAltasAlumnos);
        
        generarAltasDocentes= new JButton("");
        generarAltasDocentes.setIcon(new ImageIcon( "imagenes/agregar.png" ) );
        generarAltasDocentes.setVisible(false);
        generarAltasDocentes.reshape(298,608,120,45);
        generarAltasDocentes.addActionListener(this);
        generarAltasDocentes.setBorder(thickBorder);
        generarAltasDocentes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(generarAltasDocentes);
        
        generarAltasTutores= new JButton("");
        generarAltasTutores.setIcon(new ImageIcon( "imagenes/agregar.png" ) );
        generarAltasTutores.setVisible(false);
        generarAltasTutores.reshape(298,608,120,45);
        generarAltasTutores.addActionListener(this);
        generarAltasTutores.setBorder(thickBorder);
        generarAltasTutores.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(generarAltasTutores);
        
        generarAltasReportes= new JButton("");
        generarAltasReportes.setIcon(new ImageIcon( "imagenes/agregar.png" ) );
        generarAltasReportes.setVisible(false);
        generarAltasReportes.reshape(298,608,120,45);
        generarAltasReportes.addActionListener(this);
        generarAltasReportes.setBorder(thickBorder);
        generarAltasReportes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(generarAltasReportes);
        
        buscarAlumnos= new JButton("");
        buscarAlumnos.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        buscarAlumnos.setVisible(false);
        buscarAlumnos.reshape(180,608,120,45);
        buscarAlumnos.addActionListener(this);
        buscarAlumnos.setBorder(thickBorder);
        buscarAlumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(buscarAlumnos);
        
        
        deleteAlumnos= new JButton("");
        deleteAlumnos.setIcon(new ImageIcon( "imagenes/eliminar.png" ) );
        deleteAlumnos.setVisible(false);
        deleteAlumnos.reshape(410,608,120,45);
        deleteAlumnos.addActionListener(this);
        deleteAlumnos.setBorder(thickBorder);
        deleteAlumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(deleteAlumnos);
        
        buscarDocente= new JButton("");
        buscarDocente.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        buscarDocente.setVisible(false);
        buscarDocente.reshape(180,608,120,45);
        buscarDocente.addActionListener(this);
        buscarDocente.setBorder(thickBorder);
        buscarDocente.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(buscarDocente);
        
        
        deleteDocente= new JButton("");
        deleteDocente.setIcon(new ImageIcon( "imagenes/eliminar.png" ) );
        deleteDocente.setVisible(false);
        deleteDocente.reshape(410,608,120,45);
        deleteDocente.addActionListener(this);
        deleteDocente.setBorder(thickBorder);
        deleteDocente.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(deleteDocente);
        
        buscarTutor= new JButton("");
        buscarTutor.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        buscarTutor.setVisible(false);
        buscarTutor.reshape(180,608,120,45);
        buscarTutor.addActionListener(this);
        buscarTutor.setBorder(thickBorder);
        buscarTutor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(buscarTutor);
        
        
        deleteTutor= new JButton("");
        deleteTutor.setIcon(new ImageIcon( "imagenes/eliminar.png" ) );
        deleteTutor.setVisible(false);
        deleteTutor.reshape(410,608,120,45);
        deleteTutor.addActionListener(this);
        deleteTutor.setBorder(thickBorder);
        deleteTutor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(deleteTutor);
        
        buscarReporte= new JButton("");
        buscarReporte.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        buscarReporte.setVisible(false);
        buscarReporte.reshape(180,608,120,45);
        buscarReporte.addActionListener(this);
        buscarReporte.setBorder(thickBorder);
        buscarReporte.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(buscarReporte);
        
        
        deleteReporte= new JButton("");
        deleteReporte.setIcon(new ImageIcon( "imagenes/eliminar.png" ) );
        deleteReporte.setVisible(false);
        deleteReporte.reshape(410,608,120,45);
        deleteReporte.addActionListener(this);
        deleteReporte.setBorder(thickBorder);
        deleteReporte.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(deleteReporte);
        
        editBuscarAlumnos= new JButton("");
        editBuscarAlumnos.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        editBuscarAlumnos.setVisible(false);
        editBuscarAlumnos.reshape(280,608,120,45);
        editBuscarAlumnos.addActionListener(this);
        editBuscarAlumnos.setBorder(thickBorder);
        editBuscarAlumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editBuscarAlumnos);
        
        
        editGuardarAlumnos= new JButton("");
        editGuardarAlumnos.setIcon(new ImageIcon( "imagenes/guardar.png" ) );
        editGuardarAlumnos.setVisible(false);
        editGuardarAlumnos.reshape(490,608,120,45);
        editGuardarAlumnos.addActionListener(this);
        editGuardarAlumnos.setBorder(thickBorder);
        editGuardarAlumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editGuardarAlumnos);
        
        editBuscarDocentes= new JButton("");
        editBuscarDocentes.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        editBuscarDocentes.setVisible(false);
        editBuscarDocentes.reshape(280,608,120,45);
        editBuscarDocentes.addActionListener(this);
        editBuscarDocentes.setBorder(thickBorder);
        editBuscarDocentes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editBuscarDocentes);
        
        
        editGuardarDocentes= new JButton("");
        editGuardarDocentes.setIcon(new ImageIcon( "imagenes/guardar.png" ) );
        editGuardarDocentes.setVisible(false);
        editGuardarDocentes.reshape(490,608,120,45);
        editGuardarDocentes.addActionListener(this);
        editGuardarDocentes.setBorder(thickBorder);
        editGuardarDocentes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editGuardarDocentes);
        
        editBuscarTutor= new JButton("");
        editBuscarTutor.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        editBuscarTutor.setVisible(false);
        editBuscarTutor.reshape(280,608,120,45);
        editBuscarTutor.addActionListener(this);
        editBuscarTutor.setBorder(thickBorder);
        editBuscarTutor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editBuscarTutor);
        
        
        editGuardarTutor= new JButton("");
        editGuardarTutor.setIcon(new ImageIcon( "imagenes/guardar.png" ) );
        editGuardarTutor.setVisible(false);
        editGuardarTutor.reshape(490,608,120,45);
        editGuardarTutor.addActionListener(this);
        editGuardarTutor.setBorder(thickBorder);
        editGuardarTutor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editGuardarTutor);
        
        editBuscarReporte= new JButton("");
        editBuscarReporte.setIcon(new ImageIcon( "imagenes/buscar.png" ) );
        editBuscarReporte.setVisible(false);
        editBuscarReporte.reshape(280,608,120,45);
        editBuscarReporte.addActionListener(this);
        editBuscarReporte.setBorder(thickBorder);
        editBuscarReporte.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editBuscarReporte);
        
        
        editGuardarReporte= new JButton("");
        editGuardarReporte.setIcon(new ImageIcon( "imagenes/guardar.png" ) );
        editGuardarReporte.setVisible(false);
        editGuardarReporte.reshape(490,608,120,45);
        editGuardarReporte.addActionListener(this);
        editGuardarReporte.setBorder(thickBorder);
        editGuardarReporte.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(editGuardarReporte);
        
        
       
    }
    
    public void tablas()
    {
        tabla = new JTable(data, columnNames);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 30));
        tabla.setFillsViewportHeight(true);
        
        
                
       scrollPane = new JScrollPane(tabla);
       scrollPane.setVisible(true);

       
        add(scrollPane);
        
        panel = new JPanel();
        panel.setBounds(100, 200, 520,200);
        panel.setBackground(Color.white);
        panel.setVisible(false);
        add(panel);
        panel.add(scrollPane);
        
        
        
        /*Tabla para los datos del los reportes*/
        
        tablaR = new JTable(dataR, columnaR);
        tablaR.setPreferredScrollableViewportSize(new Dimension(500, 30));
        tablaR.setFillsViewportHeight(true);
        
        
                
       scrollPaneR = new JScrollPane(tablaR);
       scrollPaneR.setVisible(true);

       
        add(scrollPaneR);
        
        panelR = new JPanel();
        panelR.setBounds(100, 200, 520,200);
        panelR.setBackground(Color.white);
        panelR.setVisible(false);
        add(panelR);
        panelR.add(scrollPaneR);
    }
    
    public void limpiar()
    {
            campo1.setVisible(false);
            campo2.setVisible(false);
            campo3.setVisible(false);
            campo4.setVisible(false);
            campo5.setVisible(false);
            campo6.setVisible(false);
            campo7.setVisible(false);
            campo8.setVisible(false);
            campo9.setVisible(false);
            campo10.setVisible(false);
            campo11.setVisible(false);
            campo12.setVisible(false);
            campo13.setVisible(false);
            campo14.setVisible(false);
            campo15.setVisible(false);
            campo16.setVisible(false);
            campo17.setVisible(false);
            campo18.setVisible(false);

            campo1.setText("");
            campo2.setText("");
            campo3.setText("");
            campo4.setText("");
            campo5.setText("");
            campo6.setText("");
            campo7.setText("");
            campo8.setText("");
            campo9.setText("");
            campo10.setText("");
            campo11.setText("");
            campo12.setText("");
            campo13.setText("");
            campo14.setText("");
            campo15.setText("");
            campo16.setText("");
            campo17.setText("");
            campo18.setText("");
            
            tipoSangre.setVisible(false);
            sexo.setVisible(false);
            semestre.setVisible(false);

            generarAltasAlumnos.setVisible(false);
            generarAltasDocentes.setVisible(false);
            generarAltasTutores.setVisible(false);
            generarAltasReportes.setVisible(false);
            buscarAlumnos.setVisible(false);
            deleteAlumnos.setVisible(false);
            panel.setVisible(false);
            panelR.setVisible(false);
            buscarDocente.setVisible(false);
            deleteDocente.setVisible(false);
            buscarTutor.setVisible(false);
            deleteTutor.setVisible(false);
            editGuardarAlumnos.setVisible(false);
            editBuscarAlumnos.setVisible(false);
            editBuscarDocentes.setVisible(false);
            editGuardarDocentes.setVisible(false);
            editBuscarTutor.setVisible(false);
            editGuardarTutor.setVisible(false);
            editBuscarReporte.setVisible(false);
            editGuardarReporte.setVisible(false);
            buscarReporte.setVisible(false);
            deleteReporte.setVisible(false);
    }
    
    public void aparecerAltasAlumnos()
    {
            setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/altas-alumnos.png"));
            campo1.reshape(190,87,120,20);

            campo2.reshape(190,137,120,20);
            campo3.reshape(190,185,120,20);
            campo4.reshape(190,235,120,20);
            campo5.reshape(190,285,120,20);
            campo6.reshape(190,330,120,20);
            campo7.reshape(190,380,120,20);
            campo8.reshape(190,428,120,20);
            campo9.reshape(190,476,120,20);
            campo10.reshape(190,524,120,20);
            campo11.reshape(190,572,120,20);
            campo12.reshape(505,87,120,20);
            campo13.reshape(505,137,120,20);
            campo14.reshape(505,185,120,20);
            campo15.reshape(505,235,120,20);
            campo16.reshape(505,275,120,20);
            campo17.reshape(505,476,120,20);
            campo18.reshape(505,524,120,20);

            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            campo6.setVisible(true);
            campo7.setVisible(true);
            campo8.setVisible(true);
            campo9.setVisible(true);
            campo10.setVisible(true);
            campo11.setVisible(true);
            campo12.setVisible(true);
            campo13.setVisible(true);
            campo14.setVisible(true);
            campo15.setVisible(true);
            campo16.setVisible(true);
            campo17.setVisible(true);
            campo18.setVisible(true);

            tipoSangre.setBounds(505,330,80,20);
            tipoSangre.setVisible(true);

            sexo.setBounds(505,380,100,20);
            sexo.setVisible(true);

            semestre.setBounds(505,428,80,20);
            semestre.setVisible(true);
            
           generarAltasAlumnos.setVisible(true);
    }
    
    public void aparecerAltasDocentes()
    {
        setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/altas-docentes.png"));
            
            campo1.reshape(207,89,120,20);
            campo2.reshape(207,137,120,20);
            campo3.reshape(207,185,120,20);
            campo4.reshape(207,235,120,20);
            campo5.reshape(207,285,120,20);
            campo6.reshape(207,330,120,20);
            campo7.reshape(207,380,120,20);
            campo8.reshape(207,428,120,20);
            campo9.reshape(207,476,120,20);
            campo10.reshape(207,524,120,20);
            campo11.reshape(207,572,120,20);
            campo12.reshape(522,89,120,20);
            campo13.reshape(522,137,120,20);
            campo14.reshape(522,185,120,20);
            campo15.reshape(522,235,120,20);
            campo16.reshape(522,275,120,20);
            campo17.reshape(522,440,120,20);
            
            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            campo6.setVisible(true);
            campo7.setVisible(true);
            campo8.setVisible(true);
            campo9.setVisible(true);
            campo10.setVisible(true);
            campo11.setVisible(true);
            campo12.setVisible(true);
            campo13.setVisible(true);
            campo14.setVisible(true);
            campo15.setVisible(true);
            campo16.setVisible(true);
            campo17.setVisible(true);
            
            tipoSangre.setVisible(true);
            sexo.setVisible(true);
            
            tipoSangre.setBounds(522,330,80,20);
            sexo.setBounds(522,380,100,20);

            generarAltasDocentes.setVisible(true);
    }
    
    
    public void aparcerAltasTutores()
    {
            setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/altas-tutores.png"));
            
            campo1.reshape(207,91,120,20);
            campo2.reshape(207,144,120,20);
            campo3.reshape(207,198,120,20);
            campo4.reshape(207,250,120,20);
            campo5.reshape(207,305,120,20);
            campo6.reshape(207,358,120,20);            
            campo7.reshape(207,414,120,20);
            campo8.reshape(207,467,120,20);
            campo9.reshape(207,524,120,20);
            campo10.reshape(207,572,120,20);
            campo11.reshape(522,91,120,20);
            campo12.reshape(522,143,120,20);
            campo13.reshape(522,250,120,20);
            campo14.reshape(522,297,120,20);
             sexo.setBounds(522,197,100,20);
           
            
            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            campo6.setVisible(true);
            campo7.setVisible(true);
            campo8.setVisible(true);
            campo9.setVisible(true);
            campo10.setVisible(true);
            campo11.setVisible(true);
            campo12.setVisible(true);
            campo13.setVisible(true);
            campo14.setVisible(true);
            sexo.setVisible(true);

            generarAltasTutores.setVisible(true);
    }
    
    public void aparecerAltasReportes()
    {
        setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/altas-reportes.png"));
            
            campo1.reshape(214,110,120,20);
            campo2.reshape(214,194,120,20);
            campo3.reshape(214,280,120,20);
            campo4.reshape(214,365,120,20);
            campo5.reshape(214,451,120,20);
            
            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);

            generarAltasReportes.setVisible(true);
    }
    
    public void aparecerEliminarAlumnos()
    {
            setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/eliminar-alumnos.png"));
            campo1.reshape(320,140,120,25);
            campo1.setVisible(true);
            buscarAlumnos.setVisible(true);
            deleteAlumnos.setVisible(true);
    }
    
    public void aparecerEliminarDocente()
    {
        setSize( 720, 750);
        FondoMenu.setBounds(0,0,715,695);
        FondoMenu.setIcon(new ImageIcon("imagenes/eliminar-docente.png"));
        campo1.reshape(320,140,120,25);
        campo1.setVisible(true);
        buscarDocente.setVisible(true);
        deleteDocente.setVisible(true);
    }
    
    public void aparecerEliminarTutor()
    {
        setSize( 720, 750);
        FondoMenu.setBounds(0,0,715,695);
        FondoMenu.setIcon(new ImageIcon("imagenes/eliminar-tutor.png"));
        campo1.reshape(320,140,120,25);
        campo1.setVisible(true);
        buscarTutor.setVisible(true);
        deleteTutor.setVisible(true);
    }
    
    public void aparecerEditarAlumnos()
    {
            setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/editar-alumno.png"));
            
            campo1.reshape(125,615,120,20);

            campo2.reshape(190,105,120,20);
            campo3.reshape(190,155,120,20);
            campo4.reshape(190,205,120,20);
            campo5.reshape(190,255,120,20);
            campo6.reshape(190,295,120,20);
            campo7.reshape(190,350,120,20);
            campo8.reshape(190,395,120,20);
            campo9.reshape(190,445,120,20);
            campo10.reshape(190,495,120,20);
            campo11.reshape(190,545,120,20);
            campo12.reshape(522,105,120,20);
            campo13.reshape(522,155,120,20);
            campo14.reshape(522,205,120,20);
            campo15.reshape(522,250,120,20);
            campo16.reshape(522,290,120,20);
            campo17.reshape(522,495,120,20);
            campo18.reshape(522,545,120,20);

            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            campo6.setVisible(true);
            campo7.setVisible(true);
            campo8.setVisible(true);
            campo9.setVisible(true);
            campo10.setVisible(true);
            campo11.setVisible(true);
            campo12.setVisible(true);
            campo13.setVisible(true);
            campo14.setVisible(true);
            campo15.setVisible(true);
            campo16.setVisible(true);
            campo17.setVisible(true);
            campo18.setVisible(true);
            
            tipoSangre.setBounds(522,342,80,20);
            tipoSangre.setVisible(true);

            sexo.setBounds(522,396,100,20);
            sexo.setVisible(true);

            semestre.setBounds(522,444,80,20);
            semestre.setVisible(true);
            editGuardarAlumnos.setVisible(true);
            editBuscarAlumnos.setVisible(true);
    }
    
    public void aparecerEditarDocentes()
    {
         setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/editar-docente.png"));
            
             campo1.reshape(140,615,120,20);
            campo2.reshape(200,110,120,20);
            campo3.reshape(200,155,120,20);
            campo4.reshape(200,200,120,20);
            campo5.reshape(200,245,120,20);
            campo6.reshape(200,290,120,20);
            campo7.reshape(200,340,120,20);
            campo8.reshape(200,380,120,20);
            campo9.reshape(200,420,120,20);
            campo10.reshape(200,465,120,20);
            campo11.reshape(522,110,120,20);
            campo12.reshape(522,160,120,20);
            campo13.reshape(522,200,120,20);
            campo14.reshape(522,235,120,20);
            campo15.reshape(522,290,120,20);
            campo16.reshape(522,340,120,20);
            campo17.reshape(522,470,120,20);
            
            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            campo6.setVisible(true);
            campo7.setVisible(true);
            campo8.setVisible(true);
            campo9.setVisible(true);
            campo10.setVisible(true);
            campo11.setVisible(true);
            campo12.setVisible(true);
            campo13.setVisible(true);
            campo14.setVisible(true);
            campo15.setVisible(true);
            campo16.setVisible(true);
            campo17.setVisible(true);
            
            tipoSangre.setVisible(true);
            sexo.setVisible(true);
            
            tipoSangre.setBounds(522,380,80,20);
            sexo.setBounds(522,420,100,20);
            
            editBuscarDocentes.setVisible(true);
            editGuardarDocentes.setVisible(true);
    }
    
    public void aparecerEditarTutor()
    {
        setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/editar-tutores.png"));
            
             campo1.reshape(115,620,120,20);
            campo2.reshape(200,116,120,20);
            campo3.reshape(200,168,120,20);
            campo4.reshape(200,228,120,20);
            campo5.reshape(207,282,120,20);
            campo6.reshape(207,333,120,20);            
            campo7.reshape(207,388,120,20);
            campo8.reshape(207,442,120,20);
            campo9.reshape(207,490,120,20);
            campo10.reshape(207,550,120,20);
            campo11.reshape(522,118,120,20);
            campo12.reshape(522,170,120,20);
            campo13.reshape(522,280,120,20);
            campo14.reshape(522,327,120,20);
             sexo.setBounds(522,223,100,20);
           
            
            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            campo6.setVisible(true);
            campo7.setVisible(true);
            campo8.setVisible(true);
            campo9.setVisible(true);
            campo10.setVisible(true);
            campo11.setVisible(true);
            campo12.setVisible(true);
            campo13.setVisible(true);
            campo14.setVisible(true);
            sexo.setVisible(true);
            
            editBuscarTutor.setVisible(true);
            editGuardarTutor.setVisible(true);
    }
    
    public void aparecerEditarReporte()
    {
           setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/editar-reportes.png"));
            
             campo1.reshape(140,613,120,20);
            campo2.reshape(214,128,120,20);
            campo3.reshape(214,215,120,20);
            campo4.reshape(214,302,120,20);
            campo5.reshape(214,390,120,20);
            
            campo1.setVisible(true);
            campo2.setVisible(true);
            campo3.setVisible(true);
            campo4.setVisible(true);
            campo5.setVisible(true);
            editBuscarReporte.setVisible(true);
            editGuardarReporte.setVisible(true);
    }
    
    public void enviarReportes()
    {
        reportar.insertarReporte(campo1.getText(),
                    campo2.getText(),
                    campo3.getText(),
                    campo4.getText(),
                    campo5.getText());
    }
    
    public void enviarAlumnos()
    {
         alumnos.insertarAlumno(campo1.getText(),
                    campo2.getText(),
                    campo3.getText(),
                    campo4.getText(), 
                    campo5.getText(),
                    campo6.getText(),
                    campo7.getText(),
                    campo8.getText(),
                    campo9.getText(),
                    campo10.getText(),
                    campo11.getText(),
                    campo12.getText(),
                    campo13.getText(),
                    campo14.getText(),
                    campo15.getText(),
                    campo16.getText(),
                    (String)tipoSangre.getSelectedItem(),
                    (String)sexo.getSelectedItem(),
                    (String)semestre.getSelectedItem(),
                    campo17.getText(),
                    campo18.getText());
    }
    
    public void enviarDocente()
    {
        docente.insertarDocente(campo1.getText(),
                    campo2.getText(),
                    campo3.getText(),
                    campo4.getText(),
                    campo17.getText(),                    
                    campo5.getText(),
                    campo6.getText(),
                    campo7.getText(),
                    campo8.getText(),
                    campo9.getText(),
                    campo10.getText(),
                    campo11.getText(),
                    campo12.getText(),
                    campo13.getText(),
                    campo14.getText(),
                    campo15.getText(),
                    campo16.getText(),
                    (String)tipoSangre.getSelectedItem(),
                    (String)sexo.getSelectedItem());
    }
    
    public void enviarTutor()
    {
         tutor.insertarTutor(campo1.getText(),
                    campo2.getText(),
                    campo3.getText(),
                    campo4.getText(),
                    campo5.getText(),
                    campo6.getText(),
                    campo7.getText(),
                    campo8.getText(),
                    campo9.getText(),
                    campo10.getText(),
                    (String)sexo.getSelectedItem(),
                    campo11.getText(),
                    campo12.getText(),
                    campo13.getText(),
                    campo14.getText());
    }
    
    public void busquedaAlumno()
    {
        if((alumnos.existe(campo1.getText()))==true)
            {
                panel.setVisible(true);
                SetData(campo1.getText(),0,0);
                SetData(alumnos.getNombre(campo1.getText()),0,1);
                SetData(alumnos.getApellidoP(campo1.getText()),0,2);
                SetData(alumnos.getApellidoM(campo1.getText()),0,3);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void eliminacionAlumno()
    {
         if((alumnos.existe(campo1.getText()))==true)
            {
                alumnos.eliminar(campo1.getText());
                JOptionPane.showMessageDialog(null,"Se ha eliminado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void busquedaDocente()
    {
        if((docente.existe(campo1.getText()))==true)
            {
                panel.setVisible(true);
                SetData(campo1.getText(),0,0);
                SetData(docente.getNombre(campo1.getText()),0,1);
                SetData(docente.getApellidoP(campo1.getText()),0,2);
                SetData(docente.getApellidoM(campo1.getText()),0,3);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void eliminarDocente()
    {
        if((docente.existe(campo1.getText()))==true)
            {
                docente.eliminar(campo1.getText());
                JOptionPane.showMessageDialog(null,"Se ha eliminado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void busquedaTutor()
    {
        if((tutor.existe(campo1.getText()))==true)
            {
                panel.setVisible(true);
                SetData(campo1.getText(),0,0);
                SetData(tutor.getNombre(campo1.getText()),0,1);
                SetData(tutor.getApellidoP(campo1.getText()),0,2);
                SetData(tutor.getApellidoM(campo1.getText()),0,3);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void eliminarTutor()
    {
        if((tutor.existe(campo1.getText()))==true)
            {
                tutor.eliminar(campo1.getText());
                JOptionPane.showMessageDialog(null,"Se ha eliminado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void traerDatosAlumnos()
    {
        if(alumnos.existe(campo1.getText()))
            {
                campo2.setText(alumnos.getNombre(campo1.getText()));
                campo3.setText(alumnos.getApellidoP(campo1.getText()));
                campo4.setText(alumnos.getApellidoM(campo1.getText()));
                campo5.setText(alumnos.getFechaNacimiento(campo1.getText()));
                campo6.setText(alumnos.getFechaAlta(campo1.getText()));
                campo7.setText(alumnos.getEstado(campo1.getText()));
                campo8.setText(alumnos.getCiudad(campo1.getText()));
                campo9.setText(""+alumnos.getCP(campo1.getText()));
                campo10.setText(alumnos.getCalle(campo1.getText()));
                campo11.setText(alumnos.getColonia(campo1.getText()));
                campo12.setText(""+alumnos.getManzana(campo1.getText()));
                campo13.setText(""+alumnos.getLote(campo1.getText()));
                campo14.setText(""+alumnos.getNumero(campo1.getText()));
                campo15.setText(alumnos.getTelefono1(campo1.getText()));
                campo16.setText(alumnos.getTelefono2(campo1.getText()));
                campo17.setText(alumnos.getIdGrupo(campo1.getText()));
                campo18.setText(alumnos.getIdTutor(campo1.getText()));
                semestre.setSelectedIndex(alumnos.getSemestre(campo1.getText())-1);
                
                String SexoS=alumnos.getSexo(campo1.getText());
                if((SexoS).equals("Masculino"))
                {
                    sexo.setSelectedIndex(0);
                }
                else{
                    sexo.setSelectedIndex(1);
                }
                
                String sangre = alumnos.getSangre(campo1.getText());
                
                if((sangre).equals("O+"))
                {
                    tipoSangre.setSelectedIndex(0);
                }
                if((sangre).equals("A+"))
                {
                    tipoSangre.setSelectedIndex(1);
                }
                if((sangre).equals("B+"))
                {
                    tipoSangre.setSelectedIndex(2);
                }
                if((sangre).equals("AB+"))
                {
                    tipoSangre.setSelectedIndex(3);
                }
                if((sangre).equals("O-"))
                {
                    tipoSangre.setSelectedIndex(4);
                }
                if((sangre).equals("A-"))
                {
                    tipoSangre.setSelectedIndex(5);
                }
                if((sangre).equals("B-"))
                {
                    tipoSangre.setSelectedIndex(6);
                }
                if((sangre).equals("AB-"))
                {
                    tipoSangre.setSelectedIndex(7);
                }
                
                
                
            }
            else{
                 JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void guardarDatosAlumnos()
    {
        if(alumnos.existe(campo1.getText()))
            {
                alumnos.setUpdate(campo1.getText(),
                        campo2.getText(),
                        campo3.getText(),
                        campo4.getText(),
                        campo5.getText(),
                        campo6.getText(),
                        campo7.getText(),
                        campo8.getText(),
                        Integer.parseInt(campo9.getText()),
                        campo10.getText(),
                        campo11.getText(),
                        Integer.parseInt(campo12.getText()),
                        Integer.parseInt(campo13.getText()),
                        Integer.parseInt(campo14.getText()),
                        campo15.getText(),
                        campo16.getText(),
                        (String)tipoSangre.getSelectedItem(),
                        (String)sexo.getSelectedItem(),
                        Integer.parseInt((String)semestre.getSelectedItem()),
                        campo17.getText(),
                        campo18.getText());
                
                
                JOptionPane.showMessageDialog(null,"Se ha actualizado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                campo2.setText("");
                campo3.setText("");
                campo4.setText("");
                campo5.setText("");
                campo6.setText("");
                campo7.setText("");
                campo8.setText("");
                campo9.setText("");
                campo10.setText("");
                campo11.setText("");
                campo12.setText("");
                campo13.setText("");
                campo14.setText("");
                campo15.setText("");
                campo16.setText("");
                campo17.setText("");
                campo18.setText("");
                
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void traerDatosReportes()
    {
        if(reportar.existe(campo1.getText()))
            {
                campo2.setText(reportar.getCausa(campo1.getText()));
                campo3.setText(reportar.getFecha(campo1.getText()));
                campo4.setText(reportar.getIdAlumno(campo1.getText()));
                campo5.setText(reportar.getIdAsesor(campo1.getText()));
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void guardarDatosReportes()
    {
        if(reportar.existe(campo1.getText()))
            {
                reportar.setUpdate(campo1.getText(),campo2.getText(),campo3.getText(),campo4.getText(),campo5.getText());
                JOptionPane.showMessageDialog(null,"Se ha actualizado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                campo2.setText("");
                campo3.setText("");
                campo4.setText("");
                campo5.setText("");
            }
            else{
                 JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void traerDatosDocente()
    {
        if(docente.existe(campo1.getText()))
            {
                campo2.setText(docente.getNombre(campo1.getText()));
                campo3.setText(docente.getApellidoP(campo1.getText()));
                campo4.setText(docente.getApellidoM(campo1.getText()));
                campo5.setText(docente.getFechaNacimiento(campo1.getText()));
                campo6.setText(docente.getFechaAlta(campo1.getText()));
                campo7.setText(docente.getEstado(campo1.getText()));
                campo8.setText(docente.getCiudad(campo1.getText()));
                campo9.setText(docente.getCP(campo1.getText())+"");
                campo10.setText(docente.getColonia(campo1.getText()));
                campo11.setText(docente.getCalle(campo1.getText()));
                campo12.setText(docente.getManzana(campo1.getText())+"");
                campo13.setText(docente.getLote(campo1.getText())+"");
                campo14.setText(docente.getNumero(campo1.getText())+"");
                campo15.setText(docente.getTelefono1(campo1.getText()));
                campo16.setText(docente.getTelefono2(campo1.getText()));
                campo17.setText(docente.getGrado(campo1.getText()));
                
                String SexoS=docente.getSexo(campo1.getText());
                if((SexoS).equals("Masculino"))
                {
                    sexo.setSelectedIndex(0);
                }
                else{
                    sexo.setSelectedIndex(1);
                }
                
                String sangre = docente.getSangre(campo1.getText());
                
                if((sangre).equals("O+"))
                {
                    tipoSangre.setSelectedIndex(0);
                }
                if((sangre).equals("A+"))
                {
                    tipoSangre.setSelectedIndex(1);
                }
                if((sangre).equals("B+"))
                {
                    tipoSangre.setSelectedIndex(2);
                }
                if((sangre).equals("AB+"))
                {
                    tipoSangre.setSelectedIndex(3);
                }
                if((sangre).equals("O-"))
                {
                    tipoSangre.setSelectedIndex(4);
                }
                if((sangre).equals("A-"))
                {
                    tipoSangre.setSelectedIndex(5);
                }
                if((sangre).equals("B-"))
                {
                    tipoSangre.setSelectedIndex(6);
                }
                if((sangre).equals("AB-"))
                {
                    tipoSangre.setSelectedIndex(7);
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void guardarDatosDocentes()
    {
        if(docente.existe(campo1.getText()))
            {
                docente.setUpdate( campo1.getText(),
                 campo2.getText(),
                 campo3.getText(),
                 campo4.getText(),
                 campo5.getText(),
                 campo6.getText(),
                 campo7.getText(),
                 campo8.getText(),
                 Integer.parseInt(campo9.getText()),
                 campo10.getText(),
                 campo11.getText(),
                 Integer.parseInt(campo12.getText()),
                 Integer.parseInt(campo13.getText()),
                 Integer.parseInt(campo14.getText()),
                 campo15.getText(),
                 campo16.getText(),
                 (String)tipoSangre.getSelectedItem(),
                 (String)sexo.getSelectedItem(),
                 campo17.getText());
                
                JOptionPane.showMessageDialog(null,"Se ha actualizado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                campo2.setText("");
                campo3.setText("");
                campo4.setText("");
                campo5.setText("");
                campo6.setText("");
                campo7.setText("");
                campo8.setText("");
                campo9.setText("");
                campo10.setText("");
                campo11.setText("");
                campo12.setText("");
                campo13.setText("");
                campo14.setText("");
                campo15.setText("");
                campo16.setText("");
                campo17.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void traerDatosTutor()
    {
        
            if(tutor.existe(campo1.getText()))
            {
                
                campo2.setText(tutor.getNombre(campo1.getText()));
                campo3.setText(tutor.getApellidoP(campo1.getText()));
                campo4.setText(tutor.getApellidoM(campo1.getText()));
                campo5.setText(tutor.getFechaNacimiento(campo1.getText()));
                campo6.setText(tutor.getCalle(campo1.getText()));
                campo7.setText(tutor.getColonia(campo1.getText()));
                campo8.setText(tutor.getManzana(campo1.getText())+"");
                campo9.setText(tutor.getLote(campo1.getText())+"");
                campo10.setText(tutor.getNumero(campo1.getText())+"");
                campo11.setText(tutor.getTelefono1(campo1.getText()));
                campo12.setText(tutor.getTelefono2(campo1.getText()));
                campo13.setText(tutor.getOcupacion(campo1.getText()));
                campo14.setText(tutor.getIdEmpresa(campo1.getText()));
                
                String SexoS=tutor.getSexo(campo1.getText());
                if((SexoS).equals("Masculino"))
                {
                    sexo.setSelectedIndex(0);
                }
                else{
                    sexo.setSelectedIndex(1);
                }
                
            }
            else{
                 JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void guardarDatosTutor()
    {
        
            if(tutor.existe(campo1.getText()))
            {
                tutor.setUpdate(campo1.getText(),
                        campo2.getText(),
                        campo3.getText(),
                        campo4.getText(),
                        campo5.getText(),
                        campo6.getText(),
                        campo7.getText(),
                        Integer.parseInt(campo8.getText()),
                        Integer.parseInt(campo9.getText()),
                        Integer.parseInt(campo10.getText()),
                        campo11.getText(),
                        campo12.getText(),
                        (String)sexo.getSelectedItem(),
                        campo13.getText(),
                        campo14.getText());
                
                JOptionPane.showMessageDialog(null,"Se ha actualizado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                campo2.setText("");
                campo3.setText("");
                campo4.setText("");
                campo5.setText("");
                campo6.setText("");
                campo7.setText("");
                campo8.setText("");
                campo9.setText("");
                campo10.setText("");
                campo11.setText("");
                campo12.setText("");
                campo13.setText("");
                campo14.setText("");
           
            }
            else{
            JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void aparecerEliminarReporte()
    {       
        setSize( 720, 750);
            FondoMenu.setBounds(0,0,715,695);
            FondoMenu.setIcon(new ImageIcon("imagenes/eliminar-reportes.png"));
            campo1.reshape(320,140,120,25);
            campo1.setVisible(true);
            buscarReporte.setVisible(true);
            deleteReporte.setVisible(true);
    }
    
    public void busquedaReportes()
    {
        if((reportar.existe(campo1.getText()))==true)
            {
                panelR.setVisible(true);
                SetDataR(campo1.getText(),0,0);
                SetDataR(reportar.getCausa(campo1.getText()),0,1);
                SetDataR(reportar.getFecha(campo1.getText()),0,2);
                SetDataR(reportar.getIdAlumno(campo1.getText()),0,3);
                SetDataR(reportar.getIdAsesor(campo1.getText()),0,4);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void borrarReporte()
    {
        if((reportar.existe(campo1.getText()))==true)
            {
                reportar.eliminar(campo1.getText());
                JOptionPane.showMessageDialog(null,"Se ha eliminado el registro: "+campo1.getText(),"Dato eliminado",JOptionPane.PLAIN_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El ID no existe","Error- Revise sus datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==salir)
        {
            System.exit(0);
        }
        if(ae.getSource()==portada)
        {            
            limpiar();
            FondoMenu.setIcon(new ImageIcon("imagenes/portada.png"));
            setSize( 720, 680);
            FondoMenu.setBounds(0,0,715,625);
        }
        if(ae.getSource()==altasAlumnos)
        {
            limpiar();
            aparecerAltasAlumnos();
            
        }
        
        if(ae.getSource()==altasDocentes)
        {
            limpiar();
            aparecerAltasDocentes();
            
        }
        
        if(ae.getSource()==AltasTutores)
        {
            limpiar();
            aparcerAltasTutores();
        }
        
        if(ae.getSource()== reportes)
        {
            limpiar();
            aparecerAltasReportes();           
            
        }
        
        if(ae.getSource()==generarAltasReportes)
        {
            enviarReportes();            
        }
        
        if(ae.getSource()==generarAltasAlumnos)
        {
            enviarAlumnos();                           
        }
        
        if(ae.getSource()==generarAltasDocentes)
        {
            enviarDocente();
        }
        
        if(ae.getSource()==generarAltasTutores)
        {
           enviarTutor();
        }
        
        if(ae.getSource()==eliminarAlumnos)
        {
            limpiar();
            aparecerEliminarAlumnos();
        }
        
        if(ae.getSource()==buscarAlumnos)
        {
          
            busquedaAlumno();
        }
        
        if(ae.getSource()==deleteAlumnos)
        {
           eliminacionAlumno();
        }
        
        if(ae.getSource()==eliminarDocentes)
        {
            limpiar();
            aparecerEliminarDocente();
        }
        
        if(ae.getSource()==buscarDocente)
        {
            busquedaDocente();
        }
        
        if(ae.getSource()==deleteDocente)
        {
            eliminarDocente();            
        }
        
        if(ae.getSource()==eliminarTutor)
        {
            limpiar();
            aparecerEliminarTutor();
        }
        
        if(ae.getSource()==buscarTutor)
        {
            busquedaTutor();
        }
        if(ae.getSource()==deleteTutor)
        {
            eliminarTutor();
        }
        
        if(ae.getSource()==editarAlumnos)
        {
            limpiar();
           aparecerEditarAlumnos();
        }
        
        if(ae.getSource()==editarDocentes)
        {
            limpiar();
           aparecerEditarDocentes();
            
        }
        
        if(ae.getSource()==editarTutor)
        {
            limpiar();
            aparecerEditarTutor();
        }
        
        if(ae.getSource()==editarReporte)
        {
            limpiar();
            aparecerEditarReporte();
            
        }
        
        if(ae.getSource()==editBuscarAlumnos)
        {
            traerDatosAlumnos();
        }
        
        if(ae.getSource()==editGuardarAlumnos)
        {
            guardarDatosAlumnos();
        }
        
        if(ae.getSource()==editBuscarDocentes)
        {
            traerDatosDocente();
        }
        
        if(ae.getSource()==editGuardarDocentes)
        {
            guardarDatosDocentes();
        }
        
        if(ae.getSource()==editBuscarReporte)
        {
            traerDatosReportes();
            
        }
        
        if(ae.getSource()==editGuardarReporte)
        {
            guardarDatosReportes();
        }
        
        if(ae.getSource()==editBuscarTutor)
        {
            traerDatosTutor();
        }
        
        if(ae.getSource()==editGuardarTutor)
        {
            guardarDatosTutor();
        }
        if(ae.getSource()==eliminarReporte)
        {
            limpiar();
            aparecerEliminarReporte();
        }
        
        if(ae.getSource()==buscarReporte)
        {
            busquedaReportes();
        }
        if(ae.getSource()==deleteReporte)
        {
            borrarReporte();
        }
        
    }
    
    public void SetData(Object obj, int row_index, int col_index){
        tabla.getModel().setValueAt(obj,row_index,col_index);
       
  }
    
    public void SetDataR(Object obj, int row_index, int col_index){
        tablaR.getModel().setValueAt(obj,row_index,col_index);
       
  }

    
    public void itemStateChanged(ItemEvent ie) {
       
    }
    
}
