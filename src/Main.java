public class Main {
    public static void main(String[] args)
    {
            atributii shirt = new atributii();
                shirt.price = 700;
                shirt.tax = 1.5;
                shirt.quantity = 10;
                shirt.total = shirt.price * shirt.quantity * shirt.tax;



        System.out.println("Total cost with tax is = " + shirt.total);
    }
}