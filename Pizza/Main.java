package Pizza;
import java.util.*;

public class Main {
    static Scanner newScan = new Scanner(System.in);
    public static void main(String[] args) {
        Pizza[] pizzas = new Pizza[10];
        Pedido[] pedidos = new Pedido[10];
        Cliente[] clientes = new Cliente[10];
        ArrayManagement manager = new ArrayManagement();
        int cont = 0;
        int a = 0;
        int auxPedidos = 0;
        int auxClientes = 0;
        do{
            a = menu1();
            System.out.println();
            switch(a){
                case 1:
                pizzas[cont] = new Pizza();
                System.out.println("Insira o nome da Pizza");
                newScan.nextLine();
                String write = newScan.nextLine();
                pizzas[cont].setNome(write);
                System.out.println("Insira os ingredientes da Pizza");
                 write = newScan.nextLine();
                pizzas[cont].setIngredientes(write);
                System.out.println("Insira o preço da Pizza");
                 float preco = newScan.nextFloat();
                pizzas[cont].setPreco(preco);
                cont++;
                
                System.out.println("\nPizza cadastrada com sucesso\n\n");
                break;

                case 2:
                try{
                for(int i =0;i<pizzas.length;i++){
                    if(pizzas[i].getNome()!=null){
                    System.out.println("Nome:"+pizzas[i].getNome());
                    System.out.println("Ingredientes:"+pizzas[i].getIngredientes());
                    System.out.println("R$:"+pizzas[i].getPreco());
                    }
                   
                }
            }
            catch(Exception e){
                System.out.println("");
            }
                break;
                
                case 3:

                Pizza[] pizzaArray = new Pizza[5];

                //for(int i =0;i<clientes.length;i++){
                clientes[auxClientes] = new Cliente();
                System.out.println("Quem é o cliente?");
                newScan.nextLine();
                String nome = newScan.nextLine();
                System.out.println("Qual o telefone do cliente");
                String tel = newScan.nextLine();
                System.out.println("Escolha uma pizza para adicionar:");
                try{
                    for(int j=0;j<pizzas.length;j++){
                        System.out.println(pizzas[j].getNome());
                    }
                } catch(Exception e){
                   System.out.println("");
                }
                String nomePizza = newScan.nextLine();
                int index = buscarPizza(nomePizza, pizzas);
                int contador = 1;
                    
                if(index!=-1){
                    pizzaArray[0] = pizzas[index];
                    
                }
                int op=3;
                while(op!=2){
                System.out.println("Deseja acrescentar mais uma pizza (1-SIM | 2-NÃO)");
                op = newScan.nextInt();
                if(op==1){
                    System.out.println("Escolha uma pizza para adicionar:");
                    try{
                    for(int j=0;j<pizzas.length;j++){
                        System.out.println(pizzas[j].getNome());
                    }
                } catch(Exception e){
                    System.out.print("");
                }
                newScan.nextLine();
                nomePizza = newScan.nextLine();
                index = buscarPizza(nomePizza, pizzas);
                if(index!=-1){
                    pizzaArray[contador] = pizzas[index];
                    contador++;
                }
                
            }
        }
                   
                    clientes[auxClientes].setNome(nome);
                    clientes[auxClientes].setTelefone(tel);
                    Pedido testando = new Pedido();
                    testando.setCliente(clientes[auxClientes]);
                    testando.setPizzas(pizzaArray);
                    pedidos[auxPedidos] = new Pedido(clientes[auxClientes],pizzaArray);
                  
                    System.out.println(pedidos[auxPedidos].getCliente().getNome());
                    auxClientes++;
                    auxPedidos++;
                    
                    
                break;

                case 4:
                try{
                    double total = 0;
                    for(int i =0;i<pedidos.length;i++){
                        Cliente teste = pedidos[i].getCliente();
                        Pizza[] testes = pedidos[i].getPizzas();
                System.out.println("Nome:"+teste.getNome()+"\nTelefone:"+teste.getTelefone()+"\nPedido:");
                try{
                for(int j=0;j<testes.length;j++){
                    
                System.out.println(testes[j].getNome()+" - R$:"+testes[j].getPreco());
                total += (double) (testes[j].getPreco());
                     }
                    } catch(Exception e){
                        System.out.print("");
                    }


                     System.out.println("Total R$:"+total+"\n\n");

                   }
                } catch(Exception e){
                    System.out.print("");
                }
                break;
                case 5:
                int count = 1;
                try{
                for(Pizza p :pizzas){
                    System.out.println(count+" "+p.getNome()+"\t R$:"+p.getPreco());
                    System.out.println(p.getIngredientes());
                    System.out.println();
                    count++;
                }
            } catch(Exception e){
                System.out.println("Nada mais para listar");
            }
                break;



                
            }
            if(pizzas[(pizzas.length-1)]!=null){
               pizzas = manager.aumentarTamanho(pizzas);
            }
            if(pedidos[(pedidos.length-1)]!=null){
                pedidos = manager.aumentarTamanho(pedidos);
             }
             if(clientes[(clientes.length-1)]!=null){
                clientes = manager.aumentarTamanho(clientes);
             }


        }while(a!=0);


    }

    public static int menu1(){
        System.out.println("Bem vindo ao projeto de Pizzaria\nEscolha uma opção:\n1-Adicionar Pizza\n2-Listar Pizzas\n3-Criar novo Pedido\n4-Listar pedidos\n5.Listar Pizzas\n0-Sair");
        int a = newScan.nextInt();
        return a;
    }

    public static int buscarPizza(String nomePizza,Pizza pizzas[]){

        int vF = -1;
        try{
        for(int i=0;i<pizzas.length;i++){
            if(nomePizza.equals(pizzas[i].getNome())){
                vF = i;
            }
        }
    } catch(Exception e){
        System.out.println("");
    }

        return vF;
    }
    

    
}
