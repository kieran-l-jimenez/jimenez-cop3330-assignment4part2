/*
 * App
 *
 * 2021-07-10
 *
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Kieran Jimenez
 */
package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*Your application shall satisfy the following requirements (note that, as in the real world, these may have changed since [Part 1]):
1. The application shall manage a single list of items
    -The list shall have the capacity to store at least 100 unique items
2. An item shall have a description
    -A description shall be between 1 and 256 characters in length
3. An item shall have a due date
    -A due date shall be a valid date within the Gregorian Calendar
    -A due date shall be displayed to users in the format: YYYY-MM-DD
4. A user shall be able to add a new item to the list
5. A user shall be able to remove an item from the list
6. A user shall be able to clear the list of all items
7. A user shall be able to edit the description of an item within the list
8. A user shall be able to edit the due date of an item within the list
9. A user shall be able to mark an item in the list as either complete or incomplete
10. A user shall be able to display all of the existing items in the list
11. A user shall be able to display only the incomplete items in the list
12. A user shall be able to display only the completed items in the list
13. A user shall be able to save the list (and all of its items) to external storage
14. A user shall be able to load a list (and all of its items) from external storage
15. The developer shall provide a help screen with directions on how to use the application.
    -The help screen shall describe how to execute each behavioral requirement provided by the application (e.g. add an item, remove an item, edit an item, etc)
    -The help screen shall include a dedication to "Rey"
    -This help screen shall be provided as either a dedicated window within the application, or a markdown file called `readme.md` on your GitHub repository for the project.)
 */

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

            Scene scene = new Scene(root);

            stage.setTitle("To Do List Manager");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}