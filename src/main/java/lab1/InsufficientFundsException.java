package lab1;

// Optional: สร้าง Custom Exception ชื่อ InsufficientFundsException 
// สำหรับกรณีที่พยายามถอนเงินจากบัญชีเกินจำนวนที่มีอยู่
public class InsufficientFundsException extends Exception {
    // TODO: สร้าง constructor ที่รับ message
    private double balance;
    private double requestedAmount;
    
    public InsufficientFundsException(String message) {
        // TODO: เรียก super(message)
        super(message);
    }
    
    public InsufficientFundsException(String message, double balance, double requestedAmount) {
        super(message);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getRequestedAmount() {
        return requestedAmount;
    }
}
