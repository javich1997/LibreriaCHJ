
package libreria;
/**
 * Clase principal del programa en la que se simula las acciones de compra, consulta de stock
 * y recarga de fondos para realizar la compra de un libro en una librería
 * @author JAVI
 */
public class Main {
  /**
   * Método Main
   * 
   * Método principal de ejecución del programa
   *  
   */
    public static void main(String[] args) {
       
        // Declaración de variables necesarias
        LibreriaCrespoHerrerosJavier2425T4 miLibreriaCrespoHerrerosJavier2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        // Instanciamos un objeto de la clase LibreriaCrespoHerrerosJavier2425T4
        miLibreriaCrespoHerrerosJavier2425T4 = new LibreriaCrespoHerrerosJavier2425T4("Don Quijote de la Mancha", 10, 45, 120);
        
        // Simulamos la compra del libro "Don quijote de la Mancha"
        compraQuijoteCrespoHerrerosJavier2425T4(miLibreriaCrespoHerrerosJavier2425T4);
        
        // Mostramos el saldo actual tras comprar el libro, empleando para ello el método "obtenerSaldo()"
        saldoActual = miLibreriaCrespoHerrerosJavier2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );   
        
        // Consultamos el nombre del libro y el stock actual empleando para ello los métodos "obtenerNombre()" y "obtenerStock()" respectivamente
        x = miLibreriaCrespoHerrerosJavier2425T4.obtenerNombre();
        stock = miLibreriaCrespoHerrerosJavier2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        // Mediante el método "añadeIngresoCrespoHerrerosJavier2425T4" añadimos ingresos de dinero en la librería
        añadeIngresoCrespoHerrerosJavier2425T4(miLibreriaCrespoHerrerosJavier2425T4, "");
    }
    
    /**
     * Método que simula un ingreso de dinero en la librería.
     * Este método, mediante la estructura try-catch, aumenta el saldo de la librería por una cantidad especificada que sea válida y muestra por pantalla el saldo total disponible,
     * de lo contrario, si el valor de la cantidad a introducir no es válida se ejecutará el mensaje de error (catch)
     * 
     * @param miLibreriaCrespoHerrerosJavier2425T4 La instancia de la librería.
     * @param concepto El concepto o descripción del ingreso (en este caso será el valor por defecto).
     */
    public static void añadeIngresoCrespoHerrerosJavier2425T4(LibreriaCrespoHerrerosJavier2425T4 miLibreriaCrespoHerrerosJavier2425T4, String concepto) {
       
        // Declaramos las variables necesarias
        double ingreso;
        double saldoActual;
        try
        {
            //Ingreso que se va a realizar en el saldo de la librería
            ingreso = 30.5; 
            
            // Aumentamoos el saldo por el valor del parámetro saldomas, que en este caso es el valor almacenado en la variable "ingreso"
            miLibreriaCrespoHerrerosJavier2425T4.aumentarSaldo(ingreso);
            
            // Almacenamos en la variable saldoActual el valor del saldo total actual
            saldoActual = miLibreriaCrespoHerrerosJavier2425T4.obtenerSaldo();
            
            // Mostramos por pantalla el saldo total después del ingreso realizado
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            // En caso de que la cantidad introducida no sea válida se obtendrá el emnsaje de error
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
 /**
     * Método que simula la compra de un libro.
     * Este método realiza la compra de una cantidad específica de un libro,
     * descontando el saldo correspondiente y actualizando el stock.
     * 
     * @param miLibreriaCrespoHerrerosJavier2425T4 La instancia de la librería.
     */
    public static void compraQuijoteCrespoHerrerosJavier2425T4(LibreriaCrespoHerrerosJavier2425T4 miLibreriaCrespoHerrerosJavier2425T4) {
       
        // Declaramos las variables necesarias
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            // Título del libro a comprar
            x = "Don Quijote de la Mancha";
            
            //Número de ejemplares a comprar
            num = 2;    
            
            // Almacenamos en la variable "dinero" el precio del libro
            dinero = miLibreriaCrespoHerrerosJavier2425T4.obtenerPrecio();
            
            // Almacenamos en la variable "saldoActual" el saldo total disponible
            saldoActual = miLibreriaCrespoHerrerosJavier2425T4.obtenerSaldo();
            
            // Mostramos por pantalla el libro y su precio, así como el saldo actual del que se dispone
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            
            // Ejecutamos el método que permite comprar el libro con la cantidad de ejemplares a comprar (parámetro "num")
            miLibreriaCrespoHerrerosJavier2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            // En caso de que el el valor de libros a comprar o el saldo actual no sea el suficiente se ejecutará el mensaje de error
            System.out.println("Error en la compra del libro");
        }
    }
}
