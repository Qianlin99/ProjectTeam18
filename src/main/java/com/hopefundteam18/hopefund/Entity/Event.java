package com.hopefundteam18.hopefund.Entity;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
}