package org.antmobile.android.drawable_gdg.ui.activity;

import android.support.annotation.CallSuper;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import org.antmobile.android.drawable_gdg.R;

import butterknife.Bind;

/**
 * Created by Antonenko Viacheslav on 04/09/15.
 */
public class ToolbarActivity extends BaseActivity {

    @Bind(R.id.toolbar_actionbar)
    protected Toolbar mToolbarView;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        initToolbar();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        initToolbar();
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        initToolbar();
    }

    @CallSuper
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @CallSuper
    protected void initToolbar() {
        if (mToolbarView == null) {
            throw new IllegalStateException("Activity layout must contain Toolbar with id R.id.toolbar_actionbar.");
        }

        setSupportActionBar(mToolbarView);
        final ActionBar actionBar = getSupportActionBar();
        //noinspection ConstantConditions
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}