package ucf.assignments;

import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;
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
        temp.addItem("example description", "2023-07-11");
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
    void editItemDueDate() {
        // Requirement 8
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //add to ArrayList Items 3 items
        tempList.addItem("description 1", "2020-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        //call editItem changing duedate of item 1
        tempList.editItemDate(tempList.getItem(0), "2021-01-02");

        //assert item 1 dueDate is new date
        assertEquals("2021-01-02", tempList.getItem(2).getDueDateString());
    }

    @Test
    void editItemDescription() {
        // Requirement 7
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //add to ArrayList Items 3 items
        tempList.addItem("description 1", "2020-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        //call editItem changing description of item 2
        tempList.editItemDescription(tempList.getItem(1), "new description 2");

        //assert item 2 dueDate is new date
        assertEquals("new description 2", tempList.getItem(1).getDescription());
    }

    @Test
    void editItem_noChange() {
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //add to ArrayList Items 3 items
        tempList.addItem("description 1", "2019-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        //call editItem changing duedate of item 1 with invalid string such as "jan 12th"
        tempList.editItemDate(tempList.getItem(0), "Invalid String");

        //assert item 1 dueDate is old date
        assertEquals("2019-01-01", tempList.getItem(0).getDueDateString());

    }

    @Test
    void markItemComplete() {
        // Requirement 9.1
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //add to ArrayList Items 3 items
        tempList.addItem("description 1", "2019-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        //call markItemComplete for item 1
        tempList.getItem(0).markComplete();

        //assert item 1 Complete
        assertTrue(tempList.getItem(0).getComplete());
    }

    @Test
    void markItemIncomplete() {
        // Requirement 9.2
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //add to ArrayList Items 3 items
        tempList.addItem("description 1", "2019-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        //call markItemComplete for item 1
        tempList.getItem(0).markComplete();
        tempList.getItem(0).markIncomplete();

        //assert false item 1 Complete
        assertFalse(tempList.getItem(0).getComplete());
    }

    @Test
    void sortItemAll() {
        // Requirement 10
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //ToDoList Items with 3 items, only item 1 is Complete
        tempList.addItem("description 1", "2019-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        tempList.getItem(0).markComplete();

        //set Array Items to that ToDoList items
        Item[] tempArray = new Item[3];
        tempArray[0] = tempList.getItem(0);
        tempArray[1] = tempList.getItem(1);
        tempArray[2] = tempList.getItem(2);

        //call sort and hold temp
        tempList.setItemList(tempList.sortItemAll());

        //assert temp item 1 is ToDoList item 1 and temp item 3 is TDL item 3
        assertTrue((tempList.getItem(0).getDueDateString().equals(tempArray[0].getDueDateString())) &&
                (tempList.getItem(2).getDueDateString().equals(tempArray[2].getDueDateString())));
    }

    @Test
    void sortItemIncomplete() {
        // Requirement 11
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //ToDoList Items with 3 items, only item 1 is Complete
        tempList.addItem("description 1", "2019-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        tempList.getItem(0).markComplete();

        //set Array Items to that ToDoList items
        Item[] tempArray = new Item[3];
        tempArray[0] = tempList.getItem(0);
        tempArray[1] = tempList.getItem(1);
        tempArray[2] = tempList.getItem(2);

        //call sort and hold temp
        tempList.setItemList(tempList.sortItemIncomplete());

        //assert TDList item 1 is array item 2
        assertEquals(tempArray[1].getDescription(), tempList.getItem(0).getDescription());
    }

    @Test
    void sortItemComplete() {
        // Requirement 12
        //new ToDoList object
        ToDoList tempList = new ToDoList();

        //ToDoList Items with 3 items, only item 3 is Complete
        tempList.addItem("description 1", "2019-01-01");
        tempList.addItem("description 2", "2020-01-02");
        tempList.addItem("description 3", "2021-01-01");

        tempList.getItem(2).markComplete();

        //set ToDoList Items to that ArrayList
        Item tempItem = tempList.getItem(2);

        //call sort and hold temp
        ArrayList<Item> tempArray = tempList.sortItemComplete();

        //assert temp item 1 is ToDoList item 2 and temp item 2 is TDL item 3
        assertEquals(tempItem.getDescription(), tempArray.get(0).getDescription());
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

    @Test
    void clearAllItems() {
        // Requirement 6
        //new ToDoList, fill with three items
        ToDoList tempList = new ToDoList();
        tempList.addItem("description 1", "2021-07-01");
        tempList.addItem("description 2", "2021-07-02");
        tempList.addItem("description 3", "2021-07-03");

        //clearAllItems
        tempList.clearAllItems();

        //add different first item
        tempList.addItem("new item 1", "2021-10-31");

        //assert list is null
        assertEquals(tempList.getItem(0).getDescription(), "new item 1");
    }
}