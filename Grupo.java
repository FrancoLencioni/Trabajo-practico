import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grupo extends EtapaMundial{
      public List<Equipo> getEquiposQueAvanzan(){
          Map<Equipo,Integer> equiposPuntaje=new HashMap<>();
          this.partidos.forEach(partido -> {
              Resultado resultado = partido.getResultado();
              if(resultado.ganoLocal()){

                  equiposPuntaje.put(partido.getLocal(),equiposPuntaje.getOrDefault(partido.getLocal(),0)+3);
              }
              else if (resultado.empate()){
                  equiposPuntaje.put(partido.getLocal(),equiposPuntaje.getOrDefault(partido.getLocal(),0)+1);
                  equiposPuntaje.put(partido.getVisitante(),equiposPuntaje.getOrDefault(partido.getVisitante(),0)+1);
              }
              else {
                  equiposPuntaje.put(partido.getVisitante(),equiposPuntaje.getOrDefault(partido.getVisitante(),0)+3);
              }
          });
          List<Equipo> equipos = equiposPuntaje.entrySet().stream().sorted(Map.Entry.<Equipo, Integer>comparingByValue().reversed())
                  .limit(2).map(Map.Entry::getKey).collect(Collectors.toList());
          return equipos;
      }
}
