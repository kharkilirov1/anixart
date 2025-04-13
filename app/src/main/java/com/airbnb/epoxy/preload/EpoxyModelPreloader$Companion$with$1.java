package com.airbnb.epoxy.preload;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: EpoxyModelPreloader.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\f\b\u0002\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\n\b\u0003\u0010\u0006*\u0004\u0018\u00010\u0001\"\b\b\u0004\u0010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, m31884d2 = {"<anonymous>", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "T", "Lcom/airbnb/epoxy/EpoxyModel;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "U", "it", "Landroid/view/View;", "invoke"}, m31885k = 3, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EpoxyModelPreloader$Companion$with$1 extends Lambda implements Function1<View, ViewMetadata> {
    static {
        new EpoxyModelPreloader$Companion$with$1();
    }

    public EpoxyModelPreloader$Companion$with$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public ViewMetadata invoke(View view) {
        View it = view;
        Intrinsics.m32179h(it, "it");
        int i2 = ViewMetadata.f7069a;
        if (!(it instanceof ImageView)) {
            return null;
        }
        ImageView.ScaleType scaleType = ((ImageView) it).getScaleType();
        Intrinsics.m32178g(scaleType, "view.scaleType");
        return new ImageViewMetadata(scaleType);
    }
}
