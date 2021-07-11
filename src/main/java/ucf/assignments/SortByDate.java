/*
 * SortByDate
 *
 * 2021-07-11
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.util.Comparator;

public class SortByDate implements Comparator<Item> {

    public int compare(Item a, Item b) {
        return a.getDueDateString().compareTo(b.getDueDateString());
    }
}
