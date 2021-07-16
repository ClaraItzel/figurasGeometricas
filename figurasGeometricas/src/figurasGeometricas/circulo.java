package figurasGeometricas;

public class circulo extends FigurasGeomtricas {
	float pi=3.1415f;
	float operacion;
public String calcular_area(int radio) {
	operacion= (pi*radio)+(pi*radio);
	return "El area de tu circulo es..."+operacion;
}
}
