package jp.ac.shohoku.s18b707.graphicssamples;

import android.content.Context;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;

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

    /**
     * このメソッドで描画をします
     * @param canvas 画像表示用のキャンバス
     */

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.DKGRAY);
        canvas.drawRect(rect,p);
        canvas.drawBitmap(bmp,5,5,p);

        for(int i = 0; i<10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Style.FILL);  //Styleを設定：塗りつぶす
            p2.setColor(Color.rgb(25*i, 0, 0));  //色を設定
            canvas.drawCircle(25*i+125, 25*i+125, 100, p2);  //円を描く
        }
    }
}
