package Fenetres;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

import GUI.*;

public class Commentaires extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// INITIALISATION DES CONTENEURS D'ELEMENTS (JPanel)
	private JPanel panelcom = null;
	
	// INITIALISATION DES DIFFERENTS BOUTONS
	private Bouton btnMenu;
	private Bouton btnConfirm;
	
	// INITIALISATION DES DIFFERENTS ZONES DE TEXTE
	private Texte texteareacommedit;
	private Texte texteareacomm;
	private Texte textareanomedit;
	
	public Commentaires() throws IOException{
		super();
		
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );		//Fermeture de la fenetre en cas de clic sur la croix
		this.setSize(1605,400);											//dimensions de la fenetre
		this.setTitle("Map EMBLEM");									//pour donner un titre a notre fenetre
		this.setLocationRelativeTo(null);								//positionnement de la fenetre au centre de l'écran
		this.setResizable(false);									//pour ne pas pouvoir redimensionner la fenetre
		panelcom = (JPanel) this.getContentPane();
		panelcom.setLayout(null);
		panelcom.setBackground(VariablesGlobales.Bleu);	    	 	//couleur de fond de la fenetre
		new Menus(this);	//ajout de la barre de menus en haut de l'écran
		
		
		//-----------// ENTETE // ------------------------------------ //
		
    	Image icon = Toolkit.getDefaultToolkit().getImage("iconepage.png"); //Icone de fenetre
    	this.setIconImage(icon);
        
		 // -------- Espace avec des scrolls pour afficher les commentaires ---------------------- //
    	
    	Coordonnees cscrollcomm=new Coordonnees(200+VariablesGlobales.wbouton, 10, 700, 300);
    	texteareacomm=new Texte(panelcom,affichercommentaires(),cscrollcomm,18,false);
		texteareacomm.setForeground(VariablesGlobales.Bleu); 		//coloration du texte
		texteareacomm.setBackground(VariablesGlobales.Blanc);		//coloration du fond
		new EspaceScroll(panelcom,texteareacomm,cscrollcomm,13);
    	
		// --------------------------------------------------------------------------------------- //
		
		// --------- Colonne de droite avec les espaces de texte pour poster un commentaire --------------- //
		
		Coordonnees ctextnom=new Coordonnees(1250,10, 300, 30);
		new Texte(panelcom,"Votre nom : ",ctextnom,18,false);
		
		
		Coordonnees ctextareanomedit = new Coordonnees(ctextnom.get_x(),ctextnom.get_y()+30, ctextnom.get_w(), 30);
		textareanomedit =new Texte(panelcom,"",ctextareanomedit,18,true);
		textareanomedit.setForeground(VariablesGlobales.Bleu); 		//coloration du texte
		textareanomedit.setBackground(VariablesGlobales.Blanc);		//coloration du fond

		
        Coordonnees ctextcomm=new Coordonnees(ctextareanomedit.get_x(),ctextareanomedit.get_y()+30, ctextnom.get_w(), ctextnom.get_h());
		new Texte(panelcom,"Mettez un commentaire ! : ",ctextcomm,18,false);
		
		
		Coordonnees ctextareacommedit=new Coordonnees(ctextcomm.get_x(),ctextcomm.get_y()+30, ctextnom.get_w(), 160);
		texteareacommedit =new Texte(panelcom,"",ctextareacommedit,18,true);
		texteareacommedit.setForeground(VariablesGlobales.Bleu); 		//coloration du texte
		texteareacommedit.setBackground(VariablesGlobales.Blanc);		//coloration du fond
		new EspaceScroll(panelcom,texteareacommedit,ctextareacommedit,13);
    	
		
		Coordonnees cbtnconfirm=new Coordonnees(ctextareacommedit.get_x(),ctextareacommedit.get_y()+ctextareacommedit.get_h(),ctextnom.get_w(),VariablesGlobales.hbouton);
		btnConfirm=new Bouton(panelcom,"Publier",cbtnconfirm);
        btnConfirm.addActionListener(this );
        
        // ------------------------------------------------------------------------------------------ //
        
        // ----------- Colonne de gauche avec une image et le bouton pour quitter la fenetre -------- //
        
        Coordonnees clogo=new Coordonnees(10,10,300,150);
		new Img(panelcom,"logoemblem.png",clogo);
        
		Coordonnees cbtnmenu=new Coordonnees(10,20+clogo.get_h(),clogo.get_w(),VariablesGlobales.hbouton);
		btnMenu=new Bouton(panelcom,"Retour Menu",cbtnmenu);
        btnMenu.addActionListener( this );
        
        // ------------------------------------------------------------------------------------------- //
		
        this.repaint(); 						// Pour afficher les textures
        this.setVisible(true);					// Pour rendre la fenetre visible
	}
	
// --------------------------- Fonction pour afficher l'ensemble des commentaires ----------------------- //
	
	public String affichercommentaires(){
		String contenutextareacomm="";
		String file = "Commentaires.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = br.readLine()) != null) {	//pour afficher toutes les lignes du fichier
            	
            	contenutextareacomm=contenutextareacomm + line + "\n";
            	
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		return contenutextareacomm;

// --------------------------------------------------------------------------------------------------------- //
		
	}
	public void ajoutercommentaire(){
		try{
			String nom=textareanomedit.getText();	//on recupere le texte des JTextArea
			String commentaire=texteareacommedit.getText();
    		String path = "Commentaires.txt";
    		PrintWriter fich;
    		if(nom.isEmpty()){ // on verifie si un nom est ecrit,sinon on previent l'utilisateur
    			Action.notification(this,"Aucun nom saisie");
    		}
    		else if(commentaire.isEmpty()){ // on verifie si un commentaire est saisie,sinon on previent l'utilisateur
    			Action.notification(this,"Commentaire vide");
    		}
    		else{
    			Action.notification(this,"Votre commentaire vient d'être publié ! Merci !");
        		fich = new PrintWriter(new BufferedWriter(new FileWriter(path, true))); //true c'est elle qui permet d'écrire à la suite des donnée enregistrer et non de les remplacé
        		fich.print("¤ "+nom+" : "); try{Thread.sleep(20);}catch(Exception e){}
        		fich.println(commentaire+" \n ");
        		fich.close();
    		}
    		this.repaint();
    	}
    		catch (Exception e) {
    		// TODO: handle exception
    	}
	}

// -------------------------------------------------------------------------------------------------------------------------------------- //	
	
// -------------------- FONCTION DE DETECTION DE CLIQUE SUR LES BOUTONS OU LES LISTES DE LA FENETRE ------------------------------------- //

	public void actionPerformed( ActionEvent event ) {
        if ( event.getSource() == btnMenu ) {
        	Action.quitter(this);
        }
        if ( event.getSource() == btnConfirm ){
        	ajoutercommentaire();
        	texteareacomm.setText(affichercommentaires());
        }
	}
}

// --------------------------------------------------------------------------------------------------------------------------------------- //
