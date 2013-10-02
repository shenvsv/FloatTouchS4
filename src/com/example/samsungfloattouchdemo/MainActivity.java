package com.example.samsungfloattouchdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("begin");
		findViewById(R.id.layout1).setOnHoverListener(new OnHoverListener() {
			
			@Override
			public boolean onHover(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("touch");
				return false;
			}
		});
		findViewById(R.id.layout1).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("click");
				Intent intent=new Intent(MainActivity.this,TestActivity.class);
				startActivity(intent);
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
