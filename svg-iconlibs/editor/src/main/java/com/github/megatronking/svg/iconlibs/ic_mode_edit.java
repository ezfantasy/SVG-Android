package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_mode_edit extends SVGRenderer {

    public ic_mode_edit(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(3.0f, 17.25f);
        mPath.lineTo(3.0f, 21.0f);
        mPath.rLineTo(3.75f, 0f);
        mPath.lineTo(17.81f, 9.94f);
        mPath.rLineTo(-3.75f, -3.75f);
        mPath.lineTo(3.0f, 17.25f);
        mPath.close();
        mPath.moveTo(3.0f, 17.25f);
        mPath.moveTo(20.71f, 7.04f);
        mPath.rCubicTo(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        mPath.rLineTo(-2.34f, -2.34f);
        mPath.rCubicTo(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        mPath.rLineTo(-1.83f, 1.83f);
        mPath.rLineTo(3.75f, 3.75f);
        mPath.rLineTo(1.83f, -1.83f);
        mPath.close();
        mPath.moveTo(20.71f, 7.04f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}