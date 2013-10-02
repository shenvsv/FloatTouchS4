FloatTouchS4
============

demo for S4 FloatTouch
if you activity is not the main 
add
<intent-filter>
      <action android:name="com.sec.android.airview.HOVER" />
</intent-filter>
in manifest

                findViewById(R.id.layout2).setOnHoverListener(new OnHoverListener() {
			
			@Override
			public boolean onHover(View v, MotionEvent event) {
				// TODO Auto-generated method stub
//				System.out.println("touch"+v.getHeight()+v.getWidth());
				System.out.println("evevt"+event.getX()+"//"+event.getY());
				return false;
			}
		});
