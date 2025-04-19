import java.util.ArrayList;
import java.util.List;

public class PizzaProducto {
    private String nombre;
    private String masa;
    private String salsa;
    private String queso;
    private List<String> listaIngredientes = new ArrayList<>();
    private boolean extraQueso;
    private boolean glutenFree;
    private int tamano;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public List<String> getListaIngredientes() {
        return listaIngredientes;
    }
    public void setListaIngredientes(List<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public void printIngredientes() {
        for (String ingrediente : listaIngredientes) {
            System.out.println(ingrediente);
        }
    }

    public void addIngredientes(String ingrediente) {
        this.listaIngredientes.add(ingrediente);
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void imprimirResumen() {
        System.out.println("🍕 " + nombre);
        System.out.println("-----------------------------");
        System.out.println("Masa: " + getMasa());
        System.out.println("Salsa: " + getSalsa());
        System.out.println("Queso: " + getQueso());
        System.out.println("Ingredientes: " + getListaIngredientes());
        System.out.println("Extra Queso: " + (isExtraQueso() ? "Sí" : "No"));
        System.out.println("Sin Gluten: " + (isGlutenFree() ? "Sí" : "No"));
        System.out.println("Tamaño: " + getTamano());
        System.out.println("-----------------------------\n");
    }

}
