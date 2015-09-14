package org.antmobile.android.drawable_gdg.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

import org.antmobile.android.drawable_gdg.R;

/**
 * Created by Antonenko Viacheslav on 21/08/15.
 */
public class FavoriteView extends ImageView {

    private static final int[] FAVORITE_STATE_SET = new int[]{R.attr.state_favorite};

    private boolean mIsFavorite = false;

    public FavoriteView(Context context) {
        super(context);
    }

    public FavoriteView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FavoriteView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FavoriteView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FavoriteView, defStyleAttr, defStyleRes);

        mIsFavorite = a.getBoolean(a.getIndex(R.styleable.FavoriteView_isFavorite), false);

        a.recycle();
    }


    public void setFavorite(boolean isFavorite) {
        if (mIsFavorite != isFavorite) {
            mIsFavorite = isFavorite;
            drawableStateChanged();
        }
    }

    @Override
    public int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);

        if (mIsFavorite) {
            mergeDrawableStates(drawableState, FAVORITE_STATE_SET);
        }

        return drawableState;
    }
}
