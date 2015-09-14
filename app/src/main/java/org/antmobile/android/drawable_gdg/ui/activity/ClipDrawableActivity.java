package org.antmobile.android.drawable_gdg.ui.activity;

import android.os.Bundle;
import android.view.View;

import org.antmobile.android.drawable_gdg.R;

import butterknife.ButterKnife;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public class ClipDrawableActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_drawable);

        final View view = ButterKnife.findById(this, R.id.clip_view);
        view.getBackground().setLevel(7000);
    }

}
