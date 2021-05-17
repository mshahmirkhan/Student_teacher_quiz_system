
package firsttest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
  
import java.lang.reflect.Field;
/**
 *
 * @author shahmirkhan
 */


class Login{
            String name ;
            String password ;
}

class Question{
    int ID;
    String question;
    String a;
    String b;
    String c;
    String d;
    String answer;
    String catagorie;
    int marks;
}




public class DAO {
    
    Connection conn;      
    void connection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url1 = "jdbc:mysql://localhost:8889/LMSdb";
            String user = "root";
            String password = "root";

            conn = DriverManager.getConnection(url1, user, password);
            
            
        } catch (ClassNotFoundException ex) {
            
        }catch (SQLException ex) {
            
        }
    }
    
    
    
    
    
    
    
    int insert(Login s){
        
        
        try {
            connection();
//            
            String name=s.name;
            String password=s.password;


            Statement smt = conn.createStatement();
            smt.executeUpdate("INSERT INTO `login`(`name`, `password`) VALUES ('"+name+"','"+password+"')");
//            JOptionPane.showMessageDialog(this , "Record Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    
    
    
    
    
    
    
    //Select for varification
    
    
     String selectall(String name,String password){
        ResultSet rs= null;
        String CurrentName=null;
        String CurrentPassword=null;
        String TFName=name;
        String TFPassword=password;
        int c=0;
    try{
            
                connection();

                Statement smt = conn.createStatement();
                rs = smt.executeQuery("SELECT * FROM login");

                while(rs.next()){
                    CurrentName=rs.getString("name");
//                    System.out.println(name);

                    CurrentPassword=rs.getString("password");
//                    System.out.println(password);

                    if(CurrentName.equals(TFName)  && CurrentPassword.equals(TFPassword) ){//
                        
                            System.out.println("Login is varified");
                            Catagories obj= new Catagories(c1,c2,c3,c4,c5);
                            obj.setVisible(true);
                            
                            break;
                    }else{
                        
                    }
                };
                
                
                
    }catch(Exception ex){

     }
    return "" ;
    }
    
        
     
     int CreateTable(String CatagorieName){
         try{
             connection();
             Statement stmt=conn.createStatement();
             stmt.executeUpdate("CREATE TABLE "+CatagorieName+" (\n" +
                                "    ID int,\n" +
                                "    question varchar(255),\n" +
                                "    a varchar(255),\n" +
                                "    b varchar(255),\n" +
                                "    c varchar(255),\n" +
                                "    d varchar(255),\n" +
                                "    catagorie varchar(255),\n" +
                                "    rank int(40),\n" +
                                "    answer varchar(255)\n" +
                                ");");
             System.out.println("Table created");
         }
         catch(Exception ex){
             System.out.println("Error in creating table");
             System.out.println(ex);
             }
    return 0;
     }
     
     
     
     int InsertQuestion(Question s){
         try{
             connection();
             
             Statement smt = conn.createStatement();
            smt.executeUpdate("INSERT INTO "+s.catagorie +"(`ID`, `question`, `a`, `b`, `c`, `d`, `catagorie`, `rank`, `answer`) VALUES ('"+s.ID+"','"+s.question+"','"+s.a+"','"+s.b+"','"+s.c+"','"+s.d+"','"+s.catagorie+"','"+s.marks+"','"+s.answer+"')");
             
             
             
             System.out.println("question inserted successfully");
         }catch(Exception ex){
             System.out.println(ex);
         }
         return 0;
     }
     
     
     
     
     
     
     
     
     
     
     int UpdateQuestion(Question s){
         try{
             connection();
             
             Statement smt = conn.createStatement();
            smt.executeUpdate("UPDATE "+s.catagorie+" SET `question`='"+s.question+"',`a`='"+s.a+"',`b`='"+s.b+"',`c`='"+s.c+"',`d`='"+s.d+"',`catagorie`='"+s.catagorie+"',`rank`='"+s.marks+"',`answer`='"+s.answer+"' WHERE id="+s.ID+"");
                   
             
             System.out.println("question updated successfully");
         }catch(Exception ex){
             System.out.println(ex);
         }
         return 0;
     }
     
     
     
     
     
     int UpdateCatagories(String OldCat,String NewCat){
         try{
             connection();
             
             Statement smt = conn.createStatement();
            smt.executeUpdate("ALTER TABLE "+OldCat+"\n" + "RENAME TO "+NewCat+";");
                    
                    
             
             System.out.println("Table name updated successfully");
         }catch(Exception ex){
             System.out.println(ex);
         }
         return 0;
     }
     
     
     
     
     
     
     
     
     
     
     
     String giveCatagorie(){
        ResultSet rs= null;
        String CurrentName=null;
        String CurrentPassword=null;
//        String TFName=name;
//        String TFPassword=password;
        int c=0;
    try{
            
                connection();

                Statement smt = conn.createStatement();
                rs = smt.executeQuery("SELECT * FROM "+CurrentName);
//                      String c1="Math";
//                      String c2="OOP";
//                      String c3="Science";
//                      String c4="Programming";
//                      String c5="Gernal Knowage";
                while(rs.next()){
                    
//                    System.out.println(name);

//                    System.out.println(password);
                      
                    break;
                }
                            System.out.println("three catagories is selected");
                            Catagories obj= new Catagories(c1,c2,c3,c4,c5);
                            obj.setVisible(true);
//                            break;
//                    }
                
                
       
                
    }catch(Exception ex){

     }
    return "" ;
    }
    
     
     
     
                      String c1="Math";
                      String c2="OOP";
                      String c3="Science";
                      String c4="Programming";
                      String c5="Gernal Knowage";
     
     
     
     
     
     
                      
                      
      
     String[] questionfetch(String CatagoriesName,int id){
//         System.out.println(id);
             
        ResultSet rs= null;
        String[] questionData = new String[7];
//        String CurrentName=null;
//        String CurrentPassword=null;
//        String TFName=name;
//        String TFPassword=password;
//        int c=0;
    try{
            
                connection();

                Statement smt = conn.createStatement();
                rs = smt.executeQuery("SELECT * FROM "+CatagoriesName+" WHERE id="+id+";");

//                while(rs.next()){
                    rs.next();
                    questionData[0]=rs.getString("question");
                    questionData[1]=rs.getString("a");
                    questionData[2]=rs.getString("b");
                    questionData[3]=rs.getString("c");
                    questionData[4]=rs.getString("d");
                    questionData[5]=rs.getString("rank");
                    questionData[6]=rs.getString("answer");
//                            System.out.println(questionData[0]);
//
//                    CurrentPassword=rs.getString("password");
////                    System.out.println(password);

//                    if(CurrentName.equals(TFName)  && CurrentPassword.equals(TFPassword) ){//
//                        
//                            System.out.println("Login is varified");
//                            Catagories obj= new Catagories(c1,c2,c3,c4,c5);
//                            obj.setVisible(true);
//                            
//                            break;
//                    }else{
//                        
//                    }
//                };
                
                
                
    }catch(Exception ex){
        System.out.println(ex);
     }
    
//    }//for
//             System.out.println(questionData);
            return questionData ; 
             
}//QuestionAsk
                    
                      
                      
                     
                      
     
     
     
     
    int id=0;
    int EnterRank(String name, int totalMarks){
        
        
        try {
            connection();
            
            id++;

            Statement smt = conn.createStatement();
            smt.executeUpdate("INSERT INTO `StudentRank`(`name`, `marks`) VALUES ('"+name+"','"+totalMarks+"')");
            System.out.println("Rank and uner name is inserted successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    
    
     
     
    
     ResultSet selectall(){
        ResultSet rs= null;
    try{
            
            connection();
            
        Statement smt = conn.createStatement();
        rs = smt.executeQuery("SELECT * FROM StudentRank ORDER BY marks DESC ");
        
        
        
    }catch(Exception ex){

     }
    return rs;
    }
    
     
     
     
    
}//DAO
