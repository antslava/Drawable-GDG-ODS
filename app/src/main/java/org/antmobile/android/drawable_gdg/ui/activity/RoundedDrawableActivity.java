package org.antmobile.android.drawable_gdg.ui.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import org.antmobile.android.drawable_gdg.R;

import butterknife.ButterKnife;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public class RoundedDrawableActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rounded_drawable);

        final ImageView avatarView = ButterKnife.findById(this, R.id.rounded_view);
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.my_avatar);
        final RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        avatarView.setImageDrawable(roundedBitmapDrawable);
    }

}
