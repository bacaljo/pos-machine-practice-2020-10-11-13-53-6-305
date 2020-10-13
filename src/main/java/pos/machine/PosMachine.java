package pos.machine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.frequency;

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
        List<ItemQuantity> itemQuantityList = new ArrayList<>();

        barcodes.stream().distinct().forEach(barcode -> {
            int quantity = frequency(barcodes, barcode);

            itemQuantityList.add(new ItemQuantity(barcode, quantity));
        });

        return itemQuantityList;
    }
}
