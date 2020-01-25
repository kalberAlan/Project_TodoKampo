package dominio;

public class Repuesto {
    
    private int id_Repuestos;
    private String NroPlano;
    private String Denominacion;
    private float PrecioNeto;
    private float PrecioVenta;

    public int getId_Repuestos() {
        return id_Repuestos;
    }

    public void setId_Repuestos(int id_Repuestos) {
        this.id_Repuestos = id_Repuestos;
    }
    
    public String getNroPlano(){
        return NroPlano;
    }
    public void setNroPlano(String NroPlano) {
        this.NroPlano = NroPlano;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denomincaion) {
        this.Denominacion = Denominacion;
    }

    public float getPrecioNeto() {
        return PrecioNeto;
    }

    public void setPrecioNeto(float PrecioNeto) {
        this.PrecioNeto = PrecioNeto;
    }

    public float getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(float PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    @Override
    public String toString() {
        return "Repuesto{" + "id_Repuestos=" + id_Repuestos +", NroPlano=" + NroPlano + ", Denominacion=" + Denominacion + ", PrecioNeto=" + PrecioNeto + ", PrecioVenta=" + PrecioVenta + '}';
    }

   
}