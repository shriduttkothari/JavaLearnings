package org.shridutt.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class StreamExample2 {

    /**
     * Group products by category and calculate average price.
     * Example: [{category: "Tech", price: 100}, {category: "Tech", price: 200}] -> {"Tech": 150.0}
     */
    static Map<String, Double> averagePriceByCategory(List<Product> products) {
        return products.parallelStream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
    }

    /**
     * Count frequency of each word in a list.
     * Example: ["apple", "banana", "apple"] -> {"apple": 2, "banana": 1}
     */
    static Map<String, Long> wordFrequency(List<String> words) {
        return words.parallelStream()
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));
    }

    /**
     * Find top 3 most frequent words from sentences.
     * Example: ["The fox", "The dog"] -> {"the": 2, "fox": 1, "dog": 1}
     */
    static Map<String, Long> top3Words(List<String> sentences) {
        return sentences.parallelStream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    /**
     * Calculate total sales amount per product.
     * Example: [Sale(product: "Phone", amount: 200), Sale(product: "Phone", amount: 300)] -> {"Phone": 500}
     */
    static Map<String, Integer> totalSalesByProduct(List<Sale> sales) {
        return sales.stream()
                .collect(Collectors.toMap(
                        Sale::getProduct,
                        Sale::getAmount,
                        Integer::sum
                ));
    }

    /**
     * Get products with total quantity sold more than 200.
     * Example: [ProductSale(category: "Phone", quantitySold: 250)] -> {"Phone": 250}
     */
    static Map<String, Integer> productsWithHighSales(List<ProductSale> productSales) {
        return productSales.stream()
                .collect(Collectors.groupingBy(
                        ProductSale::getCategory,
                        Collectors.summingInt(ProductSale::getQuantitySold)
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 200)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    // Dummy Product class for Product related problems
    static class Product {
        private String category;
        private String name;
        private double price;

        public Product(String category, String name, double price) {
            this.category = category;
            this.name = name;
            this.price = price;
        }

        public String getCategory() { return category; }
        public String getName() { return name; }
        public double getPrice() { return price; }
    }

    static class Sale {
        private String product;
        private int amount;

        public Sale(String product, int amount) {
            this.product = product;
            this.amount = amount;
        }

        public String getProduct() { return product; }
        public int getAmount() { return amount; }
    }

    static class ProductSale {
        private String category;
        private int quantitySold;

        public ProductSale(String category, int quantitySold) {
            this.category = category;
            this.quantitySold = quantitySold;
        }

        public String getCategory() { return category; }
        public int getQuantitySold() { return quantitySold; }
    }

    public static void main(String[] args) {

        // Test averagePriceByCategory
        List<Product> products = Arrays.asList(
                new Product("Tech", "Laptop", 1000),
                new Product("Tech", "Phone", 500),
                new Product("Home", "Vacuum", 300)
        );
        System.out.println("averagePriceByCategory = " + averagePriceByCategory(products));

        // Test wordFrequency
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println("wordFrequency = " + wordFrequency(words));

        // Test top3Words
        List<String> sentences = Arrays.asList("The quick brown fox", "The quick dog", "fox and dog");
        System.out.println("top3Words = " + top3Words(sentences));

        // Test totalSalesByProduct
        List<Sale> sales = Arrays.asList(
                new Sale("Phone", 200),
                new Sale("Phone", 300),
                new Sale("Laptop", 1500)
        );
        System.out.println("totalSalesByProduct = " + totalSalesByProduct(sales));

        // Test productsWithHighSales
        List<ProductSale> productSales = Arrays.asList(
                new ProductSale("Phone", 250),
                new ProductSale("Laptop", 180),
                new ProductSale("Phone", 100)
        );
        System.out.println("productsWithHighSales = " + productsWithHighSales(productSales));
    }
}