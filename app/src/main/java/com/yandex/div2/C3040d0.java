package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivShadowTemplate;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.DivSlider;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.d0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3040d0 implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3040d0 f41237c = new C3040d0(0);

    /* renamed from: d */
    public static final /* synthetic */ C3040d0 f41238d = new C3040d0(1);

    /* renamed from: e */
    public static final /* synthetic */ C3040d0 f41239e = new C3040d0(2);

    /* renamed from: f */
    public static final /* synthetic */ C3040d0 f41240f = new C3040d0(3);

    /* renamed from: g */
    public static final /* synthetic */ C3040d0 f41241g = new C3040d0(4);

    /* renamed from: h */
    public static final /* synthetic */ C3040d0 f41242h = new C3040d0(5);

    /* renamed from: i */
    public static final /* synthetic */ C3040d0 f41243i = new C3040d0(6);

    /* renamed from: j */
    public static final /* synthetic */ C3040d0 f41244j = new C3040d0(8);

    /* renamed from: k */
    public static final /* synthetic */ C3040d0 f41245k = new C3040d0(10);

    /* renamed from: l */
    public static final /* synthetic */ C3040d0 f41246l = new C3040d0(11);

    /* renamed from: m */
    public static final /* synthetic */ C3040d0 f41247m = new C3040d0(12);

    /* renamed from: n */
    public static final /* synthetic */ C3040d0 f41248n = new C3040d0(13);

    /* renamed from: o */
    public static final /* synthetic */ C3040d0 f41249o = new C3040d0(14);

    /* renamed from: p */
    public static final /* synthetic */ C3040d0 f41250p = new C3040d0(16);

    /* renamed from: q */
    public static final /* synthetic */ C3040d0 f41251q = new C3040d0(18);

    /* renamed from: r */
    public static final /* synthetic */ C3040d0 f41252r = new C3040d0(19);

    /* renamed from: s */
    public static final /* synthetic */ C3040d0 f41253s = new C3040d0(20);

    /* renamed from: t */
    public static final /* synthetic */ C3040d0 f41254t = new C3040d0(21);

    /* renamed from: u */
    public static final /* synthetic */ C3040d0 f41255u = new C3040d0(22);

    /* renamed from: v */
    public static final /* synthetic */ C3040d0 f41256v = new C3040d0(24);

    /* renamed from: w */
    public static final /* synthetic */ C3040d0 f41257w = new C3040d0(26);

    /* renamed from: x */
    public static final /* synthetic */ C3040d0 f41258x = new C3040d0(28);

    /* renamed from: y */
    public static final /* synthetic */ C3040d0 f41259y = new C3040d0(29);

    /* renamed from: b */
    public final /* synthetic */ int f41260b;

    public /* synthetic */ C3040d0(int i2) {
        this.f41260b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41260b) {
            case 0:
                String it = (String) obj;
                DivAccessibility divAccessibility = DivSeparatorTemplate.f38623G;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 1:
                long longValue = ((Long) obj).longValue();
                DivAccessibility divAccessibility2 = DivSeparatorTemplate.f38623G;
                if (longValue >= 0) {
                }
                break;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                DivAccessibility divAccessibility3 = DivSeparatorTemplate.f38623G;
                if (longValue2 >= 0) {
                }
                break;
            case 3:
                double doubleValue = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility4 = DivSeparatorTemplate.f38623G;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 4:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility5 = DivSeparatorTemplate.f38623G;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 5:
                long longValue3 = ((Long) obj).longValue();
                DivAccessibility divAccessibility6 = DivSeparatorTemplate.f38623G;
                if (longValue3 >= 0) {
                }
                break;
            case 6:
                long longValue4 = ((Long) obj).longValue();
                DivAccessibility divAccessibility7 = DivSeparatorTemplate.f38623G;
                if (longValue4 >= 0) {
                }
                break;
            case 7:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivShadow.Companion companion = DivShadow.f38773e;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 8:
                double doubleValue4 = ((Double) obj).doubleValue();
                DivShadow.Companion companion2 = DivShadow.f38773e;
                if (doubleValue4 < 0.0d || doubleValue4 > 1.0d) {
                }
                break;
            case 9:
                long longValue5 = ((Long) obj).longValue();
                DivShadow.Companion companion3 = DivShadow.f38773e;
                if (longValue5 >= 0) {
                }
                break;
            case 10:
                long longValue6 = ((Long) obj).longValue();
                DivShadow.Companion companion4 = DivShadow.f38773e;
                if (longValue6 >= 0) {
                }
                break;
            case 11:
                double doubleValue5 = ((Double) obj).doubleValue();
                DivShadowTemplate.Companion companion5 = DivShadowTemplate.f38785e;
                if (doubleValue5 < 0.0d || doubleValue5 > 1.0d) {
                }
                break;
            case 12:
                double doubleValue6 = ((Double) obj).doubleValue();
                DivShadowTemplate.Companion companion6 = DivShadowTemplate.f38785e;
                if (doubleValue6 < 0.0d || doubleValue6 > 1.0d) {
                }
                break;
            case 13:
                long longValue7 = ((Long) obj).longValue();
                DivShadowTemplate.Companion companion7 = DivShadowTemplate.f38785e;
                if (longValue7 >= 0) {
                }
                break;
            case 14:
                long longValue8 = ((Long) obj).longValue();
                DivShadowTemplate.Companion companion8 = DivShadowTemplate.f38785e;
                if (longValue8 >= 0) {
                }
                break;
            case 15:
                long longValue9 = ((Long) obj).longValue();
                DivSlideTransition.Companion companion9 = DivSlideTransition.f38853f;
                if (longValue9 >= 0) {
                }
                break;
            case 16:
                long longValue10 = ((Long) obj).longValue();
                DivSlideTransition.Companion companion10 = DivSlideTransition.f38853f;
                if (longValue10 >= 0) {
                }
                break;
            case 17:
                long longValue11 = ((Long) obj).longValue();
                DivSlideTransition.Companion companion11 = DivSlideTransition.f38853f;
                if (longValue11 >= 0) {
                }
                break;
            case 18:
                long longValue12 = ((Long) obj).longValue();
                DivSlideTransition.Companion companion12 = DivSlideTransition.f38853f;
                if (longValue12 >= 0) {
                }
                break;
            case 19:
                long longValue13 = ((Long) obj).longValue();
                Expression<Long> expression = DivSlideTransitionTemplate.f38879f;
                if (longValue13 >= 0) {
                }
                break;
            case 20:
                long longValue14 = ((Long) obj).longValue();
                Expression<Long> expression2 = DivSlideTransitionTemplate.f38879f;
                if (longValue14 >= 0) {
                }
                break;
            case 21:
                long longValue15 = ((Long) obj).longValue();
                Expression<Long> expression3 = DivSlideTransitionTemplate.f38879f;
                if (longValue15 >= 0) {
                }
                break;
            case 22:
                long longValue16 = ((Long) obj).longValue();
                Expression<Long> expression4 = DivSlideTransitionTemplate.f38879f;
                if (longValue16 >= 0) {
                }
                break;
            case 23:
                double doubleValue7 = ((Double) obj).doubleValue();
                DivSlider.Companion companion13 = DivSlider.f38908M;
                if (doubleValue7 < 0.0d || doubleValue7 > 1.0d) {
                }
                break;
            case 24:
                long longValue17 = ((Long) obj).longValue();
                DivSlider.Companion companion14 = DivSlider.f38908M;
                if (longValue17 >= 0) {
                }
                break;
            case 25:
                String it2 = (String) obj;
                DivSlider.Companion companion15 = DivSlider.f38908M;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 26:
                String it3 = (String) obj;
                DivSlider.Companion companion16 = DivSlider.f38908M;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 27:
                String it4 = (String) obj;
                DivSlider.Companion companion17 = DivSlider.f38908M;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 28:
                String it5 = (String) obj;
                DivSlider.Companion companion18 = DivSlider.f38908M;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            default:
                double doubleValue8 = ((Double) obj).doubleValue();
                DivSlider.Companion companion19 = DivSlider.f38908M;
                if (doubleValue8 < 0.0d || doubleValue8 > 1.0d) {
                }
                break;
        }
        return true;
    }
}
