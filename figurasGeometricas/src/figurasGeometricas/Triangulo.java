package figurasGeometricas;

public class Triangulo extends FigurasGeomtricas{
	float operacion;
	public String calcular_area(int base, int altura) {
		operacion= base * altura/2;
		return "El area de tu triangulo es "+ operacion;
	}
}
