package oop_2;

public class InvoiceItem {
    String id;
    String desq;
    int qty;
    double unitPrice;

    InvoiceItem( String id,String desq,int qty,double unitPrice){
        this.id = id;
        this.desq = desq;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesq() {
        return desq;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    double getTotal(){
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id='" + id + '\'' +
                ", desq='" + desq + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
