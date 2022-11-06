package Bataille_Navale.modele.grille;

import java.awt.*;
import javax.swing.*;
public class Plateau_de_jeu extends JFrame {

	/**
	 * 
	 */
	//Crï¿½ation d'un sï¿½rial ID( recommandï¿½ par Eclipse je sais pas pk)
	private static final long serialVersionUID = 1L;

	JButton Bouton;
	JLabel lbl;

	//Constructeur 

	public Plateau_de_jeu() {

		setTitle("Bataille navale");
<<<<<<< Updated upstream
		setSize(1200,1200);
=======
		setSize(1300,800);
>>>>>>> Stashed changes
		setVisible(true);
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//Contenu

<<<<<<< Updated upstream
//Label Bataille Naval
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		//Bouton = new JButton("Commencer");
		//contentPane.add(Bouton);
		lbl = new JLabel("Bataille Navale");
		lbl.setBounds(600,0,200,100);
		lbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		add(lbl);
=======
//Bouton commencer
		
		 Container contentPane = this.getContentPane(); contentPane.setLayout(new
		 FlowLayout()); Bouton = new JButton("Commencer"); contentPane.add(Bouton);
		 lbl = new JLabel("Bataille Navale"); lbl.setBounds(500,100,200,100);
		 lbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
		 
		//add(lbl);
>>>>>>> Stashed changes

		setLayout(null);


		//Grille

<<<<<<< Updated upstream
		Grille gr = new Grille ();
		gr.setBounds(50,30,451,451);
		contentPane.add(gr);
=======
		Grille gr = new Grille();
		gr.setBounds(10,10,451,451);
		add(gr);
		
>>>>>>> Stashed changes
		
		//Label de choix du bateau
		
		JLabel bat = new JLabel("Bateau");
		bat.setFont(new Font(Font.DIALOG,Font.ITALIC,10));
		bat.setBounds(850,25,50,15);
		add(bat);
		
<<<<<<< Updated upstream
		//Liste déroulante avec tous les bateaux
=======
		
//		//Liste dï¿½roulante avec tous les bateaux
>>>>>>> Stashed changes
		String[] bateaux = {"Croiseur","Cuirase","Destroyeur","SousMarin"};
		JComboBox<String> b = new JComboBox<>(bateaux);
		b.setBounds(830,50,100,30);
		add(b);
		
		//Label de tir
		JLabel Tir = new JLabel("TIR");
		Tir.setFont(new Font(Font.DIALOG,Font.ITALIC,10));
		Tir.setBounds(850,120,50,15);
		add(Tir);
<<<<<<< Updated upstream

		//Case coordonnées X
=======
		//Case coordonnï¿½es X
>>>>>>> Stashed changes
		JTextField tfX = new JTextField();
		tfX.setBounds(800,150,60,45);
		tfX.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
		add(tfX);
		JLabel caseX = new JLabel("X");
		caseX.setFont(new Font(Font.DIALOG,Font.ITALIC,10));
		caseX.setBounds(800,130,50,15);
		add(caseX);
		
		
		

		//Bouton Valider

		JButton btnValide = new JButton();
		btnValide.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,10));
		btnValide.setText("Valider");
		btnValide.setBounds(825,200,75,50);
		add(btnValide);

		// Case coordonnï¿½es Y
		JTextField tfCoorY = new JTextField();
		tfCoorY.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
		tfCoorY.setBounds(875,150,60,45);
		add(tfCoorY);
		JLabel caseY = new JLabel("Y");
		caseY.setFont(new Font(Font.DIALOG,Font.ITALIC,10));
		caseY.setBounds(875,130,60,15);
		add(caseY);

	}



	public static void main(String[] args) {

		new Plateau_de_jeu();
	}
}