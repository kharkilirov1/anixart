package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div2.DivTooltipTemplate;
import com.yandex.div2.DivVideo;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceTemplate;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.p0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3064p0 implements ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C3064p0 f41878c = new C3064p0(0);

    /* renamed from: d */
    public static final /* synthetic */ C3064p0 f41879d = new C3064p0(3);

    /* renamed from: e */
    public static final /* synthetic */ C3064p0 f41880e = new C3064p0(5);

    /* renamed from: f */
    public static final /* synthetic */ C3064p0 f41881f = new C3064p0(7);

    /* renamed from: g */
    public static final /* synthetic */ C3064p0 f41882g = new C3064p0(8);

    /* renamed from: h */
    public static final /* synthetic */ C3064p0 f41883h = new C3064p0(10);

    /* renamed from: i */
    public static final /* synthetic */ C3064p0 f41884i = new C3064p0(12);

    /* renamed from: j */
    public static final /* synthetic */ C3064p0 f41885j = new C3064p0(14);

    /* renamed from: k */
    public static final /* synthetic */ C3064p0 f41886k = new C3064p0(16);

    /* renamed from: l */
    public static final /* synthetic */ C3064p0 f41887l = new C3064p0(17);

    /* renamed from: m */
    public static final /* synthetic */ C3064p0 f41888m = new C3064p0(18);

    /* renamed from: n */
    public static final /* synthetic */ C3064p0 f41889n = new C3064p0(19);

    /* renamed from: o */
    public static final /* synthetic */ C3064p0 f41890o = new C3064p0(20);

    /* renamed from: p */
    public static final /* synthetic */ C3064p0 f41891p = new C3064p0(21);

    /* renamed from: q */
    public static final /* synthetic */ C3064p0 f41892q = new C3064p0(22);

    /* renamed from: r */
    public static final /* synthetic */ C3064p0 f41893r = new C3064p0(23);

    /* renamed from: s */
    public static final /* synthetic */ C3064p0 f41894s = new C3064p0(24);

    /* renamed from: t */
    public static final /* synthetic */ C3064p0 f41895t = new C3064p0(25);

    /* renamed from: u */
    public static final /* synthetic */ C3064p0 f41896u = new C3064p0(26);

    /* renamed from: v */
    public static final /* synthetic */ C3064p0 f41897v = new C3064p0(27);

    /* renamed from: w */
    public static final /* synthetic */ C3064p0 f41898w = new C3064p0(28);

    /* renamed from: x */
    public static final /* synthetic */ C3064p0 f41899x = new C3064p0(29);

    /* renamed from: b */
    public final /* synthetic */ int f41900b;

    public /* synthetic */ C3064p0(int i2) {
        this.f41900b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public final boolean mo17302a(Object obj) {
        switch (this.f41900b) {
            case 0:
                String it = (String) obj;
                DivTooltipTemplate.Companion companion = DivTooltipTemplate.f40520h;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                DivVideo.Companion companion2 = DivVideo.f40644L;
                if (doubleValue < 0.0d || doubleValue > 1.0d) {
                }
                break;
            case 2:
                String it2 = (String) obj;
                DivVideo.Companion companion3 = DivVideo.f40644L;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 3:
                String it3 = (String) obj;
                DivVideo.Companion companion4 = DivVideo.f40644L;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 4:
                String it4 = (String) obj;
                DivVideo.Companion companion5 = DivVideo.f40644L;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 5:
                String it5 = (String) obj;
                DivVideo.Companion companion6 = DivVideo.f40644L;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 6:
                long longValue = ((Long) obj).longValue();
                DivVideo.Companion companion7 = DivVideo.f40644L;
                if (longValue >= 0) {
                }
                break;
            case 7:
                long longValue2 = ((Long) obj).longValue();
                DivVideo.Companion companion8 = DivVideo.f40644L;
                if (longValue2 >= 0) {
                }
                break;
            case 8:
                double doubleValue2 = ((Double) obj).doubleValue();
                DivVideo.Companion companion9 = DivVideo.f40644L;
                if (doubleValue2 < 0.0d || doubleValue2 > 1.0d) {
                }
                break;
            case 9:
                long longValue3 = ((Long) obj).longValue();
                DivVideo.Companion companion10 = DivVideo.f40644L;
                if (longValue3 >= 0) {
                }
                break;
            case 10:
                long longValue4 = ((Long) obj).longValue();
                DivVideo.Companion companion11 = DivVideo.f40644L;
                if (longValue4 >= 0) {
                }
                break;
            case 11:
                String it6 = (String) obj;
                DivVideo.Companion companion12 = DivVideo.f40644L;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 12:
                String it7 = (String) obj;
                DivVideo.Companion companion13 = DivVideo.f40644L;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 13:
                long longValue5 = ((Long) obj).longValue();
                DivVideoSource.Resolution.Companion companion14 = DivVideoSource.Resolution.f40727c;
                if (longValue5 > 0) {
                }
                break;
            case 14:
                long longValue6 = ((Long) obj).longValue();
                DivVideoSource.Resolution.Companion companion15 = DivVideoSource.Resolution.f40727c;
                if (longValue6 > 0) {
                }
                break;
            case 15:
                long longValue7 = ((Long) obj).longValue();
                DivVideoSource.Resolution.Companion companion16 = DivVideoSource.Resolution.f40727c;
                if (longValue7 > 0) {
                }
                break;
            case 16:
                long longValue8 = ((Long) obj).longValue();
                DivVideoSource.Resolution.Companion companion17 = DivVideoSource.Resolution.f40727c;
                if (longValue8 > 0) {
                }
                break;
            case 17:
                long longValue9 = ((Long) obj).longValue();
                DivVideoSourceTemplate.ResolutionTemplate.Companion companion18 = DivVideoSourceTemplate.ResolutionTemplate.f40748c;
                if (longValue9 > 0) {
                }
                break;
            case 18:
                long longValue10 = ((Long) obj).longValue();
                DivVideoSourceTemplate.ResolutionTemplate.Companion companion19 = DivVideoSourceTemplate.ResolutionTemplate.f40748c;
                if (longValue10 > 0) {
                }
                break;
            case 19:
                long longValue11 = ((Long) obj).longValue();
                DivVideoSourceTemplate.ResolutionTemplate.Companion companion20 = DivVideoSourceTemplate.ResolutionTemplate.f40748c;
                if (longValue11 > 0) {
                }
                break;
            case 20:
                long longValue12 = ((Long) obj).longValue();
                DivVideoSourceTemplate.ResolutionTemplate.Companion companion21 = DivVideoSourceTemplate.ResolutionTemplate.f40748c;
                if (longValue12 > 0) {
                }
                break;
            case 21:
                double doubleValue3 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility = DivVideoTemplate.f40770M;
                if (doubleValue3 < 0.0d || doubleValue3 > 1.0d) {
                }
                break;
            case 22:
                String it8 = (String) obj;
                DivAccessibility divAccessibility2 = DivVideoTemplate.f40770M;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            case 23:
                String it9 = (String) obj;
                DivAccessibility divAccessibility3 = DivVideoTemplate.f40770M;
                Intrinsics.m32179h(it9, "it");
                if (it9.length() >= 1) {
                }
                break;
            case 24:
                String it10 = (String) obj;
                DivAccessibility divAccessibility4 = DivVideoTemplate.f40770M;
                Intrinsics.m32179h(it10, "it");
                if (it10.length() >= 1) {
                }
                break;
            case 25:
                String it11 = (String) obj;
                DivAccessibility divAccessibility5 = DivVideoTemplate.f40770M;
                Intrinsics.m32179h(it11, "it");
                if (it11.length() >= 1) {
                }
                break;
            case 26:
                double doubleValue4 = ((Double) obj).doubleValue();
                DivAccessibility divAccessibility6 = DivVideoTemplate.f40770M;
                if (doubleValue4 < 0.0d || doubleValue4 > 1.0d) {
                }
                break;
            case 27:
                String it12 = (String) obj;
                DivAccessibility divAccessibility7 = DivVideoTemplate.f40770M;
                Intrinsics.m32179h(it12, "it");
                if (it12.length() >= 1) {
                }
                break;
            case 28:
                String it13 = (String) obj;
                DivAccessibility divAccessibility8 = DivVideoTemplate.f40770M;
                Intrinsics.m32179h(it13, "it");
                if (it13.length() >= 1) {
                }
                break;
            default:
                long longValue13 = ((Long) obj).longValue();
                DivAccessibility divAccessibility9 = DivVideoTemplate.f40770M;
                if (longValue13 >= 0) {
                }
                break;
        }
        return true;
    }
}
