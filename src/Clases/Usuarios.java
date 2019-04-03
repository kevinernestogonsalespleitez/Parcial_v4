package Clases;

import java.io.*;

public class Usuarios {
    String UserName,Password;
    public Usuarios(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }
    public int Validacion(){
        String Obtencion_User = "";
        String Obtencion_Pass = "";
        int i = 0;
        try{
            FileReader us = new FileReader("User.txt");
            BufferedReader br = new BufferedReader(us);
            Obtencion_User = br.readLine();
            
        }
        catch(Exception e){
        
        }
        try{
            FileReader pass = new FileReader("Pass.txt");
            BufferedReader bf = new BufferedReader(pass);
            Obtencion_Pass = bf.readLine();
            
        }
        catch(Exception e){
        
        }
        if(Obtencion_User.equals(this.UserName) && Obtencion_Pass.equals(this.Password)){
            i=1;
        }
        return i;
    }
    
}
