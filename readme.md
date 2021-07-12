#README

The purpose of this program is to help the user manage and mark the completion of a set of tasks.
The user can add, delete, mark complete, mark incomplete, and edit tasks.

##Warning
Invalid operations like: 
- Editing/Deleting/Marking without a selected item
- Creating an item without a date that matches the format

will lead to the program freezing and losing any unsaved data, requiring a restart.
For this reason it is advised to save early and often.

###1. Operation of To Do List Manager

#####1.1 Menu Bar
   Along the top there are three (3) buttons:
   
   "New List" - Clicking this will clear the window in preparation of creating a new To Do List. 
   **NOTE: This process does NOT save the currently open list, so the user is urged to use the "Export List" button to avoid
   losing any data.**
   
   "Load List" - Clicking this will open a file explorer and by navigating to a file created by this program it will allow
the user to open a list for use.
   
   "Export List" - Clicking this will open a file explorer prompting for a location to save the current list.

####1.2 List Tab

   Center: Item Viewing -
Use this box and scroll wheel to navigate tasks in the current list for perusal and editing.  
To edit an entry, select it and click the "Edit" button.  
To mark an item complete or incomplete, click the checkbox to the left of the entry.

   Right: Filter Selection -
Use this choice box to determine which items are displayed.  
"All" - Display every task within this list.  
"Complete" - Display every task marked "Complete".  
"Incomplete" - Display every task marked "Incomplete".  
Press "Show List" to update the tasks displayed.

   Bottom: Text Fields & "Add Item" Button -  
"Item Description" Field: Enter a description of a new task to be added to the To Do List.  
"Due Date (YYYY-MM-DD)" Field: Enter the date of completion for this task.  
"Add Item": Finalize the new entry and add to the list.  
Description and Due Date can be changed after entry into the list using the "Edit" button.

####1.3 Help Tab

This tab exists to remind the user of some basic functions of this program.