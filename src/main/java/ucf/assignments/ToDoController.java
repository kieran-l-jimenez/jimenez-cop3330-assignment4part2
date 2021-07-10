/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ToDoController {
    @FXML
    private TextField itemDescriptionBox1;
    @FXML
    private TextField itemDueDateBox1;
    @FXML
    private ChoiceBox itemFilter;

    @FXML
    public void makeItem(ActionEvent actionEvent) {
        //Add Item button pressed
        //read text field Item Description and Due Date (YYYY-MM-DD)
        //add new item to Array List of tab selected
    }

    @FXML
    public void addList(ActionEvent actionEvent) {
        //create new ToDoList object
        //prompt for Title
        //add new object to current set
        //create new tab matching pattern of "List 1" and "List 2"
    }

    @FXML
    public void openList(ActionEvent actionEvent) {
        //prompt for path to JSON file
        //create new ToDoList using data from JSON
        //add new ToDoList to current set
        //create new tab matching "List 1" and "List 2" with Title
    }

    @FXML
    public void saveList(ActionEvent actionEvent) {
        //prompt for directory to save list
        //save ToDoList data (including ArrayList of Items) as JSON
    }

    @FXML
    public void showIncomplete(ActionEvent actionEvent) {
        //create temp copy of selected ToDoList
        //copy only Items with !complete or Complete == false
        //change ListView node to display from temp ToDoList
    }

    @FXML
    public void showComplete(ActionEvent actionEvent) {
        //create temp copy of selected ToDoList
        //copy only Items with complete or Complete == true
        //change ListView node to display from temp ToDoList
    }
}
