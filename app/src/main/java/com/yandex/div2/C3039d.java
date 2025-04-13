package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAspectTemplate;
import com.yandex.div2.DivBlur;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivBorderTemplate;
import com.yandex.div2.DivChangeBoundsTransition;
import com.yandex.div2.DivContainer;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3039d implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3039d f41214c = new C3039d(0);

    /* renamed from: d */
    public static final /* synthetic */ C3039d f41215d = new C3039d(2);

    /* renamed from: e */
    public static final /* synthetic */ C3039d f41216e = new C3039d(3);

    /* renamed from: f */
    public static final /* synthetic */ C3039d f41217f = new C3039d(4);

    /* renamed from: g */
    public static final /* synthetic */ C3039d f41218g = new C3039d(6);

    /* renamed from: h */
    public static final /* synthetic */ C3039d f41219h = new C3039d(7);

    /* renamed from: i */
    public static final /* synthetic */ C3039d f41220i = new C3039d(8);

    /* renamed from: j */
    public static final /* synthetic */ C3039d f41221j = new C3039d(10);

    /* renamed from: k */
    public static final /* synthetic */ C3039d f41222k = new C3039d(12);

    /* renamed from: l */
    public static final /* synthetic */ C3039d f41223l = new C3039d(13);

    /* renamed from: m */
    public static final /* synthetic */ C3039d f41224m = new C3039d(14);

    /* renamed from: n */
    public static final /* synthetic */ C3039d f41225n = new C3039d(15);

    /* renamed from: o */
    public static final /* synthetic */ C3039d f41226o = new C3039d(16);

    /* renamed from: p */
    public static final /* synthetic */ C3039d f41227p = new C3039d(17);

    /* renamed from: q */
    public static final /* synthetic */ C3039d f41228q = new C3039d(19);

    /* renamed from: r */
    public static final /* synthetic */ C3039d f41229r = new C3039d(21);

    /* renamed from: s */
    public static final /* synthetic */ C3039d f41230s = new C3039d(23);

    /* renamed from: t */
    public static final /* synthetic */ C3039d f41231t = new C3039d(25);

    /* renamed from: u */
    public static final /* synthetic */ C3039d f41232u = new C3039d(26);

    /* renamed from: v */
    public static final /* synthetic */ C3039d f41233v = new C3039d(27);

    /* renamed from: w */
    public static final /* synthetic */ C3039d f41234w = new C3039d(28);

    /* renamed from: x */
    public static final /* synthetic */ C3039d f41235x = new C3039d(29);

    /* renamed from: b */
    public final /* synthetic */ int f41236b;

    public /* synthetic */ C3039d(int i2) {
        this.f41236b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41236b) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                DivAspectTemplate.Companion companion = DivAspectTemplate.f34744b;
                if (doubleValue > 0.0d) {
                }
                break;
            case 1:
                long longValue = ((Long) obj).longValue();
                DivBlur.Companion companion2 = DivBlur.f34777b;
                if (longValue >= 0) {
                }
                break;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                DivBlur.Companion companion3 = DivBlur.f34777b;
                if (longValue2 >= 0) {
                }
                break;
            case 3:
                long longValue3 = ((Long) obj).longValue();
                Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> function3 = DivBlurTemplate.f34780b;
                if (longValue3 >= 0) {
                }
                break;
            case 4:
                long longValue4 = ((Long) obj).longValue();
                Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> function32 = DivBlurTemplate.f34780b;
                if (longValue4 >= 0) {
                }
                break;
            case 5:
                long longValue5 = ((Long) obj).longValue();
                DivBorder.Companion companion4 = DivBorder.f34785f;
                if (longValue5 >= 0) {
                }
                break;
            case 6:
                long longValue6 = ((Long) obj).longValue();
                DivBorder.Companion companion5 = DivBorder.f34785f;
                if (longValue6 >= 0) {
                }
                break;
            case 7:
                long longValue7 = ((Long) obj).longValue();
                DivBorderTemplate.Companion companion6 = DivBorderTemplate.f34795f;
                if (longValue7 >= 0) {
                }
                break;
            case 8:
                long longValue8 = ((Long) obj).longValue();
                DivBorderTemplate.Companion companion7 = DivBorderTemplate.f34795f;
                if (longValue8 >= 0) {
                }
                break;
            case 9:
                long longValue9 = ((Long) obj).longValue();
                DivChangeBoundsTransition.Companion companion8 = DivChangeBoundsTransition.f34816d;
                if (longValue9 >= 0) {
                }
                break;
            case 10:
                long longValue10 = ((Long) obj).longValue();
                DivChangeBoundsTransition.Companion companion9 = DivChangeBoundsTransition.f34816d;
                if (longValue10 >= 0) {
                }
                break;
            case 11:
                long longValue11 = ((Long) obj).longValue();
                DivChangeBoundsTransition.Companion companion10 = DivChangeBoundsTransition.f34816d;
                if (longValue11 >= 0) {
                }
                break;
            case 12:
                long longValue12 = ((Long) obj).longValue();
                DivChangeBoundsTransition.Companion companion11 = DivChangeBoundsTransition.f34816d;
                if (longValue12 >= 0) {
                }
                break;
            case 13:
                long longValue13 = ((Long) obj).longValue();
                Expression<Long> expression = DivChangeBoundsTransitionTemplate.f34828d;
                if (longValue13 >= 0) {
                }
                break;
            case 14:
                long longValue14 = ((Long) obj).longValue();
                Expression<Long> expression2 = DivChangeBoundsTransitionTemplate.f34828d;
                if (longValue14 >= 0) {
                }
                break;
            case 15:
                long longValue15 = ((Long) obj).longValue();
                Expression<Long> expression3 = DivChangeBoundsTransitionTemplate.f34828d;
                if (longValue15 >= 0) {
                }
                break;
            case 16:
                long longValue16 = ((Long) obj).longValue();
                Expression<Long> expression4 = DivChangeBoundsTransitionTemplate.f34828d;
                if (longValue16 >= 0) {
                }
                break;
            case 17:
                String it = (String) obj;
                DivContainer.Companion companion12 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 18:
                long longValue17 = ((Long) obj).longValue();
                DivContainer.Companion companion13 = DivContainer.f34884N;
                if (longValue17 >= 0) {
                }
                break;
            case 19:
                long longValue18 = ((Long) obj).longValue();
                DivContainer.Companion companion14 = DivContainer.f34884N;
                if (longValue18 >= 0) {
                }
                break;
            case 20:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivContainer.Companion companion15 = DivContainer.f34884N;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 21:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivContainer.Companion companion16 = DivContainer.f34884N;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 22:
                long longValue19 = ((Long) obj).longValue();
                DivContainer.Companion companion17 = DivContainer.f34884N;
                if (longValue19 >= 0) {
                }
                break;
            case 23:
                long longValue20 = ((Long) obj).longValue();
                DivContainer.Companion companion18 = DivContainer.f34884N;
                if (longValue20 >= 0) {
                }
                break;
            case 24:
                String it2 = (String) obj;
                DivContainer.Companion companion19 = DivContainer.f34884N;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 25:
                String it3 = (String) obj;
                DivAccessibility divAccessibility = DivContainerTemplate.f35007N;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 26:
                String it4 = (String) obj;
                DivAccessibility divAccessibility2 = DivContainerTemplate.f35007N;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 27:
                long longValue21 = ((Long) obj).longValue();
                DivAccessibility divAccessibility3 = DivContainerTemplate.f35007N;
                if (longValue21 >= 0) {
                }
                break;
            case 28:
                long longValue22 = ((Long) obj).longValue();
                DivAccessibility divAccessibility4 = DivContainerTemplate.f35007N;
                if (longValue22 >= 0) {
                }
                break;
            default:
                double doubleValue4 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility5 = DivContainerTemplate.f35007N;
                if (doubleValue4 < 0.0d || doubleValue4 > 1.0d) {
                }
                break;
        }
        return false;
    }
}
