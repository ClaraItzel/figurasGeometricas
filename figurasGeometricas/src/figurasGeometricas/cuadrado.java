package figurasGeometricas;

public class cuadrado extends FigurasGeomtricas{
float operacion;
public String calcular_area(int lado) {
	operacion= lado * lado;
	return"El resultado es:" + operacion;
}
}
