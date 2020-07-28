package com.sns.dropdownmenu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;
import android.animation.*;

import java.util.*;

import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private boolean drop_down_menu = false;

	// USED LINEAR LAUOUTS
	private LinearLayout base;
	private LinearLayout search_bar;
	private LinearLayout drop_down_linear;
	private LinearLayout show_list1_linear;
	private LinearLayout more_option_linear;
	private LinearLayout back_button_linear;

	// OTHER LINEAR LAYOUTS
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;

	// IMAGE VIEW
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview11;
	private ImageView imageview12;
	private ImageView imageview13;
	private ImageView imageview14;
	private ImageView imageview15;
	private ImageView imageview16;
	private ImageView imageview17;
	private ImageView imageview18;
	private ImageView imageview19;
	private ImageView imageview20;
	private ImageView imageview21;
	private ImageView imageview22;
	private ImageView imageview23;
	private ImageView imageview24;

	// TEXT VIEW
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;

	// THIS IS HADING TEXT
	private TextView hading;

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {

		// Used Linear Layouts
		base = findViewById(R.id.base);
		search_bar = findViewById(R.id.search_bar);
		drop_down_linear = findViewById(R.id.drop_down_linear);
		show_list1_linear = findViewById(R.id.show_list1_linear);
		more_option_linear = findViewById(R.id.more_option_linear);
		back_button_linear = findViewById(R.id.back_button_linear);

		// Image View
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		imageview11 = findViewById(R.id.imageview11);
		imageview12 = findViewById(R.id.imageview12);
		imageview13 = findViewById(R.id.imageview13);
		imageview14 = findViewById(R.id.imageview14);
		imageview15 = findViewById(R.id.imageview15);
		imageview16 = findViewById(R.id.imageview16);
		imageview17 = findViewById(R.id.imageview17);
		imageview18 = findViewById(R.id.imageview18);
		imageview19 = findViewById(R.id.imageview19);
		imageview20 = findViewById(R.id.imageview20);
		imageview21 = findViewById(R.id.imageview21);
		imageview22 = findViewById(R.id.imageview22);
		imageview23 = findViewById(R.id.imageview23);
		imageview24 = findViewById(R.id.imageview24);

		// Linear Layout's
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);

		//Text View
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);

		// Used Text View
		hading = findViewById(R.id.hading);
		
		base.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (drop_down_menu) {
					drop_down_menu = false;
					_DROPDOWN_MENU_CLOSE();
				}
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (drop_down_menu) {
					drop_down_menu = false;
					_DROPDOWN_MENU_CLOSE();
				}
				else {
					drop_down_menu = true;
					_DROPDOWN_MENU_OPEN();
				}
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "Profile Clicked");
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "Settings Clicked");
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ON_TAP_MORE_OPTION();
			}
		});
		
		back_button_linear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ON_TAP_BACK();
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "Privacy Clicked");
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "Facebook Clicked");
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "Instagram Clicked");
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "Pinterest Clicked");
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				AndroidWithLuckyUtil.showMessage(getApplicationContext(), "About Us Clicked");
			}
		});
	}
	private void initializeLogic() {
		_ON_CREATE();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);

	}
	
	private void _ON_CREATE () {
		_DROPDOWN_MENU_CLOSE();
		_UI();
		_Animator(show_list1_linear, "translationX", AndroidWithLuckyUtil.getDip(getApplicationContext(), -200));
	}
	
	
	private void _DROPDOWN_MENU_OPEN () {
		drop_down_linear.setVisibility(View.VISIBLE);
		show_list1_linear.setVisibility(View.VISIBLE);
		more_option_linear.setVisibility(View.GONE);
		_TRANSITION(base);
		_Fade(drop_down_linear, 1);
		_Animator(show_list1_linear, "translationX", AndroidWithLuckyUtil.getDip(getApplicationContext(), 0));
	}
	
	
	private void _DROPDOWN_MENU_CLOSE () {
		drop_down_linear.setVisibility(View.GONE);
		show_list1_linear.setVisibility(View.GONE);
		more_option_linear.setVisibility(View.GONE);
		_TRANSITION(base);
		_Fade(drop_down_linear, 0);
	}
	
	
	private void _ON_TAP_MORE_OPTION () {
		show_list1_linear.setVisibility(View.GONE);
		more_option_linear.setVisibility(View.VISIBLE);
		_TRANSITION(base);
		_Animator(show_list1_linear, "translationX", AndroidWithLuckyUtil.getDip(getApplicationContext(), -200));
		_Animator(more_option_linear, "translationX", AndroidWithLuckyUtil.getDip(getApplicationContext(), 0));
	}
	
	
	private void _ON_TAP_BACK () {
		show_list1_linear.setVisibility(View.VISIBLE);
		more_option_linear.setVisibility(View.GONE);
		_TRANSITION(base);
		_Animator(show_list1_linear, "translationX", AndroidWithLuckyUtil.getDip(getApplicationContext(), 0));
		_Animator(more_option_linear, "translationX", AndroidWithLuckyUtil.getDip(getApplicationContext(), 200));
	}
	
	
	private void _TRANSITION(final View _view) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long) (double) 200);
		autoTransition.setInterpolator(new android.view.animation.DecelerateInterpolator()); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	private void _CARD_VIEW(final String _color, final double _shadow, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int) (double) 25);
		_view.setBackground(gd);
		
		try {
			if(Build.VERSION.SDK_INT >= 21) {
				_view.setElevation((int)_shadow);
			}
		} catch (Exception ignored) {}
	}
	
	
	@SuppressLint("WrongConstant")
	private void _UI () {
		_CARD_VIEW("#242424", 5, drop_down_linear);
		_CARD_VIEW("#242424", 5, search_bar);
		_CARD_VIEW("#424242", 0, back_button_linear);

		// TEXT STYLE - Please Ignore This Warnings !!!
		hading.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/custom_font.ttf"), 0);
	}
	
	
	private void _Animator(final View _view, final String _propertyName, final double _value) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long) (double) 200);
		anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
		anim.start();
	}
	
	
	private void _Fade(final View _view, final double _value) {
		// Timer
		TimerTask TIMER = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(_view, "alpha", _value);
						_Animator(_view, "scaleX", _value);
						_Animator(_view, "scaleY", _value);
						if (_value == 1) {
							_Animator(_view, "translationX", 0);
						} else {
							_Animator(_view, "translationY", 0);
						}
					}
				});
			}
		};
		_timer.schedule(TIMER, (int)((double) 0));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
