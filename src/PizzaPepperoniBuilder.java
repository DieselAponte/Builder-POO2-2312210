public class PizzaPepperoniBuilder implements PizzaBuilder {
    private PizzaProducto pizzaProducto = new PizzaProducto();

    @Override
    public void prepararMasa() {
        pizzaProducto.setNombre("Pepperoni");
        pizzaProducto.setMasa("Tradicional");
    }

    @Override
    public void prepararSalsa() {
        pizzaProducto.setSalsa("Tomate");
    }

    @Override
    public void prepararQueso() {
        pizzaProducto.setQueso("Mozzarella");
    }

    @Override
    public void peticionesExtras() {
        pizzaProducto.addIngredientes("Pepperoni");
    }

    @Override
    public PizzaProducto getPizza() {
        return pizzaProducto;
    }
}
