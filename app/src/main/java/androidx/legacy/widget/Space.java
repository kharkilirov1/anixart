package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public class Space extends View {
    /* renamed from: a */
    public static int m3171a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i2 : size : Math.min(i2, size);
    }

    @Override // android.view.View
    @SuppressLint
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    @Deprecated
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(m3171a(getSuggestedMinimumWidth(), i2), m3171a(getSuggestedMinimumHeight(), i3));
    }
}
