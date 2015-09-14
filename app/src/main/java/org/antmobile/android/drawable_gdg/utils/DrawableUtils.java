package org.antmobile.android.drawable_gdg.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;

/**
 * Created by Antonenko Viacheslav on 05/09/15.
 */
public final class DrawableUtils {

    private static final int STROKE_WIDTH = 1;

    private DrawableUtils() {

    }

    public static int getStrokeWidth(Context context) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                STROKE_WIDTH,
                context.getResources().getDisplayMetrics());
    }

    public static StateListDrawable buildStateListDrawable(Context context, int iconRes, @ColorRes int colorRes) {
        StateListDrawable stateListDrawable = new StateListDrawable();

        stateListDrawable.addState(new int[]{android.R.attr.state_pressed},
                buildLayerDrawable(context, iconRes, colorRes, Paint.Style.FILL));
        stateListDrawable.addState(new int[]{},
                buildLayerDrawable(context, iconRes, colorRes, Paint.Style.STROKE));

        return stateListDrawable;
    }


    public static LayerDrawable buildLayerDrawable(Context context, @DrawableRes int iconRes, @ColorRes int color, Paint.Style style) {
        Drawable imageDrawable;
        ShapeDrawable shapeDrawable;

        if (style == Paint.Style.FILL) {
            final Drawable notTintedDrawable = ContextCompat.getDrawable(context, iconRes);
            imageDrawable = tintBitmap(context, notTintedDrawable, color);
        } else {
            imageDrawable = ContextCompat.getDrawable(context, iconRes);
        }

        shapeDrawable = buildShapeDrawable(context, color, style);

        return new LayerDrawable(new Drawable[]{shapeDrawable, imageDrawable});
    }

    public static ShapeDrawable buildShapeDrawable(Context context, @ColorRes int color, Paint.Style shapeStyle) {
        final int strokeWidth = getStrokeWidth(context);

        final ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        final Paint shapePaint = shapeDrawable.getPaint();
        shapePaint.setColor(ContextCompat.getColor(context, color));
        shapePaint.setStyle(shapeStyle);
        shapePaint.setStrokeWidth(strokeWidth);

        return shapeDrawable;
    }

    public static BitmapDrawable tintBitmap(Context context, Drawable drawable, @ColorRes int color) {
        final Bitmap oldBitmap = ((BitmapDrawable) drawable).getBitmap();
        final Paint newPaint = new Paint();
        newPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, color), PorterDuff.Mode.MULTIPLY));

        Bitmap newTintendBitmap = Bitmap.createBitmap(oldBitmap.getWidth(),
                oldBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(newTintendBitmap);
        canvas.drawBitmap(oldBitmap, 0, 0, newPaint);

        return new BitmapDrawable(context.getResources(), newTintendBitmap);
    }
}
