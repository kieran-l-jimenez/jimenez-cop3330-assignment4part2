package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void getDescription() {
        //new Item
        //Item.Description = "some string"
        //assert Item.getDescription is same as "some string"
    }

    @Test
    void setDescription() {
        //new Item
        //Item.setDescription "some string"
        //assert Item.Description is "some string"
    }

    @Test
    void getDueDate() {
        //new Item
        //Item.DueDate = "2021-01-01"
        //assert equals Item.getDueDate, "2021-01-01"
    }

    @Test
    void setDueDate() {
        //new Item
        //Item.setDueDate("2021-01-01")
        //assert equals Item.DueDate, "2021-01-01"
    }

    @Test
    void markComplete() {
        //new Item
        //Item markComplete
        //assert Item.Complete
    }

    @Test
    void markIncomplete() {
        //new Item
        //Item markIncomplete
        //assert false Item.Complete
    }
}