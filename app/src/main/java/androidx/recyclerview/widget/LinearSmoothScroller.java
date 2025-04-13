package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.metrica.YandexMetricaDefaultValues;

/* loaded from: classes.dex */
public class LinearSmoothScroller extends RecyclerView.SmoothScroller {

    /* renamed from: k */
    public PointF f5447k;

    /* renamed from: l */
    public final DisplayMetrics f5448l;

    /* renamed from: n */
    public float f5450n;

    /* renamed from: i */
    public final LinearInterpolator f5445i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f5446j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f5449m = false;

    /* renamed from: o */
    public int f5451o = 0;

    /* renamed from: p */
    public int f5452p = 0;

    public LinearSmoothScroller(Context context) {
        this.f5448l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    /* renamed from: c */
    public void mo3716c(int i2, int i3, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (this.f5607b.f5519n.m3869Q() == 0) {
            m3938g();
            return;
        }
        int i4 = this.f5451o;
        int i5 = i4 - i2;
        if (i4 * i5 <= 0) {
            i5 = 0;
        }
        this.f5451o = i5;
        int i6 = this.f5452p;
        int i7 = i6 - i3;
        int i8 = i6 * i7 > 0 ? i7 : 0;
        this.f5452p = i8;
        if (i5 == 0 && i8 == 0) {
            PointF m3936a = m3936a(this.f5606a);
            if (m3936a != null) {
                if (m3936a.x != 0.0f || m3936a.y != 0.0f) {
                    float f2 = m3936a.y;
                    float sqrt = (float) Math.sqrt((f2 * f2) + (r3 * r3));
                    float f3 = m3936a.x / sqrt;
                    m3936a.x = f3;
                    float f4 = m3936a.y / sqrt;
                    m3936a.y = f4;
                    this.f5447k = m3936a;
                    this.f5451o = (int) (f3 * 10000.0f);
                    this.f5452p = (int) (f4 * 10000.0f);
                    action.m3940b((int) (this.f5451o * 1.2f), (int) (this.f5452p * 1.2f), (int) (mo3723k(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND) * 1.2f), this.f5445i);
                    return;
                }
            }
            action.f5617d = this.f5606a;
            m3938g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    /* renamed from: d */
    public void mo3717d() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    /* renamed from: e */
    public void mo3718e() {
        this.f5452p = 0;
        this.f5451o = 0;
        this.f5447k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    /* renamed from: f */
    public void mo3719f(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int i2;
        int mo3724l = mo3724l();
        RecyclerView.LayoutManager layoutManager = this.f5608c;
        int i3 = 0;
        if (layoutManager == null || !layoutManager.mo3700v()) {
            i2 = 0;
        } else {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            i2 = m3720h(layoutManager.m3873U(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManager.m3878X(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.mo3891f0(), layoutManager.f5577q - layoutManager.mo3892g0(), mo3724l);
        }
        int mo3725m = mo3725m();
        RecyclerView.LayoutManager layoutManager2 = this.f5608c;
        if (layoutManager2 != null && layoutManager2.mo3701w()) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
            i3 = m3720h(layoutManager2.m3879Y(view) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutManager2.m3872T(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutManager2.mo3893h0(), layoutManager2.f5578r - layoutManager2.mo3889e0(), mo3725m);
        }
        int m3722j = m3722j((int) Math.sqrt((i3 * i3) + (i2 * i2)));
        if (m3722j > 0) {
            action.m3940b(-i2, -i3, m3722j, this.f5446j);
        }
    }

    /* renamed from: h */
    public int m3720h(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    /* renamed from: i */
    public float mo3721i(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: j */
    public int m3722j(int i2) {
        return (int) Math.ceil(mo3723k(i2) / 0.3356d);
    }

    /* renamed from: k */
    public int mo3723k(int i2) {
        float abs = Math.abs(i2);
        if (!this.f5449m) {
            this.f5450n = mo3721i(this.f5448l);
            this.f5449m = true;
        }
        return (int) Math.ceil(abs * this.f5450n);
    }

    /* renamed from: l */
    public int mo3724l() {
        PointF pointF = this.f5447k;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: m */
    public int mo3725m() {
        PointF pointF = this.f5447k;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
