import model.Libro;

public class Biblioteca {

    // Atributos de la clase
    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono; // No pongo int o double si no voy a hacer operaciones matematicas con variable

   // Atributos de la clase (Coleccion de libros)
   private Libro []  libros;
   private int nLibrosActuales;
   private final int dimensionInicial = 100;

   // Constructor

   public Biblioteca(String codigo, String nombre, String direccion, String email, String nTelefono){
       this.codigo = codigo;
       this.nombre = nombre;
       this.direccion = direccion;
       this.email = email;
       this.nTelefono = nTelefono;

       this.libros= new Libro[this.dimensionInicial];
       this.nLibrosActuales = 0;

   }

   // Getters y Setters


    public String getCodigo() {
        return this.codigo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public String getnTelefono() {
        return this.nTelefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public int getnLibrosActuales() {
        return nLibrosActuales;
    }

    // Insertar libros en la biblioteca
    public boolean insertarLibro (Libro libro){
       boolean resultado = false;

       // Comprobacion si es distinto de null para evitar excepcion NullPointer, en caso contrario de
        if (libro != null) {

            if (this.nLibrosActuales < this.libros.length) {
                // Aqui digo que a la posicion esa de array tengo que asignar el libro que he creado.
                this.libros[this.nLibrosActuales] = libro;
                this.nLibrosActuales++;
                resultado = true;
            }
            else {
                // No hay espacio en el array para insertar
                // Ampliar dimension del array.

                this.ampliarDimensionBiblioteca();
                this.libros[this.nLibrosActuales] = libro;
                this.nLibrosActuales++;
                resultado = true;
            }
        }


       return resultado;
    }


    // Eliminar libros



    // Buscar libro por ISBN



    // Mostrar informacion de la biblioteca
    public String infoBiblio (){
       String infoBiblio = "";

        infoBiblio += "Codigo: " + this.codigo + "\n";
        infoBiblio += "Nombre: " + this.nombre + "\n";
        infoBiblio += "Direccion: " + this.direccion + "\n";
        infoBiblio += "Email: " + this.email + "\n";
        infoBiblio += "Nº Telefono: " + this.nTelefono + "\n";
        infoBiblio += "Nº de libros actuales: " + this.nLibrosActuales + "\n";

       return infoBiblio;
    }


    // Mostrar informacion de todos los libros almacenados


    // Ampliar dimension del array

    private void ampliarDimensionBiblioteca (){
       Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for (int i = 0; i <this.libros.length ; i++) {

            librosAux [i] = this.libros[i];
        }
       this.libros = librosAux;
    }
}
