public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta cuenta1 = new Cuenta(); //cuenta vacia

        var cuenta2 = new Cuenta("Tiziano", "8.8.8.8", 0.2, 100.5); // crea cuenta con los datos


        cuenta1.setNombreCliente("Rodrigo"); // este seria la cuenta1 que usa un getter


        System.out.println("La cuenta 2 es " + cuenta2.getNombreCliente());
        System.out.println(" La cuenta 1 es " + cuenta1.getNombreCliente() );



    }
}
