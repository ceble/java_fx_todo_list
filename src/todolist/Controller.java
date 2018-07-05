package todolist;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    @FXML
    private ListView todoListView;

    public void initialize(){
        TodoItem item1 = new TodoItem("First todo item", "This is details for the first item", LocalDate.of(2018,07,28));
        TodoItem item2 = new TodoItem("2 First todo item", "2 This is details for the first item", LocalDate.of(2018,07,28));
        TodoItem item3 = new TodoItem("3 First todo item", "3 This is details for the first item", LocalDate.of(2018,07,28));
        TodoItem item4 = new TodoItem("4 First todo item", "4 This is details for the first item", LocalDate.of(2018,07,28));
        TodoItem item5 = new TodoItem("5 First todo item", "5 This is details for the first item", LocalDate.of(2018,07,28));
        TodoItem item6 = new TodoItem("6 First todo item", "6 This is details for the first item", LocalDate.of(2018,07,28));

        todoItems = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5,item6));

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }


}
