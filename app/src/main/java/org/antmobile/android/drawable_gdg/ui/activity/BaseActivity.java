package org.antmobile.android.drawable_gdg.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import org.antmobile.android.drawable_gdg.utils.L;

import butterknife.ButterKnife;

/**
 * Created by Antonenko Viacheslav on 21/08/15.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected L LOG = L.getLogger(getClass());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LOG.d("onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        LOG.d("onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        LOG.d("onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        LOG.d("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LOG.d("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LOG.d("onDestroy()");
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.bind(this);
    }

}
