Feature:  DragDrop
Scenario: Drag and drop
Given the user is on the index page at "https://jqueryui.com/droppable/"
When selenium should drag the element whose ID is draggable into the element whose ID is droppable
Then should check the contents of drop-status