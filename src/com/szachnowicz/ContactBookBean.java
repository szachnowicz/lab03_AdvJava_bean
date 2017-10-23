package com.szachnowicz;

import javax.swing.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class ContactBookBean extends JList<String> implements Serializable {


    public ContactBookBean() {
        super();
    }

    private String contBookTitle;

    private List<String> addresList;

    private String regex = "\\*.\\*.\\*";

    private int bookMaxSize;

    public String getContBookTitle() {
        return contBookTitle;
    }

    public void setContBookTitle(String contBookTitle) {
        this.contBookTitle = contBookTitle;
    }

    public List<String> getAddresList() {
        return addresList;
    }

    public boolean addAdress(String adress) {
        if (addresList == null) {
            addresList = new LinkedList<>();
        }
        if (!addresList.contains(adress) && adress.matches(regex)) {
            addresList.add(adress);
            return true;
        } else {
            return false;
        }

    }

    public void setAddresList(List<String> addresList) {
        this.addresList = addresList;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public int getBookMaxSize() {
        return bookMaxSize;
    }

    public void setBookMaxSize(int bookMaxSize) {
        this.bookMaxSize = bookMaxSize;
    }
}
