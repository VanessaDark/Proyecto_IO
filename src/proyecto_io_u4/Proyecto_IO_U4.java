/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_io_u4;

/**
 *
 * @author Britany Morales
 */
public class Proyecto_IO_U4 {
    
    public static void porcentaje(){
        
        Bienvenida bv =new Bienvenida();
        bv.setVisible(true);
        INDEX id=new INDEX();
        try{
        for(int i=0; i<=100; i++){
            Thread.sleep(60);
            bv.Porcentaje.setText(Integer.toString(i)+"%");
            bv.Barra.setValue(i);
            
            if(i==100){
                bv.setVisible(false);
                id.setVisible(true);
                
            }
            
        }
    }catch(Exception e){
        
    }
        
    }//Fin metodo porcentaje
            
    
    
    
    
    
    
     public static void main(String[] args) {
      porcentaje();
    }
    
}
