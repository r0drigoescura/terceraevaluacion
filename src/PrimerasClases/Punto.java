package PrimerasClases;

public class Punto {
	//atributos
	private int  coordX;
	private int  coordY;
	
	//constructor
	public Punto(int nuevocoordX,int nuevocoordY){
		coordX=nuevocoordX;
		coordY=nuevocoordY;
	}
	//metodos
	double devuelveDistaciaOrigen(){
		double distancia;
		distancia=Math.sqrt(coordX*coordX+coordY*coordY);
		return(distancia);
	}
	//Métodos setter&getter:
	//Método set: sirve para fijar el valor de un atributo
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
}
