package com.example.mvvm_buttondelete.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.mvvm_buttondelete.R;
import com.example.mvvm_buttondelete.model.Notebook;
import com.example.mvvm_buttondelete.viewmodel.DatabaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    // создание полей
    private RecyclerView recyclerView; // поле для списка RecyclerView
    private FloatingActionButton fabAdd; // поле для кнопки добавить новую заметку
    private FloatingActionButton fabDel; // поле для кнопки добавить новую заметку

    private List<Notebook> notesList; // поле для контейнера списка заметок

    private DatabaseHelper database; // поле работы с БД

    private Adapter adapter; // поле для адаптера

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // присваивание id полям
        recyclerView = findViewById(R.id.recycler_list);
        fabAdd = findViewById(R.id.fabAdd);
        fabDel = findViewById(R.id.fabDel);

        notesList = new ArrayList<>(); // выделение памяти и задание типа контейнера для списка заметок
        database = new DatabaseHelper(this); // выделение памяти и задание текущего контекста работы с БД
    }
}