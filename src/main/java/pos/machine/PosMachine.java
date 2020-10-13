package pos.machine;

import java.util.List;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        List<ItemQuantity> itemQuantityList = getItemQuantity(barcodes);
        List<ReceiptItem> receiptItemList = buildReceiptItems(itemQuantityList);
        Receipt receipt = createReceipt(receiptItemList);

        return receipt.toString();
    }

    private Receipt createReceipt(List<ReceiptItem> receiptItemList) {
        return null;
    }

    private List<ReceiptItem> buildReceiptItems(List<ItemQuantity> itemQuantityList) {
        return null;
    }

    private List<ItemQuantity> getItemQuantity(List<String> barcodes) {
        return null;
    }
}
