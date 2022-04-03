package shop;

import clothes.Discount;
import clothes.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Cashier {

    public static void printReceipt(Cart cart, LocalDateTime purchaseDateTime) {
        DecimalFormat df = new DecimalFormat("#.00");
        double subTotal = 0;
        double totalDiscount = 0;
        double total;
        System.out.println("Date: " + purchaseDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println();
        System.out.println("---Products---");
        System.out.println();
        List<Product> cartItemList = cart.getCart();
        boolean isQuantityDiscount = cartItemList.size() > 2;

        for (Product product : cartItemList) {
            double itemSubtotal = product.getPrice();
            Discount discount = product.calculateDiscount(purchaseDateTime.toLocalDate(), isQuantityDiscount);
            String itemDiscountPercentage = discount.getDiscountPercentage();
            double itemDiscount = BigDecimal.valueOf(discount.getDiscountValue())
                    .setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();

            subTotal = subTotal + itemSubtotal;
            totalDiscount = totalDiscount + itemDiscount;

            System.out.println(product);
            System.out.println("$" + df.format(itemSubtotal));
            if (itemDiscount != 0) {
                System.out.println("#discount " + itemDiscountPercentage + " " + "-$" + df.format(itemDiscount));
            }
            System.out.println();
        }

        total = subTotal - totalDiscount;
        System.out.println("SUBTOTAL: $" + df.format(subTotal));
        System.out.println("DISCOUNT: -$" + df.format(totalDiscount));
        System.out.println();
        System.out.println("TOTAL: $" + df.format(total));
    }
}
