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

    public void removeItem(Item target) {
        //find item in arrayList
        if (Items.contains(target)) {
            Items.remove(target);//remove item
            numItems--;//decrement numItems
        }
    }

    public void editItemDescription(Item target, String newDescription) {
        //find item in arrayList
        if (Items.contains(target)) {
            //replace data with copy of old data + new description
            Items.get(Items.indexOf(target)).setDescription(newDescription);
        }
    }

    public void editItemDate(Item target, String newDate) {
        //find item in arrayList
        if (Items.contains(target)) {
            //replace data with copy of old data + new date
            Items.get(Items.indexOf(target)).setDueDate(newDate);
        }
    }

    public void markItemComplete(Item target) {
        //find item
        if (Items.contains(target)) {
            //have item call markComplete
            Items.get(Items.indexOf(target)).markComplete();
        }
    }

    public void markItemIncomplete(Item target) {
        //find item
        if (Items.contains(target)) {
            //have item call markIncomplete
            Items.get(Items.indexOf(target)).markIncomplete();
        }
    }

    public ArrayList<Item> sortItemComplete() {
        ArrayList<Item> tempArrayList = new ArrayList<Item>();

        //0 - <numItems
        for (int i = 0; i < numItems; i++) {
            if (Items.get(i).getComplete()) {
                //if item.Complete, add
                tempArrayList.add(Items.get(i));
            }
        }
        //return new/temp ArrayList
        return tempArrayList;
    }

    public ArrayList<Item> sortItemIncomplete() {
        ArrayList<Item> tempArrayList = new ArrayList<Item>();

        //0 - <numItems
        for (int i = 0; i < numItems; i++) {
            if (!Items.get(i).getComplete()) {
                //if item.Complete is false, add
                tempArrayList.add(Items.get(i));
            }
        }
        //return new/temp ArrayList
        return tempArrayList;
    }

    public void sortItemDate() {
        //Items .toArray arrays
        //.sort arrays by DueDate
        //TODO change Item to implement Comparable interface
        //.clear Items
        //for (0 -> numItems) : Items.add(arrays[i])
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