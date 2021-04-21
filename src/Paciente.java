public class Paciente implements Comparable<Paciente> {


    public String nombre;
    public String condicion;
    public String codigo;


    public Paciente(String nom, String cond, String cod){
        nombre = nom;
        condicion = cond;
        codigo = cod;

    }
    public int compareTo(Paciente pac){

        int compare = codigo.compareTo(pac.codigo);

        return compare;
    }

    public String toString(){
        String pac = nombre + " ingreso por " + condicion + ", por eso le corresponde el codigo: " + codigo;
        return pac;
    }

}
