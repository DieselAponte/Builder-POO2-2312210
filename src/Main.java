public class Main {
    public static void main(String[] args) {
        PizzaBuilder personalizadaBuilder = new PizzaPersonalizadaBuilder();
        Cocinero cocinero = new Cocinero(personalizadaBuilder);
        cocinero.construirPizza();
        cocinero.getPizza().imprimirResumen();
        // Margarita con extra queso
        PizzaBuilder margaritaBuilder = new PizzaMargaritaBuilder();
        Cocinero cocineroMargarita = new Cocinero(margaritaBuilder);
        cocineroMargarita.construirPizza();
        cocineroMargarita.getPizza().setExtraQueso(true);
        cocineroMargarita.getPizza().setNombre("Margarita con Extra Queso");
        cocineroMargarita.getPizza().imprimirResumen();

        // Pepperoni sin salsa picante
        PizzaBuilder pepperoniBuilder = new PizzaPepperoniBuilder();
        Cocinero cocineroPepperoni = new Cocinero(pepperoniBuilder);
        cocineroPepperoni.construirPizza();
        cocineroPepperoni.getPizza().setNombre("Pepperoni sin picante");
        cocineroPepperoni.getPizza().imprimirResumen();

        // Vegetariana con jamón
        PizzaBuilder vegetarianaBuilder = new PizzaVegetarianaBuilder();
        Cocinero cocineroVegetariana = new Cocinero(vegetarianaBuilder);
        cocineroVegetariana.construirPizza();
        cocineroVegetariana.getPizza().addIngredientes("Jamón");
        cocineroVegetariana.getPizza().setNombre("Vegetariana con Jamón");
        cocineroVegetariana.getPizza().imprimirResumen();

        // Personalizada
        PizzaProducto personalizada = new PizzaProducto();
        personalizada.setMasa("pan");
        personalizada.setSalsa("barbacoa");
        personalizada.setQueso("cheddar");
        personalizada.addIngredientes("pollo");
        personalizada.setNombre("Personalizada con pan, barbacoa, cheddar y pollo");
        personalizada.imprimirResumen();
    }
}
