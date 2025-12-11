public class Gerente {
    public static void main(String[] args)  {
        Estoque estoque = new Estoque();

        Produto a = null;
        try {
            a = new Produto("a   ", -1.0, 55);
            System.out.println("criou o produto a");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a);

        estoque.adicionaProduto(a);
        System.out.println(estoque);

    }
}
