package pos.machine;

public class ItemQuantity {
    private final String barcode;
    private final int quantity;

    public ItemQuantity(String barcode, int quantity) {
        this.barcode = barcode;
        this.quantity = quantity;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getQuantity() {
        return quantity;
    }
}
