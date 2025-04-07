package com.hangman.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.hangman.wordutils.WordData;


public class DBInitializer {
    private String dbUrl;

    public DBInitializer() {
        this.dbUrl = "jdbc:sqlite:hangman/src/main/java/com/hangman/data/words.db";
    }

    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(dbUrl)) {
            if (conn != null) {
                System.out.println("A new database has been created at: " + dbUrl);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createWordsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS words (\n"
                + " id integer PRIMARY KEY,\n"
                + " word text NOT NULL,\n"
                + " hint text NOT NULL,\n"
                + " difficulty integer NOT NULL\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(dbUrl);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Words table has been created.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertWords(String word, String wordHint, int difficulty) {
        String sql = "INSERT INTO words(word, hint, difficulty) VALUES('" + word + "', '" + wordHint + "', " + difficulty + ");";

        try (Connection conn = DriverManager.getConnection(dbUrl);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println(word + " and its hint (" + wordHint + ") have been inserted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public WordData selectWord(int id) {
        String sql = "SELECT word, hint, difficulty FROM words WHERE id = ?";
        String word;
        WordData wordData = null;
        try (Connection conn = DriverManager.getConnection(dbUrl);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id); 
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                word = rs.getString("word");
                String hint = rs.getString("hint");
                int difficulty = rs.getInt("difficulty");
                wordData = new WordData(word, hint, difficulty); 

                
            } else {
                System.out.println("No record found for id: " + id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return wordData;
        
    }
    
    public int[] maxgetRangeBoundsValue() 
    {
        int[] bounds = new int[2]; // Inicializa o array com 2 elementos
        if (getMax()==-1) 
        {
            System.out.println("ERROR: MAX VALUE CANNOT BE EQUALS TO " + getMax());  
                
        }
        else if (getMin()==-1)
        {
            System.out.println("ERROR: MIN VALUE CANNOT BE EQUALS TO " + getMin());         

        }
        else
        {
            bounds[0] = getMin();
            bounds[1] = getMax();
        }
        
    
        
    
        return bounds;
    }
   
    public int getMin (){
        int min = -1;
        String sqlMin = "SELECT MIN(id) AS min_id FROM words;";
        try (
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement stmt = conn.createStatement();
            ResultSet rsmn = stmt.executeQuery(sqlMin)
            ) 
        {
            
            if (rsmn.next()) {
                min = rsmn.getInt("min_id"); // Nome da coluna deve ser 'min_id'
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return min;

    }
   
    public int getMax(){
        int max = -1;
        String sqlMax = "SELECT MAX(id) AS max_id FROM words;";
        try (
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement stmt = conn.createStatement();
            ResultSet rsmx = stmt.executeQuery(sqlMax)
            ) 
        {
            
            if (rsmx.next()) {
                max = rsmx.getInt("max_id"); 
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return max;

    }

  
    //public static void main(String[] args) {
        //String dbPath = "hangman/src/main/java/com/hangman/database/words.db";

        //DBInitializer dbInitializer = new DBInitializer(dbPath);
        //dbInitializer.createNewDatabase();
        //dbInitializer.createWordsTable();
        //dbInitializer.insertWords("abc", "teste", 01);
   // }
}
