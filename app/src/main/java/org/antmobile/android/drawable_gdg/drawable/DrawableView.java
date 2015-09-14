package org.antmobile.android.drawable_gdg.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public class DrawableView extends View {

    private Drawable mDrawable;

    public DrawableView(Context context) {
        this(context, null);
    }

    public DrawableView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawableView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    public void setDrawable(Drawable drawable) {
        if (drawable != mDrawable) {
            if (mDrawable != null) {
                mDrawable.setCallback(null);
            }

            mDrawable = drawable;

            if (drawable != null) {
                drawable.setCallback(this);
                updateDrawableBounds();
            }
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == mDrawable;
    }

    private void updateDrawableBounds() {
        // set bounds Drawable.setBounds(int, int, int, int)
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (mDrawable != null) {
            mDrawable.draw(canvas);
        }
    }
}
