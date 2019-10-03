package jp.ac.shohoku.s18b707.graphicssamples;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by  on 2016/10/05
 */

public class CustomView extends View {
    //コンストラクタ1
    public CustomView(Context context){
        super(context);
    }
    //コンストラクタ2
    public CustomView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    //コンストラクタ3
    public CustomView(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    /**
     * このメソッドで描画をします
     * @param canvas 画像表示用のキャンバス
     */
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        int w = this.getWidth();
        int h = this.getHeight();

        Paint p = new Paint();
        p.setStyle(Style.STROKE);  //Styleを設定：線で描く
        p.setColor(Color.DKGRAY);  //色を設定
        canvas.drawRect(new Rect(5, 5, w - 10, h - 10), p);  //長方形を描画

        for(int i = 0; i<10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Style.FILL);  //Styleを設定：塗りつぶす
            p2.setColor(Color.rgb(25*i, 0, 0));  //色を設定
            canvas.drawCircle(25*i+125, 25*i+125, 100, p2);  //円を描く
        }
    }
}
