/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

public class Item {
    String Description;
    String DueDate;//YYYY-MM-DD
    Boolean Complete;

    public String getDescription() {
        return "task 1";
    }

    public void setDescription() {
        //set this.Description = new description
    }

    public String getDueDate() {
        return "2021-12-31";
    }

    public void setDueDate() {
        //check that new due date follows format "\d\d\d\d-\d\d-\d\d"
        //set this.DueDate = new due date
    }

    public void markComplete() {
        Complete = true;
    }

    public void markIncomplete() {
        Complete = false;
    }
}
