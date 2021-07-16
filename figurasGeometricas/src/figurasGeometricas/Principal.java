package figurasGeometricas;

public class Principal {

	public static void main(String[] args) {
		FigurasGeomtricas figura= new FigurasGeomtricas();
		Triangulo T= new Triangulo();
		cuadrado C= new cuadrado();
		circulo cir= new circulo();
		 System.out.println(figura.calcular_area(8));
		 System.out.println(T.calcular_area(8, 15));
		 System.out.println(C.calcular_area(8));
		 System.out.println(cir.calcular_area(8));
	}

}
