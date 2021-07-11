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
    void setDescriptionLarge() {
        // Requirement 2
        //new Item
        Item temp = new Item();
        //Item.setDescription random string 256 characters long
        temp.setDescription("XMPGgZFFtQ5JAGf1pel9BYJpbfZrF3SmvAcxoctZJFYoQRgVsaOhUbsiIXOakHk4hcPuCUqNqFa5zySVbAoKReU" +
                "mFEwF2zRLeiXMWIbcya3vH363iaoGhfYZKzigJjfRojSClj2jLNUldhoVyYiYo2YlXxLB7uRtoPKIH8FOvMjOXOCLkI0gbi4RBK" +
                "gLCPMUliZlNW4jtsLh75XfSWPJBAORC6uFbAEiTjhOhH3jmOIDd0pdFG52HdEY7d6o2IBZ");
        //assert Item.Description is "some string"
        assertEquals("XMPGgZFFtQ5JAGf1pel9BYJpbfZrF3SmvAcxoctZJFYoQRgVsaOhUbsiIXOakHk4hcPuCUqNqFa5zySVbAoKReU" +
                "mFEwF2zRLeiXMWIbcya3vH363iaoGhfYZKzigJjfRojSClj2jLNUldhoVyYiYo2YlXxLB7uRtoPKIH8FOvMjOXOCLkI0gbi4RBK" +
                "gLCPMUliZlNW4jtsLh75XfSWPJBAORC6uFbAEiTjhOhH3jmOIDd0pdFG52HdEY7d6o2IBZ", temp.getDescription());
    }

    @Test
    void setDueDate() {
        // Requirement 3
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