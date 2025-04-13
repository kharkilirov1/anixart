package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tg0 extends TimerTask {

    /* renamed from: b */
    @NotNull
    private final sg0 f55115b;

    /* renamed from: c */
    @NotNull
    private final lg0 f55116c;

    /* renamed from: d */
    @NotNull
    private final WeakReference<ViewPager2> f55117d;

    /* renamed from: e */
    @NotNull
    private int f55118e;

    public tg0(@NotNull ViewPager2 viewPager, @NotNull sg0 multiBannerSwiper, @NotNull lg0 multiBannerEventTracker) {
        Intrinsics.m32179h(viewPager, "viewPager");
        Intrinsics.m32179h(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.m32179h(multiBannerEventTracker, "multiBannerEventTracker");
        this.f55115b = multiBannerSwiper;
        this.f55116c = multiBannerEventTracker;
        this.f55117d = new WeakReference<>(viewPager);
        this.f55118e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28648a(tg0 this$0, ViewPager2 viewPager) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(viewPager, "$viewPager");
        RecyclerView.Adapter adapter = viewPager.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount != 0) {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem == 0) {
                this$0.f55118e = 1;
            } else if (currentItem == itemCount - 1) {
                this$0.f55118e = 2;
            }
        } else {
            this$0.cancel();
        }
        int m28463a = C5782t5.m28463a(this$0.f55118e);
        if (m28463a == 0) {
            this$0.f55115b.m28246a();
        } else if (m28463a == 1) {
            this$0.f55115b.m28247b();
        }
        this$0.f55116c.m26449a();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ViewPager2 viewPager2 = this.f55117d.get();
        if (viewPager2 == null) {
            cancel();
        } else if (tg1.m28657b(viewPager2) > 0) {
            viewPager2.post(new hn1(this, viewPager2, 28));
        }
    }
}
