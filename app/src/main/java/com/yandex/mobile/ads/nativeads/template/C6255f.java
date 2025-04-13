package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.tg1;

/* renamed from: com.yandex.mobile.ads.nativeads.template.f */
/* loaded from: classes3.dex */
final class C6255f extends TextView {

    /* renamed from: a */
    private Rect f57945a;

    /* renamed from: b */
    private Paint f57946b;

    /* renamed from: c */
    private int f57947c;

    /* renamed from: d */
    private int f57948d;

    public C6255f(Context context) {
        super(context);
        m30739a();
    }

    /* renamed from: a */
    private void m30739a() {
        this.f57945a = new Rect();
        this.f57946b = new Paint();
        this.f57947c = tg1.m28652a(getContext(), 1.0f);
        this.f57948d = tg1.m28652a(getContext(), 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int m28650a = tg1.m28650a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f57946b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f57947c);
        paint.setColor(m28650a);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i2 = 0; i2 < lineCount; i2++) {
            int lineBounds = getLineBounds(i2, this.f57945a);
            int lineStart = layout.getLineStart(i2);
            int lineEnd = layout.getLineEnd(i2);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f2 = lineBounds + this.f57948d;
            canvas.drawLine(primaryHorizontal, f2, primaryHorizontal2, f2, paint);
        }
        super.onDraw(canvas);
    }
}
