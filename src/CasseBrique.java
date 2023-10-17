import javax.swing.*;
import java.awt.*;

public class CasseBrique extends Canvas {

    public static final int largeur = 500;
    public static final int hauteur = 700;

    public CasseBrique() throws InterruptedException {

        setSize(largeur,hauteur);
        setBounds(0,0,largeur,hauteur);

        JFrame fenetre = new JFrame();
        JPanel panneau = (JPanel)fenetre.getContentPane();
        panneau.setSize(largeur,hauteur);
        panneau.add(this);

        fenetre.pack();
        fenetre.setResizable(false);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenetre.requestFocus();

        createBufferStrategy(2);
        setIgnoreRepaint(true);
        setFocusable(false);

        demarrer();
    }

    public void demarrer() throws InterruptedException {

        Balle balle = new Balle();

        while(true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();
            //----------------------


            dessin.setColor(Color.white);
            dessin.fillRect(0,0,largeur,hauteur);

            //TODO : créer une méthode dessiner dans la classe balle
            //       (passer ce qui vous manque en parametre)
            //TODO : ajouter une propriété couleur à la classe balle
            //TODO : ajouter une propriété diametre à la classe balle

            balle.dessiner(dessin);
            balle.deplacement();
            balle.testCollision();

            //------------------------
            dessin.dispose();
            getBufferStrategy().show();
            Thread.sleep(1000 / 60);
        }
    }
}
