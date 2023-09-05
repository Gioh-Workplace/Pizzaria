package Pizza;

public class ArrayManagement {
    private Pizza[] pizzas;
    private Pedido[] pedidos;
    private Cliente[] clientes;


    public Pizza[] aumentarTamanho(Pizza[] pizzas){
        int tam = pizzas.length;
        this.pizzas = new Pizza[tam*2];
        for(int i =0;i<pizzas.length;i++){
            this.pizzas[i] = pizzas[i];
        }
        return this.pizzas;
    }
    public Cliente[] aumentarTamanho(Cliente[] clientes){
        int tam = clientes.length;
        this.clientes = new Cliente[tam*2];
        for(int i =0;i<clientes.length;i++){
            this.clientes[i] = clientes[i];
        }
        return this.clientes;
    }
    public Pedido[] aumentarTamanho(Pedido[] pedidos){
        int tam = pedidos.length;
        this.pedidos = new Pedido[tam*2];
        for(int i =0;i<pizzas.length;i++){
            this.pedidos[i] = pedidos[i];
        }
        return this.pedidos;
    }
    


}
