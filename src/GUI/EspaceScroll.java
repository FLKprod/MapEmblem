package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;


public class EspaceScroll extends JScrollPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Coordonnees _c;
	public EspaceScroll(JPanel panel,Texte textarea,Coordonnees c,int vitessescroll){
		super();
		this._c=c;
		this.setViewportView(textarea); 		// ajout de la zone de texte dans le JScrollPane
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);	// ajout de la barre verticale pour scroller
		this.getVerticalScrollBar().setUnitIncrement(vitessescroll); 			//on donne une vitesse de scrolla a la barre
		this.setBounds(_c.get_x(),_c.get_y(),_c.get_w(),c.get_h());				//positionnnement et dimensions de l'objet
		this.setBackground(VariablesGlobales.Bleu);								//couleur du fond
		panel.add(this);
	}
}