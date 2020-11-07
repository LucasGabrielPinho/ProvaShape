public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("Roxo", true);
        Circle circle = new Circle("Verde", true, 4);
        Rectangle rectangle = new Rectangle("Preto", false, 3, 4);
        Square square = new Square("Amarelo", true, 3);

        System.out.println("Imprimindo métodos Shape get: ");
        System.out.println("Cor: " + shape.getColor());
        System.out.println("Filled: " + shape.getFilled());
        System.out.println("\n" + shape + "\n");

        System.out.println("Imprimindo métodos Circle  get: ");
        System.out.println("Cor: " + circle.getColor());
        System.out.println("Filled: " + circle.getFilled());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimetro: " + circle.getPerimeter());
        System.out.println("\n" + circle + "\n");

        System.out.println("Imprimindo métodos Rectangle  get: ");
        System.out.println("Cor: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.getFilled());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());
        System.out.println("\n" + rectangle + "\n");

        System.out.println("Imprimindo métodos Square  get: ");
        System.out.println("Cor: " + square.getColor());
        System.out.println("Filled: " + square.getFilled());
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimetro: " + square.getPerimeter());
        System.out.println("\n" + square + "\n");
    }
}