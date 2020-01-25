package manage;

import datos.Movimientos;
import dominio.Repuesto;
import java.util.List;

public class ManejoRepuestos {
    
    public static void main(String[] args) { 
        
        Movimientos Movimientos = new Movimientos();
        List<Repuesto> repuestos = Movimientos.select();
        
        for(Repuesto repuesto: repuestos){
            System.out.println("repuesto:" + repuestos);
        }
    }
}
