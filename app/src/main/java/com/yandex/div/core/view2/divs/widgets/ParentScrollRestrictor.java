package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: ParentScrollRestrictor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ParentScrollRestrictor;", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "Companion", "Direction", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ParentScrollRestrictor implements OnInterceptTouchEventListener {

    /* renamed from: a */
    public final int f32856a;

    /* renamed from: b */
    public int f32857b = -1;

    /* renamed from: c */
    public float f32858c;

    /* renamed from: d */
    public float f32859d;

    /* renamed from: e */
    public int f32860e;

    /* compiled from: ParentScrollRestrictor.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ParentScrollRestrictor$Companion;", "", "", "DIRECTION_HORIZONTAL", "I", "DIRECTION_NONE", "DIRECTION_VERTICAL", "UNDEFINED_TOUCH_SLOP", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: ParentScrollRestrictor.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ParentScrollRestrictor$Direction;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public @interface Direction {
    }

    public ParentScrollRestrictor(@Direction int i2) {
        this.f32856a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r7 != 3) goto L35;
     */
    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListener
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo17109a(@org.jetbrains.annotations.NotNull android.view.ViewGroup r7, @org.jetbrains.annotations.NotNull android.view.MotionEvent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.m32179h(r8, r0)
            android.view.ViewParent r0 = r7.getParent()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r2 = r6.f32857b
            r3 = -1
            if (r2 != r3) goto L20
            android.content.Context r7 = r7.getContext()
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            int r7 = r7.getScaledTouchSlop()
            r6.f32857b = r7
        L20:
            int r7 = r8.getActionMasked()
            r2 = 1
            if (r7 == 0) goto L70
            if (r7 == r2) goto L6c
            r3 = 2
            if (r7 == r3) goto L30
            r8 = 3
            if (r7 == r8) goto L6c
            goto L81
        L30:
            int r7 = r6.f32860e
            if (r7 != 0) goto L5f
            float r7 = r6.f32858c
            float r4 = r8.getX()
            float r7 = r7 - r4
            float r7 = java.lang.Math.abs(r7)
            float r4 = r6.f32859d
            float r8 = r8.getY()
            float r4 = r4 - r8
            float r8 = java.lang.Math.abs(r4)
            int r4 = r6.f32857b
            float r4 = (float) r4
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 >= 0) goto L57
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L57
            r2 = 0
            goto L5d
        L57:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L5c
            goto L5d
        L5c:
            r2 = 2
        L5d:
            r6.f32860e = r2
        L5f:
            int r7 = r6.f32860e
            if (r7 == 0) goto L81
            int r8 = r6.f32856a
            r7 = r7 & r8
            if (r7 != 0) goto L81
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L81
        L6c:
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L81
        L70:
            float r7 = r8.getX()
            r6.f32858c = r7
            float r7 = r8.getY()
            r6.f32859d = r7
            r6.f32860e = r1
            r0.requestDisallowInterceptTouchEvent(r2)
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor.mo17109a(android.view.ViewGroup, android.view.MotionEvent):boolean");
    }
}
