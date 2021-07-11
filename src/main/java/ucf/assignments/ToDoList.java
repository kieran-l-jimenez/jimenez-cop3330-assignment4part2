/*
 * ToDoList
 *
 * 2021-07-10
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {
    private String Title;
    private ArrayList<Item> Items;
    private int numItems;

    public void setTitle(String newTitle) {
        //user inputs new data into text field in GUI window
        Title = newTitle;
    }

    public String getTitle() {
        return Title;
    }

    public void addItem(String desc, String date) {
        //window asks for item info(passed in from controller class)
        //add item to Items
        Item temp = new Item();
        temp.setDescription(desc);
        temp.setDueDate(date);
        Items.add(temp);
        //increment numItems
        numItems++;
        //insert sort by date, call sorting method here

    }

    public Item getItem(int index) {
        //returns a specific item data, most likely in a loop to display all items to GUI window
        Item retItem = Items.get(index);
        return retItem;
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

    public ArrayList<Item> sortItemComplete() {
        //0 - <numItems
        //if item.Complete, add
        //return new/temp ArrayList
        ArrayList<Item> tempArrayList = new ArrayList<Item>();
        return tempArrayList;
    }

    public ArrayList<Item> sortItemIncomplete() {
        //0 - <numItems
        //if !item.Complete, add
        //return new/temp ArrayList
        ArrayList<Item> tempArrayList = new ArrayList<Item>();
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