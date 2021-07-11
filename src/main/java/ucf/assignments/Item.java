/*
 * Item
 *
 * 2021-07-10
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Item {
    private String Description;
    private Calendar DueDate;
    private Boolean Complete;

    public Item() {
        Complete = false;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String newDescription) {
        Description = newDescription;
    }

    public String getDueDateString() {
        return String.format("%4d-%2d-%2d", DueDate.get(Calendar.YEAR), DueDate.get(Calendar.MONTH),
                DueDate.get(Calendar.DAY_OF_MONTH));
    }

    public void setDueDate(String newDueDate) {
        //check that new due date follows format "\d\d\d\d-\d\d-\d\d"
        if (this.validateDate(newDueDate)) {
            DateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            try {
                DueDate.setTime(dateForm.parse(newDueDate));//set this.DueDate = new due date
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean validateDate(String newDueDate) {
        return newDueDate.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d");
    }

    public void markComplete() {
        Complete = true;
    }

    public void markIncomplete() {
        Complete = false;
    }
}
