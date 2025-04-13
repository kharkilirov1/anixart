package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFadeTransitionTemplate;
import com.yandex.div2.DivFixedCount;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskTemplate;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivFixedSizeTemplate;
import com.yandex.div2.DivFocus;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3051j implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3051j f41527c = new C3051j(0);

    /* renamed from: d */
    public static final /* synthetic */ C3051j f41528d = new C3051j(1);

    /* renamed from: e */
    public static final /* synthetic */ C3051j f41529e = new C3051j(2);

    /* renamed from: f */
    public static final /* synthetic */ C3051j f41530f = new C3051j(3);

    /* renamed from: g */
    public static final /* synthetic */ C3051j f41531g = new C3051j(4);

    /* renamed from: h */
    public static final /* synthetic */ C3051j f41532h = new C3051j(6);

    /* renamed from: i */
    public static final /* synthetic */ C3051j f41533i = new C3051j(7);

    /* renamed from: j */
    public static final /* synthetic */ C3051j f41534j = new C3051j(8);

    /* renamed from: k */
    public static final /* synthetic */ C3051j f41535k = new C3051j(10);

    /* renamed from: l */
    public static final /* synthetic */ C3051j f41536l = new C3051j(12);

    /* renamed from: m */
    public static final /* synthetic */ C3051j f41537m = new C3051j(14);

    /* renamed from: n */
    public static final /* synthetic */ C3051j f41538n = new C3051j(16);

    /* renamed from: o */
    public static final /* synthetic */ C3051j f41539o = new C3051j(17);

    /* renamed from: p */
    public static final /* synthetic */ C3051j f41540p = new C3051j(18);

    /* renamed from: q */
    public static final /* synthetic */ C3051j f41541q = new C3051j(19);

    /* renamed from: r */
    public static final /* synthetic */ C3051j f41542r = new C3051j(20);

    /* renamed from: s */
    public static final /* synthetic */ C3051j f41543s = new C3051j(21);

    /* renamed from: t */
    public static final /* synthetic */ C3051j f41544t = new C3051j(22);

    /* renamed from: u */
    public static final /* synthetic */ C3051j f41545u = new C3051j(23);

    /* renamed from: v */
    public static final /* synthetic */ C3051j f41546v = new C3051j(24);

    /* renamed from: w */
    public static final /* synthetic */ C3051j f41547w = new C3051j(26);

    /* renamed from: x */
    public static final /* synthetic */ C3051j f41548x = new C3051j(27);

    /* renamed from: y */
    public static final /* synthetic */ C3051j f41549y = new C3051j(28);

    /* renamed from: b */
    public final /* synthetic */ int f41550b;

    public /* synthetic */ C3051j(int i2) {
        this.f41550b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41550b) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                DivFadeTransitionTemplate.Companion companion = DivFadeTransitionTemplate.f35689e;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 1:
                long longValue = ((Long) obj).longValue();
                DivFadeTransitionTemplate.Companion companion2 = DivFadeTransitionTemplate.f35689e;
                if (longValue >= 0) {
                }
                break;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                DivFadeTransitionTemplate.Companion companion3 = DivFadeTransitionTemplate.f35689e;
                if (longValue2 >= 0) {
                }
                break;
            case 3:
                long longValue3 = ((Long) obj).longValue();
                DivFadeTransitionTemplate.Companion companion4 = DivFadeTransitionTemplate.f35689e;
                if (longValue3 >= 0) {
                }
                break;
            case 4:
                long longValue4 = ((Long) obj).longValue();
                DivFadeTransitionTemplate.Companion companion5 = DivFadeTransitionTemplate.f35689e;
                if (longValue4 >= 0) {
                }
                break;
            case 5:
                long longValue5 = ((Long) obj).longValue();
                DivFixedCount.Companion companion6 = DivFixedCount.f35725a;
                if (longValue5 >= 0) {
                }
                break;
            case 6:
                long longValue6 = ((Long) obj).longValue();
                DivFixedCount.Companion companion7 = DivFixedCount.f35725a;
                if (longValue6 >= 0) {
                }
                break;
            case 7:
                long longValue7 = ((Long) obj).longValue();
                Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> function3 = DivFixedCountTemplate.f35727b;
                if (longValue7 >= 0) {
                }
                break;
            case 8:
                long longValue8 = ((Long) obj).longValue();
                Function3<String, JSONObject, ParsingEnvironment, Expression<Long>> function32 = DivFixedCountTemplate.f35727b;
                if (longValue8 >= 0) {
                }
                break;
            case 9:
                String it = (String) obj;
                DivFixedLengthInputMask.Companion companion8 = DivFixedLengthInputMask.f35732e;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 10:
                String it2 = (String) obj;
                DivFixedLengthInputMask.Companion companion9 = DivFixedLengthInputMask.f35732e;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 11:
                String it3 = (String) obj;
                DivFixedLengthInputMask.Companion companion10 = DivFixedLengthInputMask.f35732e;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 12:
                String it4 = (String) obj;
                DivFixedLengthInputMask.Companion companion11 = DivFixedLengthInputMask.f35732e;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 13:
                String it5 = (String) obj;
                DivFixedLengthInputMask.PatternElement.Companion companion12 = DivFixedLengthInputMask.PatternElement.f35742d;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 14:
                String it6 = (String) obj;
                DivFixedLengthInputMask.PatternElement.Companion companion13 = DivFixedLengthInputMask.PatternElement.f35742d;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 15:
                String it7 = (String) obj;
                DivFixedLengthInputMask.PatternElement.Companion companion14 = DivFixedLengthInputMask.PatternElement.f35742d;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 16:
                String it8 = (String) obj;
                DivFixedLengthInputMask.PatternElement.Companion companion15 = DivFixedLengthInputMask.PatternElement.f35742d;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            case 17:
                String it9 = (String) obj;
                Expression<Boolean> expression = DivFixedLengthInputMaskTemplate.f35751e;
                Intrinsics.m32179h(it9, "it");
                if (it9.length() >= 1) {
                }
                break;
            case 18:
                String it10 = (String) obj;
                Expression<Boolean> expression2 = DivFixedLengthInputMaskTemplate.f35751e;
                Intrinsics.m32179h(it10, "it");
                if (it10.length() >= 1) {
                }
                break;
            case 19:
                String it11 = (String) obj;
                Expression<Boolean> expression3 = DivFixedLengthInputMaskTemplate.f35751e;
                Intrinsics.m32179h(it11, "it");
                if (it11.length() >= 1) {
                }
                break;
            case 20:
                String it12 = (String) obj;
                Expression<Boolean> expression4 = DivFixedLengthInputMaskTemplate.f35751e;
                Intrinsics.m32179h(it12, "it");
                if (it12.length() >= 1) {
                }
                break;
            case 21:
                String it13 = (String) obj;
                DivFixedLengthInputMaskTemplate.PatternElementTemplate.Companion companion16 = DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35772d;
                Intrinsics.m32179h(it13, "it");
                if (it13.length() >= 1) {
                }
                break;
            case 22:
                String it14 = (String) obj;
                DivFixedLengthInputMaskTemplate.PatternElementTemplate.Companion companion17 = DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35772d;
                Intrinsics.m32179h(it14, "it");
                if (it14.length() >= 1) {
                }
                break;
            case 23:
                String it15 = (String) obj;
                DivFixedLengthInputMaskTemplate.PatternElementTemplate.Companion companion18 = DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35772d;
                Intrinsics.m32179h(it15, "it");
                if (it15.length() >= 1) {
                }
                break;
            case 24:
                String it16 = (String) obj;
                DivFixedLengthInputMaskTemplate.PatternElementTemplate.Companion companion19 = DivFixedLengthInputMaskTemplate.PatternElementTemplate.f35772d;
                Intrinsics.m32179h(it16, "it");
                if (it16.length() >= 1) {
                }
                break;
            case 25:
                long longValue9 = ((Long) obj).longValue();
                DivFixedSize.Companion companion20 = DivFixedSize.f35789c;
                if (longValue9 >= 0) {
                }
                break;
            case 26:
                long longValue10 = ((Long) obj).longValue();
                DivFixedSize.Companion companion21 = DivFixedSize.f35789c;
                if (longValue10 >= 0) {
                }
                break;
            case 27:
                long longValue11 = ((Long) obj).longValue();
                DivFixedSizeTemplate.Companion companion22 = DivFixedSizeTemplate.f35798c;
                if (longValue11 >= 0) {
                }
                break;
            case 28:
                long longValue12 = ((Long) obj).longValue();
                DivFixedSizeTemplate.Companion companion23 = DivFixedSizeTemplate.f35798c;
                if (longValue12 >= 0) {
                }
                break;
            default:
                String it17 = (String) obj;
                DivFocus.NextFocusIds.Companion companion24 = DivFocus.NextFocusIds.f35825f;
                Intrinsics.m32179h(it17, "it");
                if (it17.length() >= 1) {
                }
                break;
        }
        return false;
    }
}
