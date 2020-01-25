package datos;

import dominio.Repuesto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Movimientos {
    private static final String SQL_SELECT = "SELECT id_Repuesto,NroPlano, Denominacio, PrecioNeto, PrecioVenta FROM Repuesto";
    private static final String SQL_INSERT = "INSERT INTO persona(NroPlano,Denominacion, PrecioNeto, PrecioVenta) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET NroPlano=?, Denominacion=?, PrecioNeto=?, PrecioVenta=? WHERE id_Repuesto = ?";
    private static final String SQL_DELETE = "DELETE FROM Repuesto WHERE id_Repuesto=?";
    
    public List<Repuesto> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Repuesto repuesto = null;
        List<Repuesto> repuestos = new ArrayList<Repuesto>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_Repuesto = rs.getInt("id_Repuesto");
                String NroPlano = rs.getString("NroPlano");
                String Denominacion = rs.getString("Denominacion");
                float PrecioNeto = rs.getFloat("PrecioNeto");
                float PrecioVenta = rs.getFloat("PrecioVenta");
                
                repuesto = new Repuesto();
                repuesto.setId_Repuestos(id_Repuesto);
                repuesto.setNroPlano(NroPlano);
                repuesto.setDenominacion(Denominacion);
                repuesto.setPrecioNeto(PrecioNeto);
                repuesto.setPrecioVenta(PrecioVenta);
                
                repuestos.add(repuesto);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return repuestos;
    }
}
