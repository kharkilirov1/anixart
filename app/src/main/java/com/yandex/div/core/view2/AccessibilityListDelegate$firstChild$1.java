package com.yandex.div.core.view2;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements Function1<View, Integer> {

    /* renamed from: d */
    public static final AccessibilityListDelegate$firstChild$1 f31528d = new AccessibilityListDelegate$firstChild$1();

    public AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public Integer invoke(View view) {
        View p0 = view;
        Intrinsics.m32179h(p0, "p0");
        return Integer.valueOf(p0.getTop());
    }
}
