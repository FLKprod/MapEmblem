import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Fenetre extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 8583003536311593618L;
	
	public Font font = new Font("Monospaced",Font.PLAIN,20);//changement de font si besoin
	
	public final Color BleuC=new Color(100,100,255);
	public final Color Bleu=new Color(85,51,255);
	
	private JButton btnMap = new JButton( "Map Emblem" );
    private JButton btnConexion = new JButton( "Connexion" );
    private JButton btnInscription = new JButton( "Inscription" );
    private JLabel text = new JLabel("Un projet de Maxime Falkowski     #EMBLEM");
    private JPanel panel = null;
    
	public Fenetre() throws IOException {
		super();
        
		panel = (JPanel) this.getContentPane();
		panel.setLayout( new FlowLayout( FlowLayout.CENTER ) );
		
		this.setTitle("Projet EMBLEM");
    	this.setSize(600,600);   
    	this.setVisible(true);
    	this.setLocationRelativeTo(null);	//Nous demandons maintenant à notre objet de se positionner au centre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); //Termine le processus lorsqu'on clique sur la croix rouge
    	panel.setForeground(Color.WHITE);
    	panel.setBackground(Color.white);	    	 	//Définition de sa couleur de fond
        
    	panel = (JPanel) this.getContentPane();
    	panel.setLayout( new GridLayout(2,2) );
    	
    	//-----------// CHANGER ICONE DE LA FENETRE // ------------------------------------ //
    	Image icon = Toolkit.getDefaultToolkit().getImage("iconepage.png");  
    	setIconImage(icon);
    	
		
        // BOUTON MAP //
    	
        this.btnMap.addActionListener( this );
        btnMap.setBackground(Bleu);
        btnMap.setForeground(Color.WHITE);
        btnMap.setOpaque(true);
        panel.add( this.btnMap );
        
        // ------------------------------------------------ //
        
        // BOUTON CONNEXION // 
        
        this.btnConexion.addActionListener( this );
        btnConexion.setBackground(BleuC);
        btnConexion.setForeground(Color.WHITE);
        btnConexion.setOpaque(true);
        panel.add( this.btnConexion );
        
        // ------------------------------------------------- //
        
        // BOUTON INSCRIPTION //
        
        this.btnInscription.addActionListener( this );
        btnInscription.setBackground(BleuC);
        btnInscription.setForeground(Color.WHITE);
        btnInscription.setOpaque(true);
        panel.add( this.btnInscription );
		
        // -------------------------------------------------- //
        
        
		// MENU ACCUEIL //
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Bleu);
		
		
		JMenu menu = new JMenu("Accueil");
		JMenuItem Accueil = new JMenuItem("Accueil");
		menu.add(Accueil);
		JMenuItem quitter = new JMenuItem("Quitter");
		menu.add(quitter);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		
		// MENU ACCUEIL //
		JMenu menuaffichage = new JMenu("Affichage");
		JMenuItem Nuit = new JMenuItem("Mode Nuit");
		menuaffichage.add(Nuit);
		JMenuItem Clair = new JMenuItem("Mode Clair");
		menuaffichage.add(Clair);
		menuBar.add(menuaffichage);
		
		
		// MENU AIDE //
		JMenu menuaide = new JMenu("Aides");
		JMenuItem apropos = new JMenuItem("A propos de ce projet");
		menuaide.add(apropos);
		JMenuItem autre = new JMenuItem("?");
		menuaide.add(autre);
		menuBar.add(menuaide);
		
		
		// LOGO //
		BufferedImage imglogo =ImageIO.read(new File("iconepage.png"));
		JLabel lablogo=new JLabel(new ImageIcon(imglogo));
		panel.add(lablogo);
}
	
	public void actionPerformed( ActionEvent event ){
        if ( event.getSource() == btnMap ) {
        	//Map mapemblem=new Map();
        }
        else if ( event.getSource() == btnConexion ) {
        	Connexion connect=new Connexion();
        }
        else if ( event.getSource() == btnInscription ){
            
            Inscription connexion = new Inscription();
        }
	}
	// MAIN //
    public static void main(String args[]) throws Exception,IOException {
    	UIManager.setLookAndFeel( new NimbusLookAndFeel() );
    	
    	
    	
     	
    	//Fenetre f=new Fenetre();
     	new Fenetre().setVisible( true );
    }
}

/* AJOUTER UN Swicth
 * BIEN S'OCCUPER DES HERITAGES ( A EXTENDS B )
 * GEstion des exceptions
 * */
