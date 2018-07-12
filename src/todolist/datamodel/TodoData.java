package todolist.datamodel;

import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TodoData {
    private static TodoData instance = new TodoData();
    private static String filename = "TodoListItems.txt";
    private List<TodoItem> todoItems;
    private DateTimeFormatter formatter;

    private static TodoData getInstance(){
        return instance;
    }

    private TodoData(){
        formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    public void loadTodoItems() throws IOException {

        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);

        try{


        } finally{

        }

    }

    public void storeTodoItems(){

    }


}
