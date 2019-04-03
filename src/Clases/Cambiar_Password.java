package Clases;

import java.io.*;

public class Cambiar_Password {
    String Correo;
    public Cambiar_Password(String Correo) {
       this.Correo = Correo;
    }
    String Password,User;
    public Cambiar_Password(String Correo, String Password) {
        this.User = Correo;
        this.Password = Password;
    }
    public int Correo_c(){
        String Usuario = "";
        int i = 0;
        try{
            FileReader fichero = new FileReader("User.txt");
            BufferedReader br = new BufferedReader(fichero);
            Usuario = br.readLine();
        }
        catch(Exception e){
        }
        if(Usuario.equals(this.Correo)){
        i = 1;
        }
        return i;
        
    }
    public void cambioDePass(){
        String Pass = "";
        try{
            FileReader fichero = new FileReader("Pass.txt");
            BufferedReader br = new BufferedReader(fichero);
            Pass = br.readLine();
        }
        catch(Exception e){
        }
        try{
            FileWriter fichero = new FileWriter("Pass.txt");
            fichero.write(this.Password);
            fichero.close();
        }
        catch(Exception e){
        }
        
        
    }
    
}
