package Bataille_Navale.modele.grille;

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

	Grille(){

	}

	protected void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		//Les cases
		int CASE_DIM = 30;// 450 / 15
		for(int i = 0; i<15;i++) {

			for(int j=0; j<15;j++) {
				g2.setPaint(Color.WHITE);
				g2.fill(new Rectangle2D.Double((j+1)*CASE_DIM, (i+1)*CASE_DIM, CASE_DIM, CASE_DIM));
				g2.setPaint(Color.BLACK);
				g2.drawLine((j+1)*CASE_DIM, CASE_DIM, (j+1)*CASE_DIM,(CASE_DIM + 450));
				g2.drawLine(CASE_DIM, (i+1)*CASE_DIM, (CASE_DIM + 450), (i+1)*CASE_DIM);

			}

		}
//Contour de la grille
		g2.setPaint(Color.BLACK);

		g2.draw(new Rectangle2D.Double(CASE_DIM,CASE_DIM, 15*CASE_DIM, 15*CASE_DIM));

		g2.dispose();
	}
}
