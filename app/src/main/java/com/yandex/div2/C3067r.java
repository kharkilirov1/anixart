package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivIndicator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3067r implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3067r f41951c = new C3067r(0);

    /* renamed from: d */
    public static final /* synthetic */ C3067r f41952d = new C3067r(2);

    /* renamed from: e */
    public static final /* synthetic */ C3067r f41953e = new C3067r(4);

    /* renamed from: f */
    public static final /* synthetic */ C3067r f41954f = new C3067r(6);

    /* renamed from: g */
    public static final /* synthetic */ C3067r f41955g = new C3067r(8);

    /* renamed from: h */
    public static final /* synthetic */ C3067r f41956h = new C3067r(10);

    /* renamed from: i */
    public static final /* synthetic */ C3067r f41957i = new C3067r(12);

    /* renamed from: j */
    public static final /* synthetic */ C3067r f41958j = new C3067r(13);

    /* renamed from: k */
    public static final /* synthetic */ C3067r f41959k = new C3067r(14);

    /* renamed from: l */
    public static final /* synthetic */ C3067r f41960l = new C3067r(15);

    /* renamed from: m */
    public static final /* synthetic */ C3067r f41961m = new C3067r(16);

    /* renamed from: n */
    public static final /* synthetic */ C3067r f41962n = new C3067r(17);

    /* renamed from: o */
    public static final /* synthetic */ C3067r f41963o = new C3067r(18);

    /* renamed from: p */
    public static final /* synthetic */ C3067r f41964p = new C3067r(19);

    /* renamed from: q */
    public static final /* synthetic */ C3067r f41965q = new C3067r(20);

    /* renamed from: r */
    public static final /* synthetic */ C3067r f41966r = new C3067r(21);

    /* renamed from: s */
    public static final /* synthetic */ C3067r f41967s = new C3067r(22);

    /* renamed from: t */
    public static final /* synthetic */ C3067r f41968t = new C3067r(23);

    /* renamed from: u */
    public static final /* synthetic */ C3067r f41969u = new C3067r(24);

    /* renamed from: v */
    public static final /* synthetic */ C3067r f41970v = new C3067r(26);

    /* renamed from: w */
    public static final /* synthetic */ C3067r f41971w = new C3067r(28);

    /* renamed from: b */
    public final /* synthetic */ int f41972b;

    public /* synthetic */ C3067r(int i2) {
        this.f41972b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41972b) {
            case 0:
                long longValue = ((Long) obj).longValue();
                DivAccessibility divAccessibility = DivGridTemplate.f36503J;
                if (longValue >= 0) {
                }
                break;
            case 1:
                String it = (String) obj;
                DivImage.Companion companion = DivImage.f36662S;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 2:
                String it2 = (String) obj;
                DivImage.Companion companion2 = DivImage.f36662S;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 3:
                String it3 = (String) obj;
                DivImage.Companion companion3 = DivImage.f36662S;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 4:
                String it4 = (String) obj;
                DivImage.Companion companion4 = DivImage.f36662S;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 5:
                long longValue2 = ((Long) obj).longValue();
                DivImage.Companion companion5 = DivImage.f36662S;
                if (longValue2 >= 0) {
                }
                break;
            case 6:
                long longValue3 = ((Long) obj).longValue();
                DivImage.Companion companion6 = DivImage.f36662S;
                if (longValue3 >= 0) {
                }
                break;
            case 7:
                double doubleValue = ((Double) obj).doubleValue();
                DivImage.Companion companion7 = DivImage.f36662S;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 8:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivImage.Companion companion8 = DivImage.f36662S;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 9:
                long longValue4 = ((Long) obj).longValue();
                DivImage.Companion companion9 = DivImage.f36662S;
                if (longValue4 >= 0) {
                }
                break;
            case 10:
                long longValue5 = ((Long) obj).longValue();
                DivImage.Companion companion10 = DivImage.f36662S;
                if (longValue5 >= 0) {
                }
                break;
            case 11:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivImageBackground.Companion companion11 = DivImageBackground.f36748h;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 12:
                double doubleValue4 = ((Double) obj).doubleValue();
                DivImageBackground.Companion companion12 = DivImageBackground.f36748h;
                if (doubleValue4 < 0.0d || doubleValue4 > 1.0d) {
                }
                break;
            case 13:
                double doubleValue5 = ((Double) obj).doubleValue();
                Expression<Double> expression = DivImageBackgroundTemplate.f36770h;
                if (doubleValue5 < 0.0d || doubleValue5 > 1.0d) {
                }
                break;
            case 14:
                double doubleValue6 = ((Double) obj).doubleValue();
                Expression<Double> expression2 = DivImageBackgroundTemplate.f36770h;
                if (doubleValue6 < 0.0d || doubleValue6 > 1.0d) {
                }
                break;
            case 15:
                String it5 = (String) obj;
                DivAccessibility divAccessibility2 = DivImageTemplate.f36849S;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 16:
                String it6 = (String) obj;
                DivAccessibility divAccessibility3 = DivImageTemplate.f36849S;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 17:
                String it7 = (String) obj;
                DivAccessibility divAccessibility4 = DivImageTemplate.f36849S;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 18:
                String it8 = (String) obj;
                DivAccessibility divAccessibility5 = DivImageTemplate.f36849S;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            case 19:
                long longValue6 = ((Long) obj).longValue();
                DivAccessibility divAccessibility6 = DivImageTemplate.f36849S;
                if (longValue6 >= 0) {
                }
                break;
            case 20:
                long longValue7 = ((Long) obj).longValue();
                DivAccessibility divAccessibility7 = DivImageTemplate.f36849S;
                if (longValue7 >= 0) {
                }
                break;
            case 21:
                double doubleValue7 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility8 = DivImageTemplate.f36849S;
                if (doubleValue7 < 0.0d || doubleValue7 > 1.0d) {
                }
                break;
            case 22:
                double doubleValue8 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility9 = DivImageTemplate.f36849S;
                if (doubleValue8 < 0.0d || doubleValue8 > 1.0d) {
                }
                break;
            case 23:
                long longValue8 = ((Long) obj).longValue();
                DivAccessibility divAccessibility10 = DivImageTemplate.f36849S;
                if (longValue8 >= 0) {
                }
                break;
            case 24:
                long longValue9 = ((Long) obj).longValue();
                DivAccessibility divAccessibility11 = DivImageTemplate.f36849S;
                if (longValue9 >= 0) {
                }
                break;
            case 25:
                double doubleValue9 = ((Double) obj).doubleValue();
                DivIndicator.Companion companion13 = DivIndicator.f37014M;
                if (doubleValue9 > 0.0d) {
                }
                break;
            case 26:
                String it9 = (String) obj;
                DivIndicator.Companion companion14 = DivIndicator.f37014M;
                Intrinsics.m32179h(it9, "it");
                if (it9.length() >= 1) {
                }
                break;
            case 27:
                double doubleValue10 = ((Double) obj).doubleValue();
                DivIndicator.Companion companion15 = DivIndicator.f37014M;
                if (doubleValue10 > 0.0d) {
                }
                break;
            case 28:
                double doubleValue11 = ((Double) obj).doubleValue();
                DivIndicator.Companion companion16 = DivIndicator.f37014M;
                if (doubleValue11 > 0.0d) {
                }
                break;
            default:
                long longValue10 = ((Long) obj).longValue();
                DivIndicator.Companion companion17 = DivIndicator.f37014M;
                if (longValue10 >= 0) {
                }
                break;
        }
        return false;
    }
}
