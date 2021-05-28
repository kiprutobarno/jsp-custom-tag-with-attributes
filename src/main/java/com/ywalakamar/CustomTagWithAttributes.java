package com.ywalakamar;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTagWithAttributes extends SimpleTagSupport {
    private int number;

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();

        try {
            out.println("The square of " + number + " is " + Math.pow(number, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setNumber(int number){
        this.number=number;
    }
}
