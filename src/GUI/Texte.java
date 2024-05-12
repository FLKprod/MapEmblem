package GUI;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class Texte extends JTextArea {
	private static final long serialVersionUID = 1L;
	private Coordonnees _c;
	// Constructeur
	public Texte(JPanel panel, String texte,Coordonnees c,int fontsize,Boolean autorisation){
	  super();
	  
	  Font font = new Font("Consolas",Font.PLAIN,fontsize);	//personalisatio de la police d'ecriture et de la taille du texte
	  this.setFont(font); 									//incrementation de la police dans la JTextArea
	  this.setWrapStyleWord(true);							//pour ne pas que les mots puissent etre coupés dans la zone detexte
	  this.setLineWrap(true); 								//pour sauter des lignes si le texte est trop long pour etre affiché entierement sur une seule ligne
	  this.setEditable(autorisation);						//pour autoriser ou empecher la modificatiojn du texte
	  this.setText(texte);									//insertion du texte
	  this.setForeground(VariablesGlobales.Blanc); 			//coloration du texte
	  this.setBackground(VariablesGlobales.Bleu);			//coloration du fond
	  this._c=c;											//coordonnees x y et largeur et auteur de l'image
	  this.setBounds(_c.get_x(),_c.get_y(),_c.get_w(),_c.get_h()); 	//positionnement de la JTextArea
      panel.add(this);												//ajout de la JTextArea, la zone de texte, dans le panel
  }      
}