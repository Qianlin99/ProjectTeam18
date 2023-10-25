package com.hopefundteam18.hopefund.Entity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "DONATION")
public class Donation {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "CARD_NAME")
    private String cardName;

    @Column(name = "CARD_NUM")
    private String cardNum;

    @Column(name = "AMOUNT")
    private String amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
