import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Inscription extends JFrame implements ActionListener {
	
	public Font font = new Font("Monospaced",Font.PLAIN,16);//changement de font si besoin
 	public final Color Bleu=new Color(85,51,255);
 	
 	private JButton boutonEnregistrer = new JButton("Cr�ez votre profil");
 	private JButton boutonAnnuler = new JButton("Annuler");
 	//panel principal à inserer 5 pour espacer entre WEST et CENTER, 5 pour espacer entre CENTER et SOUTH
 	private JPanel panel = new JPanel(new BorderLayout(5,5));
 	
 	private Profil newprofil;
	public Inscription() {
		this.setTitle("Cr�ation de votre profil");
		
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
		panel.setPreferredSize(new Dimension(450,300));// taille preferee du panel principal
		this.add(panel);
 
 
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
 		
 		JLabel labelAdresse = new JLabel(" Adresse ");
 		labelAdresse.setForeground(Color.WHITE);
		labelAdresse.setBackground(Bleu);
		labelAdresse.setOpaque(true);
		labelAdresse.setFont(font);
		
		JLabel labelTel = new JLabel(" Numéro de téléphone ");
		labelTel.setForeground(Color.WHITE);
		labelTel.setBackground(Bleu);
		labelTel.setOpaque(true);
		labelTel.setFont(font);
		
		JLabel labelVille = new JLabel(" Ville ");
		labelVille.setForeground(Color.WHITE);
		labelVille.setBackground(Bleu);
		labelVille.setOpaque(true);
		labelVille.setFont(font);
		
		JLabel labelCode = new JLabel(" Code Postale ");
		labelCode.setForeground(Color.WHITE);
		labelCode.setBackground(Bleu);
		labelCode.setOpaque(true);
		labelCode.setFont(font);
		
		JLabel labelSexe = new JLabel(" Sexe ");
		labelSexe.setForeground(Color.WHITE);
		labelSexe.setBackground(Bleu);
		labelSexe.setOpaque(true);
		labelSexe.setFont(font);
 
		JLabel labelDate = new JLabel(" Date de naissance ");
		labelDate.setForeground(Color.WHITE);
		labelDate.setBackground(Bleu);
		labelDate.setOpaque(true);
		labelDate.setFont(font);
 
		int Wlabel=200,Hlabel=30; // Longueur et Largeur des saisies de texte
		
		JPanel panelTextPrenom = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//on mets textPrenom dans un JPanel avec LEFT pour coller à gauche et preferredSize fonctionne
		JTextField textPrenom = new JTextField();
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
		
		
		JPanel panelTextAdresse = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//pareil qu'au dessus
		JTextField textAdresse = new JTextField();
		textAdresse.setPreferredSize(new Dimension(Wlabel,Hlabel));
		textAdresse.setFont(font);
		panelTextAdresse.add(textAdresse);
		panelTextAdresse.setOpaque(true);
		panelTextAdresse.setBackground(Bleu);
		
		JPanel panelTextVille = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//pareil qu'au dessus
		JTextField textVille = new JTextField();
		textVille.setPreferredSize(new Dimension(Wlabel,Hlabel));
		textVille.setFont(font);
		panelTextVille.add(textVille);
		panelTextVille.setOpaque(true);
		panelTextVille.setBackground(Bleu);
		
		JPanel panelTextCode = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//pareil qu'au dessus
		JTextField textCode = new JTextField();
		textCode.setPreferredSize(new Dimension(Wlabel,Hlabel));
		textCode.setFont(font);
		panelTextCode.add(textCode);
		panelTextCode.setOpaque(true);
		panelTextCode.setBackground(Bleu);
		
		JPanel panelTextTel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//pareil qu'au dessus
		JTextField textTel = new JTextField();
		textTel.setPreferredSize(new Dimension(Wlabel,Hlabel));
		textTel.setFont(font);
		panelTextTel.add(textTel);
		panelTextTel.setOpaque(true);
		panelTextTel.setBackground(Bleu);
		
		
		//on récupère les textes ecrits dans les jTextField
 		String tel=textTel.getText();
		System.out.println(tel);
		
		JRadioButton radioMasculin = new JRadioButton("Masculin");
		radioMasculin.setForeground(Color.WHITE);
		radioMasculin.setBackground(Bleu);
		radioMasculin.setOpaque(true);
		radioMasculin.setFont(font);
 
		JRadioButton radioFeminin = new JRadioButton("Feminin");
		radioFeminin.setForeground(Color.WHITE);
		radioFeminin.setBackground(Bleu);
		radioFeminin.setOpaque(true);
		radioFeminin.setFont(font);
 
		JPanel panelRadio = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//on mets les radio dans un JPanel avec LEFT pour coller à gauche
		panelRadio.add(radioMasculin);
		panelRadio.add(radioFeminin);
		panelRadio.setBackground(Bleu);
		panelRadio.setOpaque(true);
		JComboBox comboJour = new JComboBox();
		comboJour.setForeground(Color.WHITE);
		comboJour.setBackground(Bleu);
		comboJour.setOpaque(true);
		comboJour.setFont(font);
		for(int i=1;i<32;i++)
			comboJour.addItem(i);
 
		JComboBox comboMois = new JComboBox();
		comboMois.setForeground(Color.WHITE);
		comboMois.setBackground(Bleu);
		comboMois.setOpaque(true);
		
		
		comboMois.setFont(font);
		comboMois.addItem("Janvier");
		comboMois.addItem("F�vrier");
		comboMois.addItem("Mars");
		comboMois.addItem("Avril");
		comboMois.addItem("Mai");
		comboMois.addItem("Juin");
		comboMois.addItem("Juillet");
		comboMois.addItem("Aout");
		comboMois.addItem("Septembre");
		comboMois.addItem("Octobre");
		comboMois.addItem("Novembre");
		comboMois.addItem("D�cembre");
		
		
		JComboBox comboAnnee = new JComboBox();
		comboAnnee.setForeground(Color.WHITE);
		comboAnnee.setBackground(Bleu);
		comboAnnee.setOpaque(true);
		comboAnnee.setFont(font);
		for(int i=1900;i<2020;i++)
			comboAnnee.addItem(i);
 
		JPanel panelCombo = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));//on mets les combo dans un JPanel avec LEFT pour coller à gauche
		panelCombo.add(comboJour);
		panelCombo.add(comboMois);
		panelCombo.add(comboAnnee);
 		panelCombo.setBackground(Bleu);
		panelCombo.setOpaque(true);
 
		JPanel panelWest = new JPanel(new GridLayout(8,1));//panelWest à l'ouest du borderlayout. c'est une grille d'une colonne avec 8 lignes pour les labels
		panelWest.add(labelPrenom);
		panelWest.add(labelNom);
		panelWest.add(labelAdresse);
		panelWest.add(labelVille);
		panelWest.add(labelCode);
		panelWest.add(labelTel);
		panelWest.add(labelSexe);
		panelWest.add(labelDate);
		panel.add(panelWest,BorderLayout.WEST);//ajout du panelWest au panel principal
 		
 
 
		JPanel panelCentre = new JPanel(new GridLayout(8,1));//panelCentre au centre du borderlayout. c'est une grille d'une colonne avec 8 lignes
		panelCentre.add(panelTextPrenom);
		panelCentre.add(panelTextNom);
		panelCentre.add(panelTextAdresse);
		panelCentre.add(panelTextVille);
		panelCentre.add(panelTextCode);
		panelCentre.add(panelTextTel);
		panelCentre.add(panelRadio);
		panelCentre.add(panelCombo);
		panelCentre.setBackground(Bleu);
		panelCentre.setOpaque(true);
		panel.add(panelCentre,BorderLayout.CENTER);//ajout du panelCentre au panel principal
 
		JPanel panelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));//panel sud pour les 2 boutons
		panelSouth.setBackground(Bleu);
		
		this.boutonEnregistrer.addActionListener( this );
		boutonEnregistrer.setBackground(Bleu);
		boutonEnregistrer.setForeground(Color.WHITE);
		boutonEnregistrer.setOpaque(true); 

		this.boutonAnnuler.addActionListener( this );
		boutonAnnuler.setBackground(Bleu);
		boutonAnnuler.setForeground(Color.WHITE);
		boutonAnnuler.setOpaque(true);
		panelSouth.add(boutonEnregistrer);
		panelSouth.add(boutonAnnuler);
		panel.add(panelSouth,BorderLayout.SOUTH);//ajout du panelSouth au panel principal
		
		pack();//java propose la meilleure taille en fonction des elements
		setVisible(true);
	}
 
	public void actionPerformed( ActionEvent event ) {
        if ( event.getSource() == boutonAnnuler ) {
        	this.dispose();
        } else if ( event.getSource() == boutonEnregistrer ) {
        	System.out.println("OK");
        	newprofil.setnom(textNom.getText());
    		newprofil.setprenom(textPrenom.getText());
    		//newprofil.setage(textage.getText());
    		newprofil.setadresse(textAdresse.getText());
    		newprofil.setville(textVille.getText(),textCode.getText());
    		newprofil.setnom(textNom.getText());
    		newprofil.settelephone(textTel.getText());
        	
        } else {
        }
	}
}
