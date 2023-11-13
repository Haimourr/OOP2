/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ammar
 */
public class Student {
        private int id;
    private String  name;
    private double gpa;
    private String email;
    
    public Student(int id, String name, double gpa) {
        
         setId(id);
         setName(name);
         setGpa(gpa);
    }
     public Student( ){
         
     }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Student WithId(int id ){
        setId(id);
        return this;
    
    }
    
    public Student WithName(String name ){
        
        setName(name);
        return this;
    }
    
    public Student WithGpa(double gpa ){
        
        setGpa(gpa);
        return this;
     
    }
    
    public Student WithEmail(String email ){
        
        setEmail(email);
        return this;
    }
    
    
    
    
}
