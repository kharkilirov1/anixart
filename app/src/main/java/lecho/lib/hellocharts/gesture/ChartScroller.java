package lecho.lib.hellocharts.gesture;

import android.content.Context;
import android.graphics.Point;
import androidx.core.widget.ScrollerCompat;
import lecho.lib.hellocharts.model.Viewport;

/* loaded from: classes3.dex */
public class ChartScroller {

    /* renamed from: a */
    public Viewport f68526a = new Viewport();

    /* renamed from: b */
    public Point f68527b = new Point();

    /* renamed from: c */
    public ScrollerCompat f68528c;

    public static class ScrollResult {

        /* renamed from: a */
        public boolean f68529a;

        /* renamed from: b */
        public boolean f68530b;
    }

    public ChartScroller(Context context) {
        this.f68528c = new ScrollerCompat(context, null);
    }
}
