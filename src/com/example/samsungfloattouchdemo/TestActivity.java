package com.example.samsungfloattouchdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
        findViewById(R.id.layout2).setOnHoverListener(new OnHoverListener() {
			
			@Override
			public boolean onHover(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("touch"+v.getHeight()+v.getWidth());
				System.out.println("evevt"+event.getX()+event.getY());
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

}
