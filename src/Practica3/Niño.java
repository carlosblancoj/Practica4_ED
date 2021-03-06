package Practica3;

public class Niño extends Persona {

    private String colegio;
    private Juguete juguete;

    public String getColegio() {
        /*método getColegio(): consultar el valor de colegio
        @return: devuelve el valor del atributo colegio*/
        return colegio;
    }

    public void setColegio(String colegio) {
        /*método setColegio(): modifica el valor del atributo colegio 
        @param: String colegio*/
        this.colegio = colegio;
    }

    public Niño() {
        /*constructor Niño(): inicializa las variables de la clase Niño como nulas
        @param: */
    }

    public Niño(String colegio, Juguete juguete) {
        /*constructor Niño(): inicializa las variables de la clase Niño con los valores 
         de los parámetros
        @param: String colegio,Juguete juguete */
        this.colegio = colegio;
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        /*método toString(): convierte el objeto a String
        @return: devuelve un string con los atributos del objeto Niño*/
        return "Niño[ Colegio: " + colegio +"]";
    }
}


