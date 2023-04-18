package Ejercicios_Clases;

public class ManejaBarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco miPrimerBarquito,miSegundoBarquito;
		BarcovelasCuadradas miBarquitoBebe;
		miPrimerBarquito=new Barco("velero",12,2);
		miSegundoBarquito=new Barco("bergantin",67,5);
		System.out.println(miPrimerBarquito.getNombreBarco());
		System.out.println(miSegundoBarquito.getNombreBarco());
		miBarquitoBebe= new BarcovelasCuadradas("trirreme",10,1,true);
		System.out.println(miBarquitoBebe.getNombreBarco());
	}
	

}
