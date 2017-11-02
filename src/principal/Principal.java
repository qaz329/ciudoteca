
package principal;

import java.util.ArrayList;
import java.util.List;
import modelo.Ciudad;
import modelo.Lugar;
import modelo.Museo;
import modelo.Naturaleza;

public class Principal {

    public static void main(String[] args) {
        inicializarDatos();
    }
    
    private static void inicializarDatos(){
        Ciudad ciudad1 = new Ciudad("Lleida",140000);
        Ciudad ciudad2 = new Ciudad("Barcelona",1600000);
        
        List<Lugar> listaLugares = new ArrayList();
        
        listaLugares.add(new Lugar(ciudad1, "La Seu Vella"));
        listaLugares.add(new Museo(ciudad1, "Diposit del pla de l'aigua", 0, "Sábados y domingos, de 12h a 14h"));
        listaLugares.add(new Naturaleza(ciudad1, "Parc de la mitjana", false, false, true, false));
        
        listaLugares.add(new Lugar(ciudad2, "Sagrada familia"));
        listaLugares.add(new Museo(ciudad2, "MACBA: Museu d'Art Contemporani de Barcelona", 10, "Lunes, miércoles y viernes, de 11h a 20h\n"
                                                                                            + "Jueves, de 11h a 21h\n"
                                                                                            + "Sábado, de 10h a 20h\n"
                                                                                            + "Domingo, de 10h a 15h\n"
                                                                                            + "Martes, cerrado"));
        listaLugares.add(new Naturaleza(ciudad2, "Park Güell", false, false, true, false));
        
    }
    
}
