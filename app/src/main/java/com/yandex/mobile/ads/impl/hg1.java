package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.audio.RunnableC0979f;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hg1 {

    /* renamed from: a */
    @NotNull
    private static final Lazy f50929a = LazyKt.m31881b(C5185a.f50930a);

    /* renamed from: com.yandex.mobile.ads.impl.hg1$a */
    public static final class C5185a extends Lambda implements Function0<Handler> {

        /* renamed from: a */
        public static final C5185a f50930a = new C5185a();

        public C5185a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m25195a(@Nullable ViewGroup viewGroup, boolean z) {
        ((Handler) f50929a.getValue()).post(new RunnableC0979f(viewGroup, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m25196b(ViewGroup viewGroup, View contentView, Context context, SizeInfo sizeInfo, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Intrinsics.m32179h(contentView, "$contentView");
        Intrinsics.m32179h(context, "$context");
        if (viewGroup == null || viewGroup.indexOfChild(contentView) != -1) {
            return;
        }
        RelativeLayout.LayoutParams m24318a = C5057f5.m24318a(context, sizeInfo);
        Intrinsics.m32178g(m24318a, "adLayoutParams(context, sizeInfo)");
        contentView.setVisibility(0);
        viewGroup.addView(contentView, m24318a);
        if (onPreDrawListener != null) {
            tg1.m28654a(contentView, onPreDrawListener);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m25194a(@Nullable ViewGroup viewGroup, @NotNull View contentView, @NotNull Context context, @Nullable SizeInfo sizeInfo, @Nullable ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(contentView, "contentView");
        ((Handler) f50929a.getValue()).post(new mq1(viewGroup, contentView, context, sizeInfo, onPreDrawListener, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m25197b(ViewGroup viewGroup, boolean z) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AbstractC5179he) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC5179he) arrayList.get(i3)).mo25136e();
        }
        arrayList.clear();
    }
}
