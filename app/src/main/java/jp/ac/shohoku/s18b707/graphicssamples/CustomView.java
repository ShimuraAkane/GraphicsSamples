package jp.ac.shohoku.s18b707.graphicssamples;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

class CustomView extends View {
    int w = this.getWidth();
    int h = this.getHeight();
    Paint p = new Paint();
    Rect rect = new Rect(5,5,w-5,h-5);
    Resources rs = this.getResources();
    Bitmap bmp = BitmapFactory.decodeResource(rs, R.drawable.illumination);

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.DKGRAY);
        canvas.drawRect(rect,p);
        canvas.drawBitmap(bmp,5,5,p);
    }
}

