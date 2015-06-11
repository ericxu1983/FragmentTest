package comericxu1983.github.fragmenttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private View root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        root = findViewById(R.id.root);

        replace(FirstFragment.newInstance("", ""), true);
        postReplace2();

    }

    void postReplace2() {
        root.postDelayed(new Runnable() {
            @Override
            public void run() {
                replace(SecondFragment.newInstance("", ""), true);

                postReplace3();

            }
        }, 5000);
    }

    void postReplace3() {
        root.postDelayed(new Runnable() {
            @Override
            public void run() {
                replace(ThirdFragment.newInstance("", ""), true);

            }
        }, 5000);
    }


    public void add(Fragment fragment, boolean enableBack) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, fragment);
        if (enableBack) {
            ft.addToBackStack(null);
        }
        ft.commitAllowingStateLoss();
    }


    public void replace(Fragment fragment, boolean enableBack) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, fragment);
        if (enableBack) {
            ft.addToBackStack(null);
        }
        ft.commitAllowingStateLoss();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.popBackStack();

//        super.onBackPressed();
    }
}
