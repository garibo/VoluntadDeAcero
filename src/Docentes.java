import java.sql.*;

public class Docentes {
    
    String driver = "org.postgresql.Driver";
    String conec = "jdbc:postgresql://localhost:5432/colegiobd";
    private boolean existe;
    public void Docentes()
    {
        
    }
    
    public void insertarDocente(String cam1,
            String cam2,
            String cam3,
            String cam4,
            String cam5,
            String cam6,
            String cam7,
            String cam8,
            String cam9,
            String cam10,
            String cam11,
            String cam12,
            String cam13,
            String cam14,
            String cam15,
            String cam16,
            String cam17,
            String cam18,
            String cam19)
    {
        
        
        try{
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("insert into docente values("
                        +"'"+cam1+"',"+
                        "'"+cam2+"',"+
                        "'"+cam3+"',"+
                        "'"+cam4+"',"+
                        "'"+cam5+"',"+
                        "'"+cam6+"',"+
                        "'"+cam7+"',"+
                        "'"+cam8+"',"+
                        "'"+cam9+"',"+
                        ""+Integer.parseInt(cam10)+","+
                        "'"+cam11+"',"+
                        "'"+cam12+"',"+
                        ""+Integer.parseInt(cam13)+","+
                        ""+Integer.parseInt(cam14)+","+
                        ""+Integer.parseInt(cam15)+","+
                        "'"+cam16+"',"+
                        "'"+cam17+"',"+
                        "'"+cam18+"',"+
                        "'"+cam19+"'"+
                        ");");
                
                String variable;
                while(rs.next())
                {
                    variable = rs.getString("");
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
    
    public void eliminar(String id)
      {
          String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("delete from docente where id_docente='"+id+"'");
                
                
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
    
    public boolean existe(String id)
    {
         try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_docente from docente where id_docente = '"+id+"'  ");
                
                String variable = "";
                while(rs.next())
                {
                    variable = rs.getString("id_docente");
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
    
     public String getNombre(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select nombre_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("nombre_docente");
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
    
     
     public String getApellidoP(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select apellido_paterno_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_paterno_docente");
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
     
     public String getApellidoM(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select apellido_materno_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_materno_docente");
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
     
     public String getGrado(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select grado_estudios_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("grado_estudios_docente");
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
     
     public String getFechaNacimiento(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select fecha_de_nacimiento_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("fecha_de_nacimiento_docente");
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
     
     public String getFechaAlta(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select fecha_de_alta_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("fecha_de_alta_docente");
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
     
     public String getEstado(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select estado_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("estado_docente");
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
     
     public String getCiudad(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select ciudad_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("ciudad_docente");
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
     
     public int getCP(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select codigo_postal_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("codigo_postal_docente");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return Integer.parseInt(variable);
    }
     
     public String getColonia(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select colonia_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("colonia_docente");
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
     
     public String getCalle(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select calle_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("calle_docente");
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
     
     public int getManzana(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select manzana_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("manzana_docente");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return Integer.parseInt(variable);
    }
     
     public int getLote(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select lote_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("lote_docente");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return Integer.parseInt(variable);
    }
     
     public int getNumero(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select numero_de_casa_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("numero_de_casa_docente");
                   // System.out.println("El nombre del usuario es: "+variable);
                }
                
              
                
                st.close();
                con.close();
        
        }
        catch( Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        return Integer.parseInt(variable);
    }
     
     public  String getTelefono1(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select telefono_1_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("telefono_1_docente");
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
     
     public  String getTelefono2(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select telefono_2_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("telefono_2_docente");
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
     
     public  String getSangre(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select tipo_de_sange_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("tipo_de_sange_docente");
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
     
     public  String getSexo(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select sexo_docente from docente where id_docente = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("sexo_docente");
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
     
     public void setUpdate(String id,
             String nombre,
             String apellidoP,
             String apellidoM,
             String fechaNacimiento,
             String fechaAlta,
             String estado,
             String ciudad,
             int CP,
             String colonia,
             String calle,
             int manzana,
             int lote,
             int numero,
             String telefono1,
             String telefono2,
             String sangre,
             String sexo,
             String grado)
     {
          String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("update docente set "
                        +"nombre_docente = '"+nombre+"',"
                        +"apellido_paterno_docente = '"+apellidoP+"',"
                        +"apellido_materno_docente = '"+apellidoM+"',"
                        +"fecha_de_nacimiento_docente = '"+fechaNacimiento+"',"
                        +"fecha_de_alta_docente = '"+fechaAlta+"',"
                        +"estado_docente = '"+estado+"',"
                        +"ciudad_docente = '"+ciudad+"',"
                        +"codigo_postal_docente = "+CP+","
                        +"colonia_docente = '"+colonia+"',"
                        +"calle_docente = '"+calle+"',"
                        +"manzana_docente = "+manzana+","
                        +"lote_docente = "+lote+","
                        +"numero_de_casa_docente = "+numero+","
                        +"telefono_1_docente = '"+telefono1+"',"
                        +"telefono_2_docente = '"+telefono2+"',"
                        +"tipo_de_sange_docente = '"+sangre+"',"
                        +"sexo_docente = '"+sexo+"',"
                        +"grado_estudios_docente = '"+grado+"'"
                        +"where id_docente = '"+id+"';");
                        
                
                
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
