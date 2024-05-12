package GUI;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Img{
	private String _path;
	private Coordonnees _c;
	private BufferedImage imgicone;
	
	//Constructeur 
  public Img(JPanel panel,String path,Coordonnees c) throws IOException{
	  super();
	  this._path=path;	//nom du fichier de l'image
	  this._c=c;		//coordonnees x y et largeur et auteur de l'image
	  imgicone =ImageIO.read(new File(_path));	//lecture de l'image
	  BufferedImage imgiconedim = new BufferedImage(c.get_w(), c.get_h(), imgicone.getType());	//redimension de l'image
	  Graphics2D gicone = imgiconedim.createGraphics();	//creation du graphisme de l'image
	  gicone.drawImage(imgicone, 0, 0, c.get_w(), c.get_h(), null);	//on dessine l'image avec la alrgeur et la hauteur demandée
	  gicone.dispose();		//on n'affiche pas le graphisme
	  JLabel labicone=new JLabel(new ImageIcon(imgiconedim));	//creation d'un JLabel pour y mettre image et ainsi l'afficher
	  labicone.setBounds(c.get_x(),c.get_y(),c.get_w(),c.get_h());	//positionnement du JLabel, de l'image
	  panel.add(labicone);	//ajout du JLabel, de l'image, dans le panel
  }
  public Img(String path) throws IOException{
	  this._path=path;	//nom du fichier de l'image
	  imgicone =ImageIO.read(new File(_path));	//lecture de l'image
	  BufferedImage imgiconedim = new BufferedImage(imgicone.getWidth(), imgicone.getHeight(), imgicone.getType());	//redimension de l'image
	  Graphics2D gicone = imgiconedim.createGraphics();	//creation du graphisme de l'image
	  gicone.drawImage(imgicone, 0, 0, imgicone.getWidth(), imgicone.getHeight(), null);	//on dessine l'image avec la alrgeur et la hauteur demandée
  }
public BufferedImage getImgicone() {
	return imgicone;
}
}