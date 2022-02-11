public class Funciones<price> {
    public static void main(String[] args) {
        //una función es un bloque de código que se puede repetir
        //las líneas siguientes se pueden agrupar en una función y escribirlas sólo una vez
        //el tipo de retorno void no devuelve resultado ( la función que llama no recibe resultado,
        // pero permite mostrar datos (Systme.out.print) por ejemplo

        //opción 1: función sin parámetros (paréntesis vacíos) y sin tipo de retorno
        showMenu();//aquí se está invocando la función. El código que contiene se ejecutará tantas veces
        showMenu();//como aparezca, en este caso 3 veces
        showMenu();
        getMenu();

        int numero1 = 10;
        int numero2 = 22;

        //opción 2: función sin parámetros y con tipo de retorno (para devolver algo se usa return)
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(getPrice());
        System.out.println(price);


        //opción 3: Función con parámetros sin tipo de retorno
        imprimirSaludo("Hola");

        //opción 4: función con parámetros y tipo de retorno
        String nombre = "Yosoy";
        String apellido = "Roscoe";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);




    }
        static int suma (int numero1, int numero2){
            return numero1 + numero2;

    }

        static String obtenerSaludo(String nombre, String apellido) { //recibe dos parámetros y devuelve un texto
        return "Hola," + nombre  + " "  +  apellido;              //los parámetros se declaran como String

    }
        static void imprimirSaludo(String nombre) {
        System.out.println("Holita " + nombre);
    }

    static double getPrice() {
        return 100.99;
    }


    static void showMenu(){ //se guarda en la función el código que queremos ejecutar a demanda
       System.out.println("Bienvenido al E-commerce de zapatillas");
       System.out.println("1 - Ver zapatillas");
       System.out.println("2 - Comprar zapatillas");
       System.out.println("2 - Salir");

   }

   static String getMenu(){
        return "\nBienvenido al E-commerce de zapatillas";//return exluye a void y
                                                        // hay que indicar tipo de dato (en este caso String)


   }





}
