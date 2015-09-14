package org.antmobile.android.drawable_gdg.ui.activity;

import android.os.Bundle;
import android.widget.ImageView;

import org.antmobile.android.drawable_gdg.R;
import org.antmobile.android.drawable_gdg.utils.DrawableUtils;

import butterknife.Bind;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public class ThirdUseCaseActivity extends ToolbarActivity {

    @Bind(R.id.twitter_view)
    ImageView mTwitterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_use_case);

        mTwitterView.setImageDrawable(DrawableUtils.buildStateListDrawable(this,
                R.drawable.ic_twitter, R.color.twitter));
    }

}