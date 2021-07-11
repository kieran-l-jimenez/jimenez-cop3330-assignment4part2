package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void capacityCheck() {
        // Requirement 1
        //new ToDoList object
        ToDoList temp = new ToDoList();
        //try loop add 100 items
        try {
            for (int i = 0; i < 100; i++) {
                temp.addItem(String.format("Task #%d", i), "2021-7-11");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //assert sizeof == 100
        assertEquals(100, temp.getItemList().size());
    }

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
        // Requirement 4
        //new ToDoList object
        ToDoList temp = new ToDoList();
        //call addItem
        temp.addItem("example description", "2021-07-11");
        //assert first item in ArrayList Items description or date = expected item description or date
        assertTrue(temp.getItem(0).getDescription().equals("example description"));
    }

    @Test
    void removeItem() {
        // Requirement 5
        //new ToDoList object
        ToDoList tempList = new ToDoList();
        Item itemOne = new Item();
        Item itemTwo = new Item();
        Item itemThree = new Item();
        boolean successful = false;

        //new ArrayList Items with 3 items
        ArrayList<Item> tempArray = new ArrayList<>();

        itemOne.setDescription("description 1");
        itemOne.setDueDate("2020-01-01");
        itemTwo.setDescription("description 2");
        itemTwo.setDueDate("2020-01-02");
        itemThree.setDescription("description 3");
        itemThree.setDueDate("2021-01-01");

        //set ToDoList Items to that ArrayList
        tempArray.add(itemOne);
        tempArray.add(itemThree);
        tempList.addItem(itemOne.getDescription(), itemOne.getDueDateString());
        tempList.addItem(itemTwo.getDescription(), itemTwo.getDueDateString());
        tempList.addItem(itemThree.getDescription(), itemThree.getDueDateString());

        //call removeItem
        tempList.removeItem(tempList.getItem(1));

        if ((tempList.getItemList().size() == 2) &&
                (tempList.getItem(1).getDueDateString().equals(itemThree.getDueDateString()))) {
            successful = true;
        }
        //assert flag & ToDoList numItems = expected size
        assertTrue(successful);
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
        ToDoList temp = new ToDoList();

        Item first = new Item();
        Item last = new Item();

        //new ArrayList Items with 3 items, unsorted dates
        temp.addItem("Celebrate January 10th","2021-01-10");
        temp.addItem("Grab candy", "2021-10-28");
        temp.addItem("Celebrate New Year's Day", "2021-01-01");

        //set ToDoList Items to that ArrayList
        temp.sortItemDate();

        //expected1 and expected3 strings for first and last expected dates respectively
        first.setDueDate("2021-01-01");
        first.setDescription("Celebrate New Year's Day");

        last.setDueDate("2021-10-28");
        last.setDescription("Grab candy");

        //assert TDL item 1 date is expected1 and TDL item 3 date is expected3
        assertEquals(first.getDueDateString(), temp.getItem(0).getDueDateString());
    }
}