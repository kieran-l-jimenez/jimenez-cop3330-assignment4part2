package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void setDescription() {
        //new Item
        Item temp = new Item();
        //Item.setDescription "some string"
        temp.setDescription("some string?");
        //assert Item.Description is "some string"
        assertEquals("some string?", temp.getDescription());
    }

    @Test
    void setDueDate() {
        //new Item
        Item temp = new Item();
        //Item.setDueDate("2021-01-01")
        temp.setDueDate("2021-01-01");
        //assert equals Item.DueDate, "2021-01-01"
        assertEquals("2021-01-01", temp.getDueDateString());
    }

    @Test
    void markComplete() {
        //new Item
        Item temp = new Item();
        //Item markComplete
        temp.markComplete();
        //assert Item.Complete
        assertTrue(temp.getComplete());
    }

    @Test
    void markIncomplete() {
        //new Item
        Item temp = new Item();
        //Item markIncomplete
        temp.markComplete();
        temp.markIncomplete();
        //assert false Item.Complete
        assertFalse(temp.getComplete());
    }
}