package compras;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<item> itemlist;

    public CarrinhoDeCompras() {
        this.itemlist = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        item item = new item(nome, preco, quantidade);
        this.itemlist.add(item);
    }
    public void removerItem(String nome){
        List<item> itensParaRemover = new ArrayList<>();
        for (item i : this.itemlist){
            if (i.getNome().equals(nome)){
                itensParaRemover.add(i);
            }
        }
        this.itemlist.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (item i : this.itemlist){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        for (item i : this.itemlist) {
            System.out.println(i);
        }
    }

}
