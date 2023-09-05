package uniandes.dpoo.taller0.modificacion;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Modificación {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		System.out.println("Hola, mundo!");
		// TODO Auto-generated method stub
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}
	//TAN BONITA COMO TU TAN BONITA Y SOLA 

}
