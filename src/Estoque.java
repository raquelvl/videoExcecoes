import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estoque {
    private List<Produto> estoque = new ArrayList<>();

    public int adicionaProduto(Produto produto) {
        estoque.add(produto);
        return estoque.size()-1;
    }

    public boolean removeProduto(long codigo) {
        for (Produto produto: estoque) {
            if(produto.getCodigo() == codigo) {
                return estoque.remove(produto);
            }
        }
        return false;
    }

    public boolean removeProduto(Produto produto) {
        return estoque.remove(produto);
    }

    public Produto pesquisa(long codigo) {
        for (Produto produto: estoque) {
            if(produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public boolean pesquisa(Produto produto) {
        return estoque.contains(produto);
    }

    public int getQuantidadeProduto(long codigo) {
        int quantidade = 0;
        for (Produto produto: estoque) {
            if(produto.getCodigo() == codigo) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public List<Produto> getEstoque() {
        return estoque;
    }

    public List<Produto> pesquisaPorNomeExato(String nome) {
        List<Produto> resposta = new ArrayList<>();
        for (Produto produto: estoque) {
            if(produto.getNome().equals(nome)) {
                resposta.add(produto);
            }
        }
        return resposta;
    }

    public List<Produto> pesquisaPorNome(String nome) {
        List<Produto> resposta = new ArrayList<>();
        for (Produto produto: estoque) {
            if(produto.getNome().startsWith(nome)) {
                resposta.add(produto);
            }
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "criacao.classes.Estoque{" +
                "estoque=" + estoque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque1 = (Estoque) o;
        return Objects.equals(estoque, estoque1.estoque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estoque);
    }

}