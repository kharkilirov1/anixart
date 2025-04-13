package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div2.DivStretchIndicatorItemPlacement;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivStrokeTemplate;
import com.yandex.div2.DivTabs;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.h0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3048h0 implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3048h0 f41455c = new C3048h0(0);

    /* renamed from: d */
    public static final /* synthetic */ C3048h0 f41456d = new C3048h0(1);

    /* renamed from: e */
    public static final /* synthetic */ C3048h0 f41457e = new C3048h0(2);

    /* renamed from: f */
    public static final /* synthetic */ C3048h0 f41458f = new C3048h0(3);

    /* renamed from: g */
    public static final /* synthetic */ C3048h0 f41459g = new C3048h0(4);

    /* renamed from: h */
    public static final /* synthetic */ C3048h0 f41460h = new C3048h0(5);

    /* renamed from: i */
    public static final /* synthetic */ C3048h0 f41461i = new C3048h0(6);

    /* renamed from: j */
    public static final /* synthetic */ C3048h0 f41462j = new C3048h0(8);

    /* renamed from: k */
    public static final /* synthetic */ C3048h0 f41463k = new C3048h0(9);

    /* renamed from: l */
    public static final /* synthetic */ C3048h0 f41464l = new C3048h0(10);

    /* renamed from: m */
    public static final /* synthetic */ C3048h0 f41465m = new C3048h0(12);

    /* renamed from: n */
    public static final /* synthetic */ C3048h0 f41466n = new C3048h0(13);

    /* renamed from: o */
    public static final /* synthetic */ C3048h0 f41467o = new C3048h0(14);

    /* renamed from: p */
    public static final /* synthetic */ C3048h0 f41468p = new C3048h0(17);

    /* renamed from: q */
    public static final /* synthetic */ C3048h0 f41469q = new C3048h0(19);

    /* renamed from: r */
    public static final /* synthetic */ C3048h0 f41470r = new C3048h0(20);

    /* renamed from: s */
    public static final /* synthetic */ C3048h0 f41471s = new C3048h0(22);

    /* renamed from: t */
    public static final /* synthetic */ C3048h0 f41472t = new C3048h0(24);

    /* renamed from: u */
    public static final /* synthetic */ C3048h0 f41473u = new C3048h0(26);

    /* renamed from: v */
    public static final /* synthetic */ C3048h0 f41474v = new C3048h0(28);

    /* renamed from: b */
    public final /* synthetic */ int f41475b;

    public /* synthetic */ C3048h0(int i2) {
        this.f41475b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41475b) {
            case 0:
                String it = (String) obj;
                DivAccessibility divAccessibility = DivStateTemplate.f39267E;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 1:
                String it2 = (String) obj;
                DivAccessibility divAccessibility2 = DivStateTemplate.f39267E;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 2:
                long longValue = ((Long) obj).longValue();
                DivAccessibility divAccessibility3 = DivStateTemplate.f39267E;
                if (longValue >= 0) {
                }
                break;
            case 3:
                long longValue2 = ((Long) obj).longValue();
                DivAccessibility divAccessibility4 = DivStateTemplate.f39267E;
                if (longValue2 >= 0) {
                }
                break;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility5 = DivStateTemplate.f39267E;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 5:
                long longValue3 = ((Long) obj).longValue();
                DivAccessibility divAccessibility6 = DivStateTemplate.f39267E;
                if (longValue3 >= 0) {
                }
                break;
            case 6:
                long longValue4 = ((Long) obj).longValue();
                DivAccessibility divAccessibility7 = DivStateTemplate.f39267E;
                if (longValue4 >= 0) {
                }
                break;
            case 7:
                long longValue5 = ((Long) obj).longValue();
                DivStretchIndicatorItemPlacement.Companion companion = DivStretchIndicatorItemPlacement.f39415c;
                if (longValue5 > 0) {
                }
                break;
            case 8:
                long longValue6 = ((Long) obj).longValue();
                DivStretchIndicatorItemPlacement.Companion companion2 = DivStretchIndicatorItemPlacement.f39415c;
                if (longValue6 > 0) {
                }
                break;
            case 9:
                long longValue7 = ((Long) obj).longValue();
                DivFixedSize divFixedSize = DivStretchIndicatorItemPlacementTemplate.f39422c;
                if (longValue7 > 0) {
                }
                break;
            case 10:
                long longValue8 = ((Long) obj).longValue();
                DivFixedSize divFixedSize2 = DivStretchIndicatorItemPlacementTemplate.f39422c;
                if (longValue8 > 0) {
                }
                break;
            case 11:
                long longValue9 = ((Long) obj).longValue();
                DivStroke.Companion companion3 = DivStroke.f39434d;
                if (longValue9 >= 0) {
                }
                break;
            case 12:
                long longValue10 = ((Long) obj).longValue();
                DivStroke.Companion companion4 = DivStroke.f39434d;
                if (longValue10 >= 0) {
                }
                break;
            case 13:
                long longValue11 = ((Long) obj).longValue();
                DivStrokeTemplate.Companion companion5 = DivStrokeTemplate.f39445d;
                if (longValue11 >= 0) {
                }
                break;
            case 14:
                long longValue12 = ((Long) obj).longValue();
                DivStrokeTemplate.Companion companion6 = DivStrokeTemplate.f39445d;
                if (longValue12 >= 0) {
                }
                break;
            case 15:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivTabs.Companion companion7 = DivTabs.f39463K;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 16:
                long longValue13 = ((Long) obj).longValue();
                DivTabs.Companion companion8 = DivTabs.f39463K;
                if (longValue13 >= 0) {
                }
                break;
            case 17:
                long longValue14 = ((Long) obj).longValue();
                DivTabs.Companion companion9 = DivTabs.f39463K;
                if (longValue14 >= 0) {
                }
                break;
            case 18:
                long longValue15 = ((Long) obj).longValue();
                DivTabs.Companion companion10 = DivTabs.f39463K;
                if (longValue15 >= 0) {
                }
                break;
            case 19:
                long longValue16 = ((Long) obj).longValue();
                DivTabs.Companion companion11 = DivTabs.f39463K;
                if (longValue16 >= 0) {
                }
                break;
            case 20:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivTabs.Companion companion12 = DivTabs.f39463K;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 21:
                long longValue17 = ((Long) obj).longValue();
                DivTabs.Companion companion13 = DivTabs.f39463K;
                if (longValue17 >= 0) {
                }
                break;
            case 22:
                long longValue18 = ((Long) obj).longValue();
                DivTabs.Companion companion14 = DivTabs.f39463K;
                if (longValue18 >= 0) {
                }
                break;
            case 23:
                String it3 = (String) obj;
                DivTabs.Companion companion15 = DivTabs.f39463K;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 24:
                String it4 = (String) obj;
                DivTabs.Companion companion16 = DivTabs.f39463K;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 25:
                String it5 = (String) obj;
                DivTabs.Item.Companion companion17 = DivTabs.Item.f39538d;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 26:
                String it6 = (String) obj;
                DivTabs.Item.Companion companion18 = DivTabs.Item.f39538d;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 27:
                long longValue19 = ((Long) obj).longValue();
                DivTabs.TabTitleStyle.Companion companion19 = DivTabs.TabTitleStyle.f39560r;
                if (longValue19 >= 0) {
                }
                break;
            case 28:
                long longValue20 = ((Long) obj).longValue();
                DivTabs.TabTitleStyle.Companion companion20 = DivTabs.TabTitleStyle.f39560r;
                if (longValue20 >= 0) {
                }
                break;
            default:
                long longValue21 = ((Long) obj).longValue();
                DivTabs.TabTitleStyle.Companion companion21 = DivTabs.TabTitleStyle.f39560r;
                if (longValue21 >= 0) {
                }
                break;
        }
        return true;
    }
}
