package com.stfalcon.imageviewer.viewer.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageViewerView.kt */
@Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 15})
/* loaded from: classes2.dex */
final /* synthetic */ class ImageViewerView$dispatchTouchEvent$1 extends MutablePropertyReference0 {
    @Override // kotlin.reflect.KProperty0
    @Nullable
    public Object get() {
        TransitionImageAnimator transitionImageAnimator = ((ImageViewerView) this.receiver).f25310z;
        if (transitionImageAnimator != null) {
            return transitionImageAnimator;
        }
        Intrinsics.m32189r("transitionImageAnimator");
        throw null;
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "transitionImageAnimator";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.m32193a(ImageViewerView.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getTransitionImageAnimator()Lcom/stfalcon/imageviewer/viewer/view/TransitionImageAnimator;";
    }
}
