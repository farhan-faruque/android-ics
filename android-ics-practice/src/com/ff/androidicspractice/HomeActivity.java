package com.ff.androidicspractice;

import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;


public class HomeActivity extends MainActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME
				| ActionBar.DISPLAY_SHOW_TITLE | ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setTitle("ICs");
		actionBar.setSubtitle("cs");
	}


}
