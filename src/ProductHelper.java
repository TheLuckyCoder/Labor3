import java.util.List;

public class ProductHelper {
    public static float roundPrice(float price) {
        if (price * 100 % 5 != 0) {
            return (float) (Math.ceil(price * 100f / 5f) * 5f / 100f);
        }

        return price;
    }

    private static int compareProductPrice(Product product1, Product product2) {
        return Float.compare(product1.getPrice(), product2.getPrice());
    }

    public static List<Product> computeRabatt(List<Product> products) {
        for (var product : products) {
            if (product.getDays() > 20) {
                var newPrice = product.getPrice() * 0.8f;
                product.setPrice(roundPrice(newPrice));
            } else if (product.getDays() > 10) {
                var newPrice = product.getPrice() * 0.9f;
                product.setPrice(roundPrice(newPrice));
            }
        }
        return products;
    }

    public static List<Product> filterPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() > 100)
                .toList();
    }

    public static List<Product> sortPrice(List<Product> products) {
        return products.stream()
                .sorted(ProductHelper::compareProductPrice)
                .toList();
    }

    public static Product findMaxPrice(List<Product> products) {
        return products.stream()
                .max(ProductHelper::compareProductPrice).get();
    }

    public static Product findMinPrice(List<Product> products) {
        return products.stream()
                .min(ProductHelper::compareProductPrice).get();
    }
}
