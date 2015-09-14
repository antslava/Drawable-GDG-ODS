package org.antmobile.android.drawable_gdg.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import org.antmobile.android.drawable_gdg.R;

import butterknife.ButterKnife;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public class ScaleDrawableActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_drawable);

        final Drawable d = ButterKnife.findById(this, R.id.scale_view).getBackground();
        d.setLevel(10000);
    }

}
