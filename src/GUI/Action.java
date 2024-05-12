package GUI;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Fenetres.Commentaires;

public class Action{
	public Action(){
		super();
	}
	
	// ------------------------------ Se redireger vers un site internet --------------------------------------------------- //
	
	public void lienverssite(String path){
	   	 try {
				Desktop.getDesktop().browse(new URI(path)); //Faire qqch avec lienversssite();
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	//ouverture d'un navigateur web et direction vers le lien
	}
	
	// ----------------------------------------------------------------------------------------------------------------------- //
	
	// -------------------------------- Action pour quitter une fenetre avec une notification de dialogue -------------------- //
	
	public static void quitter(JFrame f){
		  JOptionPane confirmquitter = new JOptionPane();            
			@SuppressWarnings("static-access")
			int option = confirmquitter.showConfirmDialog(null, "Voulez-vous quitter cette fenetre ?", "Fermer la fenêtre ?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,new ImageIcon("iconepage.png"));

		if(option == JOptionPane.OK_OPTION){	//si on clique sur le bouton Oui
			f.dispose();	//fermeture de la fenetre
		};
	}
	
	// ----------------------------------------------------------------------------------------------------------------------- //
	
	// ----------------------------------- Creation d'une modification --------------------------------------------------------- //
	
	public static void notification(JFrame f,String message){
		JOptionPane.showMessageDialog(null, message,"EMBLEM",JOptionPane.PLAIN_MESSAGE,new ImageIcon("iconepage.png"));
	}
	
	// ----------------------------------------------------------------------------------------------------------------------- //
	
	// ------------------------------------- Ouverture de la fenetre pour ecrire et voir les commentaires -------------------- // 
	
	public void accescommentaires(){
		try {
				new Commentaires();
			} catch (IOException el) {
				// TODO Auto-generated catch block
				el.printStackTrace();
			}
	}
	
	// ----------------------------------------------------------------------------------------------------------------------- //

}