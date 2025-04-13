package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivScaleTransition;
import com.yandex.div2.DivSelect;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.a0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3034a0 implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3034a0 f41082c = new C3034a0(0);

    /* renamed from: d */
    public static final /* synthetic */ C3034a0 f41083d = new C3034a0(2);

    /* renamed from: e */
    public static final /* synthetic */ C3034a0 f41084e = new C3034a0(4);

    /* renamed from: f */
    public static final /* synthetic */ C3034a0 f41085f = new C3034a0(6);

    /* renamed from: g */
    public static final /* synthetic */ C3034a0 f41086g = new C3034a0(8);

    /* renamed from: h */
    public static final /* synthetic */ C3034a0 f41087h = new C3034a0(9);

    /* renamed from: i */
    public static final /* synthetic */ C3034a0 f41088i = new C3034a0(10);

    /* renamed from: j */
    public static final /* synthetic */ C3034a0 f41089j = new C3034a0(11);

    /* renamed from: k */
    public static final /* synthetic */ C3034a0 f41090k = new C3034a0(12);

    /* renamed from: l */
    public static final /* synthetic */ C3034a0 f41091l = new C3034a0(13);

    /* renamed from: m */
    public static final /* synthetic */ C3034a0 f41092m = new C3034a0(14);

    /* renamed from: n */
    public static final /* synthetic */ C3034a0 f41093n = new C3034a0(15);

    /* renamed from: o */
    public static final /* synthetic */ C3034a0 f41094o = new C3034a0(16);

    /* renamed from: p */
    public static final /* synthetic */ C3034a0 f41095p = new C3034a0(17);

    /* renamed from: q */
    public static final /* synthetic */ C3034a0 f41096q = new C3034a0(18);

    /* renamed from: r */
    public static final /* synthetic */ C3034a0 f41097r = new C3034a0(20);

    /* renamed from: s */
    public static final /* synthetic */ C3034a0 f41098s = new C3034a0(22);

    /* renamed from: t */
    public static final /* synthetic */ C3034a0 f41099t = new C3034a0(24);

    /* renamed from: u */
    public static final /* synthetic */ C3034a0 f41100u = new C3034a0(26);

    /* renamed from: v */
    public static final /* synthetic */ C3034a0 f41101v = new C3034a0(27);

    /* renamed from: w */
    public static final /* synthetic */ C3034a0 f41102w = new C3034a0(29);

    /* renamed from: b */
    public final /* synthetic */ int f41103b;

    public /* synthetic */ C3034a0(int i2) {
        this.f41103b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41103b) {
            case 0:
                long longValue = ((Long) obj).longValue();
                DivScaleTransition.Companion companion = DivScaleTransition.f38207g;
                if (longValue >= 0) {
                }
                break;
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                DivScaleTransition.Companion companion2 = DivScaleTransition.f38207g;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 2:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivScaleTransition.Companion companion3 = DivScaleTransition.f38207g;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 3:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivScaleTransition.Companion companion4 = DivScaleTransition.f38207g;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 4:
                double doubleValue4 = ((Double) obj).doubleValue();
                DivScaleTransition.Companion companion5 = DivScaleTransition.f38207g;
                if (doubleValue4 < 0.0d || doubleValue4 > 1.0d) {
                }
                break;
            case 5:
                double doubleValue5 = ((Double) obj).doubleValue();
                DivScaleTransition.Companion companion6 = DivScaleTransition.f38207g;
                if (doubleValue5 >= 0.0d) {
                }
                break;
            case 6:
                double doubleValue6 = ((Double) obj).doubleValue();
                DivScaleTransition.Companion companion7 = DivScaleTransition.f38207g;
                if (doubleValue6 >= 0.0d) {
                }
                break;
            case 7:
                long longValue2 = ((Long) obj).longValue();
                DivScaleTransition.Companion companion8 = DivScaleTransition.f38207g;
                if (longValue2 >= 0) {
                }
                break;
            case 8:
                long longValue3 = ((Long) obj).longValue();
                DivScaleTransition.Companion companion9 = DivScaleTransition.f38207g;
                if (longValue3 >= 0) {
                }
                break;
            case 9:
                long longValue4 = ((Long) obj).longValue();
                Expression<Long> expression = DivScaleTransitionTemplate.f38231g;
                if (longValue4 >= 0) {
                }
                break;
            case 10:
                long longValue5 = ((Long) obj).longValue();
                Expression<Long> expression2 = DivScaleTransitionTemplate.f38231g;
                if (longValue5 >= 0) {
                }
                break;
            case 11:
                double doubleValue7 = ((Double) obj).doubleValue();
                Expression<Long> expression3 = DivScaleTransitionTemplate.f38231g;
                if (doubleValue7 < 0.0d || doubleValue7 > 1.0d) {
                }
                break;
            case 12:
                double doubleValue8 = ((Double) obj).doubleValue();
                Expression<Long> expression4 = DivScaleTransitionTemplate.f38231g;
                if (doubleValue8 < 0.0d || doubleValue8 > 1.0d) {
                }
                break;
            case 13:
                double doubleValue9 = ((Double) obj).doubleValue();
                Expression<Long> expression5 = DivScaleTransitionTemplate.f38231g;
                if (doubleValue9 < 0.0d || doubleValue9 > 1.0d) {
                }
                break;
            case 14:
                double doubleValue10 = ((Double) obj).doubleValue();
                Expression<Long> expression6 = DivScaleTransitionTemplate.f38231g;
                if (doubleValue10 < 0.0d || doubleValue10 > 1.0d) {
                }
                break;
            case 15:
                double doubleValue11 = ((Double) obj).doubleValue();
                Expression<Long> expression7 = DivScaleTransitionTemplate.f38231g;
                if (doubleValue11 >= 0.0d) {
                }
                break;
            case 16:
                double doubleValue12 = ((Double) obj).doubleValue();
                Expression<Long> expression8 = DivScaleTransitionTemplate.f38231g;
                if (doubleValue12 >= 0.0d) {
                }
                break;
            case 17:
                long longValue6 = ((Long) obj).longValue();
                Expression<Long> expression9 = DivScaleTransitionTemplate.f38231g;
                if (longValue6 >= 0) {
                }
                break;
            case 18:
                long longValue7 = ((Long) obj).longValue();
                Expression<Long> expression10 = DivScaleTransitionTemplate.f38231g;
                if (longValue7 >= 0) {
                }
                break;
            case 19:
                double doubleValue13 = ((Double) obj).doubleValue();
                DivSelect.Companion companion10 = DivSelect.f38266L;
                if (doubleValue13 < 0.0d || doubleValue13 > 1.0d) {
                }
                break;
            case 20:
                String it = (String) obj;
                DivSelect.Companion companion11 = DivSelect.f38266L;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 21:
                String it2 = (String) obj;
                DivSelect.Companion companion12 = DivSelect.f38266L;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 22:
                String it3 = (String) obj;
                DivSelect.Companion companion13 = DivSelect.f38266L;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 23:
                long longValue8 = ((Long) obj).longValue();
                DivSelect.Companion companion14 = DivSelect.f38266L;
                if (longValue8 >= 0) {
                }
                break;
            case 24:
                long longValue9 = ((Long) obj).longValue();
                DivSelect.Companion companion15 = DivSelect.f38266L;
                if (longValue9 >= 0) {
                }
                break;
            case 25:
                long longValue10 = ((Long) obj).longValue();
                DivSelect.Companion companion16 = DivSelect.f38266L;
                if (longValue10 >= 0) {
                }
                break;
            case 26:
                long longValue11 = ((Long) obj).longValue();
                DivSelect.Companion companion17 = DivSelect.f38266L;
                if (longValue11 >= 0) {
                }
                break;
            case 27:
                double doubleValue14 = ((Double) obj).doubleValue();
                DivSelect.Companion companion18 = DivSelect.f38266L;
                if (doubleValue14 < 0.0d || doubleValue14 > 1.0d) {
                }
                break;
            case 28:
                String it4 = (String) obj;
                DivSelect.Companion companion19 = DivSelect.f38266L;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            default:
                String it5 = (String) obj;
                DivSelect.Companion companion20 = DivSelect.f38266L;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
        }
        return false;
    }
}
