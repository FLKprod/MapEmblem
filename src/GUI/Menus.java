package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class Menus extends JMenuBar implements ActionListener {
	private Action Action=new Action();
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Menu");
	private JMenuItem commentaires = new JMenuItem("Commentaires");
	private JMenuItem quitter = new JMenuItem("Quitter");
	private JMenu reseaux = new JMenu("Nos réseaux");
	private JMenuItem site = new JMenuItem("Notre Site Internet");
	private JMenuItem instagram = new JMenuItem("Notre Instagram");
	private JMenuItem facebook = new JMenuItem("Notre Facebook");
	private JMenu menudivers = new JMenu("Infos sur le Projet");
	private JMenuItem itemdivers = new JMenuItem("READ ME");
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	Color Blanc=VariablesGlobales.Blanc;//new Color(255,255,255);
	Color Bleu=new Color(121,194,188);
	public Menus(JFrame f){
	  super();
	  quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
	  commentaires.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.ALT_DOWN_MASK));
	  Font font = new Font("Consolas",Font.PLAIN,4);
	  this.setFont(font);
	  menuBar.add(menu);
	  f.setJMenuBar(menuBar);
	  menuBar.add(reseaux);
	  menuBar.add(menudivers);
	  f.setJMenuBar(menuBar);
	  
	  
	  menudivers.add(itemdivers).addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	// -------------------------------- Action pour quitter une fenetre avec une notification de dialogue -------------------- //
	        	 JOptionPane.showMessageDialog(null, "Projet Java 2022 \n\n Maxime Falkowski 3A IT ESIREM \n Projet : une carte ou sont indiqués les lieux partenaires de EMBLEM,\n avec des informations utiles sur ces derniers.\nEt un espace pour mettre des commentaires \n\n Enjoy.","EMBLEM",JOptionPane.PLAIN_MESSAGE,new ImageIcon("gif.gif")); 
	         }
	      });
	  menu.add(commentaires).addActionListener(new ActionListener() {
		  	// ------------------------------------- Ouverture de la fenetre pour ecrire et voir les commentaires -------------------- // 
	         public void actionPerformed(ActionEvent e) {
	        	 Action.accescommentaires();
	        	 
	         }
	  });
	  menu.add(quitter).addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 GUI.Action.quitter(f);
         }
      });
	  
	  reseaux.add(site).addActionListener(new ActionListener() {		//ajout des differentes items et des actions dediées a ces elements
		  //redirection vers un site internet
		  public void actionPerformed(ActionEvent e) {
	        	 Action.lienverssite("https://www.emblemdijon.com/");
	         }});
	  reseaux.add(instagram).addActionListener(new ActionListener() {	//ajout des differentes items et des actions dediées a ces elements
		//redirection vers un site internet
	         public void actionPerformed(ActionEvent e) {
	        	 Action.lienverssite("https://www.instagram.com/emblemdijon/?hl=fr");
	         }});
	  reseaux.add(facebook).addActionListener(new ActionListener() {	//ajout des differentes items et des actions dediées a ces elements
		//redirection vers un site internet
			public void actionPerformed(ActionEvent e) {
				Action.lienverssite("https://www.facebook.com/emblemdijon/");
				
			}});
	}
}