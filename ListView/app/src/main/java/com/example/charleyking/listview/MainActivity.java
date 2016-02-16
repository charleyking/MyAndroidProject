package com.example.charleyking.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charleyking on 2/14/16.
 */
public class MainActivity extends Activity{
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initFruits() {
        Fruit crow = new Fruit("Crow", R.drawable.crow_48);
        fruitList.add(crow);
        Fruit grave = new Fruit("Grave", R.drawable.grave_48);
        fruitList.add(grave);
        Fruit skull = new Fruit("Skull", R.drawable.skull_48);
        fruitList.add(skull);
        Fruit werewolf = new Fruit("Werewolf", R.drawable.werewolf_48);
        fruitList.add(werewolf);
        Fruit zombie = new Fruit("Zombie", R.drawable.zombie_48);
        fruitList.add(zombie);
        Fruit a = new Fruit("Crow", R.drawable.crow_48);
        fruitList.add(crow);
        Fruit b = new Fruit("Grave", R.drawable.grave_48);
        fruitList.add(grave);
        Fruit c = new Fruit("Skull", R.drawable.skull_48);
        fruitList.add(skull);
        Fruit d = new Fruit("Werewolf", R.drawable.werewolf_48);
        fruitList.add(werewolf);
        Fruit e = new Fruit("Zombie", R.drawable.zombie_48);
        fruitList.add(zombie);
        Fruit f = new Fruit("Crow", R.drawable.crow_48);
        fruitList.add(crow);
        Fruit g = new Fruit("Grave", R.drawable.grave_48);
        fruitList.add(grave);
        Fruit h = new Fruit("Skull", R.drawable.skull_48);
        fruitList.add(skull);
        Fruit i = new Fruit("Werewolf", R.drawable.werewolf_48);
        fruitList.add(werewolf);
        Fruit j = new Fruit("Zombie", R.drawable.zombie_48);
        fruitList.add(zombie);
    }
}
