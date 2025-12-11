public class Produto {
    private String nome;
    private double preco;
    private long codigo;

    public Produto(String nome, double preco, long codigo) throws Exception {
        testaNome(nome);
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    private void testaNome(String nome) throws Exception {
        if(nome == null || nome.trim().length() < 2) {
            throw new Exception("Nome do produto não pode ser nulo ou ter menos de 2 caracteres válidos.");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        testaNome(nome);
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "criacao.classes.Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        if (Double.compare(produto.getPreco(), getPreco()) != 0) return false;
        if (getCodigo() != produto.getCodigo()) return false;
        return getNome() != null ? getNome().equals(produto.getNome()) : produto.getNome() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNome() != null ? getNome().hashCode() : 0;
        temp = Double.doubleToLongBits(getPreco());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getCodigo() ^ (getCodigo() >>> 32));
        return result;
    }
}
