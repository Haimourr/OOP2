/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ammar
 */
public class SingletonTest {
    
    private static SingletonTest instance;
    
    
    private SingletonTest( ){
        System.out.println("new obj has been created ");
    }
    
    public static SingletonTest getInstance(){
        
        if(instance==null){
            instance=new SingletonTest();
            
        }
        return instance;
    }
    
    public void hello ( ){
        System.out.println("hello from singleton");
    }
    
}
