import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Connexion extends JFrame implements ActionListener {
	
	public Font font = new Font("Monospaced",Font.PLAIN,16);//changement de font si besoin
 	public final Color Bleu=new Color(85,51,255);
 	
 	private JButton boutonConnect = new JButton("Connexion");
 	private JButton boutonAnnuler = new JButton("Annuler");
 	//panel principal à inserer 5 pour espacer entre WEST et CENTER, 5 pour espacer entre CENTER et SOUTH
 	private JPanel panel = new JPanel(new BorderLayout(4,2));
 	
	public Connexion() {
		super();
		
 		this.setTitle("Page de Connexion");

 		//-----------// CHANGER ICONE DE LA FENETRE // ------------------------------------ //
    	Image icon = Toolkit.getDefaultToolkit().getImage("iconepage.png");  
    	setIconImage(icon);
 		
 		this.setLayout(null);   
 		this.setSize(300,300);   
 		this.setVisible(true);
 		this.getContentPane().setBackground(Bleu);
 		this.setLocationRelativeTo(null);
 		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 		this.setLayout(new FlowLayout(FlowLayout.CENTER)); //pour inserer un panel au centre
		
		
		panel.setBackground(Bleu);
		panel.setPreferredSize(new Dimension(400,220));// taille preferee du panel principal
		add(panel);
 
 
		/****creation des éléments****/
 
		JLabel labelPrenom = new JLabel(" Pr�nom ");
		labelPrenom.setForeground(Color.WHITE);
		labelPrenom.setBackground(Bleu);
		labelPrenom.setOpaque(true);
		labelPrenom.setFont(font);
		
		JLabel labelNom = new JLabel(" Nom ");
		labelNom.setForeground(Color.WHITE);
		labelNom.setBackground(Bleu);
		labelNom.setOpaque(true);
		labelNom.setFont(font);
 		
 		JLabel labelMDP = new JLabel(" Mot de passe ");
 		labelMDP.setForeground(Color.WHITE);
		labelMDP.setBackground(Bleu);
		labelMDP.setOpaque(true);
		labelMDP.setFont(font);
		
		
		
		int Wlabel=200,Hlabel=30; // Longueur et Largeur des saisies de texte
		
		JPanel panelTextPrenom = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//on mets textPrenom dans un JPanel avec LEFT pour coller à gauche et preferredSize fonctionne
		JTextField textPrenom = new JTextField();
		
		
		//Instanciation d'un objet JPanel
		textPrenom.setPreferredSize(new Dimension(Wlabel,Hlabel));//taille de textPrenom
		textPrenom.setFont(font);
		panelTextPrenom.add(textPrenom);
		panelTextPrenom.setOpaque(true);
		panelTextPrenom.setBackground(Bleu);
 
		JPanel panelTextNom = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//pareil qu'au dessus
		JTextField textNom = new JTextField();
		textNom.setPreferredSize(new Dimension(Wlabel,Hlabel));
		textNom.setFont(font);
		panelTextNom.setOpaque(true);
		panelTextNom.setBackground(Bleu);
		panelTextNom.add(textNom);
		
		JPanel panelTextMDP = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//pareil qu'au dessus
		JTextField textMDP = new JTextField();
		textMDP.setPreferredSize(new Dimension(Wlabel,Hlabel));
		textMDP.setFont(font);
		panelTextMDP.add(textMDP);
		panelTextMDP.setOpaque(true);
		panelTextMDP.setBackground(Bleu);

 
		JPanel panelWest = new JPanel(new GridLayout(3,1));//panelWest à l'ouest du borderlayout. c'est une grille d'une colonne avec 8 lignes pour les labels
		panelWest.add(labelPrenom);
		panelWest.add(labelNom);
		panelWest.add(labelMDP);
		panel.add(panelWest,BorderLayout.WEST);//ajout du panelWest au panel principal
 
		JPanel panelCentre = new JPanel(new GridLayout(3,1));//panelCentre au centre du borderlayout. c'est une grille d'une colonne avec 8 lignes
		panelCentre.add(panelTextPrenom);
		panelCentre.add(panelTextNom);
		panelCentre.add(panelTextMDP);
		panelCentre.setBackground(Bleu);
		panelCentre.setOpaque(true);
		panel.add(panelCentre,BorderLayout.CENTER);//ajout du panelCentre au panel principal
 
		JPanel panelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));//panel sud pour les 2 boutons
		panelSouth.setBackground(Bleu);
		
		this.boutonConnect.addActionListener( this );
		boutonConnect.setBackground(Bleu);
		boutonConnect.setForeground(Color.WHITE);
		boutonConnect.setOpaque(true); 

		this.boutonAnnuler.addActionListener( this );
		boutonAnnuler.setBackground(Bleu);
		boutonAnnuler.setForeground(Color.WHITE);
		boutonAnnuler.setOpaque(true);
		panelSouth.add(boutonConnect);
		panelSouth.add(boutonAnnuler);
		panel.add(panelSouth,BorderLayout.SOUTH);//ajout du panelSouth au panel principal
		
		this.pack();//java propose la meilleure taille en fonction des elements
		this.setVisible(true);
		
	}
 
	public void actionPerformed( ActionEvent event ) {
        if ( event.getSource() == boutonAnnuler ) {
        	this.dispose();
        } else if ( event.getSource() == boutonConnect ) {
        	System.out.println("OK");
        	if(Listeprofils.size() != 0){
    			Enumeration<String> enumProfils = Listeprofils.keys();
    			while ( enumProfils.hasMoreElements()){
    				//enumProfils.nextElement();
    				//Profil p = (Profil) ListeProfils.get(key);
    				System.out.println(enumProfils.nextElement());
    			}
    		}
        } else {
        }
	}
}