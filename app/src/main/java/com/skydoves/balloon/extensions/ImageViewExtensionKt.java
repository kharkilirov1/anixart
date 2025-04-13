package com.skydoves.balloon.extensions;

import com.skydoves.balloon.IconForm;
import com.skydoves.balloon.IconGravity;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.skydoves.balloon.vectortext.VectorTextViewParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageViewExtension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"balloon_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ImageViewExtensionKt {

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[IconGravity.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[1] = 4;
        }
    }

    /* renamed from: a */
    public static final void m13878a(@NotNull VectorTextView vectorTextView, @NotNull IconForm iconForm) {
        if (iconForm.f24715a != null) {
            VectorTextViewParams vectorTextViewParams = new VectorTextViewParams(null, null, null, null, null, null, null, null, Integer.valueOf(iconForm.f24718d), Integer.valueOf(iconForm.f24717c), null, Integer.valueOf(iconForm.f24719e), null, null, null, 29951);
            int ordinal = iconForm.f24716b.ordinal();
            if (ordinal == 0) {
                vectorTextViewParams.f24759e = iconForm.f24715a;
                vectorTextViewParams.f24755a = null;
            } else if (ordinal == 1) {
                vectorTextViewParams.f24760f = iconForm.f24715a;
                vectorTextViewParams.f24756b = null;
            } else if (ordinal == 2) {
                vectorTextViewParams.f24762h = iconForm.f24715a;
                vectorTextViewParams.f24758d = null;
            } else if (ordinal == 3) {
                vectorTextViewParams.f24761g = iconForm.f24715a;
                vectorTextViewParams.f24757c = null;
            }
            vectorTextView.setDrawableTextViewParams(vectorTextViewParams);
        }
    }
}
