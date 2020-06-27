package com.order.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

public class DrawImageView extends android.support.v7.widget.AppCompatImageView {
    public DrawImageView(Context context) {
        super(context);
    }

    Paint paint = new Paint();
    {
        paint.setAntiAlias(true);//用于防止边缘的锯齿
        paint.setColor(Color.WHITE);//设置颜色
        paint.setStyle(Paint.Style.STROKE);//设置样式为空心矩形
        paint.setStrokeWidth(2.5f);//设置空心矩形边框的宽度
        paint.setAlpha(1000);//设置透明度
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(new Rect(getLeft()+20,getTop()+40,getRight()-20,getBottom()-50),paint);//绘制矩形，并设置矩形框显示的位置
    }

}
