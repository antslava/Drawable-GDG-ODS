package org.antmobile.android.drawable_gdg.ui.activity;

import android.graphics.drawable.RotateDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import org.antmobile.android.drawable_gdg.R;

import butterknife.ButterKnife;

/**
 * Created by Antonenko Viacheslav on 04/09/15.
 */
public class RotateDrawableActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_drawable);

        final RotateDrawable drawable = (RotateDrawable) ((ImageView) ButterKnife.findById(this, R.id.rotate)).getDrawable();
        drawable.setLevel(5000);
    }

}
