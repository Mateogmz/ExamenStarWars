
import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class dcsdgsdg extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblTapadera1;
    private JLabel lblTapadera2;
    private JLabel lblTapadera3;
    private JLabel lblImgPrincipal;
    private JLabel lblImgAdivinar1;
    private JLabel lblImgAdivinar2;
    private JLabel lblImgAdivinar3;
    private int numeroRandom;
    private int contador;
    private JButton btnVolverAJugar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                dcsdgsdg frame = new dcsdgsdg();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public dcsdgsdg() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 810, 635);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnVolverAJugar = new JButton("Volver a jugar");
        btnVolverAJugar.addActionListener(e -> {
            reiniciarJuego();
            contador();
        });
        btnVolverAJugar.setBounds(31, 573, 737, 23);
        contentPane.add(btnVolverAJugar);
        contador++;

        JButton btnAqui3 = new JButton("Aquí");
        btnAqui3.addActionListener(e -> {
            desaparecerTapadera();
            verificarAcierto(3);
        });
        btnAqui3.setBounds(543, 542, 225, 23);
        contentPane.add(btnAqui3);

        JButton btnAqui2 = new JButton("Aquí");
        btnAqui2.addActionListener(e -> {
            desaparecerTapadera();
            verificarAcierto(2);
        });
        btnAqui2.setBounds(287, 542, 225, 23);
        contentPane.add(btnAqui2);

        JButton btnAqui1 = new JButton("Aquí");
        btnAqui1.addActionListener(e -> {
            desaparecerTapadera();
            verificarAcierto(1);
        });
        btnAqui1.setBounds(31, 542, 225, 23);
        contentPane.add(btnAqui1);

        lblImgPrincipal = new JLabel("New label");
        lblImgPrincipal.setBounds(287, 30, 225, 227);
        contentPane.add(lblImgPrincipal);

        lblTapadera2 = new JLabel("New label");
        lblTapadera2.setIcon(new ImageIcon("C:\\Users\\Profesor\\Desktop\\ExamenStarWars\\imgFriki\\traseraCromo.jpg"));
        lblTapadera2.setBounds(287, 310, 225, 227);
        contentPane.add(lblTapadera2);

        lblTapadera1 = new JLabel("New label");
        lblTapadera1.setIcon(new ImageIcon("C:\\Users\\Profesor\\Desktop\\ExamenStarWars\\imgFriki\\traseraCromo.jpg"));
        lblTapadera1.setBounds(31, 310, 225, 227);
        contentPane.add(lblTapadera1);

        lblTapadera3 = new JLabel("New label");
        lblTapadera3.setIcon(new ImageIcon("C:\\Users\\Profesor\\Desktop\\ExamenStarWars\\imgFriki\\traseraCromo.jpg"));
        lblTapadera3.setBounds(543, 310, 225, 227);
        contentPane.add(lblTapadera3);

        lblImgAdivinar1 = new JLabel("New label");
        lblImgAdivinar1.setBounds(31, 310, 225, 227);
        contentPane.add(lblImgAdivinar1);

        lblImgAdivinar2 = new JLabel("New label");
        lblImgAdivinar2.setBounds(287, 310, 225, 227);
        contentPane.add(lblImgAdivinar2);

        lblImgAdivinar3 = new JLabel("New label");
        lblImgAdivinar3.setBounds(543, 310, 225, 227);
        contentPane.add(lblImgAdivinar3);

        JLabel lblFondo = new JLabel("New label");
        lblFondo.setIcon(new ImageIcon("C:\\Users\\Profesor\\Desktop\\ExamenStarWars\\imgFriki\\Fondo pantalla.jpg"));
        lblFondo.setBounds(0, 0, 810, 635);
        contentPane.add(lblFondo);

        numeroRandom = cargarImagenAleatoria(lblImgPrincipal);
    }

    public void reiniciarJuego() {
        dispose();
        dcsdgsdg frame = new dcsdgsdg();
        frame.setVisible(true);
    }

    public void desaparecerTapadera() {
        lblTapadera1.setVisible(false);
        lblTapadera2.setVisible(false);
        lblTapadera3.setVisible(false);
    }

    private int cargarImagenAleatoria(JLabel label) {
        File carpeta = new File("C:\\Users\\Profesor\\Desktop\\ExamenStarWars\\Nueva Carpeta");

        File[] archivos = carpeta.listFiles((dir, name) ->
                name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".png"));

        if (archivos != null && archivos.length > 0) {
            List<File> listaArchivos = Arrays.asList(archivos);
            Collections.shuffle(listaArchivos);

            File imagenAleatoria = listaArchivos.get(0);

            try {
                ImageIcon imagenIcon = new ImageIcon(new ImageIcon(imagenAleatoria.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                label.setIcon(imagenIcon);
                Random random = new Random();
                int randomNumber = random.nextInt(3) + 1;

            if (randomNumber == 1) {
                List<File> listaArchivos2 = Arrays.asList(archivos);
                Collections.shuffle(listaArchivos);

                File imagenAleatoria2 = listaArchivos2.get(0);
                ImageIcon imagenIcon2 = new ImageIcon(new ImageIcon(imagenAleatoria2.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                List<File> listaArchivos3 = Arrays.asList(archivos);
                Collections.shuffle(listaArchivos);

                File imagenAleatoria3 = listaArchivos3.get(0);
                ImageIcon imagenIcon3 = new ImageIcon(new ImageIcon(imagenAleatoria3.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                lblImgAdivinar2.setIcon(imagenIcon2);
                lblImgAdivinar3.setIcon(imagenIcon3);

            } else if (randomNumber == 2) {
                List<File> listaArchivos2 = Arrays.asList(archivos);
                Collections.shuffle(listaArchivos);

                File imagenAleatoria2 = listaArchivos2.get(0);
                ImageIcon imagenIcon2 = new ImageIcon(new ImageIcon(imagenAleatoria2.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                List<File> listaArchivos3 = Arrays.asList(archivos);
                Collections.shuffle(listaArchivos);

                File imagenAleatoria3 = listaArchivos3.get(0);
                ImageIcon imagenIcon3 = new ImageIcon(new ImageIcon(imagenAleatoria3.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                lblImgAdivinar1.setIcon(imagenIcon2);
                lblImgAdivinar3.setIcon(imagenIcon3);

            } else if (randomNumber == 3) {
                List<File> listaArchivos2 = Arrays.asList(archivos);
                Collections.shuffle(listaArchivos);

                File imagenAleatoria2 = listaArchivos2.get(0);
                ImageIcon imagenIcon2 = new ImageIcon(new ImageIcon(imagenAleatoria2.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                List<File> listaArchivos3 = Arrays.asList(archivos);
                Collections.shuffle(listaArchivos);

                File imagenAleatoria3 = listaArchivos3.get(0);
                ImageIcon imagenIcon3 = new ImageIcon(new ImageIcon(imagenAleatoria3.getAbsolutePath())
                        .getImage().getScaledInstance(225, 227, Image.SCALE_DEFAULT));

                lblImgAdivinar2.setIcon(imagenIcon2);
                lblImgAdivinar1.setIcon(imagenIcon3);
            }

            System.out.println("Número Aleatorio: " + randomNumber);
            JLabel[] labelsAdivinar = {lblImgAdivinar1, lblImgAdivinar2, lblImgAdivinar3};
            labelsAdivinar[randomNumber - 1].setIcon(imagenIcon);

            return randomNumber;
        } catch (Exception e) {
            e.printStackTrace();
            return 0; 
        }
    }
    return 0;
}



    private void verificarAcierto(int botonPresionado) {
        if (botonPresionado == numeroRandom) {
            JOptionPane.showMessageDialog(this, "¡Has acertado!");
        } else {
            JOptionPane.showMessageDialog(this, "¡Has fallado!");
        }

        contador();  // Call contador() after each button click
    }
    public void contador() {
        if (contador >= 10) {
            btnVolverAJugar.setEnabled(false);
        }
    }
}