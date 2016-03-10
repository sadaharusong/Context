package com.example.context;

import java.util.ArrayList;

import android.R.anim;
import android.R.id;
import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showListView();
	}

	private void showListView()
	{
		ListView listView = (ListView) findViewById(R.id.listview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getDate());
		listView.setAdapter(adapter);
		this.registerForContextMenu(listView);
		
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.setHeaderTitle("����");
		menu.setHeaderIcon(R.drawable.ic_launcher);
		menu.add(1, 1, 1, "����");
		menu.add(1, 2, 1, "ճ��");
		menu.add(1, 3, 1, "����");
		menu.add(1, 4, 1, "ɾ��");
	}
	private ArrayList<String> getDate(){
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			list.add("�ļ�"+(i+1));
		}
		return list;
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()){
		case 1:
			Toast.makeText(MainActivity.this, "�������", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			Toast.makeText(MainActivity.this, "���ճ��", Toast.LENGTH_SHORT).show();

			break;	
		case 3:
			Toast.makeText(MainActivity.this, "�������", Toast.LENGTH_SHORT).show();

			break;
		case 4:
			Toast.makeText(MainActivity.this, "���ɾ��", Toast.LENGTH_SHORT).show();

			break;
		}
		return super.onContextItemSelected(item);
		
	}
}
