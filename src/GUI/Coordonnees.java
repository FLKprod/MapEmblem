package GUI;


public class Coordonnees{
	private int _x;
	private int _y;
	private int _w;
	private int _h;
	
	public Coordonnees(int x, int y ,int w, int h){
		this._x=x;	//position de l'image sur la largeur de la fenetre
		this._y=y;	//position de l'image sur la hauteur de la fenetre
		this._w=w;	//largeur de la fenetre
		this._h=h;	//hauteur de la fenetre
	}

	public int get_x() {
		return _x;
	}

	public int get_y() {
		return _y;
	}

	public int get_w() {
		return _w;
	}


	public int get_h() {
		return _h;
	}

}