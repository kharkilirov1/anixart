package com.stfalcon.imageviewer.viewer.view;

import android.view.View;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: ImageViewerView.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00072\u0015\u0010\b\u001a\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, m31884d2 = {"<anonymous>", "", "T", "p1", "", "Lkotlin/ParameterName;", "name", "translationY", "p2", "", "translationLimit", "invoke"}, m31885k = 3, m31886mv = {1, 1, 15})
/* loaded from: classes2.dex */
final /* synthetic */ class ImageViewerView$createSwipeToDismissHandler$3 extends FunctionReference implements Function2<Float, Integer, Unit> {
    public ImageViewerView$createSwipeToDismissHandler$3(ImageViewerView imageViewerView) {
        super(2, imageViewerView);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "handleSwipeViewMove";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(ImageViewerView.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "handleSwipeViewMove(FI)V";
    }

    @Override // kotlin.jvm.functions.Function2
    public Unit invoke(Float f2, Integer num) {
        float floatValue = f2.floatValue();
        int intValue = num.intValue();
        ImageViewerView imageViewerView = (ImageViewerView) this.receiver;
        int i2 = ImageViewerView.f25284B;
        Objects.requireNonNull(imageViewerView);
        float abs = 1.0f - (Math.abs(floatValue) * ((1.0f / intValue) / 4.0f));
        imageViewerView.f25293i.setAlpha(abs);
        View view = imageViewerView.overlayView;
        if (view != null) {
            view.setAlpha(abs);
        }
        return Unit.f63088a;
    }
}
