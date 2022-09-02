package metododebiseccion;

import org.nfunk.jep.JEP; //uso de las librerias extra
 

public class Funcion {
    
    private String expresion = ""; //se encarga de almacenar la funcion 
    
    
    public Funcion(String expresion){
        this.expresion = expresion;
    }
    
    public double evaluar(double x){  
       JEP j = new JEP(); 
       j.addStandardFunctions(); //se va encarga de evaluar los valores en x 
       j.addStandardConstants(); 
       j.addVariable("x", x); //se evaluan las variables
       j.parseExpression(this.expresion);
       
        if (!j.hasError()) {
            return j.getValue(); //sino ocurre un error con se retorna el valor para j
        } else {
            return Double.NaN; 
        }           
    }
    
}
