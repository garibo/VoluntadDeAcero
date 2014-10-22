import java.sql.*;
import javax.swing.JOptionPane;


public class Alumnos {
    String driver = "org.postgresql.Driver";
    String conec = "jdbc:postgresql://localhost:5432/colegiobd";
    private boolean existe;
    
    public void Alumnos()
    {
        
    }
    
    public void insertarAlumno(String cam1, 
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
            String cam19,
            String cam20,
            String cam21)
    {
        if(cam12.equals(""))
        {
            cam12 ="0";
        }
        if(cam13.equals(""))
        {
            cam13 ="0";
        }
        
       
         try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("insert into alumno values("
                        +"'"+cam1+"',"+
                        "'"+cam2+"',"+
                        "'"+cam3+"',"+
                        "'"+cam4+"',"+
                        "'"+cam5+"',"+
                        "'"+cam6+"',"+
                        "'"+cam7+"',"+
                        "'"+cam8+"',"+
                        ""+Integer.parseInt(cam9)+","+
                        "'"+cam10+"',"+
                        "'"+cam11+"',"+
                        ""+Integer.parseInt(cam12)+","+
                        ""+Integer.parseInt(cam13)+","+
                        ""+Integer.parseInt(cam14)+","+
                        "'"+cam15+"',"+
                        "'"+cam16+"',"+
                        "'"+cam17+"',"+
                        "'"+cam18+"',"+
                        "'"+Integer.parseInt(cam19)+"',"+
                        "'"+cam20+"',"+
                        "'"+cam21+"'"+
                        ");");
                
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
                ResultSet rs = st.executeQuery("select id_alumno from alumno where id_alumno = '"+id+"'  ");
                
                String variable = "";
                while(rs.next())
                {
                    variable = rs.getString("id_alumno");
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
    {
        String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select nombre_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("nombre_alumno");
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
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select apellido_paterno_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_paterno_alumno");
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
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select apellido_materno_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_materno_alumno");
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
                ResultSet rs = st.executeQuery("select fecha_de_nacimiento_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("fecha_de_nacimiento_alumno");
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
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select fecha_de_alta_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("fecha_de_alta_alumno");
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
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select estado_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("estado_alumno");
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
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select ciudad_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("ciudad_alumno");
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
                ResultSet rs = st.executeQuery("select codigo_postal_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("codigo_postal_alumno");
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
                ResultSet rs = st.executeQuery("select colonia_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("colonia_alumno");
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
                ResultSet rs = st.executeQuery("select calle_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("calle_alumno");
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
                ResultSet rs = st.executeQuery("select manzana_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("manzana_alumno");
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
                ResultSet rs = st.executeQuery("select lote_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("lote_alumno");
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
                ResultSet rs = st.executeQuery("select numero_de_casa_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("numero_de_casa_alumno");
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
    
    public String getTelefono1(String id)
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select telefono_1_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("telefono_1_alumno");
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
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select telefono_2_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("telefono_2_alumno");
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
     
    public String getSangre(String id)
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select tipo_de_sange_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("tipo_de_sange_alumno");
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
    
    public String getSexo(String id)
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select sexo_alumno from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("sexo_alumno");
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
    
    public int getSemestre(String id)
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select semestre from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("semestre");
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
    
    public String getIdGrupo(String id)
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_grupo_fk from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("id_grupo_fk");
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
    
    public String getIdTutor(String id)
    {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select id_tutor_fk from alumno where id_alumno = '"+id+"'  ");
                
                
                while(rs.next())
                {
                    variable = rs.getString("id_tutor_fk");
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
    
    
       
    public void eliminar(String id)
      {
       String variable = "";
       try{
            
        
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("delete from alumno where id_alumno='"+id+"'");
                
                
                while(rs.next())
                {
                    variable = rs.getString("apellido_materno_alumno");
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
            int semestre,
            String idGrupo,
            String idTutor)
    {
         String variable = "";
       try{
            
        
        Class.forName(driver);
                Connection con = DriverManager.getConnection(conec,"postgres","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("update alumno set "
                        +"nombre_alumno = '"+nombre+"',"
                        +"apellido_paterno_alumno = '"+apellidoP+"',"
                        +"apellido_materno_alumno = '"+apellidoM+"',"
                        +"fecha_de_nacimiento_alumno = '"+fechaNacimiento+"',"
                        +"fecha_de_alta_alumno = '"+fechaAlta+"',"
                        +"estado_alumno = '"+estado+"',"
                        +"ciudad_alumno = '"+ciudad+"',"
                        +"codigo_postal_alumno = "+CP+","
                        +"colonia_alumno = '"+colonia+"',"
                        +"calle_alumno = '"+calle+"',"
                        +"manzana_alumno = "+manzana+","
                        +"lote_alumno = "+lote+","
                        +"numero_de_casa_alumno = "+numero+","
                        +"telefono_1_alumno = '"+telefono1+"',"
                        +"telefono_2_alumno = '"+telefono2+"',"
                        +"tipo_de_sange_alumno = '"+sangre+"',"
                        +"sexo_alumno = '"+sexo+"',"
                        +"semestre = "+semestre+","
                        +"id_grupo_fk = '"+idGrupo+"',"
                        +"id_tutor_fk = '"+idTutor+"'"
                        +"where id_alumno = '"+id+"'");
                
                
                
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

    
