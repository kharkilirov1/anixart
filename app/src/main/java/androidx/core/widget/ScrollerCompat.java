package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* loaded from: classes.dex */
public final class ScrollerCompat {

    /* renamed from: a */
    public OverScroller f3852a;

    public ScrollerCompat(Context context, Interpolator interpolator) {
        this.f3852a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* renamed from: a */
    public void m2638a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f3852a.fling(i2, i3, i4, i5, i6, i7, i8, i9);
    }
}
