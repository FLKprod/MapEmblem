package GUI;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Bouton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _name;
	private Coordonnees _c;
  public Bouton(JPanel panel, String name,Coordonnees c){
	  super(name);
	  this._name=name;
	  this._c=c;
	  
	  Font font = new Font("Arial",Font.PLAIN,17);	//personalisatio de la police d'ecriture et de la taille du texte
	  
	  this.setFont(font);							//incrementation de la police dans le bouton
	  this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	//modification du curseur lorsqu'on survole un bouton
	  this.setForeground(VariablesGlobales.Blanc); 		//coloration du texte
	  this.setBackground(VariablesGlobales.BleuC);		//coloration du fond
	  this.setBounds(_c.get_x(),_c.get_y(), _c.get_w(), _c.get_h()); //positionnement du bouton
	  
      panel.add(this);	//ajout du JButton, du bouton, dans le panel

  }
  public void btnselected(){	//Pour afficher le bouton comme étant séléctionné
	  this.setBackground(VariablesGlobales.Blanc);	
	  this.setForeground(VariablesGlobales.BleuC);	
  }
  public void btnnotselected(){	//Pour afficher le bouton comme n'étant pas séléctionné
	  this.setBackground(VariablesGlobales.BleuC);	
	  this.setForeground(VariablesGlobales.Blanc);	
  }

}
