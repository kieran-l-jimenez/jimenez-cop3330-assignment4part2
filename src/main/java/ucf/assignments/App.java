/*
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

/*Your application shall satisfy the following requirements:
1. The application shall be able to manage at least 100 unique todo lists
2. A todo list shall have a title
3. A todo list shall have the capacity to store at least 100 unique items
4. An item shall have a description
5. An item shall have a due date, formatted as YYYY-MM-DD

6. A user shall be able to add a new todo list
7. A user shall be able to remove an existing todo list
8. A user shall be able to edit the title of an existing todo list
9. A user shall be able to add a new item to an existing todo list
10. A user shall be able to remove an item from an existing todo list
11. A user shall be able to edit the description of an item within an existing todo list
12. A user shall be able to edit the due date of an item within an existing todo list
13. A user shall be able to mark an item in a todo list as complete
14. A user shall be able to display all of the existing items in a todo list
15. A user shall be able to display only the incompleted items in a todo list
16. A user shall be able to display only the completed items in a todo list
17. A user shall be able to save all of the items in a single todo list to external storage
18. A user shall be able to save all of the items across all of the todo lists to external storage
19. A user shall be able to load a single todo list that was previously saved to external storage
20. A user shall be able to load multiple todo lists that were previous saved to external storage
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