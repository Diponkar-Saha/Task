package com.diponnkar.task.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.diponnkar.task.R;
import com.diponnkar.task.adapter.DBAdapter;
import com.diponnkar.task.model.Product;
import com.diponnkar.task.data.local.TableHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.listeners.TableDataClickListener;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class TaskTwoActivity extends AppCompatActivity {


    EditText nameEditText,propellantEditTxt,destEditTxt;
    Button saveBtn;
    TableView<String[]> tb;
    TableHelper tableHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_two);



        //TABLEVIEW
        tableHelper=new TableHelper(this);
        tb = findViewById(R.id.tableView);
        tb.setColumnCount(3);
        tb.setHeaderBackgroundColor(Color.parseColor("#2ecc71"));
        tb.setHeaderAdapter(new SimpleTableHeaderAdapter(this,tableHelper.getSpaceProbeHeaders()));
        tb.setDataAdapter(new SimpleTableDataAdapter(this, tableHelper.getSpaceProbes()));

        //TABLE CLICK
        tb.addDataClickListener(new TableDataClickListener() {
            @Override
            public void onDataClicked(int rowIndex, Object clickedData) {
                Toast.makeText(TaskTwoActivity.this, ((String[])clickedData)[1], Toast.LENGTH_SHORT).show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog();
            }
        });
    }



    private void displayDialog()
    {
        Dialog d=new Dialog(this);
        d.setTitle("SQLITE DATA");
        d.setContentView(R.layout.dialog_layout);

        //INITIALIZE VIEWS
        nameEditText= (EditText) d.findViewById(R.id.nameEditTxt);
        propellantEditTxt= (EditText) d.findViewById(R.id.propEditTxt);
        destEditTxt= (EditText) d.findViewById(R.id.destEditTxt);

        saveBtn= (Button) d.findViewById(R.id.saveBtn);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product s = new Product();
                s.setName(nameEditText.getText().toString());
                s.setPrice(propellantEditTxt.getText().toString());
                s.setDate(destEditTxt.getText().toString());


                if (new DBAdapter(TaskTwoActivity.this).saveSpacecraft(s)) {
                    nameEditText.setText("");
                    propellantEditTxt.setText("");
                    destEditTxt.setText("");

                    tb.setDataAdapter(new SimpleTableDataAdapter(TaskTwoActivity.this, tableHelper.getSpaceProbes()));

                } else {
                    Toast.makeText(TaskTwoActivity.this, "Not Saved", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //SHOW DIALOG
        d.show();


    }

}