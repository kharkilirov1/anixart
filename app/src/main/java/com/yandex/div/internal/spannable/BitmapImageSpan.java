package com.yandex.div.internal.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.ReplacementSpan;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BitmapImageSpan.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/spannable/BitmapImageSpan;", "Landroid/text/style/ReplacementSpan;", "AnchorPoint", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class BitmapImageSpan extends ReplacementSpan {

    /* renamed from: b */
    public final float f33865b;

    /* renamed from: c */
    @NotNull
    public final AnchorPoint f33866c;

    /* renamed from: d */
    @NotNull
    public final Drawable f33867d;

    /* compiled from: BitmapImageSpan.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/internal/spannable/BitmapImageSpan$AnchorPoint;", "", "BASELINE", "LINE_BOTTOM", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum AnchorPoint {
        BASELINE,
        LINE_BOTTOM
    }

    /* compiled from: BitmapImageSpan.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnchorPoint.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BitmapImageSpan(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull android.graphics.Bitmap r3, float r4, int r5, int r6, @androidx.annotation.ColorInt @org.jetbrains.annotations.Nullable java.lang.Integer r7, @org.jetbrains.annotations.NotNull android.graphics.PorterDuff.Mode r8, boolean r9, @org.jetbrains.annotations.NotNull com.yandex.div.internal.spannable.BitmapImageSpan.AnchorPoint r10) {
        /*
            r1 = this;
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
            java.lang.String r0 = "tintMode"
            kotlin.jvm.internal.Intrinsics.m32179h(r8, r0)
            r1.<init>()
            r1.f33865b = r4
            r1.f33866c = r10
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r2.getResources()
            r4.<init>(r2, r3)
            r1.f33867d = r4
            r2 = 0
            if (r9 == 0) goto L60
            int r9 = r3.getWidth()
            int r3 = r3.getHeight()
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r5 <= 0) goto L2f
            float r0 = (float) r9
            float r5 = (float) r5
            float r0 = r0 / r5
            goto L31
        L2f:
            r0 = 1065353216(0x3f800000, float:1.0)
        L31:
            if (r6 <= 0) goto L37
            float r5 = (float) r3
            float r6 = (float) r6
            float r10 = r5 / r6
        L37:
            float r5 = java.lang.Math.max(r0, r10)
            r6 = 0
            r10 = 1
            if (r9 <= 0) goto L4c
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 != 0) goto L45
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            if (r0 != 0) goto L4c
            float r9 = (float) r9
            float r9 = r9 / r5
            int r9 = (int) r9
            goto L4d
        L4c:
            r9 = 0
        L4d:
            if (r3 <= 0) goto L5b
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 != 0) goto L54
            goto L55
        L54:
            r10 = 0
        L55:
            if (r10 != 0) goto L5b
            float r3 = (float) r3
            float r3 = r3 / r5
            int r3 = (int) r3
            goto L5c
        L5b:
            r3 = 0
        L5c:
            r4.setBounds(r2, r2, r9, r3)
            goto L63
        L60:
            r4.setBounds(r2, r2, r5, r6)
        L63:
            if (r7 == 0) goto L71
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            int r3 = r7.intValue()
            r2.<init>(r3, r8)
            r4.setColorFilter(r2)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.spannable.BitmapImageSpan.<init>(android.content.Context, android.graphics.Bitmap, float, int, int, java.lang.Integer, android.graphics.PorterDuff$Mode, boolean, com.yandex.div.internal.spannable.BitmapImageSpan$AnchorPoint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int i2, int i3, float f2, int i4, int i5, int i6, @NotNull Paint paint) {
        Intrinsics.m32179h(canvas, "canvas");
        Intrinsics.m32179h(text, "text");
        Intrinsics.m32179h(paint, "paint");
        canvas.save();
        int ordinal = this.f33866c.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = i6;
        }
        canvas.translate(f2, (i5 - this.f33867d.getBounds().bottom) + this.f33865b);
        this.f33867d.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int ceil2;
        Intrinsics.m32179h(paint, "paint");
        Intrinsics.m32179h(text, "text");
        if (fontMetricsInt != null) {
            if (i2 == 0 && Build.VERSION.SDK_INT < 28) {
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.descent = 0;
                fontMetricsInt.leading = 0;
            }
            Assert.m17297a(null, Long.valueOf(this.f33867d.getBounds().top), Long.valueOf(0));
            int i4 = this.f33867d.getBounds().bottom;
            int ordinal = this.f33866c.ordinal();
            if (ordinal == 0) {
                ceil = Math.ceil(i4 - this.f33865b);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ceil = Math.ceil((i4 - this.f33865b) - fontMetricsInt.bottom);
            }
            int i5 = -((int) ceil);
            fontMetricsInt.ascent = Math.min(i5, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i5, fontMetricsInt.top);
            int ordinal2 = this.f33866c.ordinal();
            if (ordinal2 == 0) {
                ceil2 = (int) Math.ceil(this.f33865b);
            } else {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ceil2 = fontMetricsInt.bottom;
            }
            fontMetricsInt.descent = Math.max(ceil2, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(ceil2, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return this.f33867d.getBounds().right;
    }
}
