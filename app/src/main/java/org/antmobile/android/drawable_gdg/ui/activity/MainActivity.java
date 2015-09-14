package org.antmobile.android.drawable_gdg.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;

import org.antmobile.android.drawable_gdg.R;

import butterknife.OnClick;

public class MainActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();

        final ActionBar actionBar = getSupportActionBar();
        //noinspection ConstantConditions
        actionBar.setDisplayHomeAsUpEnabled(false);
    }

    @OnClick(R.id.gradient_drawable)
    void openGradientDrawableActivity() {
        startActivity(new Intent(this, GradientDrawableActivity.class));
    }

    @OnClick(R.id.state_list_drawable)
    void openStateListDrawableActivity() {
        startActivity(new Intent(this, StateListDrawableActivity.class));
    }

    @OnClick(R.id.custom_state)
    void openDrawableCustomStateActivity() {
        startActivity(new Intent(this, DrawableCustomStateActivity.class));
    }

    @OnClick(R.id.bitmap_drawable)
    void openBitmapDrawableActivity() {
        startActivity(new Intent(this, BitmapDrawableActivity.class));
    }

    @OnClick(R.id.layer_drawable)
    void openLayerDrawableActivity() {
        startActivity(new Intent(this, LayerDrawableActivity.class));
    }

    @OnClick(R.id.rotate_drawable)
    void openRotateDrawableActivity() {
        startActivity(new Intent(this, RotateDrawableActivity.class));
    }

    @OnClick(R.id.inset_drawable)
    void openInsetDrawableActivity() {
        startActivity(new Intent(this, InsetDrawableActivity.class));
    }

    @OnClick(R.id.clip_drawable)
    void openClipDrawableActivity() {
        startActivity(new Intent(this, ClipDrawableActivity.class));
    }

    @OnClick(R.id.scale_drawable)
    void openScaleDrawableActivity() {
        startActivity(new Intent(this, ScaleDrawableActivity.class));
    }

    @OnClick(R.id.rounded_drawable)
    void openRoundedDrawableActivity() {
        startActivity(new Intent(this, RoundedDrawableActivity.class));
    }

    @OnClick(R.id.first_use_case)
    void openFirstUseCaseActivity() {
        startActivity(new Intent(this, FirstUseCaseActivity.class));
    }

    @OnClick(R.id.second_use_case)
    void openSecondUseCaseActivity() {
        startActivity(new Intent(this, SecondUseCaseActivity.class));
    }

    @OnClick(R.id.third_use_case)
    void openThirdUseCaseActivity() {
        startActivity(new Intent(this, ThirdUseCaseActivity.class));
    }

    @OnClick(R.id.tinting)
    void openTintingActivity() {
        startActivity(new Intent(this, TintingActivity.class));
    }
}
