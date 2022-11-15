package Bataille_Navale.modele.joueur;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JComponent;

import Bataille_Navale.modele.bateau.Bateau;
import Bataille_Navale.modele.bateau.Croiseur;
import Bataille_Navale.modele.bateau.Cuirase;
import Bataille_Navale.modele.bateau.Destroyeur;
import Bataille_Navale.modele.bateau.SousMarin;
import Bataille_Navale.vue.grille.*;

public class Deplacement extends JFrame implements KeyListener  {
	
		
		Grille  grr ; 
		
		
		public Deplacement() {

			grr.addKeyListener(this);
		}
		

		@Override
		public void keyTyped(KeyEvent e) {
			
			
			
			switch(e.getKeyChar()) {
				case 'd':
					
					grr.deplacerBateauD(grr.lesBateaux.get(2) , grr.g2);
					System.out.println("bouton pressé");
					
				break;

			}
			
		}



		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

}
