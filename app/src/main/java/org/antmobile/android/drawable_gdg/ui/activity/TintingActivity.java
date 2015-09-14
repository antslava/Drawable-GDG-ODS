package org.antmobile.android.drawable_gdg.ui.activity;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.widget.ImageView;

import org.antmobile.android.drawable_gdg.R;

import butterknife.Bind;

/**
 * Created by Antonenko Viacheslav on 14/09/15.
 */
public class TintingActivity extends ToolbarActivity {

    @Bind(R.id.twitter_view)
    ImageView mTwitterView;

    @Bind(R.id.twitter_selector_view)
    ImageView mTwitterSelectorView;

    @Bind(R.id.twitter_colorfilter)
    ImageView mTwitterColorFilterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinting);

        // Tinting with support library
        Drawable twitter = ContextCompat.getDrawable(this, R.drawable.ic_twitter);
        twitter.mutate();
        twitter = DrawableCompat.wrap(twitter);
        DrawableCompat.setTint(twitter, ContextCompat.getColor(this, R.color.red_400));
        mTwitterView.setImageDrawable(twitter);

        // Init color state list example
        final int[][] states = new int[2][];
        final int[] colors = new int[2];

        states[0] = new int[]{android.R.attr.state_pressed};
        colors[0] = ContextCompat.getColor(this, R.color.purple_400);

        states[1] = new int[0];
        colors[1] = ContextCompat.getColor(this, R.color.green_400);

        final ColorStateList colorStateList = new ColorStateList(states, colors);

        twitter = ContextCompat.getDrawable(this, R.drawable.ic_twitter);
        twitter = twitter.mutate();
        twitter = DrawableCompat.wrap(twitter);
        DrawableCompat.setTintList(twitter, colorStateList);

        mTwitterSelectorView.setImageDrawable(twitter);

        // Tinting without support library
        twitter = ContextCompat.getDrawable(this, R.drawable.ic_twitter);
        twitter.mutate();
        final int yellow = ContextCompat.getColor(this, R.color.yellow_400);
        twitter.setColorFilter(new PorterDuffColorFilter(yellow, PorterDuff.Mode.SRC_IN));

        mTwitterColorFilterView.setImageDrawable(twitter);
    }
}
