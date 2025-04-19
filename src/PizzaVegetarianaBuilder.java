public class PizzaVegetarianaBuilder implements PizzaBuilder {
    private PizzaProducto pizzaProducto = new PizzaProducto();

    @Override
    public void prepararMasa() {
        pizzaProducto.setNombre("Vegetariana");
        pizzaProducto.setMasa("Delgada integral");
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
        pizzaProducto.addIngredientes("Cebolla blanca");
        pizzaProducto.addIngredientes("Aceitunas verdes");
        pizzaProducto.addIngredientes("Pimientos verdes");
    }

    @Override
    public PizzaProducto getPizza() {
        return pizzaProducto;
    }
}
