public class Product {
    private int id;
    private String name;
    private float price;
    private int count;
    private int days;

    public Product(int id, String name, float price, int count, int days) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (price != product.price) return false;
        if (count != product.count) return false;
        if (days != product.days) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = (int) (31 * result + price);
        result = 31 * result + count;
        result = 31 * result + days;
        return result;
    }

    @Override
    public String toString() {
        return "Product(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", days=" + days +
                ')';
    }
}
