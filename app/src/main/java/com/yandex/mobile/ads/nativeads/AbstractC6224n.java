package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5427m6;
import com.yandex.mobile.ads.impl.k60;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.nativeads.AbstractC6221l0;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.nativeads.n */
/* loaded from: classes3.dex */
public abstract class AbstractC6224n<T extends AbstractC6221l0> extends FrameLayout {

    /* renamed from: a */
    @Nullable
    private T f57762a;

    public AbstractC6224n(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m30591a(int i2) {
        n60.m26811d(k60.m26036a("onVisibilityChanged(), visibility = ", i2), new Object[0]);
        T t = this.f57762a;
        if (t != null) {
            StringBuilder m25v = C0000a.m25v("onVisibilityChanged(), visibility = ", i2, ", clazz = ");
            int i3 = C5427m6.f52583b;
            m25v.append(t.toString());
            n60.m26811d(m25v.toString(), new Object[0]);
            if (i2 == 0) {
                t.m30586f();
            } else {
                t.m30587g();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T t = this.f57762a;
        if (t != null) {
            t.m30586f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        T t = this.f57762a;
        if (t != null) {
            t.m30587g();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        n60.m26811d("onVisibilityChanged(), changedView = %s, viewVisibility = %s", view, Integer.valueOf(i2));
        m30591a((i2 == 0 && isShown()) ? 0 : 8);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        n60.m26811d("onWindowVisibilityChanged(), windowVisibility = %s, this.getVisibility = %s", Integer.valueOf(i2), Integer.valueOf(getVisibility()));
        m30591a((i2 == 0 && getVisibility() == 0) ? 0 : 8);
        super.onWindowVisibilityChanged(i2);
    }

    public AbstractC6224n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC6224n(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* renamed from: a */
    public final void m30592a(@NonNull T t) {
        this.f57762a = t;
    }
}
