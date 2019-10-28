package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="wow";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //存入数据库
        Manager manager=new Manager(this);
        /*manager.add(new Item("60"));
        manager.add(new Item("50"));
        manager.add(new Item("50"));*/
        Log.i(TAG, "onCreate: .................");

        List<Item> testlist = manager.listAll();
        for (Item i : testlist){
            Log.i(TAG, "onCreate: id +" +i.getWEIGHT());
        }
        //从数据库中读取

    }
}
