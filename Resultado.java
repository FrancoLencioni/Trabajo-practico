public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    public int getGolesLocal() {
        return golesLocal;
    }
    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean ganoLocal(){
        return golesLocal > golesVisitante;
    }
    public boolean empate(){
        return golesLocal==golesVisitante;
    }

}
