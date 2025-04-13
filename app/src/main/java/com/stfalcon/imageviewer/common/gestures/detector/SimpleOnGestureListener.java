package com.stfalcon.imageviewer.common.gestures.detector;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SimpleOnGestureListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/stfalcon/imageviewer/common/gestures/detector/SimpleOnGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class SimpleOnGestureListener extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    public final Function1<MotionEvent, Boolean> f25225b;

    /* renamed from: c */
    public final Function1<MotionEvent, Boolean> f25226c;

    public SimpleOnGestureListener() {
        this.f25225b = null;
        this.f25226c = null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent event) {
        Boolean invoke;
        Intrinsics.m32180i(event, "event");
        Function1<MotionEvent, Boolean> function1 = this.f25226c;
        if (function1 == null || (invoke = function1.invoke(event)) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent event) {
        Boolean invoke;
        Intrinsics.m32180i(event, "event");
        Function1<MotionEvent, Boolean> function1 = this.f25225b;
        if (function1 == null || (invoke = function1.invoke(event)) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleOnGestureListener(@Nullable Function1<? super MotionEvent, Boolean> function1, @Nullable Function1<? super MotionEvent, Boolean> function12) {
        this.f25225b = function1;
        this.f25226c = function12;
    }
}
