public interface PizzaBuilder {
    void prepararMasa();
    void prepararSalsa();
    void prepararQueso();
    void peticionesExtras();
    PizzaProducto getPizza();
}
