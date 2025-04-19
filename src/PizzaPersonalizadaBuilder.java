import java.util.*;

public class PizzaPersonalizadaBuilder implements PizzaBuilder {
    private PizzaProducto pizza = new PizzaProducto();
    private Scanner scanner = new Scanner(System.in);

    private final List<String> masas = Arrays.asList("napolitana", "romana", "americana", "pan");
    private final List<String> salsas = Arrays.asList("tomate", "barbacoa", "pesto", "picante");
    private final List<String> quesos = Arrays.asList("mozzarella", "cheddar", "parmesano");
    private final List<String> ingredientesDisponibles = Arrays.asList(
            "pepperoni", "cebolla", "jamon", "aceitunas", "pimientos", "pollo", "champiñones");

    private String preguntarOpcion(String categoria, List<String> opciones) {
        while (true) {
            System.out.println(categoria + " - Opciones:");
            for (int i = 0; i < opciones.size(); i++) {
                System.out.println("(" + (char) ('a' + i) + ") " + opciones.get(i));
            }
            System.out.print("Input: ");
            String input = scanner.nextLine().trim().toLowerCase();
            int index = input.charAt(0) - 'a';
            if (index >= 0 && index < opciones.size()) {
                return opciones.get(index);
            }
            System.out.println("Opción inválida. Intenta de nuevo.");
        }
    }

    private boolean confirmar() {
        System.out.print("¿Estás seguro? (sí/no): ");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("sí") || input.equals("si") || input.equals("s");
    }

    private void elegirExtras() {
        System.out.println("Agrega ingredientes (escribe 'fin' para terminar): " + ingredientesDisponibles);
        while (true) {
            System.out.print("Ingrediente: ");
            String ingrediente = scanner.nextLine().trim().toLowerCase();
            if (ingrediente.equals("fin")) break;
            if (ingredientesDisponibles.contains(ingrediente)) {
                pizza.addIngredientes(ingrediente);
            } else {
                System.out.println("Ingrediente no válido.");
            }
        }
    }

    @Override
    public void prepararMasa() {
        pizza.setNombre("Personalizada");
        pizza.setMasa(preguntarOpcion("Masa", masas));
    }

    @Override
    public void prepararSalsa() {
        pizza.setSalsa(preguntarOpcion("Salsa", salsas));
    }

    @Override
    public void prepararQueso() {
        pizza.setQueso(preguntarOpcion("Queso", quesos));
    }


    @Override
    public void peticionesExtras() {
        elegirExtras();

        System.out.print("¿Deseas extra queso? (sí/no): ");
        pizza.setExtraQueso(scanner.nextLine().trim().toLowerCase().startsWith("s"));

        System.out.print("¿Deseas sin gluten? (sí/no): ");
        pizza.setGlutenFree(scanner.nextLine().trim().toLowerCase().startsWith("s"));

        while (true) {
            System.out.print("Tamaño (1=pequeña, 2=mediana, 3=grande): ");
            try {
                int t = Integer.parseInt(scanner.nextLine());
                if (t >= 1 && t <= 3) {
                    pizza.setTamano(t);
                    break;
                }
            } catch (Exception ignored) {}
            System.out.println("Tamaño no válido.");
        }

        // Confirmación
        System.out.println("\n--- Resumen de tu pizza personalizada ---");
        System.out.println("Masa: " + pizza.getMasa());
        System.out.println("Salsa: " + pizza.getSalsa());
        System.out.println("Queso: " + pizza.getQueso());
        System.out.println("Ingredientes: " + pizza.getListaIngredientes());
        System.out.println("Extra queso: " + pizza.isExtraQueso());
        System.out.println("Sin gluten: " + pizza.isGlutenFree());
        System.out.println("Tamaño: " + pizza.getTamano());
        System.out.println("-----------------------------------------");

        if (!confirmar()) {
            // Reinicia
            pizza = new PizzaProducto();
            System.out.println("\nVolvamos a empezar...\n");
            prepararMasa();
            prepararSalsa();
            prepararQueso();
            peticionesExtras();
        }
    }

    @Override
    public PizzaProducto getPizza() {
        return pizza;
    }
}