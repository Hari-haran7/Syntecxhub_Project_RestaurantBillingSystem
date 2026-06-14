import java.util.ArrayList;

public class Bill {

    private ArrayList<MenuItem> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();

    public void addItem(MenuItem item, int quantity) {
        items.add(item);
        quantities.add(quantity);
    }

    public void removeLastItem() {

        if (!items.isEmpty()) {

            items.remove(items.size() - 1);
            quantities.remove(quantities.size() - 1);

            System.out.println("Last item removed.");

        } else {

            System.out.println("Cart is empty.");
        }
    }

    public void generateBill() {

        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double subtotal = 0;

        System.out.println("\n===== RECEIPT =====");

        for (int i = 0; i < items.size(); i++) {

            MenuItem item = items.get(i);
            int qty = quantities.get(i);

            double itemTotal = item.getPrice() * qty;
            subtotal += itemTotal;

            System.out.println(
                    item.getName()
                            + " x"
                            + qty
                            + " = Rs."
                            + itemTotal);
        }

        double gst = subtotal * 0.18;
        double total = subtotal + gst;

        System.out.printf("\nSubtotal : Rs.%.2f\n", subtotal);
        System.out.printf("GST (18%%) : Rs.%.2f\n", gst);
        System.out.printf("Total : Rs.%.2f\n", total);
    }
}