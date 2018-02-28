package tech.vaps.com.staff;

import android.app.Fragment;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView img_pic = (ImageView) findViewById(R.id.img_pic);

    //    ImageView img_pic1 = (ImageView) findViewById(R.id.img_pic1);

        // Image loading
        Glide.with(this)
                .load("https://bdcampusstrg.blob.core.windows.net/files/5/EmployeeProfilePics/f7c4794e-f6d5-4ea7-8f93-9527e3e9dba6.jpg")
                .into(img_pic);

       /* Glide.with(this)
                .load("https://bdcampusstrg.blob.core.windows.net/files/5/EmployeeProfilePics/f7c4794e-f6d5-4ea7-8f93-9527e3e9dba6.jpg")
                .into(img_pic1);*/
     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);





    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

    //    Fragment fragment = null;
        if (id == R.id.profile_det) {

            ProfileFragment fragment = new ProfileFragment();
            FragmentManager fm0 = getSupportFragmentManager();
            FragmentTransaction ft0 = fm0.beginTransaction();
            ft0.replace(R.id.main_content,fragment,"main_container");
            ft0.addToBackStack(null);
            ft0.commit();

        }else if (id == R.id.salary_det) {

            SalaryDetailsFragment fragment = new SalaryDetailsFragment();
            FragmentManager fm1 = getSupportFragmentManager();
            FragmentTransaction ft1 = fm1.beginTransaction();
            ft1.replace(R.id.main_content,fragment,"main_container");
            ft1.addToBackStack(null);
            ft1.commit();

        } else if (id == R.id.leave_details) {

            LeaveDetailsFragment fragment = new LeaveDetailsFragment();
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.main_content,fragment,"main_container");
            ft2.addToBackStack(null);
            ft2.commit();

        } else if (id == R.id.timetable)
        {

            TimetableFragment fragment = new TimetableFragment();
            FragmentManager fm3 = getSupportFragmentManager();
            FragmentTransaction ft3 = fm3.beginTransaction();
            ft3.replace(R.id.main_content,fragment,"main_container");
            ft3.addToBackStack(null);
            ft3.commit();

        } else if (id == R.id.attendance)
        {
            AttendanceFragment fragment = new AttendanceFragment();
            FragmentManager fm4 = getSupportFragmentManager();
            FragmentTransaction ft4 = fm4.beginTransaction();
            ft4.replace(R.id.main_content,fragment,"main_container");
            ft4.addToBackStack(null);
            ft4.commit();

        } else if (id == R.id.marks_det) {
            finish();
        }

       /* FragmentManager fm4 = getSupportFragmentManager();
        FragmentTransaction ft4 = fm4.beginTransaction();
        ft4.replace(R.id.main_content,fragment,"main_container");
        ft4.addToBackStack(null);
        ft4.commit();*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
