package org.antmobile.android.drawable_gdg.ui.activity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import org.antmobile.android.drawable_gdg.R;
import org.antmobile.android.drawable_gdg.utils.DrawableUtils;

import butterknife.Bind;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public class SecondUseCaseActivity extends ToolbarActivity {

    @Bind(R.id.basket_view)
    ImageView mBasketView;
    @Bind(R.id.twitter_view)
    ImageView mTwitterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_use_case);

        mBasketView.setImageDrawable(DrawableUtils.buildLayerDrawable(this,
                R.drawable.ic_basket, R.color.black, Paint.Style.STROKE));
        mTwitterView.setImageDrawable(DrawableUtils.buildLayerDrawable(this,
                R.drawable.ic_twitter, R.color.blue_400, Paint.Style.STROKE));
    }

}
