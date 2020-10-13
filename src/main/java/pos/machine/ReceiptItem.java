package pos.machine;

import static pos.machine.PosMachine.CURRENCY;

public class ReceiptItem {
    private ItemInfo itemInfo;
    private int quantity;
    private int subtotal;

    public ReceiptItem(ItemInfo itemInfo, int quantity) {
        this.itemInfo = itemInfo;
        this.quantity = quantity;
        subtotal = itemInfo.getPrice() * quantity;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Quantity: %d, Unit price: %d (%s), Subtotal: %d(%s)",
                itemInfo.getName(), quantity, itemInfo.getPrice(), CURRENCY, subtotal, CURRENCY);
    }
}
