package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.DivVisibilityActionTemplate;
import com.yandex.div2.DivWrapContentSize;
import com.yandex.div2.DivWrapContentSizeTemplate;
import com.yandex.div2.IntegerVariable;
import com.yandex.div2.NumberVariable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.r0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3068r0 implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3068r0 f41973c = new C3068r0(0);

    /* renamed from: d */
    public static final /* synthetic */ C3068r0 f41974d = new C3068r0(1);

    /* renamed from: e */
    public static final /* synthetic */ C3068r0 f41975e = new C3068r0(2);

    /* renamed from: f */
    public static final /* synthetic */ C3068r0 f41976f = new C3068r0(4);

    /* renamed from: g */
    public static final /* synthetic */ C3068r0 f41977g = new C3068r0(6);

    /* renamed from: h */
    public static final /* synthetic */ C3068r0 f41978h = new C3068r0(8);

    /* renamed from: i */
    public static final /* synthetic */ C3068r0 f41979i = new C3068r0(10);

    /* renamed from: j */
    public static final /* synthetic */ C3068r0 f41980j = new C3068r0(11);

    /* renamed from: k */
    public static final /* synthetic */ C3068r0 f41981k = new C3068r0(12);

    /* renamed from: l */
    public static final /* synthetic */ C3068r0 f41982l = new C3068r0(13);

    /* renamed from: m */
    public static final /* synthetic */ C3068r0 f41983m = new C3068r0(14);

    /* renamed from: n */
    public static final /* synthetic */ C3068r0 f41984n = new C3068r0(15);

    /* renamed from: o */
    public static final /* synthetic */ C3068r0 f41985o = new C3068r0(16);

    /* renamed from: p */
    public static final /* synthetic */ C3068r0 f41986p = new C3068r0(17);

    /* renamed from: q */
    public static final /* synthetic */ C3068r0 f41987q = new C3068r0(18);

    /* renamed from: r */
    public static final /* synthetic */ C3068r0 f41988r = new C3068r0(20);

    /* renamed from: s */
    public static final /* synthetic */ C3068r0 f41989s = new C3068r0(21);

    /* renamed from: t */
    public static final /* synthetic */ C3068r0 f41990t = new C3068r0(22);

    /* renamed from: u */
    public static final /* synthetic */ C3068r0 f41991u = new C3068r0(24);

    /* renamed from: v */
    public static final /* synthetic */ C3068r0 f41992v = new C3068r0(25);

    /* renamed from: w */
    public static final /* synthetic */ C3068r0 f41993w = new C3068r0(26);

    /* renamed from: x */
    public static final /* synthetic */ C3068r0 f41994x = new C3068r0(28);

    /* renamed from: y */
    public static final /* synthetic */ C3068r0 f41995y = new C3068r0(29);

    /* renamed from: b */
    public final /* synthetic */ int f41996b;

    public /* synthetic */ C3068r0(int i2) {
        this.f41996b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41996b) {
            case 0:
                long longValue = ((Long) obj).longValue();
                DivAccessibility divAccessibility = DivVideoTemplate.f40770M;
                if (longValue >= 0) {
                }
                break;
            case 1:
                long longValue2 = ((Long) obj).longValue();
                DivAccessibility divAccessibility2 = DivVideoTemplate.f40770M;
                if (longValue2 >= 0) {
                }
                break;
            case 2:
                long longValue3 = ((Long) obj).longValue();
                DivAccessibility divAccessibility3 = DivVideoTemplate.f40770M;
                if (longValue3 >= 0) {
                }
                break;
            case 3:
                String it = (String) obj;
                DivVisibilityAction.Companion companion = DivVisibilityAction.f40938i;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 4:
                String it2 = (String) obj;
                DivVisibilityAction.Companion companion2 = DivVisibilityAction.f40938i;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 5:
                long longValue4 = ((Long) obj).longValue();
                DivVisibilityAction.Companion companion3 = DivVisibilityAction.f40938i;
                if (longValue4 >= 0) {
                }
                break;
            case 6:
                long longValue5 = ((Long) obj).longValue();
                DivVisibilityAction.Companion companion4 = DivVisibilityAction.f40938i;
                if (longValue5 >= 0) {
                }
                break;
            case 7:
                long longValue6 = ((Long) obj).longValue();
                DivVisibilityAction.Companion companion5 = DivVisibilityAction.f40938i;
                if (longValue6 >= 0) {
                }
                break;
            case 8:
                long longValue7 = ((Long) obj).longValue();
                DivVisibilityAction.Companion companion6 = DivVisibilityAction.f40938i;
                if (longValue7 >= 0) {
                }
                break;
            case 9:
                long longValue8 = ((Long) obj).longValue();
                DivVisibilityAction.Companion companion7 = DivVisibilityAction.f40938i;
                if (longValue8 <= 0 || longValue8 > 100) {
                }
                break;
            case 10:
                long longValue9 = ((Long) obj).longValue();
                DivVisibilityAction.Companion companion8 = DivVisibilityAction.f40938i;
                if (longValue9 <= 0 || longValue9 > 100) {
                }
                break;
            case 11:
                String it3 = (String) obj;
                DivVisibilityActionTemplate.Companion companion9 = DivVisibilityActionTemplate.f40959i;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 12:
                String it4 = (String) obj;
                DivVisibilityActionTemplate.Companion companion10 = DivVisibilityActionTemplate.f40959i;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 13:
                long longValue10 = ((Long) obj).longValue();
                DivVisibilityActionTemplate.Companion companion11 = DivVisibilityActionTemplate.f40959i;
                if (longValue10 >= 0) {
                }
                break;
            case 14:
                long longValue11 = ((Long) obj).longValue();
                DivVisibilityActionTemplate.Companion companion12 = DivVisibilityActionTemplate.f40959i;
                if (longValue11 >= 0) {
                }
                break;
            case 15:
                long longValue12 = ((Long) obj).longValue();
                DivVisibilityActionTemplate.Companion companion13 = DivVisibilityActionTemplate.f40959i;
                if (longValue12 >= 0) {
                }
                break;
            case 16:
                long longValue13 = ((Long) obj).longValue();
                DivVisibilityActionTemplate.Companion companion14 = DivVisibilityActionTemplate.f40959i;
                if (longValue13 >= 0) {
                }
                break;
            case 17:
                long longValue14 = ((Long) obj).longValue();
                DivVisibilityActionTemplate.Companion companion15 = DivVisibilityActionTemplate.f40959i;
                if (longValue14 <= 0 || longValue14 > 100) {
                }
                break;
            case 18:
                long longValue15 = ((Long) obj).longValue();
                DivVisibilityActionTemplate.Companion companion16 = DivVisibilityActionTemplate.f40959i;
                if (longValue15 <= 0 || longValue15 > 100) {
                }
                break;
            case 19:
                long longValue16 = ((Long) obj).longValue();
                DivWrapContentSize.ConstraintSize.Companion companion17 = DivWrapContentSize.ConstraintSize.f40999c;
                if (longValue16 >= 0) {
                }
                break;
            case 20:
                long longValue17 = ((Long) obj).longValue();
                DivWrapContentSize.ConstraintSize.Companion companion18 = DivWrapContentSize.ConstraintSize.f40999c;
                if (longValue17 >= 0) {
                }
                break;
            case 21:
                long longValue18 = ((Long) obj).longValue();
                DivWrapContentSizeTemplate.ConstraintSizeTemplate.Companion companion19 = DivWrapContentSizeTemplate.ConstraintSizeTemplate.f41019c;
                if (longValue18 >= 0) {
                }
                break;
            case 22:
                long longValue19 = ((Long) obj).longValue();
                DivWrapContentSizeTemplate.ConstraintSizeTemplate.Companion companion20 = DivWrapContentSizeTemplate.ConstraintSizeTemplate.f41019c;
                if (longValue19 >= 0) {
                }
                break;
            case 23:
                String it5 = (String) obj;
                IntegerVariable.Companion companion21 = IntegerVariable.f41033c;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 24:
                String it6 = (String) obj;
                IntegerVariable.Companion companion22 = IntegerVariable.f41033c;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 25:
                String it7 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function3 = IntegerVariableTemplate.f41037c;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 26:
                String it8 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function32 = IntegerVariableTemplate.f41037c;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            case 27:
                String it9 = (String) obj;
                NumberVariable.Companion companion23 = NumberVariable.f41045c;
                Intrinsics.m32179h(it9, "it");
                if (it9.length() >= 1) {
                }
                break;
            case 28:
                String it10 = (String) obj;
                NumberVariable.Companion companion24 = NumberVariable.f41045c;
                Intrinsics.m32179h(it10, "it");
                if (it10.length() >= 1) {
                }
                break;
            default:
                String it11 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function33 = NumberVariableTemplate.f41049c;
                Intrinsics.m32179h(it11, "it");
                if (it11.length() >= 1) {
                }
                break;
        }
        return false;
    }
}
