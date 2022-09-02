
package metododebiseccion;

public class Metodo {
    
    private Funcion fun;
    double pm;
    int contador;
    
    public Metodo(){}
    
    public Metodo(String expresion){
        fun = new Funcion(expresion);//ahora funcion almacene los valores de funcion
    }
    
    public void setFuncion(String expresion){
        fun = new Funcion(expresion); //con set modifica
    }
    
    public double biseccion(double a, double b, double t){ //en esta parte se encarga de alamacenar a LI,LS,y  delta   
        this.pm = Double.NaN;                              // a = Li y b = LS
        this.contador = 0;
        
        double evaA = this.fun.evaluar(a);
        
        if (!Double.isNaN(evaA)) {
            double evaB = this.fun.evaluar(b);
            
            if(evaA * evaB < 0){
                
                do {    
                    this.pm = (a+b) / 2; //LI +LS /2 //en este caso pm es punto medio
                    this.contador++; //SE INCREMENTA
                    evaA = this.fun.evaluar(a); //se vuelve a evaluar a  y b
                    evaB = this.fun.evaluar(b);
                    
                    if(evaA * this.fun.evaluar(pm) < 0){
                        b = this.pm;// el LS va ser pm
                    }else{
                        a = this.pm; //el LI va ser pm
                    }
                    
                } while (Math.abs(this.fun.evaluar(pm)) > t);// este ciclo se va a repetir si el resultado el mayor que delta 
                
                
            }
            
            if(!Double.isNaN(this.pm)){ // si se genera otro valor ,significa que se a encontrado a la raiz
                return this.pm;//aqui pm es raiz
            }
                        
        }
        
            return Double.NaN; // en este caso significa que no se encontro ninguna raiz
    }
    
}
