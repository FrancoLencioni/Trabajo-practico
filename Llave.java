import java.util.ArrayList;
import java.util.List;

public class Llave extends EtapaMundial{
    public List<Equipo> getEquiposQueAvanzan(){
        List<Equipo> equiposGanadores=new ArrayList<>();
        this.partidos.forEach(partido -> {
            Resultado resultado = partido.getResultado();
            if(resultado.ganoLocal()){
                equiposGanadores.add(partido.getLocal());
            }
            else {
              equiposGanadores.add(partido.getVisitante());
            }
        });
        return equiposGanadores;
    }
}
