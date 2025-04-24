public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Mostrar saludo
        String mensaje = Saludo.obtenerSaludo(nombre);
        System.out.println(mensaje);

        // Mostrar edad
        System.out.println("Tienes " + edad + " años.");

        scanner.close();
    }
}

