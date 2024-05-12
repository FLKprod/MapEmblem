package GUI;

import java.awt.Color;
import java.awt.Font;

public class VariablesGlobales{
	
	// couleurs utilisées dans le projet
	public static Color Blanc=new Color(255,255,255,255);
	public static Color Bleu=new Color(50,90,120,255);
	public static Color BleuC=new Color(101,174,168,255);
	
	// police utilisée dans le projet
	public static Font font = new Font("Monospaced",Font.PLAIN,14);

	// variables pour gerer l'affichage des cartes demandées
	public static String carteselect="Globale";
	public static String lieuselect="Tous les lieux";
	
	// taille des boutons ( qui sont identiques a tous les boutons du projet )
	public static int wbouton=250;
	public static int hbouton=60;
	
	public static int opacity=5; //variable pour gerer l'opacité du text et faire des animations
}
