import java.util.Scanner;

    public class Main {

        public static int calculate(int x, int a){

            int c = (a * 100) + x;
            return c;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Здраствуйте!");
            System.out.println("Введите цену товара (в руб.)");
            int priceProduct = scanner.nextInt() / 100;
            System.out.println("Введите вес товара (в кг.)");
            int weightProduct = scanner.nextInt();
            int tariff = calculate(priceProduct, weightProduct);
            System.out.println("Размер пошлины составит: " + tariff + " (в руб).");
            }
        }
