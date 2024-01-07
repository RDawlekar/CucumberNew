package StepDefinationFile;

import com.google.common.collect.Lists;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.BeanProperty;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTableStepDefination {

    @Given("the details of student")
    public void theDetailsOfStudent(DataTable datatable) {
        List<Map<String,String>> rows=datatable.asMaps(String.class, String.class);
        for(Map<String,String> data:rows)
        {
            System.out.println(data.get("Name"));
            System.out.println(data.get("Dep"));
            System.out.println(data.get("Percentage"));

        }

           }


}
