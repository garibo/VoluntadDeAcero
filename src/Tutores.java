import java.sql.*;


public class Tutores {
    
    String driver = "org.postgresql.Driver";
    String conec = "jdbc:postgresql://localhost:5432/colegiobd";
    private boolean existe;
    public void Tutore()
    {
        
    }
    
    public void insertarTutor(String cam1,
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
            String cam15)
    {
        try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("insert into tutor values("
                        +"'"+cam1+"',"
                        +"'"+cam2+"',"
                        +"'"+cam3+"',"
                        +"'"+cam4+"',"
                        +"'"+cam5+"',"
                        +"'"+cam6+"',"
                        +"'"+cam7+"',"
                        +""+Integer.parseInt(cam8)+","
                        +""+Integer.parseInt(cam9)+","
                        +""+Integer.parseInt(cam10)+","
                        +"'"+cam11+"',"
                        +"'"+cam12+"',"
                        +"'"+cam13+"',"
                        +"'"+cam14+"',"
                        +"'"+cam15+"'"
                        + ");");
                
               
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
                ResultSet rs = st.executeQuery("delete from tutor where id_tutor='"+id+"'");
                
                
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
                ResultSet rs = st.executeQuery("select id_tutor from tutor where id_tutor = '"+id+"'  ");
                
                String variable = "";
                while(rs.next())
                {
                    variable = rs.getString("id_tutor");
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
                ResultSet rs = st.executeQuery("select nombre_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("nombre_tutor");
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
                ResultSet rs = st.executeQuery("select apellido_paterno_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_paterno_tutor");
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
                ResultSet rs = st.executeQuery("select apellido_materno_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_materno_tutor");
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
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select fecha_nacimiento_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("fecha_nacimiento_tutor");
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
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select calle_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("calle_tutor");
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
    
    public String getColonia(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select colonia_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("colonia_tutor");
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
                ResultSet rs = st.executeQuery("select manzana_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("manzana_tutor");
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
                ResultSet rs = st.executeQuery("select lote_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("lote_tutor");
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
                ResultSet rs = st.executeQuery("select numero_de_casa_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("numero_de_casa_tutor");
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
    
    
    public String getSexo(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select sexo_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("sexo_tutor");
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
    
    public String getTelefono1(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select telefono_1_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("telefono_1_tutor");
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
    
    public String getTelefono2(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select telefono_2_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("telefono_2_tutor");
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
    
    public String getOcupacion(String id)
    {String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select ocupacion_tutor from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("ocupacion_tutor");
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
    
    public String getIdEmpresa(String id)
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_empresa_fk from tutor where id_tutor = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("id_empresa_fk");
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
            String calle,
            String colonia,
            int manzana,
            int lote,
            int numero,
            String telefono1,
            String telefono2,
            String sexo,
            String ocupacion,
            String idEmpresa)
    {
          String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("update tutor set "
                            +"nombre_tutor = '"+nombre+"',"
                            +"apellido_paterno_tutor = '"+apellidoP+"',"
                            +"apellido_materno_tutor = '"+apellidoM+"',"
                            +"fecha_nacimiento_tutor = '"+fechaNacimiento+"',"
                            +"calle_tutor = '"+calle+"',"
                            +"colonia_tutor = '"+colonia+"',"
                            +"manzana_tutor = "+manzana+","
                            +"lote_tutor = "+lote+","
                            +"numero_de_casa_tutor = "+numero+","
                            +"telefono_1_tutor = '"+telefono1+"',"
                            +"telefono_2_tutor = '"+telefono2+"',"
                            +"sexo_tutor = '"+sexo+"',"
                            +"ocupacion_tutor = '"+ocupacion+"',"
                            +"id_empresa_fk = '"+idEmpresa+"'"
                            +"where id_tutor = '"+id+"';");
                
                
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
