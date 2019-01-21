package com.jiahuan.svgmapview.core.componet;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;

import com.jiahuan.svgmapview.overlay.SVGMapBaseOverlay;

public class TableOverlay extends SVGMapBaseOverlay{

    private Paint paint;
    private float[] points;
    private MapMainView mapMainView;
    private int currentColor;

    public TableOverlay(MapMainView mapMainView, float[] points, int color)
    {
        initLayer(mapMainView, points, color);
    }

    private void initLayer(MapMainView mapMainView, float[] points, int color)
    {
        this.points = points;
        this.currentColor = color;
        this.mapMainView = mapMainView;
        this.showLevel = LOCATION_LEVEL;
        this.paint = new Paint();
        this.paint.setColor(color);
        this.paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }


    @Override
    public void onDestroy()
    {
    }

    @Override
    public void onPause()
    {

    }

    @Override
    public void onResume()
    {

    }

    @Override
    public void onTap(MotionEvent event)
    {

    }

    @Override
    public void draw(Canvas canvas, Matrix matrix, float currentZoomValue, float currentRotateDegrees)
    {
        canvas.save();
        if (isVisible)
        {
            canvas.setMatrix(matrix);
            canvas.drawRect(this.points[0],this.points[1],this.points[2],this.points[3],this.paint);
        }
        canvas.restore();
    }
}
