package com.example.demo.pojo;

import java.util.Objects;

public class CardMap {

    private Integer id;
    private Integer cardNo;

    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardMap)) return false;
        CardMap cardMap = (CardMap) o;
        return Objects.equals(getId(), cardMap.getId()) &&
                Objects.equals(getCardNo(), cardMap.getCardNo()) &&
                Objects.equals(getPerson(), cardMap.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCardNo(), getPerson());
    }
}
