package com.stfalcon.imageviewer.common.gestures.direction;

import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeDirectionDetector.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/gestures/direction/SwipeDirectionDetector;", "", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class SwipeDirectionDetector {

    /* renamed from: a */
    public final int f25233a;

    /* renamed from: b */
    public float f25234b;

    /* renamed from: c */
    public float f25235c;

    /* renamed from: d */
    public boolean f25236d;

    /* renamed from: e */
    public final Function1<SwipeDirection, Unit> f25237e;

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeDirectionDetector(@NotNull Context context, @NotNull Function1<? super SwipeDirection, Unit> function1) {
        this.f25237e = function1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.m32175d(viewConfiguration, "ViewConfiguration.get(context)");
        this.f25233a = viewConfiguration.getScaledTouchSlop();
    }
}
