package proyectocalculadora;

import javax.swing.JOptionPane;

// Clase principal del programa
public class Main {
    public static void main(String[] args) {
          
         String num1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
         //saco el cuadro de mensaje con entrada para recolectra el dato
             
         int numero1 = Integer.parseInt(num1); 
         //lo que hago aqui es convertir el dato que se ingreso de string a int y lo almaceno
            
         String num2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
             
         int numero2 = Integer.parseInt(num2);
         //aqui realizo lo mismo pero con el segundo dato
         
         //llevo los datos que se ingresaron a la clase operations para que se realize la operacion
         Operations operacion = new Operations(numero1, numero2);
          
         /*operacion.sumar();
         int resul = operacion.getResult();
         JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resul);
         */ 
         
         operacion.sumar(); //llamo el metodo sumar 
         int rsuma = operacion.getResult(); //el valor que le dio sumar a result se lo doy a la variable rsuma
         JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + rsuma);
         
         operacion.restar(); 
         int rresta = operacion.getResult(); 
         JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + rresta);
         
         operacion.multiplicar(); 
         int rmultiplicar = operacion.getResult(); 
         JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + rmultiplicar);

        }        
    }
