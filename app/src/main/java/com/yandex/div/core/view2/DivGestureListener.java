package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivGestureListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    @Nullable
    public Function0<Unit> f31644b;

    /* renamed from: c */
    @Nullable
    public Function0<Unit> f31645c;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent e2) {
        Intrinsics.m32179h(e2, "e");
        Function0<Unit> function0 = this.f31645c;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e2) {
        Intrinsics.m32179h(e2, "e");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent e2) {
        Function0<Unit> function0;
        Intrinsics.m32179h(e2, "e");
        if (this.f31645c == null || (function0 = this.f31644b) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent e2) {
        Function0<Unit> function0;
        Intrinsics.m32179h(e2, "e");
        if (this.f31645c != null || (function0 = this.f31644b) == null) {
            return false;
        }
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }
}
