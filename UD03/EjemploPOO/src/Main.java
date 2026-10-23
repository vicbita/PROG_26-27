//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Mi primer objeto java
    Persona pp = new Persona("Pepe", "Blanco",  42);

    // Mi segundo objeto java
    Persona paco = new Persona("Paco", "Flaco" , 33 );

    // Objeto con DNI

    Persona ans = new Persona("Fernando" , "Alonso" , 29 , "58754695Y");


    IO.println(pp.getNombre());
    pp.setEdad(45);
    IO.println(pp.getApellidos());

    IO.println(pp.personatostring());



    }

