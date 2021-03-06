package pos.machine;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.frequency;

public class PosMachine {
    public static final String CURRENCY = "yuan";

    public String printReceipt(List<String> barcodes) {
        List<ItemQuantity> itemQuantityList = getItemQuantity(barcodes);
        List<ReceiptItem> receiptItemList = buildReceiptItems(itemQuantityList);
        Receipt receipt = createReceipt(receiptItemList);

        return receipt.toString();
    }

    private Receipt createReceipt(List<ReceiptItem> receiptItemList) {
        return new Receipt(receiptItemList);
    }

    private List<ReceiptItem> buildReceiptItems(List<ItemQuantity> itemQuantityList) {
        List<ReceiptItem> receiptItemList = new ArrayList<>();

        for (ItemQuantity itemQuantity : itemQuantityList) {
            ItemInfo itemInfo = getItemByBarCode(itemQuantity.getBarcode());
            ReceiptItem receiptItem = createReceiptItem(itemInfo, itemQuantity.getQuantity());

            receiptItemList.add(receiptItem);
        }

        return receiptItemList;
    }

    private ItemInfo getItemByBarCode(String barcode) {
        return ItemDataLoader.loadAllItemInfos().stream()
                .filter(itemInfo -> itemInfo.getBarcode().equals(barcode))
                .findFirst()
                .get();
    }

    private ReceiptItem createReceiptItem(ItemInfo itemInfo, int quantity) {
        return new ReceiptItem(itemInfo, quantity);
    }

    private List<ItemQuantity> getItemQuantity(List<String> barcodes) {
        List<ItemQuantity> itemQuantityList = new ArrayList<>();

        barcodes.stream().distinct().forEach(barcode -> {
            int quantity = frequency(barcodes, barcode);

            itemQuantityList.add(new ItemQuantity(barcode, quantity));
        });

        return itemQuantityList;
    }
}
