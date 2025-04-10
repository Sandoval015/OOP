public class Operations {
    private Data data; // Instancia de Data

    public Operations() {
        data = new Data(); // Inicializo Data
    }

    // Métodos para las operaciones
    public void sumar(int a, int b) {
        data.setResultado(a + b); // Uso Data para almacenar el resultado
    }

    public void restar(int a, int b) {
        data.setResultado(a - b);//igual aqui 
    }

    public void multiplicar(int a, int b) {
        data.setResultado(a * b);
    }
//esta parte me presenta problemas, no se como reparlo.
   // public void potencia(int base, int exponente) {
       // data.setResultado((exponente == 0 ? 1 : base * potencia(base, exponente - 1));
   // }

    // aqui lo que hago es retornar el resultado
    public int getResultado() {
        return data.getResultado();
    }
}
