// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.util.*;
public class Main {
    List<Product> products = new ArrayList<>();
    public static List<Product> loadProductList(String filePath) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String productName = data[0];
                String productCategory = data[1];
                int productQuantity = Integer.parseInt(data[2]);
                double productPrice = Double.parseDouble(data[3]);

                Product product;
                if (productQuantity > 0) {
                    product = new Product(productName, productPrice, productQuantity, productCategory);
                } else {
                    product = new Product(productName, productPrice, 0, productCategory);
                }

                products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(products);
        return products;
    }
    public static void main(String[] args) {

    }
}