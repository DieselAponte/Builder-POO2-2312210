public class Cocinero {
    private PizzaBuilder pizzaBuilder;

    public Cocinero(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public PizzaProducto getPizza() {
        return this.pizzaBuilder.getPizza();
    }

    public void construirPizza() {
        this.pizzaBuilder.prepararMasa();
        this.pizzaBuilder.prepararSalsa();
        this.pizzaBuilder.prepararQueso();
        this.pizzaBuilder.peticionesExtras();
    }
}
