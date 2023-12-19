package application;

import java.sql.Timestamp;

public class History {
    private int transactionId;
    private final int userId;
    private final int productId;
    private final int quantity;
    private final int totalPrice;
    private final Timestamp transactionDate;

    public History(int userId, int productId, int quantity, int totalPrice, Timestamp transactionDate) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }
}


//package application;
//
//import java.sql.Timestamp;
//
//public class History {
//    private int transactionId; // Perubahan: tidak menggunakan kata kunci 'final'
//    private final int userId;
//    private final int productId;
//    private final int quantity;
//    private final int totalPrice;
//    private final Timestamp transactionDate;
//
//    public History(int userId, int productId, int quantity, int totalPrice, Timestamp transactionDate) {
//        this.userId = userId;
//        this.productId = productId;
//        this.quantity = quantity;
//        this.totalPrice = totalPrice;
//        this.transactionDate = transactionDate;
//    }
//
//    // Getter untuk atribut-atribut history entry
//    public int getTransactionId() {
//        return transactionId;
//    }
//
//    // Perubahan: tambahkan metode setTransactionId
//    public void setTransactionId(int transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public int getTotalPrice() {
//        return totalPrice;
//    }
//
//    public Timestamp getTransactionDate() {
//        return transactionDate;
//    }
//}
