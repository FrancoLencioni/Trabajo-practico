import java.util.List;

public class EtapaMundial {
    private String descripcionEtapa;
    public List<Partido> partidos;

    public EtapaMundial() {
    }
    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }
    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    public List<Partido> getPartidos() {
        return partidos;
    }
}
