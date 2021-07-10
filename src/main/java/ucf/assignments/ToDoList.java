/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {
    String Title;
    ArrayList<Item> Items;
    int numItems;

    public void setTitle(String newTitle) {
        //user inputs new data into text field in GUI window
    }

    public String getTitle() {
        return "List 1";
    }

    public Item getItem() {
        //returns a specific item data, most likely in a loop to display all items to GUI window
        Item tempItem = new Item();
        return tempItem;
    }

    public void addItem() {
        //window asks for item info(passed in from controller class)
        //add item to Items
        //increment numItems
        //insert sort by date
    }

    public void removeItem() {
        //find item in arrayList
        //remove item
        //decrement numItems
    }

    public void editItem() {
        //find item in arrayList
        //replace data with copy of old data + any changes
    }

    public void markItemComplete() {
        //find item
        //have item call markComplete
    }

    public void markItemIncomplete() {
        //find item
        //have item call markIncomplete
    }

    public ArrayList sortItemComplete() {
        //0 - <numItems
        //if item.Complete, add
        //return new/temp ArrayList
        ArrayList tempArrayList = new ArrayList();
        return tempArrayList;
    }

    public ArrayList sortItemIncomplete() {
        //0 - <numItems
        //if !item.Complete, add
        //return new/temp ArrayList
        ArrayList tempArrayList = new ArrayList();
        return tempArrayList;
    }

    public void sortItemDate() {
        //sorts Items by DueDate
    }

    public void exportList() {
        //new file, save info to a default directory or directory user gives in JSON
    }

    public void loadList() {
        //open JSON file
        //Title =
        //numItems =
        //0 - <numItems: addItem with JSON data
    }
}