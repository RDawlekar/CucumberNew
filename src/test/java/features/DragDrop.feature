Feature: DragDrop
Scenario: Drag and Drop
    Given the user is on the index page at "https://jqueryui.com/droppable/",Selenium should drag the element whose ID is "draggable" into the element whose ID is "droppable" Then should check the contents of "droppable"