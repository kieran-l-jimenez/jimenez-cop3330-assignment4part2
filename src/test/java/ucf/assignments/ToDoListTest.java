package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void setTitle() {
        //new ToDoList object
        //call setTitle with "some string"
        //assert ToDoList.Title.equals "some string"
    }

    @Test
    void getTitle() {
        //new ToDoList object
        //set ToDoList.Title = "something"
        //assert ToDoList.getTitle = "something"
    }

    @Test
    void getItem() {
        //new ToDoList object
        //new ArrayList Items with 3 items
        //set ToDoList Items to that ArrayList
        //assert :getItem passing in index.description = expected description
    }

    @Test
    void addItem() {
        //new ToDoList object
        //call addItem
        //assert first item in ArrayList Items description or date = expected item description or date
    }

    @Test
    void removeItem() {
        //new ToDoList object
        //new ArrayList Items with 3 items
        //set ToDoList Items to that ArrayList
        //call removeItem
        //loop through arrayList making sure item isnt there with flag
        //assert flag & ToDoList numItems = expected size
    }

    @Test
    void editItem() {
        //new ToDoList object
        //new ArrayList Items with 3 items
        //set ToDoList Items to that ArrayList
        //call editItem changing duedate of item 1
        //assert item 1 dueDate is new date
    }

    @Test
    void editItem_noChange() {
        //new ToDoList object
        //new ArrayList Items with 3 items
        //set ToDoList Items to that ArrayList
        //call editItem changing duedate of item 1 with invalid string such as "jan 12th"
        //assert item 1 dueDate is old date
    }

    @Test
    void markItemComplete() {
        //new ToDoList object
        //new ArrayList Items with 3 items, item 1 Complete = false
        //set ToDoList Items to that ArrayList
        //call markItemComplete for item 1
        //assert item 1 Complete
    }

    @Test
    void markItemIncomplete() {
        //new ToDoList object
        //new ArrayList Items with 3 items, item 1 Complete = true
        //set ToDoList Items to that ArrayList
        //call markItemIncomplete for item 1
        //assertfalse item 1 Complete
    }

    @Test
    void sortItemComplete() {
        //new ToDoList object
        //new ArrayList Items with 3 items, only item 1 !Complete
        //set ToDoList Items to that ArrayList
        //call sort and hold temp
        //assert temp item 1 is ToDoList item 2 and temp item 2 is TDL item 3
    }

    @Test
    void sortItemIncomplete() {
        //new ToDoList object
        //new ArrayList Items with 3 items, only item 1 Complete
        //set ToDoList Items to that ArrayList
        //call sort and hold temp
        //assert temp item 1 is ToDoList item 2 and temp item 2 is TDL item 3
    }

    @Test
    void sortItemDate() {
        //new ToDoList object
        //new ArrayList Items with 3 items, unsorted dates
        //set ToDoList Items to that ArrayList
        //expected1 and expected3 strings for first and last expected dates respectively
        //assert TDL item 1 date is expected1 and TDL item 3 date is expected3
    }
}