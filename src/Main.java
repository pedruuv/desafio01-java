import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var produto1 = new Produto("Rosquinha", 18.90, 500);

        var produto2 = new Produto("Geladeira", 5540.95, 90);

        var produto3 = new Produto("Notebook", 3000, 300);

        var produtoPerecivel = new ProdutoPerecivel("Carne", 80, 900, "06/12/2023");

        System.out.println(produtoPerecivel);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos);
    }
}
