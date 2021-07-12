/*
 * ToDoController
 *
 * 2021-07-11
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ToDoController implements Initializable{
    @FXML
    private TextField itemDescriptionBox;
    @FXML
    private TextField itemDueDateBox;
    @FXML
    private ComboBox itemFilter;
    @FXML
    private ListView listView;
    @FXML
    private ChoiceBox itemActionType;

    private ToDoList currentList;

    @FXML
    public void clearListPressed(ActionEvent actionEvent) {
        //create new ToDoList object
        //prompt for Title
        //add new object to current set
        //instantiate ToDoList here?
    }

    @FXML
    public void openListPressed(ActionEvent actionEvent) {
        //prompt for path to JSON file
        //create new ToDoList using data from JSON
        //add new ToDoList to current set
        //create new tab matching "List 1" and "List 2" with Title
    }

    @FXML
    public void saveListPressed(ActionEvent actionEvent) {
        //prompt for directory to save list
        //save ToDoList data (including ArrayList of Items) as JSON
    }

    @FXML
    public void showListUpdated(ActionEvent actionEvent) {
        String filter = itemFilter.getValue().toString();
        ArrayList<Item> visibleItems;

        switch (filter) {
            case "Incomplete" ->
                    //Show Incomplete, sortIncomplete
                    visibleItems = currentList.sortItemIncomplete();
            case "Complete" ->
                    //Show Complete, sortComplete
                    visibleItems = currentList.sortItemComplete();
            default ->
                    //Show All
                    visibleItems = currentList.sortItemAll();
        }

        //change ListView node to display from temp ToDoList
        updateListView(visibleItems);
    }

    @FXML
    public void executePressed(ActionEvent actionEvent) {
        String actionType = itemActionType.getValue().toString();
        try {
            switch (actionType) {
                case "Add Item" -> makeItem(itemDescriptionBox.getText(), itemDueDateBox.getText());
                case "Edit Item Description" -> editDescription(itemDescriptionBox.getText());
                case "Edit Item DueDate" -> editDate(itemDueDateBox.getText());
                case "Delete Item" -> deleteItem();
                case "Mark Incomplete" -> markIncomplete();
                case "Mark Complete" -> markComplete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        currentList = new ToDoList();

        itemFilter.getItems().addAll("All", "Incomplete", "Complete");
        itemFilter.setValue("All");
        itemFilter.setEditable(false);
        itemFilter.setVisibleRowCount(3);

        itemActionType.getItems().addAll("Add Item", "Edit Item Description", "Edit Item DueDate",
                "Delete Item", "Mark Incomplete", "Mark Complete");
        itemActionType.setValue("Add Item");
    }

    public void makeItem(String descriptionText, String dateText) throws Exception {
        currentList.addItem(descriptionText, dateText);
        updateListView(currentList.sortItemAll());
    }

    public void editDate(String newDateText) throws Exception {
        currentList.editItemDate(currentList.getItem(listView.getSelectionModel().getSelectedIndex()), newDateText);
        showListUpdated(new ActionEvent());
        //updateListView(currentList.sortItemAll());
    }

    public void editDescription(String newDescriptionText) throws Exception {
        currentList.editItemDescription(currentList.getItem(listView.getSelectionModel().getSelectedIndex()),
                newDescriptionText);
        showListUpdated(new ActionEvent());
    }

    public void deleteItem() throws Exception {
        currentList.removeItem(currentList.getItem(listView.getSelectionModel().getSelectedIndex()));
        showListUpdated(new ActionEvent());
    }

    public void markIncomplete() throws Exception {
        currentList.getItem(listView.getSelectionModel().getSelectedIndex()).markIncomplete();
        showListUpdated(new ActionEvent());
    }

    public void markComplete() throws Exception {
        currentList.getItem(listView.getSelectionModel().getSelectedIndex()).markComplete();
        showListUpdated(new ActionEvent());
    }

    public void updateListView(ArrayList<Item> visibleItems) {
        listView.getItems().clear();
        for (Item visibleItem : visibleItems) {
            listView.getItems().add(visibleItem.getDescription() + "\t\t\tDue: " + visibleItem.getDueDateString());
        }
    }
}
