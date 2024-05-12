package GUI;
import GUI.VariablesGlobales;

import java.awt.Cursor;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Liste extends JComboBox<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Liste(JPanel panel,Coordonnees c){
		this.setFont(VariablesGlobales.font);
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	//modification du curseur lorsqu'on survole un bouton
  	  	this.setBackground(VariablesGlobales.Bleu);
  	  	this.setBounds(c.get_x(),c.get_y(),c.get_w(),c.get_h());
  	  	this.setOpaque(true);
        panel.add(this);
	}
	
	// creation de cette fonction pour permettre a cette classe d'etre utlisée sur un autre projet
	public void addlementsemblem(){
		this.addItem("Tous les lieux");									//Ajout des éléments de la liste
  	  	this.addItem("Restauration");
  	  	this.addItem("Bars");
  	  	this.addItem("Services, Sport et Santé");
  	  	this.addItem("Loisirs et Sports");
	}
	public void addelement(String s){
		this.addItem(s);
	}
}