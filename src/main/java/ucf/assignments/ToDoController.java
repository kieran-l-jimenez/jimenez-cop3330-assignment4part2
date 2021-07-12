/*
 * ToDoController
 *
 * 2021-07-11
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


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
    @FXML
    private Tab listTitle;

    private ToDoList currentList;
    private FileChooser fileChooser;

    @FXML
    public void clearListPressed(ActionEvent actionEvent) {
        //create new ToDoList object
        ToDoList temp = new ToDoList();
        //TODO prompt for Title
        currentList.clearAllItems();
        currentList = temp;
        showListUpdated(new ActionEvent());
    }

    @FXML
    public void openListPressed(ActionEvent actionEvent) {
        Stage stage = new Stage();
        fileChooser.setTitle("Open To Do List File");
        loadList(fileChooser.showOpenDialog(stage));
    }

    @FXML
    public void saveListPressed(ActionEvent actionEvent) {
        Stage stage = new Stage();
        fileChooser.setTitle("Save To Do List File");
        saveList(fileChooser.showSaveDialog(stage));
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

        fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JSON", "*.json"));


        itemFilter.getItems().addAll("All", "Incomplete", "Complete");
        itemFilter.setValue("All");
        itemFilter.setEditable(false);
        itemFilter.setVisibleRowCount(3);

        itemActionType.getItems().addAll("Add Item", "Edit Item Description", "Edit Item DueDate",
                "Delete Item", "Mark Incomplete", "Mark Complete");
        itemActionType.setValue("Add Item");

        listTitle.setText(currentList.getTitle());
    }

    public void makeItem(String descriptionText, String dateText) throws Exception {
        currentList.addItem(descriptionText, dateText);
        showListUpdated(new ActionEvent());
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

    public void saveList(File file) {
        Gson gson = new Gson();
        try (FileWriter fileWriter = new FileWriter(file.getPath())) {
            gson.toJson(currentList, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadList(File file ) {
        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(file.getPath())) {
            currentList = gson.fromJson(fileReader, ToDoList.class);
            showListUpdated(new ActionEvent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
