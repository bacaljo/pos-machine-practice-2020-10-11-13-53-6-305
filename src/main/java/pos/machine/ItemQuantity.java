package pos.machine;

public class ItemQuantity {
    private String barcode;
    private int quantity;

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
