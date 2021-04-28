package com.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint=new Paint();
    private Paint mPaintText=new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.my_imageview);
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelBlue,null));
        mPaintText.setColor(Color.BLACK);
        mPaintText.setTextSize(40);
    }

    public void drawSomething(View view) {
        int vWidth=view.getWidth();
        int vHeight=view.getHeight();
        mBitmap=Bitmap.createBitmap(vWidth,vHeight,Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas=new Canvas(mBitmap);

        //background & text
        mCanvas.drawColor(ResourcesCompat.getColor(getResources(),
                R.color.bgcolour,null));
        mCanvas.drawText(getString(R.string.app_name),100,250,mPaintText);

        //triangle 1
        Path path=new Path();
        path.moveTo(100,700);
        path.lineTo(300,450);
        path.lineTo(500,700);
        path.lineTo(100,700);
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelOrange,null));
        mCanvas.drawPath(path,mPaint);

        /*
        //triangle 2
        Path path2=new Path();
        path2.moveTo(150,650);
        path2.lineTo(300,450);
        path2.lineTo(450,650);
        path2.lineTo(150,650);
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        mCanvas.drawPath(path2,mPaint);
        */

        //circle at roof
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mCanvas.drawCircle(300,600,55,mPaint);

        //circle2 at roof
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        mCanvas.drawCircle(300,600,35,mPaint);

        //line as shadow
        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(102,700,498,700,mPaint);

        //rectangle as wall
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelOrange,null));
        Rect mRect=new Rect();
        mRect.set(150,700,450,1000);
        mCanvas.drawRect(mRect,mPaint);

        //rectangle2 as door
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        Rect mRect2=new Rect();
        mRect2.set(220,850,320,1000);
        mCanvas.drawRect(mRect2,mPaint);

        //circle3 at door
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mCanvas.drawCircle(240,920,10,mPaint);

        //circle4 at door
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        mCanvas.drawCircle(240,920,5,mPaint);

        //rectangle3 as window1
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        Rect mRect3=new Rect();
        mRect3.set(340,850,360,880);
        mCanvas.drawRect(mRect3,mPaint);

        //rectangle4 as window2
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        Rect mRect4=new Rect();
        mRect4.set(370,850,390,880);
        mCanvas.drawRect(mRect4,mPaint);

        //rectangle5 as window3
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        Rect mRect5=new Rect();
        mRect5.set(340,885,360,915);
        mCanvas.drawRect(mRect5,mPaint);

        //rectangle6 as window4
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelRed,null));
        Rect mRect6=new Rect();
        mRect6.set(370,885,390,915);
        mCanvas.drawRect(mRect6,mPaint);


        //line2 as vent1
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(4);
        mCanvas.drawLine(220,800,390,800,mPaint);

        //line2 as vent2
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(4);
        mCanvas.drawLine(220,780,390,780,mPaint);

        //line2 as vent3
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(4);
        mCanvas.drawLine(220,760,390,760,mPaint);

        //line3 as vent4
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(4);
        mCanvas.drawLine(220,740,390,740,mPaint);


        //line4 as windowline1vertical
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(340,845,390,845,mPaint);

        //line5 as windowline2vertical
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(340,880,390,880,mPaint);

        //line6 as windowline3vertical
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(340,915,390,915,mPaint);


        //line7 as windowline1horizontal
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(340,845,340,915,mPaint);

        //line8 as windowline2horizontal
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(365,845,365,915,mPaint);

        //line9 as windowline3horizontal
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(390,845,390,915,mPaint);


        //line10 as doorline1vertical
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(220,845,320,845,mPaint);

        //line11 as doorline2vertical
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(220,995,320,995,mPaint);

        //line12 as windowline3horizontal
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(220,845,220,995,mPaint);

        //line14 as windowline4horizontal
        mPaint.setColor(ResourcesCompat.getColor(getResources(),
                R.color.pastelYellow,null));
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(320,845,320,996,mPaint);


        view.invalidate();
    }
}