package lesson9.Task25;

public class VirtualBankCard extends Card {
    private int idNumber;

    public VirtualBankCard(int balance, CardHolder cardHolder, int idNumber) {
        super(balance, cardHolder);
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "VirtualBankCard{" +
                "idNumber=" + idNumber +
                ", balance=" + balance +
                ", cardHolder=" + cardHolder +
                '}';
    }
}
