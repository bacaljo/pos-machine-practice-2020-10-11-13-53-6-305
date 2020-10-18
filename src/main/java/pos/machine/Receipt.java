package pos.machine;

import java.util.ArrayList;
import java.util.List;

import static pos.machine.PosMachine.CURRENCY;

public class Receipt {
    private final List<ReceiptItem> receiptItemList;
    private int total;

    public Receipt(List<ReceiptItem> receiptItemList) {
        this.receiptItemList = receiptItemList;
        for (ReceiptItem receiptItem : receiptItemList) {
            total += receiptItem.getSubtotal();
        }
    }

    @Override
    public String toString() {
        List<String> receiptLineList = new ArrayList<>();

        receiptLineList.add("***<store earning no money>Receipt***");
        for (ReceiptItem receiptItem : receiptItemList) {
            receiptLineList.add(receiptItem.toString());
        }
        receiptLineList.add("----------------------");
        receiptLineList.add(String.format("Total: %d (%s)", total, CURRENCY));
        receiptLineList.add("**********************");

        return String.join("\n", receiptLineList);
    }
}
