package Ejercicios_Clases;

public class Barco {
	
	
	//Atributos
	private String nombreBarco;
	private int tamano;
	private int numeroPalos;
	//Constructor
	public Barco(String nombreBarco, int tamano, int numeroPalos) {
		super();
		this.nombreBarco = nombreBarco;
		this.tamano = tamano;
		this.numeroPalos = numeroPalos;
	}
	//ejemplo de polimorfismo: Vamos a sobrecargar el constructor
	public Barco(String nombreBarco) {
		super();
		this.nombreBarco = nombreBarco;
	}
	public String getNombreBarco() {
		return nombreBarco;
	}
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public int getNumeroPalos() {
		return numeroPalos;
	}
	public void setNumeroPalos(int numeroPalos) {
		this.numeroPalos = numeroPalos;
	}
}
