
package libreria;

/**
 * Clase que representa una librería, donde se pueden gestionar libros, 
 * realizar compras y gestionar el saldo disponible.
 * 
 * La librería tiene un libro con nombre, cantidad en stock, precio y un saldo 
 * que se puede actualizar con ingresos o compras.
 * 
 * @author JAVI
 */
public class LibreriaCrespoHerrerosJavier2425T4 {
    private String nom;   
    private int cantidad; 
    private double precio;
    private double saldo;
    
    //Constructor sin argumentos
    public LibreriaCrespoHerrerosJavier2425T4(){}
    
     /**
     * Constructor con parámetros para inicializar todas las propiedades de la librería (clase).
     * 
     * @param nom Nombre del libro.
     * @param cantidad Cantidad de ejemplares disponibles en stock.
     * @param precio Precio unitario del libro.
     * @param saldo Saldo disponible en la cuenta de la librería.
     */
    public LibreriaCrespoHerrerosJavier2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    
     /**
     * Método que devuelve el nombre del libro.
     * 
     * @return El nombre del libro.
     */
    public String obtenerNombre(){
        return getNom();
    }
    
    /**
     * Método que devuelve el precio del libro.
     * 
     * @return El precio del libro.
     */
    public double obtenerPrecio(){
        return getPrecio();
    }
    
    /**
     * Método que devuelve la cantidad de libros disponibles en stock (disponibles para vender).
     * 
     * @return La cantidad de libros disponibles.
     */
    public int obtenerStock(){
        return getCantidad();
    }
    
    /**
     * Método que devuelve el saldo disponible en la cuenta de la librería.
     * 
     * @return El saldo actual en la cuenta de la librería.
     */
    public double obtenerSaldo(){
        return getSaldo();
    }
    
    /**
     * Método para aumentar el saldo disponible en la cuenta de la librería.
     * 
     * @param saldomas Cantidad de dinero a ingresar en el saldo de la librería.
     * @throws Exception Si la cantidad a ingresar es menor o igual a cero, se lanza una excepción.
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(getSaldo() + saldomas);
    }
    
    /**
     * Método para comprar un libro de la librería, actualizando el stock y el saldo de la librería.
     * 
     * @param canti Cantidad de ejemplares a comprar.
     * @throws Exception Si hay un error con la cantidad de libros, el saldo o el stock.
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (getCantidad()>=canti){
            if (getSaldo() <= getPrecio())
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }

   // Métodos getter y setter

    /**
     * Obtiene el nombre del libro.
     * 
     * @return El nombre del libro.
     */
    public String getNom() {
        return nom;
    }

     /**
     * Establece el nombre del libro.
     * 
     * @param nom El nombre del libro.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

   /**
     * Obtiene la cantidad de libros disponibles en stock.
     * 
     * @return La cantidad de libros disponibles.
     */
    public int getCantidad() {
        return cantidad;
    }

     /**
     * Establece la cantidad de libros disponibles en stock.
     * 
     * @param cantidad La cantidad de libros disponibles.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  
    /**
     * Obtiene el precio unitario del libro.
     * 
     * @return El precio del libro.
     */
    public double getPrecio() {
        return precio;
    }

   /**
     * Establece el precio unitario del libro.
     * 
     * @param precio El precio del libro.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el saldo disponible en la cuenta de la librería.
     * 
     * @return El saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

   
    /**
     * Establece el saldo disponible en la cuenta de la librería.
     * 
     * @param saldo El saldo disponible.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
