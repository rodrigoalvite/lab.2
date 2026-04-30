public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta cuenta1 = new Cuenta();

        var cuenta2 = new Cuenta("Tiziano", "8.8.8.8", 0.2, 100.5);


        cuenta1.setNombreCliente("Rodrigo");


        System.out.println("La cuenta 2 es " + cuenta2.getNombreCliente());
        System.out.println(" La cuenta 1 es " + cuenta1.getNombreCliente() );



    }
}
