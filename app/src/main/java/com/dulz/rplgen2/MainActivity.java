package com.dulz.rplgen2;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private double number = 0;
	private String package_name = "";
	private String recent_version = "";
	private String description = "";
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmapp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout main_ui;
	private LinearLayout linear3;
	private ImageView imageview1;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview2;
	private ViewPager viewpager1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ListView listview1;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear24;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear19;
	private LinearLayout _drawer_linear17;
	private LinearLayout _drawer_linear18;
	private LinearLayout _drawer_linear26;
	private LinearLayout _drawer_linear16;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear28;
	private LinearLayout _drawer_linear29;
	private LinearLayout _drawer_linear31;
	private ImageView _drawer_imageview1;
	private TextView _drawer_textview3;
	private LinearLayout _drawer_linear25;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview6;
	private ImageView _drawer_imageview13;
	private TextView _drawer_textview9;
	private ImageView _drawer_imageview11;
	private TextView _drawer_textview7;
	private ImageView _drawer_imageview12;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview14;
	private TextView _drawer_textview11;
	private TextView _drawer_textview13;
	private ImageView _drawer_imageview18;
	private ImageView _drawer_imageview17;
	private ImageView _drawer_imageview22;
	private TextView _drawer_textview18;
	
	private RequestNetwork dulz;
	private RequestNetwork.RequestListener _dulz_request_listener;
	private Intent in = new Intent();
	private Intent ln2 = new Intent();
	private Intent ln3 = new Intent();
	private Intent openig = new Intent();
	private Intent opentt = new Intent();
	private Intent opengithub = new Intent();
	private Intent openigdulz = new Intent();
	private Intent splashscreen = new Intent();
	private Intent update_intent = new Intent();
	private Intent updatess = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		main_ui = findViewById(R.id.main_ui);
		linear3 = findViewById(R.id.linear3);
		imageview1 = findViewById(R.id.imageview1);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		viewpager1 = findViewById(R.id.viewpager1);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		listview1 = findViewById(R.id.listview1);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		_drawer_linear8 = _nav_view.findViewById(R.id.linear8);
		_drawer_linear24 = _nav_view.findViewById(R.id.linear24);
		_drawer_linear13 = _nav_view.findViewById(R.id.linear13);
		_drawer_linear19 = _nav_view.findViewById(R.id.linear19);
		_drawer_linear17 = _nav_view.findViewById(R.id.linear17);
		_drawer_linear18 = _nav_view.findViewById(R.id.linear18);
		_drawer_linear26 = _nav_view.findViewById(R.id.linear26);
		_drawer_linear16 = _nav_view.findViewById(R.id.linear16);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_linear28 = _nav_view.findViewById(R.id.linear28);
		_drawer_linear29 = _nav_view.findViewById(R.id.linear29);
		_drawer_linear31 = _nav_view.findViewById(R.id.linear31);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_textview3 = _nav_view.findViewById(R.id.textview3);
		_drawer_linear25 = _nav_view.findViewById(R.id.linear25);
		_drawer_imageview8 = _nav_view.findViewById(R.id.imageview8);
		_drawer_textview6 = _nav_view.findViewById(R.id.textview6);
		_drawer_imageview13 = _nav_view.findViewById(R.id.imageview13);
		_drawer_textview9 = _nav_view.findViewById(R.id.textview9);
		_drawer_imageview11 = _nav_view.findViewById(R.id.imageview11);
		_drawer_textview7 = _nav_view.findViewById(R.id.textview7);
		_drawer_imageview12 = _nav_view.findViewById(R.id.imageview12);
		_drawer_textview8 = _nav_view.findViewById(R.id.textview8);
		_drawer_imageview14 = _nav_view.findViewById(R.id.imageview14);
		_drawer_textview11 = _nav_view.findViewById(R.id.textview11);
		_drawer_textview13 = _nav_view.findViewById(R.id.textview13);
		_drawer_imageview18 = _nav_view.findViewById(R.id.imageview18);
		_drawer_imageview17 = _nav_view.findViewById(R.id.imageview17);
		_drawer_imageview22 = _nav_view.findViewById(R.id.imageview22);
		_drawer_textview18 = _nav_view.findViewById(R.id.textview18);
		dulz = new RequestNetwork(this);
		
		_dulz_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				listmapp = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				listview1.setAdapter(new Listview1Adapter(listmapp));
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "b");
			listmap.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("c", "d");
			listmap.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("e", "f");
			listmap.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("g", "h");
			listmap.add(_item);
		}
		viewpager1.setAdapter(new Viewpager1Adapter(listmap));
		dulz.startRequestNetwork(RequestNetworkController.GET, "masukin link spreadsheetnya!!", "A", _dulz_request_listener);
		_drawer_linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				in.setClass(getApplicationContext(), Activity2Activity.class);
				startActivity(in);
			}
		});
		_drawer_linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ln2.setClass(getApplicationContext(), Activity3Activity.class);
				startActivity(ln2);
			}
		});
		_drawer_linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Versi 1.5");
			}
		});
		_drawer_linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ln3.setClass(getApplicationContext(), Activity4Activity.class);
				startActivity(ln3);
			}
		});
		_drawer_linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				openig.setAction(Intent.ACTION_VIEW);
				openig.setData(Uri.parse("https://www.instagram.com/rpl_zephyr25"));
				startActivity(openig);
			}
		});
		_drawer_imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				openigdulz.setAction(Intent.ACTION_VIEW);
				openigdulz.setData(Uri.parse("https://www.instagram.com/dulzzs"));
				startActivity(openigdulz);
			}
		});
		_drawer_imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opentt.setAction(Intent.ACTION_VIEW);
				opentt.setData(Uri.parse("https://www.tiktok.com/@yth.dulz"));
				startActivity(opentt);
			}
		});
		_drawer_imageview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opengithub.setAction(Intent.ACTION_VIEW);
				opengithub.setData(Uri.parse("https://github.com/Dulzx"));
				startActivity(opengithub);
			}
		});
		splashscreen.setClass(getApplicationContext(), SplashscreenActivity.class);
		startActivity(splashscreen);
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}
	public class Viewpager1Adapter extends PagerAdapter {
		
		Context _context;
		ArrayList<HashMap<String, Object>> _data;
		
		public Viewpager1Adapter(Context _ctx, ArrayList<HashMap<String, Object>> _arr) {
			_context = _ctx;
			_data = _arr;
		}
		
		public Viewpager1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_context = getApplicationContext();
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public boolean isViewFromObject(View _view, Object _object) {
			return _view == _object;
		}
		
		@Override
		public void destroyItem(ViewGroup _container, int _position, Object _object) {
			_container.removeView((View) _object);
		}
		
		@Override
		public int getItemPosition(Object _object) {
			return super.getItemPosition(_object);
		}
		
		@Override
		public CharSequence getPageTitle(int pos) {
			// Use the Activity Event (onTabLayoutNewTabAdded) in order to use this method
			return "page " + String.valueOf(pos);
		}
		
		@Override
		public Object instantiateItem(ViewGroup _container,  final int _position) {
			View _view = LayoutInflater.from(_context).inflate(R.layout.dulzgaleri, _container, false);
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			if (_position == 0) {
				imageview1.setImageResource(R.drawable.dulz_1);
			}
			if (_position == 1) {
				imageview1.setImageResource(R.drawable.dulz_2);
			}
			if (_position == 2) {
				imageview1.setImageResource(R.drawable.dulz_3);
			}
			if (_position == 3) {
				imageview1.setImageResource(R.drawable.dulz_4);
			}
			
			_container.addView(_view);
			return _view;
		}
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.dulzkas, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final TextView textview5 = _view.findViewById(R.id.textview5);
			
			textview1.setText(_data.get((int)_position).get("no").toString());
			textview2.setText(_data.get((int)_position).get("nis").toString());
			textview3.setText(_data.get((int)_position).get("nama").toString());
			textview4.setText(_data.get((int)_position).get("kekurangan").toString());
			textview5.setText(_data.get((int)_position).get("lunas").toString());
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
