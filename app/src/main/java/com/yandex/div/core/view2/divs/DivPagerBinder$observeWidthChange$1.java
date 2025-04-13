package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.div.core.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPagerBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"com/yandex/div/core/view2/divs/DivPagerBinder$observeWidthChange$1", "Lcom/yandex/div/core/Disposable;", "Landroid/view/View$OnLayoutChangeListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivPagerBinder$observeWidthChange$1 implements Disposable, View.OnLayoutChangeListener {

    /* renamed from: b */
    public int f32279b;

    /* renamed from: c */
    public final /* synthetic */ View f32280c;

    /* renamed from: d */
    public final /* synthetic */ Function1<Object, Unit> f32281d;

    public DivPagerBinder$observeWidthChange$1(final View view, final Function1<Object, Unit> function1) {
        this.f32280c = view;
        this.f32281d = function1;
        this.f32279b = view.getWidth();
        view.addOnLayoutChangeListener(this);
        OneShotPreDrawListener.m2149a(view, new Runnable(view, function1, view) { // from class: com.yandex.div.core.view2.divs.DivPagerBinder$observeWidthChange$1$special$$inlined$doOnPreDraw$1

            /* renamed from: b */
            public final /* synthetic */ Function1 f32246b;

            /* renamed from: c */
            public final /* synthetic */ View f32247c;

            {
                this.f32246b = function1;
                this.f32247c = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32246b.invoke(Integer.valueOf(this.f32247c.getWidth()));
            }
        });
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.f32280c.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View v, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.m32179h(v, "v");
        int width = v.getWidth();
        if (this.f32279b == width) {
            return;
        }
        this.f32279b = width;
        this.f32281d.invoke(Integer.valueOf(width));
    }
}
