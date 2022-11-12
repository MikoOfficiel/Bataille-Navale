package Bataille_Navale.vue.grille;
import Bataille_Navale.modele.bateau.Bateau;
<<<<<<< HEAD
import Bataille_Navale.modele.bateau.Cuirase;
=======
>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e
import  Bataille_Navale.modele.grille.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JComponent;
public class Grille extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Constructeur
	private int line;
	private int column;
<<<<<<< HEAD
	int dimensionCase ;

	public Grille(int ligne , int colonne){

		
		this.line = ligne;
		this.column = colonne;
		this.dimensionCase=28;
=======
	private int dimensionCase;// 450 / 15
	//private Graphics g;

	public Grille(int ligne , int colonne){

		this.line = ligne;
		this.column = colonne;
		this.dimensionCase = 28;

>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e

	}

	protected void paintComponent(Graphics g) {
		
		Bateau croisiere = new Cuirase(5,5);
		
		
		Graphics2D g2 = (Graphics2D) g;

<<<<<<< HEAD
		//Les cases
		for(int i = 0; i<line;i++) {

			for(int j=0; j<column;j++) {
				g2.setPaint(Color.LIGHT_GRAY);
=======
		//Les cases 
		for(int i = 0; i<line;i++) { //i -> ligne

			for(int j=0; j<column;j++) { //j -> colonne
				g2.setPaint(Color.lightGray);
>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e
				g2.fill(new Rectangle2D.Double((j+1)*dimensionCase, (i+1)*dimensionCase, dimensionCase, dimensionCase));
				g2.setPaint(Color.BLACK);
				g2.drawLine((j+1)*dimensionCase, dimensionCase, (j+1)*dimensionCase,(dimensionCase + 450));
				g2.drawLine(dimensionCase, (i+1)*dimensionCase, (dimensionCase + 450), (i+1)*dimensionCase);

			}
			
<<<<<<< HEAD
			this.placerBateau(croisiere, g2);
=======
			for(int w = 0; w<4+1;w++) { //i -> ligne

				//for(int z=0; z<1+1;z++) { //j -> colonne
			g2.setPaint(Color.cyan);
			g2.fill(new Rectangle2D.Double(dimensionCase*5, dimensionCase*8 , dimensionCase*w, dimensionCase)); // (x,y,case_di
				}
			
			for(int w = 0; w<7+1;w++) { //i -> ligne

				for(int z=0; z<1+1;z++) { //j -> colonne
			g2.setPaint(Color.pink);
			g2.fill(new Rectangle2D.Double(dimensionCase*12, dimensionCase*6 , dimensionCase*z, dimensionCase*w)); // (x,y,case_di
				}}

>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e
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
	
<<<<<<< HEAD
	public void placerBateau(Bateau b, Graphics2D graph) {
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	
=======
	public void placerBateau(Bateau b, Graphics2D graph ) {
		
		for(int i = 0; i<b.getTaille();i++) { //i -> ligne
				
				graph.setPaint(Color.pink);
				graph.fill(new Rectangle2D.Double(dimensionCase*b.getCoordX(), dimensionCase*b.getCoordY() , dimensionCase*b.getTaille(), dimensionCase)); 
				
			}
		
	}
	
	
}
>>>>>>> ff3c04b6ad59179e7f0425f02c9b783780eed58e
