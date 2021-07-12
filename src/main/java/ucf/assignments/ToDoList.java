/*
 * ToDoList
 *
 * 2021-07-11
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {
    private String title;
    private ArrayList<Item> items;
    private int numItems;

    public ToDoList() {
        title = "List";
        items = new ArrayList<>();
        numItems = 0;
    }

    public void setTitle(String newTitle) {
        //user inputs new data into text field in GUI window
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void addItem(String desc, String date) {
        //add item to Items
        Item temp = new Item();
        temp.setDescription(desc);
        temp.setDueDate(date);
        items.add(temp);
        //increment numItems
        numItems++;
        //sort by date, call sorting method here
        this.sortItemDate();
    }

    public Item getItem(int index) {
        //returns a specific item data, most likely in a loop to display all items to GUI window
        return items.get(index);
    }

    public void removeItem(Item target) {
        //find item in arrayList
        if (items.contains(target)) {
            items.remove(target);//remove item
            numItems--;//decrement numItems
        }
    }

    public void editItemDescription(Item target, String newDescription) {
        //find item in arrayList
        if (items.contains(target)) {
            //replace data with copy of old data + new description
            items.get(items.indexOf(target)).setDescription(newDescription);
        }
    }

    public void editItemDate(Item target, String newDate) {
        //find item in arrayList
        if (items.contains(target)) {
            //replace data with copy of old data + new date
            items.get(items.indexOf(target)).setDueDate(newDate);
            this.sortItemDate();
        }
    }

    public ArrayList<Item> getItemList() {
        return items;
    }

    public void setItemList(ArrayList<Item> newList) {
        items = newList;
    }

    public void clearAllItems() {
        items.clear();
    }

    public void markItemComplete(Item target) {
        //find item
        if (items.contains(target)) {
            //have item call markComplete
            items.get(items.indexOf(target)).markComplete();
        }
    }

    public void markItemIncomplete(Item target) {
        //find item
        if (items.contains(target)) {
            //have item call markIncomplete
            items.get(items.indexOf(target)).markIncomplete();
        }
    }

    public ArrayList<Item> sortItemAll() {
        ArrayList<Item> tempArrayList = new ArrayList<>();

        //0 -> <numItems
        for (int i = 0; i < numItems; i++) {
                tempArrayList.add(items.get(i));
        }
        //return new/temp ArrayList
        return tempArrayList;
    }

    public ArrayList<Item> sortItemIncomplete() {
        ArrayList<Item> tempArrayList = new ArrayList<>();

        //0 -> <numItems
        for (int i = 0; i < numItems; i++) {
            if (!items.get(i).getComplete()) {
                //if item.Complete is false, add
                tempArrayList.add(items.get(i));
            }
        }
        //return new/temp ArrayList
        return tempArrayList;
    }

    public ArrayList<Item> sortItemComplete() {
        ArrayList<Item> tempArrayList = new ArrayList<>();

        //0 -> <numItems
        for (int i = 0; i < numItems; i++) {
            if (items.get(i).getComplete()) {
                //if item.Complete, add
                tempArrayList.add(items.get(i));
            }
        }
        //return new/temp ArrayList
        return tempArrayList;
    }

    public void sortItemDate() {
        //.sort arrays by DueDate
        items.sort(new SortByDate());
    }
}