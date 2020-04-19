package lesson9.Task25;

public class  Operation<T extends Card> {
    T card;

    public Operation(T card) {
        this.card = card;
    }

    public void balancePlus (int sum){
        card.setBalance(card.getBalance() + sum);
    }
}
