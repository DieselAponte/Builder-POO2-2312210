public class PizzaMargaritaBuilder implements PizzaBuilder {
    private PizzaProducto pizzaProducto = new PizzaProducto();

    @Override
    public void prepararMasa() {
        pizzaProducto.setNombre("Margarita");
        pizzaProducto.setMasa("Napolitana");
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
        // No hay ingredientes adicionales
    }

    @Override
    public PizzaProducto getPizza() {
        return pizzaProducto;
    }
}
