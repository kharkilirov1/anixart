package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivAnimation;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: DivStateBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivStateBinderKt {

    /* compiled from: DivStateBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            DivAnimation.Name name = DivAnimation.Name.TRANSLATE;
            iArr[1] = 1;
            DivAnimation.Name name2 = DivAnimation.Name.SCALE;
            iArr[2] = 2;
            DivAnimation.Name name3 = DivAnimation.Name.NO_ANIMATION;
            iArr[5] = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.transition.Transition m17036a(com.yandex.div2.DivAnimation r6, boolean r7, com.yandex.div.json.expressions.ExpressionResolver r8) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinderKt.m17036a(com.yandex.div2.DivAnimation, boolean, com.yandex.div.json.expressions.ExpressionResolver):androidx.transition.Transition");
    }

    /* renamed from: b */
    public static final Float m17037b(Double d) {
        if (d == null) {
            return null;
        }
        return Float.valueOf(RangesKt.m32238e((float) d.doubleValue(), 0.0f, 1.0f));
    }

    /* renamed from: c */
    public static final Float m17038c(Double d) {
        if (d == null) {
            return null;
        }
        return Float.valueOf(RangesKt.m32234a((float) d.doubleValue(), 0.0f));
    }

    /* renamed from: d */
    public static final Float m17039d(Double d) {
        if (d == null) {
            return null;
        }
        return Float.valueOf(RangesKt.m32238e((float) d.doubleValue(), -1.0f, 1.0f));
    }
}
