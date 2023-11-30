package ig;


import java.sql.*;
public class Connecteur {
    Connection con;
    
    
    
        public Connecteur (){  

                try{
                    //driver mta3na
                    Class.forName("com.mysql.jdbc.Driver");  
                    //url fiih el base de donnes w user w password
                    String url ="jdbc:mysql://localhost:3306/golf";
                    String user="root";
                    String password="aaabbb75";
                    con=DriverManager.getConnection(url,user,password);
                    System.out.println("CONNEXION DISPONIBLE");
                }
                catch(ClassNotFoundException | SQLException e){
                System.out.println("PAS DE CONNEXION");
                
                }
        }       

        public Connection connecttodb(){
                       return con; 
        }
 }    

