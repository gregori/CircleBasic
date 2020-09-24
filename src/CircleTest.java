public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(1.5, "blue");

        System.out.printf("C1: Raio: %.2f, Cor: %s, Área: %.2f, Perímetro: %.2f\n",
                c1.getRadius(), c1.getColor(), c1.getArea(), c1.getPerimeter());
        System.out.printf("C2: Raio: %.2f, Cor: %s, Área: %.2f, Perímetro: %.2f\n",
                c2.getRadius(), c2.getColor(), c2.getArea(), c2.getPerimeter());
        System.out.printf("C3: Raio: %.2f, Cor: %s, Área: %.2f, Perímetro: %.2f\n",
                c3.getRadius(), c3.getColor(), c3.getArea(), c3.getPerimeter());
    }
}
