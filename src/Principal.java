import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la pelicula: ");

        ConsultaPelicula consulta = new ConsultaPelicula();
        try {
            var numeroPelicula = Integer.valueOf(sc.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(numeroPelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo fileGenerate = new GeneradorDeArchivo();
            fileGenerate.guardarJson(pelicula);
        }catch (NumberFormatException e){
            System.out.println("Numero no encontrado" + e.getMessage());
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la app");
        }
    }
}
