package Fenetres;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import GUI.*;
import GUI.Action;
import Lieux.Ville;

public class Map extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	// INITIALISATION DES DIFFERENTES IMAGES
	Img imgcarte=new Img("CarteDijon.jpg");
	Img imgcarteloisirs=new Img("CarteDijonloisirs.jpg");
	Img imgcarteRestos=new Img("CarteDijonRestos.jpg");
	Img imgcarteServices=new Img("carteDijonservices.jpg");
	
	Img imgcarteCentre=new Img("CentreVilleDijon.jpg");
	Img imgcarteCentreRestos=new Img("CentreVilleDijonRestos.jpg");
	Img imgcarteCentreBars=new Img("cartecentredijonBars.jpg");
	Img imgcarteCentreLoisirs=new Img("cartecentredijonloisirs.jpg");
	Img imgcarteCentreServices=new Img("cartecentredijonservices.jpg");
	
	// INITIALISATION DES DIFFERENTS BOUTONS
	private Bouton btnMenu;
	private Bouton btnCentreville;
	private Bouton btnVille;
	private Bouton btnCommentaires;
	
	// INITIALISATION DES DIFFERENTES ZONES D'AFFICHAGE (JLabel) ET DES CONTENEURS D'ELEMENTS (JPanel)
	private JLabel labcarte=new JLabel(new ImageIcon(imgcarte.getImgicone()));
	private JPanel panel = null;
	private JScrollPane scrollcarte;
	private Action Action=new Action(); // Ajout des actions possibles
	
	private Liste choicelieu;
	public Ville _lieuxEMBLEMdijon; // Objet de type Ville contenant tous les objets de type Lieu

	
	// CONSTRUCTEUR DE LA FENETRE MAP
	public Map() throws IOException {
		super();
		
		
		this.setTitle("Map EMBLEM");									//pour donner un titre a notre fenetre
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );		//Fermeture de la fenetre en cas de clic sur la croix
		this.setSize(1610,940);										//dimensions de la fenetre
		this.setLocationRelativeTo(null);								//positionnement de la fenetre au centre de l'écran
		this.setResizable(false);										//pour ne pas pouvoir redimensionner la fenetre
		panel = (JPanel) this.getContentPane();
		panel.setLayout(null);										
		panel.setBackground(VariablesGlobales.Bleu);	    	 	//couleur de fond de la fenetre
		new Menus(this);			//création de la bar de menus en haut de la fenetre
		
		
		//-----------// ENTETE // ------------------------------------ //
		
    	Image icon = Toolkit.getDefaultToolkit().getImage("iconepage.png"); //Icone de fenetre
    	this.setIconImage(icon);
    	
    	
        //Appel de fonctions utiles definies ci dessous //
    	_lieuxEMBLEMdijon=new Ville("Dijon");
    	_lieuxEMBLEMdijon=_lieuxEMBLEMdijon.lieuxdijon();
    	
        ColonneUn();				//affichage de la colonne de gauche de la fenetre
        btnVille.btnselected();		//on ouvre la fenetre avec la carte de tous les lieux de toute la ville de dijon

		// ------------ AFFICHAGE DU LOGO EMBLEM -----------------------------------------//
        
    	Coordonnees clogo=new Coordonnees(710,7,160,88);	//Coordonnées du logo emblem
        new Img(panel,"logoemblem.png",clogo);		
		
		// ---------------------------------------------------------------------------------------------------------------------------------------------- //
		
		// --------------------- affichage de la carte -------------------------------------------------------------------------------------------------- //
		
		Coordonnees cscrollarealieu=new Coordonnees(280,100,900,750);
		scrollcarte = new JScrollPane(labcarte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	//creation d'un objet JScrollPane avec une barre de scroll verticale et une autre barre horizontale
        scrollcarte.setBounds(cscrollarealieu.get_x(), cscrollarealieu.get_y(),cscrollarealieu.get_w(), cscrollarealieu.get_h());
        scrollcarte.getVerticalScrollBar().setUnitIncrement(16); scrollcarte.getHorizontalScrollBar().setUnitIncrement(16);		//on donne une vitesse a chaque barre de scroll
        
     // ---------------------------------------------------------------------------------------------------------------------------------------------- //
        
     // affichage de l'espace de texte ou seront affichées les informations sur les lieux
        
        Coordonnees ctextaeralieu=new Coordonnees(0,0,600,40);
        Texte textarealieu=new Texte(panel,"Selectionnez un lieu sur la carte en cliquant dessus !",ctextaeralieu,20,false);
		
     // ---------------------------------------------------------------------------------------------------------------------------------------------- //
     
     // ------------- FONCTION DE DETECTION DE CLICS SUR LA CARTE ------------------------------------------------------------------------------------ //
        
        labcarte.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
              System.out.println(e.getX() + "," + e.getY());
              try {
				selectlieu(e);
              }
              catch (IOException ee) {
				ee.printStackTrace();
              }
            }
            
            // Fonction pour detecter si nous cliquons ou non sur un lieu //
            public void selectlieu(MouseEvent e) throws IOException{
            	VariablesGlobales.opacity=0;
            	String textlieu="";
            	int nbrelieu=0;
				for(int i=0;i<_lieuxEMBLEMdijon.get_listelieux().size();i++){
					
					// DETECTION DU OU DES LIEUX A CE CLIC
					if(VariablesGlobales.carteselect=="Globale" && (_lieuxEMBLEMdijon.getlieu(i).get_type()==choicelieu.getSelectedItem()||choicelieu.getSelectedItem()=="Tous les lieux" ) && e.getX()>=_lieuxEMBLEMdijon.getlieu(i).get_xglobal()-20 && e.getX()<=_lieuxEMBLEMdijon.getlieu(i).get_xglobal()+20 && e.getY()>=_lieuxEMBLEMdijon.getlieu(i).get_yglobal()-40 && e.getY()<=_lieuxEMBLEMdijon.getlieu(i).get_yglobal()){
						nbrelieu++;
						textlieu = textlieu+_lieuxEMBLEMdijon.getlieu(i).afficher()+"\n\n\n";
					}
					else if(VariablesGlobales.carteselect=="Centre" && (_lieuxEMBLEMdijon.getlieu(i).get_type()==choicelieu.getSelectedItem()||choicelieu.getSelectedItem()=="Tous les lieux" ) && e.getX()>=_lieuxEMBLEMdijon.getlieu(i).get_xcentre()-20 && e.getX()<=_lieuxEMBLEMdijon.getlieu(i).get_xcentre()+20 && e.getY()>=_lieuxEMBLEMdijon.getlieu(i).get_ycentre()-40 && e.getY()<=_lieuxEMBLEMdijon.getlieu(i).get_ycentre()){
						nbrelieu++;
						textlieu = textlieu+_lieuxEMBLEMdijon.getlieu(i).afficher()+"\n\n\n";
					}
					
					// Si on clique dans la zone bleu marquée Centre-ville
					else if(VariablesGlobales.carteselect=="Globale" && e.getX()>514 && e.getX()<837 && e.getY()>648 && e.getY()<860){
						btnCentreville.btnselected();
			        	btnVille.btnnotselected();
			        	VariablesGlobales.carteselect="Centre";
			        	choicecarte();
					}
				}
				
				// SI NOUS NE CLIQUONS PAS SUR UN ICONE
				if(textlieu==""){
					textlieu="Selectionnez un lieu sur la carte en cliquant dessus !";
				}
				
				// PARTIE POUR COMPTER LE NOMBRE DE LIEUX A CET ENDROIT
				else{
					textlieu="\t"+textlieu+"|"+nbrelieu;
					if(nbrelieu==1){
						textlieu+=" lieu à cet endroit |";
					}
					else{
						textlieu+=" lieux à cet endroit |";
					}
				}
				// ------- ANIMATION DE L'APPARITION DU TEXTE ------------------------------------------- //
				textarealieu.setForeground(new Color(255,255,255,0));
				textarealieu.setText(textlieu);
				Timer timer = new Timer(40, new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                	if(VariablesGlobales.opacity<255){
	                		textarealieu.setForeground(new Color(255,255,255,VariablesGlobales.opacity)); // on chane l'opacité pour faire un effet de fondu
	                		VariablesGlobales.opacity+=50;
	                	}
	                	else{
	                		VariablesGlobales.opacity=255;
	                		textarealieu.setForeground(new Color(255,255,255,VariablesGlobales.opacity));
	                	}
	                	
				}
	            });
				timer.start(); //on demarre l'annimation a chaque mail
				
				// --------------------------------------------------------------------------------------- //
            }
          });
        this.add(scrollcarte);  
        
        // Espace avec des scrolls pour afficher les informations d'un lieu //

        Coordonnees cscrollville=new Coordonnees(cscrollarealieu.get_x()+cscrollarealieu.get_w()-3,cscrollarealieu.get_y(),405,750);
    	new EspaceScroll(panel,textarealieu,cscrollville,10);
    	Coordonnees cbtnCommentaires = new Coordonnees (1605-VariablesGlobales.wbouton-50,10,VariablesGlobales.wbouton,VariablesGlobales.hbouton);
        btnCommentaires=new Bouton(panel,"Espace commentaires",cbtnCommentaires);
        btnCommentaires.addActionListener( this );
		
        this.repaint(); 						// Pour afficher les textures
        this.setVisible(true);					// Pour rendre la fenetre visible
	}
	
	
	//FONCTION CONTENANT L'ENSEMBLE DES ELEMENTS DE LA COLONNE DE GAOUCHE (AFFICHAGE? BOUTONS,LISTE,ETC...)
	public void ColonneUn() throws IOException{
		
	// ------------------- Creation et positionnement des différents boutons ---------------------------------------------------------------------------- //
		
		Coordonnees cbtnmenu=new Coordonnees(20,10,VariablesGlobales.wbouton,VariablesGlobales.hbouton);
        btnMenu=new Bouton(panel,"Retour Menu",cbtnmenu);
        btnMenu.addActionListener( this );
        
        Coordonnees cbtnCentreville=new Coordonnees(cbtnmenu.get_x(), 100, VariablesGlobales.wbouton, VariablesGlobales.hbouton); // On utilise les coordonnéees de l'element précedent pour l'afficher a la suite
        btnCentreville=new Bouton(panel,"Centre-ville",cbtnCentreville);
        btnCentreville.addActionListener( this );
		
        Coordonnees cbtnville=new Coordonnees(cbtnCentreville.get_x(),cbtnCentreville.get_h()+cbtnCentreville.get_y() , VariablesGlobales.wbouton, VariablesGlobales.hbouton);
        btnVille=new Bouton(panel,"Vue globale",cbtnville);
        btnVille.addActionListener( this ); // On ajoute ce bouton a la fonction permettant de declencher des fonctions lors du clic sur ce bouton
        
     // ---------------------------------------------------------------------------------------------------------------------------------------------- //
        
     // --------- CHARGEMENT DES ICONES ET DU TEXTE APPARENT A COTE ------------------------------------------------------------//

        Coordonnees cImage1=new Coordonnees(cbtnville.get_x(),cbtnville.get_y()+cbtnville.get_h()+10,50,50);
        new Img(panel,"iconejaune.png", cImage1);
        Coordonnees cImage2=new Coordonnees(cImage1.get_x(),cbtnville.get_y()+cbtnville.get_h()+90,50,50);
        new Img(panel,"iconeorange.png", cImage2);
        Coordonnees cImage3=new Coordonnees(cbtnville.get_x(),cbtnville.get_y()+cbtnville.get_h()+170,50,50);
        new Img(panel,"iconerouge.png", cImage3);
        Coordonnees cImage4=new Coordonnees(cbtnville.get_x(),cbtnville.get_y()+cbtnville.get_h()+260,50,50);
        new Img(panel,"iconevert.png", cImage4);
        Coordonnees ctexticones=new Coordonnees(cbtnville.get_x()+60, cbtnville.get_y()+cbtnville.get_h()+10, VariablesGlobales.wbouton-60, 330);
        new Texte(panel,"Restauration \n \n \nBars \n \n \nServices, Sport et Santé \n  \nLoisirs et sports",ctexticones,21,false);
        
      //-----------------------------------------------------------------------------------------------//
        
        
        
        Coordonnees cchoicelieu=new Coordonnees(cbtnCentreville.get_x(),ctexticones.get_y()+ctexticones.get_h()+10,VariablesGlobales.wbouton, 55);
        new Texte(panel,"Séléctionnez un type de lieu :",cchoicelieu,18,false);
		
        // CHARGEMENT DE LA LISTE
        Coordonnees coorliste= new Coordonnees(cbtnCentreville.get_x(),cchoicelieu.get_y()+cchoicelieu.get_h(),VariablesGlobales.wbouton,50);
        choicelieu=new Liste(panel,coorliste);
        choicelieu.addlementsemblem();
        choicelieu.addActionListener(this);
        
        VariablesGlobales.lieuselect=(String) choicelieu.getSelectedItem();	//ON RECUPERE L'ELEMENT DE LA LISTE ACTUELEMENT SELECTIONNE
		
	}
	
	// -------------------- FONCTION DE DETECTION DE CLIQUE SUR LES BOUTONS OU LES LISTES DE LA FENETRE --------------------------------------//
	
	public void actionPerformed( ActionEvent event ) {
        if(event.getSource()==choicelieu){
        	choicecarte();					// fonction permettant d'afficher la bonne carte en fonction des choix de l'utilisateur
        }
        if ( event.getSource() == btnMenu ) {
			GUI.Action.quitter(this);			// alerte de choix pour fermer ou non la fenetre,quitter ou non le projet
        }
        else if ( event.getSource() == btnCommentaires ) {
			Action.accescommentaires();		//ouverture de la fenetre des commentaires
        }
        else if ( event.getSource()==btnCentreville){
        	btnCentreville.btnselected();
        	btnVille.btnnotselected();
        	VariablesGlobales.carteselect="Centre";					//on change la variable de carte
        	choicecarte();											//on lance cette fonction qui changera la carte
        }
        else if ( event.getSource()==btnVille){
        	btnCentreville.btnnotselected();
        	btnVille.btnselected();
        	VariablesGlobales.carteselect="Globale";
        	choicecarte();
        }
	}
	
	// -------------------------------------------------------------------------------------------------------------------------------------- //
	
	// --------------- FONCTION POUR AFFICHER LA BONNE CARTE SELON LES CHOIX DE L'UTILISATEUR ----------------------------------------------- //
	
	@SuppressWarnings("static-access")
	public void choicecarte(){
		if(VariablesGlobales.carteselect=="Globale"){
    		switch((String) choicelieu.getSelectedItem()){
    			case "Tous les lieux":labcarte.setIcon(new ImageIcon(imgcarte.getImgicone()));break;
    			case "Restauration":labcarte.setIcon(new ImageIcon(imgcarteRestos.getImgicone()));break;
    			case "Bars":Action.notification(this,"Pour l'instant, aucun bar en dehors du centre ville n'est partenaire avec nous...");
    						choicelieu.setSelectedItem("Tous les lieux");
    						labcarte.setIcon(new ImageIcon(imgcarte.getImgicone()));break;
    			case "Loisirs et Sports":labcarte.setIcon(new ImageIcon(imgcarteloisirs.getImgicone()));break;
    			case "Services, Sport et Santé":labcarte.setIcon(new ImageIcon(imgcarteServices.getImgicone()));break;
    		}
    	}
    	else if(VariablesGlobales.carteselect=="Centre"){
    		switch((String) choicelieu.getSelectedItem()){
				case "Tous les lieux":labcarte.setIcon(new ImageIcon(imgcarteCentre.getImgicone()));break;
				case "Restauration":labcarte.setIcon(new ImageIcon(imgcarteCentreRestos.getImgicone()));break;
				case "Bars":labcarte.setIcon(new ImageIcon(imgcarteCentreBars.getImgicone()));break;
				case "Loisirs et Sports":labcarte.setIcon(new ImageIcon(imgcarteCentreLoisirs.getImgicone()));break;
				case "Services, Sport et Santé":labcarte.setIcon(new ImageIcon(imgcarteCentreServices.getImgicone()));break;
		}
    		}
    		VariablesGlobales.lieuselect=(String) choicelieu.getSelectedItem();
    		System.out.println(VariablesGlobales.lieuselect);
    		this.repaint();
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------ //
	
	
	public static void main(String args[]) throws Exception {
		UIManager.setLookAndFeel( new NimbusLookAndFeel() );	//donner un type de style à chaque élément de la feneyre
		UIManager.put("control", VariablesGlobales.Bleu);
		UIManager.put("nimbusLightBackground",VariablesGlobales.Bleu);
		UIManager.put("nimbusSelectionBackground",VariablesGlobales.BleuC);
		UIManager.put("text", VariablesGlobales.Blanc);
		UIManager.put("nimbusBase",VariablesGlobales.Bleu);
		new Map();
	}
}