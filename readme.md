#README

The purpose of this program is to help the user manage and mark the completion of a set of tasks.
The user can add, delete, mark complete, mark incomplete, and edit tasks.

##Warning
Invalid operations like: 
- Editing/Deleting/Marking without a selected item
- Creating an item without a date that matches the format

will lead to errors with the program, so the user is advised to follow formatting as closely as possible.
In addition, trying to create an item without a proper date will prevent any further items being added to the list, 
but other operations, including exporting the list, are still available. If it is necessary to add more items, save the
list, restart the program, and open up the saved file.

##Dedication
This project would not be possible without the help of Rey.

###1. Operation of To Do List Manager

#####1.1 Menu Bar
   Along the top there are three (3) buttons:
   
   "Clear List" - Clicking this will clear the window in preparation of creating a new To Do List. 
   **NOTE: This process does NOT save the currently open list, so the user is urged to use the "Export List" button to 
   avoid losing any data.**
   
   "Load List" - Clicking this will open a file explorer and by navigating to a file (.json) created by this program, 
   the user can open a list for use.
   
   "Export List" - Clicking this will open a file explorer prompting for a name and location to save the current list. 
Notably, this program has no auto-save feature.

####1.2 List Tab

   Center: Item Viewing -
Use this box to navigate tasks in the current list for perusal and editing.
Select an item by left clicking in this box.  
To edit an entry, select it, select "Edit Item Description/Due Date", enter the new information in the respective field 
   along the bottom of the window, and click the "Execute Action" button.  
To mark an item complete or incomplete, select the appropriate entry from the "Item Action" drop down and click the 
   "Execute Action" button.

   Right: Filter Selection -
Use this choice box to determine which items are displayed.  
"All" - Display every task within this list.  
"Incomplete" - Display every task marked "Incomplete".  
"Complete" - Display every task marked "Complete".  
 

   Bottom: Text Fields, "Item Action" Choice Box, & "Execute Action" Button -  
"Item Description" Field: Enter a description of a new task or a new description for an old task.  
"Due Date (YYYY-MM-DD)" Field: Enter the date of completion for a new task or to change an old task. NOTE: It is very
important to enter the date in the given format.  
"Execute Action": Executes the command currently selected in "Item Action". Options include:  
- Add Item: Uses both fields to add a new task to the current list.
- Edit Item Description: Uses "Item Description" to replace the description of the selected item.
- Edit Item Due Date: Uses "Due Date (YYYY-MM-DD)" to replace the Due Date of the selected item.
- Delete: Removes the selected item from the current list. This cannot be undone.
- Mark Incomplete: Marks the selected item as incomplete. Items are marked incomplete by default.
- Mark Complete: Marks the selected item as complete. This can be undone using the above action.

####1.3 Help Tab

This tab exists to remind the user of some basic functions of this program.

