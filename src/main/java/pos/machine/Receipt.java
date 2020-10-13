package pos.machine;

import java.util.List;

public class Receipt {
    private List<ReceiptItem> receiptItemList;

    public Receipt(List<ReceiptItem> receiptItemList) {
        this.receiptItemList = receiptItemList;
    }

    @Override
    public String toString() {
        return null;
    }
}
