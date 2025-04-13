package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AdaptiveMaxLines.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "", "Params", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AdaptiveMaxLines {

    /* renamed from: a */
    @NotNull
    public final TextView f32954a;

    /* renamed from: b */
    @Nullable
    public View.OnAttachStateChangeListener f32955b;

    /* renamed from: c */
    @Nullable
    public ViewTreeObserver.OnPreDrawListener f32956c;

    /* renamed from: d */
    @Nullable
    public Params f32957d;

    /* renamed from: e */
    public boolean f32958e;

    /* compiled from: AdaptiveMaxLines.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/AdaptiveMaxLines$Params;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Params {

        /* renamed from: a */
        public final int f32959a;

        /* renamed from: b */
        public final int f32960b;

        public Params(int i2, int i3) {
            this.f32959a = i2;
            this.f32960b = i3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.f32959a == params.f32959a && this.f32960b == params.f32960b;
        }

        public int hashCode() {
            return (this.f32959a * 31) + this.f32960b;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Params(maxLines=");
            m24u.append(this.f32959a);
            m24u.append(", minHiddenLines=");
            return C0000a.m17n(m24u, this.f32960b, ')');
        }
    }

    public AdaptiveMaxLines(@NotNull TextView textView) {
        this.f32954a = textView;
    }

    /* renamed from: a */
    public final void m17132a() {
        if (this.f32956c != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addPreDrawListener$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                AdaptiveMaxLines adaptiveMaxLines = AdaptiveMaxLines.this;
                AdaptiveMaxLines.Params params = adaptiveMaxLines.f32957d;
                if (params == null || TextUtils.isEmpty(adaptiveMaxLines.f32954a.getText())) {
                    return true;
                }
                AdaptiveMaxLines adaptiveMaxLines2 = AdaptiveMaxLines.this;
                if (adaptiveMaxLines2.f32958e) {
                    adaptiveMaxLines2.m17133b();
                    AdaptiveMaxLines.this.f32958e = false;
                    return true;
                }
                AdaptiveMaxLines adaptiveMaxLines3 = AdaptiveMaxLines.this;
                r0.intValue();
                int lineCount = adaptiveMaxLines3.f32954a.getLineCount();
                int i2 = params.f32959a;
                r0 = lineCount <= params.f32960b + i2 ? Integer.MAX_VALUE : null;
                if (r0 != null) {
                    i2 = r0.intValue();
                }
                if (i2 == AdaptiveMaxLines.this.f32954a.getMaxLines()) {
                    AdaptiveMaxLines.this.m17133b();
                    return true;
                }
                AdaptiveMaxLines.this.f32954a.setMaxLines(i2);
                AdaptiveMaxLines.this.f32958e = true;
                return false;
            }
        };
        ViewTreeObserver viewTreeObserver = this.f32954a.getViewTreeObserver();
        Intrinsics.m32178g(viewTreeObserver, "textView.viewTreeObserver");
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.f32956c = onPreDrawListener;
    }

    /* renamed from: b */
    public final void m17133b() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f32956c;
        if (onPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = this.f32954a.getViewTreeObserver();
            Intrinsics.m32178g(viewTreeObserver, "textView.viewTreeObserver");
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
        this.f32956c = null;
    }
}
