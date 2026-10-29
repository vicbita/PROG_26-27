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

    public boolean eleminarLibro (Libro libro){
       boolean resultado = false;
        if (libro != null) {
            int index = -1; //index para no ser la i, y -1 para que el array nunca va a tener posicion -1

            for (int i = 0; i <this.nLibrosActuales ; i++) {
                if (this.libros[i] != null) { // por si acaso, para que nunca sea null
                    if(this.libros[i].equals(libro.getIsbn())){
                        index = i; //i es la posicion el la que estamos, la guardo
                        break; //se para, para no seguir a buscar, como ya hemos encontrado el libro
                    }

                }
            }

            if (index != -1){
                this.libros[index] = null;
                resultado = true;

                // Recolocar el Array
                for (int i = index; i <this.nLibrosActuales ; i++) {

                    this.libros[i] = this.libros[i+1]; // aqui le digo que empezamos en 4 por ejemplo que hemos eliminado,
                                                        // y vamos recolocando del 5 a 4 del 6 a 5 etc
                }

                this.libros[this.nLibrosActuales-1] = null; //[] lo que esta dentro es la posicion
                this.nLibrosActuales--;

            }
        }

       return resultado;
    }





    // Buscar libro por ISBN
    public Libro getLibroByISBN (String isbn){ //es public Libro porque me devuelve el libro entero

       Libro libro = null; // null porque no se si lo encuentra o no

        if (isbn != null && !isbn.isEmpty()) {// si me lo da vacio

            for (int i = 0; i <this.nLibrosActuales ; i++) { //vamos hasta this.nLibrosActuales para no recorrer el array entero con null
                if (this.libros[i].getIsbn().equals(isbn)) {
                    libro = this.libros[i];

                    return libro;

                }
            }
        }

       return libro;
    }


    // Buscar libro por Titulo (el titulo tiene que ser unico)
    public Libro getLibroByTitulo (String titulo){ //es public Libro porque me devuelve el libro entero

        Libro libro = null; // null porque no se si lo encuentra o no

        if (titulo != null && !titulo.isEmpty()) {// si me lo da vacio

            for (int i = 0; i <this.nLibrosActuales ; i++) { //vamos hasta this.nLibrosActuales para no recorrer el array entero con null
                if (this.libros[i].getIsbn().equals(titulo)) {
                    libro = this.libros[i];

                    return libro;

                }
            }
        }

        return libro;
    }



    // Mostrar informacion de todos los libros almacenados
    public String infoLibrosAlmacenados(){
       String infoLibros = "";

       // Metodo Recorrer el Array (con un for each--- mentira)
        for (int i = 0; i < this.nLibrosActuales; i++) {

            infoLibros = infoLibros + this.libros[i].infoLibro() + "\n\n";// this.libro[posicion del array] + llamo a metodo .infolibro
        }

       return infoLibros;
    }



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





    // Ampliar dimension del array
    private void ampliarDimensionBiblioteca (){
       Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for (int i = 0; i <this.libros.length ; i++) {

            librosAux [i] = this.libros[i];
        }
       this.libros = librosAux;
    }


}
