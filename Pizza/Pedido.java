package Pizza;

public class Pedido {
    private Cliente cliente;
    private Pizza pizzas[] = new Pizza[5];
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Pizza[] getPizzas() {
        return pizzas;
    }
    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }
    public Pedido(Cliente cliente, Pizza[] pizzas){
        this.cliente = cliente;
        this.pizzas = pizzas;
    }
    public Pedido(){
        
    }

}
