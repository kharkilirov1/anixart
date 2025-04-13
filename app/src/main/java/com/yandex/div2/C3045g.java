package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDisappearActionTemplate;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3045g implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3045g f41369c = new C3045g(0);

    /* renamed from: d */
    public static final /* synthetic */ C3045g f41370d = new C3045g(2);

    /* renamed from: e */
    public static final /* synthetic */ C3045g f41371e = new C3045g(4);

    /* renamed from: f */
    public static final /* synthetic */ C3045g f41372f = new C3045g(5);

    /* renamed from: g */
    public static final /* synthetic */ C3045g f41373g = new C3045g(6);

    /* renamed from: h */
    public static final /* synthetic */ C3045g f41374h = new C3045g(7);

    /* renamed from: i */
    public static final /* synthetic */ C3045g f41375i = new C3045g(8);

    /* renamed from: j */
    public static final /* synthetic */ C3045g f41376j = new C3045g(9);

    /* renamed from: k */
    public static final /* synthetic */ C3045g f41377k = new C3045g(10);

    /* renamed from: l */
    public static final /* synthetic */ C3045g f41378l = new C3045g(11);

    /* renamed from: m */
    public static final /* synthetic */ C3045g f41379m = new C3045g(12);

    /* renamed from: n */
    public static final /* synthetic */ C3045g f41380n = new C3045g(14);

    /* renamed from: o */
    public static final /* synthetic */ C3045g f41381o = new C3045g(15);

    /* renamed from: p */
    public static final /* synthetic */ C3045g f41382p = new C3045g(16);

    /* renamed from: q */
    public static final /* synthetic */ C3045g f41383q = new C3045g(18);

    /* renamed from: r */
    public static final /* synthetic */ C3045g f41384r = new C3045g(20);

    /* renamed from: s */
    public static final /* synthetic */ C3045g f41385s = new C3045g(22);

    /* renamed from: t */
    public static final /* synthetic */ C3045g f41386t = new C3045g(24);

    /* renamed from: u */
    public static final /* synthetic */ C3045g f41387u = new C3045g(25);

    /* renamed from: v */
    public static final /* synthetic */ C3045g f41388v = new C3045g(26);

    /* renamed from: w */
    public static final /* synthetic */ C3045g f41389w = new C3045g(27);

    /* renamed from: x */
    public static final /* synthetic */ C3045g f41390x = new C3045g(28);

    /* renamed from: y */
    public static final /* synthetic */ C3045g f41391y = new C3045g(29);

    /* renamed from: b */
    public final /* synthetic */ int f41392b;

    public /* synthetic */ C3045g(int i2) {
        this.f41392b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41392b) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                DivCustom.Companion companion = DivCustom.f35258D;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 1:
                long longValue = ((Long) obj).longValue();
                DivCustom.Companion companion2 = DivCustom.f35258D;
                if (longValue >= 0) {
                }
                break;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                DivCustom.Companion companion3 = DivCustom.f35258D;
                if (longValue2 >= 0) {
                }
                break;
            case 3:
                String it = (String) obj;
                DivCustom.Companion companion4 = DivCustom.f35258D;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 4:
                String it2 = (String) obj;
                DivCustom.Companion companion5 = DivCustom.f35258D;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 5:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility = DivCustomTemplate.f35319D;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 6:
                String it3 = (String) obj;
                DivAccessibility divAccessibility2 = DivCustomTemplate.f35319D;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 7:
                String it4 = (String) obj;
                DivAccessibility divAccessibility3 = DivCustomTemplate.f35319D;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 8:
                long longValue3 = ((Long) obj).longValue();
                DivAccessibility divAccessibility4 = DivCustomTemplate.f35319D;
                if (longValue3 >= 0) {
                }
                break;
            case 9:
                long longValue4 = ((Long) obj).longValue();
                DivAccessibility divAccessibility5 = DivCustomTemplate.f35319D;
                if (longValue4 >= 0) {
                }
                break;
            case 10:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility6 = DivCustomTemplate.f35319D;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 11:
                long longValue5 = ((Long) obj).longValue();
                DivAccessibility divAccessibility7 = DivCustomTemplate.f35319D;
                if (longValue5 >= 0) {
                }
                break;
            case 12:
                long longValue6 = ((Long) obj).longValue();
                DivAccessibility divAccessibility8 = DivCustomTemplate.f35319D;
                if (longValue6 >= 0) {
                }
                break;
            case 13:
                String it5 = (String) obj;
                DivData.Companion companion6 = DivData.f35444h;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 14:
                String it6 = (String) obj;
                DivData.Companion companion7 = DivData.f35444h;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 15:
                String it7 = (String) obj;
                Expression<DivTransitionSelector> expression = DivDataTemplate.f35466g;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 16:
                String it8 = (String) obj;
                Expression<DivTransitionSelector> expression2 = DivDataTemplate.f35466g;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            case 17:
                long longValue7 = ((Long) obj).longValue();
                DivDisappearAction.Companion companion8 = DivDisappearAction.f35537a;
                if (longValue7 >= 0) {
                }
                break;
            case 18:
                long longValue8 = ((Long) obj).longValue();
                DivDisappearAction.Companion companion9 = DivDisappearAction.f35537a;
                if (longValue8 >= 0) {
                }
                break;
            case 19:
                String it9 = (String) obj;
                DivDisappearAction.Companion companion10 = DivDisappearAction.f35537a;
                Intrinsics.m32179h(it9, "it");
                if (it9.length() >= 1) {
                }
                break;
            case 20:
                String it10 = (String) obj;
                DivDisappearAction.Companion companion11 = DivDisappearAction.f35537a;
                Intrinsics.m32179h(it10, "it");
                if (it10.length() >= 1) {
                }
                break;
            case 21:
                long longValue9 = ((Long) obj).longValue();
                DivDisappearAction.Companion companion12 = DivDisappearAction.f35537a;
                if (longValue9 >= 0) {
                }
                break;
            case 22:
                long longValue10 = ((Long) obj).longValue();
                DivDisappearAction.Companion companion13 = DivDisappearAction.f35537a;
                if (longValue10 >= 0) {
                }
                break;
            case 23:
                long longValue11 = ((Long) obj).longValue();
                DivDisappearAction.Companion companion14 = DivDisappearAction.f35537a;
                if (longValue11 < 0 || longValue11 >= 100) {
                }
                break;
            case 24:
                long longValue12 = ((Long) obj).longValue();
                DivDisappearAction.Companion companion15 = DivDisappearAction.f35537a;
                if (longValue12 < 0 || longValue12 >= 100) {
                }
                break;
            case 25:
                long longValue13 = ((Long) obj).longValue();
                DivDisappearActionTemplate.Companion companion16 = DivDisappearActionTemplate.f35550i;
                if (longValue13 >= 0) {
                }
                break;
            case 26:
                long longValue14 = ((Long) obj).longValue();
                DivDisappearActionTemplate.Companion companion17 = DivDisappearActionTemplate.f35550i;
                if (longValue14 >= 0) {
                }
                break;
            case 27:
                String it11 = (String) obj;
                DivDisappearActionTemplate.Companion companion18 = DivDisappearActionTemplate.f35550i;
                Intrinsics.m32179h(it11, "it");
                if (it11.length() >= 1) {
                }
                break;
            case 28:
                String it12 = (String) obj;
                DivDisappearActionTemplate.Companion companion19 = DivDisappearActionTemplate.f35550i;
                Intrinsics.m32179h(it12, "it");
                if (it12.length() >= 1) {
                }
                break;
            default:
                long longValue15 = ((Long) obj).longValue();
                DivDisappearActionTemplate.Companion companion20 = DivDisappearActionTemplate.f35550i;
                if (longValue15 >= 0) {
                }
                break;
        }
        return false;
    }
}
