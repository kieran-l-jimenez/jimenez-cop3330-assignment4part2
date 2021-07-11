/*
 * Item
 *
 * 2021-07-11
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Item {
    private String description;
    private Calendar dueDate;
    private Boolean complete;

    public Item() {
        complete = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public String getDueDateString() {
        return String.format("%4d-%02d-%02d", dueDate.get(Calendar.YEAR), dueDate.get(Calendar.MONTH)+1,
                dueDate.get(Calendar.DAY_OF_MONTH));
    }

    public void setDueDate(String newDueDate) {
        //check that new due date follows format "\d\d\d\d-\d\d-\d\d"
        if (this.validateDate(newDueDate)) {
            dueDate = new GregorianCalendar();
            DateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

            try {
                dueDate.setTime(dateForm.parse(newDueDate));//set this.DueDate = new due date
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean validateDate(String newDueDate) {
        return newDueDate.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d");
    }

    public boolean getComplete() {
        return complete;
    }

    public void markComplete() {
        complete = true;
    }

    public void markIncomplete() {
        complete = false;
    }
}
