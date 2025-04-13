package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivCornersRadiusTemplate;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.DivCustom;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3043f implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3043f f41323c = new C3043f(0);

    /* renamed from: d */
    public static final /* synthetic */ C3043f f41324d = new C3043f(1);

    /* renamed from: e */
    public static final /* synthetic */ C3043f f41325e = new C3043f(2);

    /* renamed from: f */
    public static final /* synthetic */ C3043f f41326f = new C3043f(4);

    /* renamed from: g */
    public static final /* synthetic */ C3043f f41327g = new C3043f(6);

    /* renamed from: h */
    public static final /* synthetic */ C3043f f41328h = new C3043f(8);

    /* renamed from: i */
    public static final /* synthetic */ C3043f f41329i = new C3043f(10);

    /* renamed from: j */
    public static final /* synthetic */ C3043f f41330j = new C3043f(11);

    /* renamed from: k */
    public static final /* synthetic */ C3043f f41331k = new C3043f(12);

    /* renamed from: l */
    public static final /* synthetic */ C3043f f41332l = new C3043f(13);

    /* renamed from: m */
    public static final /* synthetic */ C3043f f41333m = new C3043f(14);

    /* renamed from: n */
    public static final /* synthetic */ C3043f f41334n = new C3043f(15);

    /* renamed from: o */
    public static final /* synthetic */ C3043f f41335o = new C3043f(16);

    /* renamed from: p */
    public static final /* synthetic */ C3043f f41336p = new C3043f(17);

    /* renamed from: q */
    public static final /* synthetic */ C3043f f41337q = new C3043f(18);

    /* renamed from: r */
    public static final /* synthetic */ C3043f f41338r = new C3043f(20);

    /* renamed from: s */
    public static final /* synthetic */ C3043f f41339s = new C3043f(22);

    /* renamed from: t */
    public static final /* synthetic */ C3043f f41340t = new C3043f(23);

    /* renamed from: u */
    public static final /* synthetic */ C3043f f41341u = new C3043f(24);

    /* renamed from: v */
    public static final /* synthetic */ C3043f f41342v = new C3043f(25);

    /* renamed from: w */
    public static final /* synthetic */ C3043f f41343w = new C3043f(26);

    /* renamed from: x */
    public static final /* synthetic */ C3043f f41344x = new C3043f(29);

    /* renamed from: b */
    public final /* synthetic */ int f41345b;

    public /* synthetic */ C3043f(int i2) {
        this.f41345b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41345b) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility = DivContainerTemplate.f35007N;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 1:
                long longValue = ((Long) obj).longValue();
                DivAccessibility divAccessibility2 = DivContainerTemplate.f35007N;
                if (longValue >= 0) {
                }
                break;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                DivAccessibility divAccessibility3 = DivContainerTemplate.f35007N;
                if (longValue2 >= 0) {
                }
                break;
            case 3:
                long longValue3 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion = DivCornersRadius.f35216e;
                if (longValue3 >= 0) {
                }
                break;
            case 4:
                long longValue4 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion2 = DivCornersRadius.f35216e;
                if (longValue4 >= 0) {
                }
                break;
            case 5:
                long longValue5 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion3 = DivCornersRadius.f35216e;
                if (longValue5 >= 0) {
                }
                break;
            case 6:
                long longValue6 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion4 = DivCornersRadius.f35216e;
                if (longValue6 >= 0) {
                }
                break;
            case 7:
                long longValue7 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion5 = DivCornersRadius.f35216e;
                if (longValue7 >= 0) {
                }
                break;
            case 8:
                long longValue8 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion6 = DivCornersRadius.f35216e;
                if (longValue8 >= 0) {
                }
                break;
            case 9:
                long longValue9 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion7 = DivCornersRadius.f35216e;
                if (longValue9 >= 0) {
                }
                break;
            case 10:
                long longValue10 = ((Long) obj).longValue();
                DivCornersRadius.Companion companion8 = DivCornersRadius.f35216e;
                if (longValue10 >= 0) {
                }
                break;
            case 11:
                long longValue11 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion9 = DivCornersRadiusTemplate.f35223e;
                if (longValue11 >= 0) {
                }
                break;
            case 12:
                long longValue12 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion10 = DivCornersRadiusTemplate.f35223e;
                if (longValue12 >= 0) {
                }
                break;
            case 13:
                long longValue13 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion11 = DivCornersRadiusTemplate.f35223e;
                if (longValue13 >= 0) {
                }
                break;
            case 14:
                long longValue14 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion12 = DivCornersRadiusTemplate.f35223e;
                if (longValue14 >= 0) {
                }
                break;
            case 15:
                long longValue15 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion13 = DivCornersRadiusTemplate.f35223e;
                if (longValue15 >= 0) {
                }
                break;
            case 16:
                long longValue16 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion14 = DivCornersRadiusTemplate.f35223e;
                if (longValue16 >= 0) {
                }
                break;
            case 17:
                long longValue17 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion15 = DivCornersRadiusTemplate.f35223e;
                if (longValue17 >= 0) {
                }
                break;
            case 18:
                long longValue18 = ((Long) obj).longValue();
                DivCornersRadiusTemplate.Companion companion16 = DivCornersRadiusTemplate.f35223e;
                if (longValue18 >= 0) {
                }
                break;
            case 19:
                String it = (String) obj;
                DivCurrencyInputMask.Companion companion17 = DivCurrencyInputMask.f35246c;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 20:
                String it2 = (String) obj;
                DivCurrencyInputMask.Companion companion18 = DivCurrencyInputMask.f35246c;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 21:
                String it3 = (String) obj;
                DivCurrencyInputMask.Companion companion19 = DivCurrencyInputMask.f35246c;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 22:
                String it4 = (String) obj;
                DivCurrencyInputMask.Companion companion20 = DivCurrencyInputMask.f35246c;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 23:
                String it5 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, Expression<String>> function3 = DivCurrencyInputMaskTemplate.f35250c;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 24:
                String it6 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, Expression<String>> function32 = DivCurrencyInputMaskTemplate.f35250c;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 25:
                String it7 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, Expression<String>> function33 = DivCurrencyInputMaskTemplate.f35250c;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 26:
                String it8 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, Expression<String>> function34 = DivCurrencyInputMaskTemplate.f35250c;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            case 27:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivCustom.Companion companion21 = DivCustom.f35258D;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 28:
                long longValue19 = ((Long) obj).longValue();
                DivCustom.Companion companion22 = DivCustom.f35258D;
                if (longValue19 >= 0) {
                }
                break;
            default:
                long longValue20 = ((Long) obj).longValue();
                DivCustom.Companion companion23 = DivCustom.f35258D;
                if (longValue20 >= 0) {
                }
                break;
        }
        return false;
    }
}
