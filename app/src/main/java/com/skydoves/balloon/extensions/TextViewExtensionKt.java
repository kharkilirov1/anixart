package com.skydoves.balloon.extensions;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.widget.TextView;
import com.skydoves.balloon.TextForm;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextViewExtension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"balloon_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class TextViewExtensionKt {
    /* renamed from: a */
    public static final void m13879a(@NotNull TextView applyTextForm, @NotNull TextForm textForm) {
        CharSequence charSequence;
        Intrinsics.m32179h(applyTextForm, "$this$applyTextForm");
        boolean z = textForm.f24731d;
        if (z) {
            String obj = textForm.f24728a.toString();
            charSequence = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(obj, 0) : Html.fromHtml(obj);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            charSequence = textForm.f24728a;
        }
        applyTextForm.setText(charSequence);
        applyTextForm.setTextSize(textForm.f24729b);
        applyTextForm.setGravity(textForm.f24734g);
        applyTextForm.setTextColor(textForm.f24730c);
        Typeface typeface = textForm.f24733f;
        if (typeface != null) {
            applyTextForm.setTypeface(typeface);
        } else {
            applyTextForm.setTypeface(applyTextForm.getTypeface(), textForm.f24732e);
        }
    }
}
