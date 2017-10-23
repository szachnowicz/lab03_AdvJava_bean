package com.szachnowicz;

import com.szachnowicz.ContactBookBean;
import org.junit.Assert;

public class ContactBookTest {
    private ContactBookBean contactBook;

    @org.junit.Before
    public void setUp() throws Exception {

        contactBook = new ContactBookBean();

    }

    @org.junit.Test
    public void addAdress() throws Exception {

        boolean firsAdd = contactBook.addAdress("www.asdasd.asd");
        boolean secondAdd = contactBook.addAdress("www.asda.sdasd");
        Assert.assertTrue(firsAdd);
        Assert.assertFalse(secondAdd);

    }

}