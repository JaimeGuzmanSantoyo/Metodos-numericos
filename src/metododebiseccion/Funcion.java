package metododebiseccion;

import org.nfunk.jep.JEP;
 
/**
 *
 * @author Adrian
 */
public class Funcion {
    
    private String expresion = "";
    
    
    public Funcion(String expresion){
        this.expresion = expresion;
    }
    
    public double evaluar(double x){  
       JEP j = new JEP(); 
       j.addStandardFunctions();
       j.addStandardConstants();
       j.addVariable("x", x);
       j.parseExpression(this.expresion);
       
        if (!j.hasError()) {
            return j.getValue();
        } else {
            return Double.NaN;
        }           
    }
    
}
