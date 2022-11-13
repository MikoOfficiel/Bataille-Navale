package Bataille_Navale.vue.grille;
import Bataille_Navale.modele.bateau.Bateau;
import Bataille_Navale.modele.bateau.Croiseur;
import Bataille_Navale.modele.bateau.Cuirase;
import Bataille_Navale.modele.bateau.Destroyeur;
import Bataille_Navale.modele.bateau.SousMarin;
import  Bataille_Navale.modele.grille.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.util.ArrayList;

import java.util.Collections;

import javax.swing.JComponent;
public class Grille extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Constructeur
	private int line;
	private int column;
	int dimensionCase ;
	private ArrayList <Bateau> lesBateaux ;

	public Grille(int ligne , int colonne){


		this.line = ligne;
		this.column = colonne;
		this.dimensionCase=28;

	}



	protected void paintComponent(Graphics g) {

		//Bateau croisiere = new Cuirase(5,5);

		Bateau ab = new Cuirase();
		Bateau bb= new SousMarin();
		Bateau cb = new Destroyeur();
		Bateau db = new Croiseur();
		Bateau eb = new SousMarin();


		ArrayList <Bateau> X = new ArrayList <Bateau>();
		X.add(ab);
		X.add(bb);
		X.add(cb);
		X.add(db);
		X.add(eb);

		Collections.shuffle(X);



		Graphics2D g2 = (Graphics2D) g;

		//Les cases
		for(int i = 0; i<line;i++) {

			for(int j=0; j<column;j++) {
				g2.setPaint(Color.LIGHT_GRAY);
				g2.fill(new Rectangle2D.Double((j+1)*dimensionCase, (i+1)*dimensionCase, dimensionCase, dimensionCase));
				g2.setPaint(Color.BLACK);
				g2.drawLine((j+1)*dimensionCase, dimensionCase, (j+1)*dimensionCase,(dimensionCase + 450));
				g2.drawLine(dimensionCase, (i+1)*dimensionCase, (dimensionCase + 450), (i+1)*dimensionCase);

			}

			//this.placerUnBateau(croisiere, g2);

			this.placerBateaux2(X, g2);

		}
		//Contour de la grille
		g2.setPaint(Color.BLACK);
		g2.draw(new Rectangle2D.Double(dimensionCase,dimensionCase, line*dimensionCase, column*dimensionCase));

		// Coordonn�es sur le contour de la grille
		int c;

		for(int i =0;i<line;i++) {
			c = i+1; 
			g2.drawString(c+" ", 2.0f / 3 * dimensionCase, (i+1.5f)*dimensionCase + 6);

		}
		for(int j =0; j<column;j++) {
			c = 'A' + j; //Code ASCII
			g2.drawString("" + (char)c, (j + 1.5f) * dimensionCase - 5,2.0f/3* dimensionCase + 6);
		}


		g2.dispose();
	}

	public void placerUnBateau(Bateau b, Graphics2D graph) {


		if(b.orientationBateau()==true) {
			for(int i = 0; i<=b.getTaille();i++) {
				graph.setPaint(Color.BLUE);
				graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY(), dimensionCase*i, dimensionCase));
			}
		}else {
			for(int i = 0; i<=b.getTaille();i++) {
				graph.setPaint(Color.pink);
				graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY(), dimensionCase, dimensionCase*i));
			}
		}
	}

	public void placerBateaux(ArrayList <Bateau> bateaux, Graphics2D graph) {

		for(Bateau b : bateaux ) {

			if(b.orientationBateau()==true) {
				for(int i = 0; i<=b.getTaille();i++) {
					graph.setPaint(Color.BLUE);
					graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY(), dimensionCase*i, dimensionCase));
				}
			}else {
				for(int i = 0; i<=b.getTaille();i++) {
					graph.setPaint(Color.pink);
					graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY(), dimensionCase, dimensionCase*i));
				}
			}
		}
	}


	public void placerBateaux2(ArrayList <Bateau> bateaux, Graphics2D graph) {

		int c = 0;

		for(Bateau b : bateaux ) {

			c++;

			if(c%2==0) {
				for(int i = 0; i<=b.getTaille();i++) {
					graph.setPaint(Color.blue);
					graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY(), dimensionCase*i, dimensionCase));
				}
			}else {
				for(int i = 0; i<=b.getTaille();i++) {
					graph.setPaint(Color.BLUE);
					graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY(), dimensionCase, dimensionCase*i));
				}
			}
		}
	}
}









