import java.sql.*;

public class Reportes {
    
    String driver = "org.postgresql.Driver";
    String conec = "jdbc:postgresql://localhost:5432/colegiobd";
     private boolean existe;
        
    public void Reportes()
    {
        
    }
    
    public void insertarReporte(String cam1, String cam2, String cam3, String cam4, String cam5)
    {
        
        
        try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("insert into reportes values("
                        +"'"+cam1+"',"+
                        "'"+cam2+"',"+
                        "'"+cam3+"',"+
                        "'"+cam4+"',"+
                        "'"+cam5+"'"+");");
                
                String variable;
                while(rs.next())
                {
                    variable = rs.getString("");
                   // System.out.println("El nombre del usuario es: "+variable);
                    System.out.println(variable);
                }
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean existe(String id)
    {
         try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_reporte from reportes where id_reporte = '"+id+"'  ");
                
                String variable = "";
                while(rs.next())
                {
                    variable = rs.getString("id_reporte");
                    //System.out.println("El nombre del usuario es: "+variable);
                }
                
                if(variable.equals(id))
                {
                   // System.out.println("El numero de control existe");
                    existe=true;
                    
                }
                else{
                  //  System.out.println("El numero de control no existe");
                    existe=false;
                    
                }
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return existe;
    }
    
    public String getCausa(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select causa_reporte from reportes where id_reporte = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("causa_reporte");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return variable;
    }    
    
    public String getFecha(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select fecha_reporte from reportes where id_reporte = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("fecha_reporte");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return variable;
    }
    
    public String getIdAlumno(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_alumno_fk from reportes where id_reporte = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("id_alumno_fk");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return variable;
    }
    
    public String getIdAsesor(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_asesor_fk from reportes where id_reporte = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("id_asesor_fk");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return variable;
    }
    
    public void setUpdate(String id,String causa, String fecha,String id_alumno,String id_asesor)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("update reportes set"
                        +" causa_reporte = '"+causa+"',"
                        +" fecha_reporte = '"+fecha+"',"
                        +" id_alumno_fk = '"+id_alumno+"',"
                        +" id_asesor_fk = '"+id_asesor+"'"
                        +"where id_reporte like '"+id+"';");
                
                
                while(rs.next())
                {
                    variable = rs.getString("");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    
    public void eliminar(String id)
      {
          String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("delete from reportes where id_reporte ='"+id+"'");
                
                
                while(rs.next())
                {
                    variable = rs.getString("");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
                
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
      }
    
    
}
