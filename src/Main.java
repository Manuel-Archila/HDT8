import java.util.Scanner;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        VectorHeap<Paciente> pacientes = new VectorHeap<>();

        System.out.println("Bienvenido al organizador de pacientes.\n");
        System.out.println("Estamos leyendo el registro de los pacientes...");

        try {
            File myObj = new File("pacientes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] datospac = data.split(",");
                String nombre = datospac[0];
                String condicion = datospac[1];
                String codigo =  datospac[2];
                Paciente anadido = new Paciente(nombre, condicion, codigo);
                pacientes.add(anadido);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        while(!pacientes.isEmpty()){
            Paciente saliendo = pacientes.remove();
            System.out.println(saliendo.toString() + " \n");
        }
    }
}
