package com.hopefundteam18.hopefund;
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

}
