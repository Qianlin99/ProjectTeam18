package com.hopefundteam18.hopefund;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "EVENT")
public class Event {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "EVENT_DESC")
    private String eventDesc;

    @Column(name = "ORGANISER")
    private String organiser;

    @Column(name = "EVENT_DT")
    private String eventDate;

}