package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPercentageSize;
import com.yandex.div2.DivPercentageSizeTemplate;
import com.yandex.div2.DivScaleTransition;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3076y implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3076y f42172c = new C3076y(0);

    /* renamed from: d */
    public static final /* synthetic */ C3076y f42173d = new C3076y(2);

    /* renamed from: e */
    public static final /* synthetic */ C3076y f42174e = new C3076y(3);

    /* renamed from: f */
    public static final /* synthetic */ C3076y f42175f = new C3076y(4);

    /* renamed from: g */
    public static final /* synthetic */ C3076y f42176g = new C3076y(6);

    /* renamed from: h */
    public static final /* synthetic */ C3076y f42177h = new C3076y(8);

    /* renamed from: i */
    public static final /* synthetic */ C3076y f42178i = new C3076y(9);

    /* renamed from: j */
    public static final /* synthetic */ C3076y f42179j = new C3076y(11);

    /* renamed from: k */
    public static final /* synthetic */ C3076y f42180k = new C3076y(13);

    /* renamed from: l */
    public static final /* synthetic */ C3076y f42181l = new C3076y(15);

    /* renamed from: m */
    public static final /* synthetic */ C3076y f42182m = new C3076y(16);

    /* renamed from: n */
    public static final /* synthetic */ C3076y f42183n = new C3076y(17);

    /* renamed from: o */
    public static final /* synthetic */ C3076y f42184o = new C3076y(18);

    /* renamed from: p */
    public static final /* synthetic */ C3076y f42185p = new C3076y(19);

    /* renamed from: q */
    public static final /* synthetic */ C3076y f42186q = new C3076y(20);

    /* renamed from: r */
    public static final /* synthetic */ C3076y f42187r = new C3076y(21);

    /* renamed from: s */
    public static final /* synthetic */ C3076y f42188s = new C3076y(22);

    /* renamed from: t */
    public static final /* synthetic */ C3076y f42189t = new C3076y(23);

    /* renamed from: u */
    public static final /* synthetic */ C3076y f42190u = new C3076y(24);

    /* renamed from: v */
    public static final /* synthetic */ C3076y f42191v = new C3076y(26);

    /* renamed from: w */
    public static final /* synthetic */ C3076y f42192w = new C3076y(27);

    /* renamed from: x */
    public static final /* synthetic */ C3076y f42193x = new C3076y(28);

    /* renamed from: b */
    public final /* synthetic */ int f42194b;

    public /* synthetic */ C3076y(int i2) {
        this.f42194b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f42194b) {
            case 0:
                long longValue = ((Long) obj).longValue();
                Expression<Long> expression = DivLinearGradientTemplate.f37697c;
                if (longValue < 0 || longValue > 360) {
                }
                break;
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                DivMatchParentSize.Companion companion = DivMatchParentSize.f37710b;
                if (doubleValue > 0.0d) {
                }
                break;
            case 2:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivMatchParentSize.Companion companion2 = DivMatchParentSize.f37710b;
                if (doubleValue2 > 0.0d) {
                }
                break;
            case 3:
                double doubleValue3 = ((Double) obj).doubleValue();
                Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> function3 = DivMatchParentSizeTemplate.f37713b;
                if (doubleValue3 > 0.0d) {
                }
                break;
            case 4:
                double doubleValue4 = ((Double) obj).doubleValue();
                Function3<String, JSONObject, ParsingEnvironment, Expression<Double>> function32 = DivMatchParentSizeTemplate.f37713b;
                if (doubleValue4 > 0.0d) {
                }
                break;
            case 5:
                double doubleValue5 = ((Double) obj).doubleValue();
                DivPager.Companion companion3 = DivPager.f37748G;
                if (doubleValue5 < 0.0d || doubleValue5 > 1.0d) {
                }
                break;
            case 6:
                String it = (String) obj;
                DivPager.Companion companion4 = DivPager.f37748G;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 7:
                long longValue2 = ((Long) obj).longValue();
                DivPager.Companion companion5 = DivPager.f37748G;
                if (longValue2 >= 0) {
                }
                break;
            case 8:
                long longValue3 = ((Long) obj).longValue();
                DivPager.Companion companion6 = DivPager.f37748G;
                if (longValue3 >= 0) {
                }
                break;
            case 9:
                double doubleValue6 = ((Double) obj).doubleValue();
                DivPager.Companion companion7 = DivPager.f37748G;
                if (doubleValue6 < 0.0d || doubleValue6 > 1.0d) {
                }
                break;
            case 10:
                long longValue4 = ((Long) obj).longValue();
                DivPager.Companion companion8 = DivPager.f37748G;
                if (longValue4 >= 0) {
                }
                break;
            case 11:
                long longValue5 = ((Long) obj).longValue();
                DivPager.Companion companion9 = DivPager.f37748G;
                if (longValue5 >= 0) {
                }
                break;
            case 12:
                long longValue6 = ((Long) obj).longValue();
                DivPager.Companion companion10 = DivPager.f37748G;
                if (longValue6 >= 0) {
                }
                break;
            case 13:
                long longValue7 = ((Long) obj).longValue();
                DivPager.Companion companion11 = DivPager.f37748G;
                if (longValue7 >= 0) {
                }
                break;
            case 14:
                String it2 = (String) obj;
                DivPager.Companion companion12 = DivPager.f37748G;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 15:
                double doubleValue7 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility = DivPagerTemplate.f37839G;
                if (doubleValue7 < 0.0d || doubleValue7 > 1.0d) {
                }
                break;
            case 16:
                String it3 = (String) obj;
                DivAccessibility divAccessibility2 = DivPagerTemplate.f37839G;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 17:
                String it4 = (String) obj;
                DivAccessibility divAccessibility3 = DivPagerTemplate.f37839G;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 18:
                long longValue8 = ((Long) obj).longValue();
                DivAccessibility divAccessibility4 = DivPagerTemplate.f37839G;
                if (longValue8 >= 0) {
                }
                break;
            case 19:
                long longValue9 = ((Long) obj).longValue();
                DivAccessibility divAccessibility5 = DivPagerTemplate.f37839G;
                if (longValue9 >= 0) {
                }
                break;
            case 20:
                double doubleValue8 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility6 = DivPagerTemplate.f37839G;
                if (doubleValue8 < 0.0d || doubleValue8 > 1.0d) {
                }
                break;
            case 21:
                long longValue10 = ((Long) obj).longValue();
                DivAccessibility divAccessibility7 = DivPagerTemplate.f37839G;
                if (longValue10 >= 0) {
                }
                break;
            case 22:
                long longValue11 = ((Long) obj).longValue();
                DivAccessibility divAccessibility8 = DivPagerTemplate.f37839G;
                if (longValue11 >= 0) {
                }
                break;
            case 23:
                long longValue12 = ((Long) obj).longValue();
                DivAccessibility divAccessibility9 = DivPagerTemplate.f37839G;
                if (longValue12 >= 0) {
                }
                break;
            case 24:
                long longValue13 = ((Long) obj).longValue();
                DivAccessibility divAccessibility10 = DivPagerTemplate.f37839G;
                if (longValue13 >= 0) {
                }
                break;
            case 25:
                double doubleValue9 = ((Double) obj).doubleValue();
                DivPercentageSize.Companion companion13 = DivPercentageSize.f38017b;
                if (doubleValue9 > 0.0d) {
                }
                break;
            case 26:
                double doubleValue10 = ((Double) obj).doubleValue();
                DivPercentageSize.Companion companion14 = DivPercentageSize.f38017b;
                if (doubleValue10 > 0.0d) {
                }
                break;
            case 27:
                double doubleValue11 = ((Double) obj).doubleValue();
                DivPercentageSizeTemplate.Companion companion15 = DivPercentageSizeTemplate.f38021b;
                if (doubleValue11 > 0.0d) {
                }
                break;
            case 28:
                double doubleValue12 = ((Double) obj).doubleValue();
                DivPercentageSizeTemplate.Companion companion16 = DivPercentageSizeTemplate.f38021b;
                if (doubleValue12 > 0.0d) {
                }
                break;
            default:
                long longValue14 = ((Long) obj).longValue();
                DivScaleTransition.Companion companion17 = DivScaleTransition.f38207g;
                if (longValue14 >= 0) {
                }
                break;
        }
        return false;
    }
}
