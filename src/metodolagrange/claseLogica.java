/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodolagrange;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class claseLogica {
    private ArrayList<Punto> datos;
    
    claseLogica(ArrayList<Punto> lista){
    this.datos = lista;
    
    }
    
    public String getLagrange(){
        int i,j,p,apuntador;
         p=0;
         apuntador=0;
        String lag="";
        String polinomio="";
        for (i = 0; i<this.datos.size();i++){
            
            lag ="";
            for( j = 0;j<this.datos.size();j++){
                if(j!=i){
                 
                  p=j-1;
                  
                    apuntador=apuntador+p;
                    lag = "( x - " + String.valueOf( this.datos.get(apuntador).getX()) + " ) " + "( x - "+ String.valueOf( this.datos.get(j).getX())+" ) /";
                    lag += "(" +String.valueOf( this.datos.get(i).getX()) +" - " + String.valueOf( this.datos.get(apuntador).getX()) +")" +"(" +String.valueOf( this.datos.get(i).getX()) +" - " + String.valueOf( this.datos.get(j).getX()) +")";
                 
                }
              
            }
             
            polinomio +="+" + lag + "*"+ String.valueOf( this.datos.get(i).getY() );
          
        }
        return polinomio;
    }
    
    
    
    
}
