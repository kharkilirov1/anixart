package com.yandex.div2;

import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationTemplate;
import com.yandex.div2.DivAppearanceSetTransition;
import com.yandex.div2.DivChangeSetTransition;
import com.yandex.div2.DivContainer;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3037c implements ListValidator {

    /* renamed from: a */
    public final /* synthetic */ int f41182a;

    /* renamed from: b */
    public static final /* synthetic */ C3037c f41157b = new C3037c(0);

    /* renamed from: c */
    public static final /* synthetic */ C3037c f41158c = new C3037c(1);

    /* renamed from: d */
    public static final /* synthetic */ C3037c f41159d = new C3037c(2);

    /* renamed from: e */
    public static final /* synthetic */ C3037c f41160e = new C3037c(3);

    /* renamed from: f */
    public static final /* synthetic */ C3037c f41161f = new C3037c(4);

    /* renamed from: g */
    public static final /* synthetic */ C3037c f41162g = new C3037c(5);

    /* renamed from: h */
    public static final /* synthetic */ C3037c f41163h = new C3037c(6);

    /* renamed from: i */
    public static final /* synthetic */ C3037c f41164i = new C3037c(7);

    /* renamed from: j */
    public static final /* synthetic */ C3037c f41165j = new C3037c(8);

    /* renamed from: k */
    public static final /* synthetic */ C3037c f41166k = new C3037c(9);

    /* renamed from: l */
    public static final /* synthetic */ C3037c f41167l = new C3037c(10);

    /* renamed from: m */
    public static final /* synthetic */ C3037c f41168m = new C3037c(11);

    /* renamed from: n */
    public static final /* synthetic */ C3037c f41169n = new C3037c(12);

    /* renamed from: o */
    public static final /* synthetic */ C3037c f41170o = new C3037c(13);

    /* renamed from: p */
    public static final /* synthetic */ C3037c f41171p = new C3037c(14);

    /* renamed from: q */
    public static final /* synthetic */ C3037c f41172q = new C3037c(15);

    /* renamed from: r */
    public static final /* synthetic */ C3037c f41173r = new C3037c(16);

    /* renamed from: s */
    public static final /* synthetic */ C3037c f41174s = new C3037c(17);

    /* renamed from: t */
    public static final /* synthetic */ C3037c f41175t = new C3037c(18);

    /* renamed from: u */
    public static final /* synthetic */ C3037c f41176u = new C3037c(19);

    /* renamed from: v */
    public static final /* synthetic */ C3037c f41177v = new C3037c(20);

    /* renamed from: w */
    public static final /* synthetic */ C3037c f41178w = new C3037c(21);

    /* renamed from: x */
    public static final /* synthetic */ C3037c f41179x = new C3037c(22);

    /* renamed from: y */
    public static final /* synthetic */ C3037c f41180y = new C3037c(23);

    /* renamed from: z */
    public static final /* synthetic */ C3037c f41181z = new C3037c(24);

    /* renamed from: A */
    public static final /* synthetic */ C3037c f41152A = new C3037c(25);

    /* renamed from: B */
    public static final /* synthetic */ C3037c f41153B = new C3037c(26);

    /* renamed from: C */
    public static final /* synthetic */ C3037c f41154C = new C3037c(27);

    /* renamed from: D */
    public static final /* synthetic */ C3037c f41155D = new C3037c(28);

    /* renamed from: E */
    public static final /* synthetic */ C3037c f41156E = new C3037c(29);

    public /* synthetic */ C3037c(int i2) {
        this.f41182a = i2;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public final boolean isValid(List it) {
        switch (this.f41182a) {
            case 0:
                DivAction.Companion companion = DivAction.f34546g;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 1:
                DivAction.MenuItem.Companion companion2 = DivAction.MenuItem.f34559d;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 2:
                DivActionTemplate.Companion companion3 = DivActionTemplate.f34572i;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 3:
                DivActionTemplate.Companion companion4 = DivActionTemplate.f34572i;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 4:
                DivActionTemplate.MenuItemTemplate.Companion companion5 = DivActionTemplate.MenuItemTemplate.f34605d;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 5:
                DivActionTemplate.MenuItemTemplate.Companion companion6 = DivActionTemplate.MenuItemTemplate.f34605d;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 6:
                DivAnimation.Companion companion7 = DivAnimation.f34634h;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 7:
                DivAnimationTemplate.Companion companion8 = DivAnimationTemplate.f34681i;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 8:
                DivAnimationTemplate.Companion companion9 = DivAnimationTemplate.f34681i;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 9:
                DivAppearanceSetTransition.Companion companion10 = DivAppearanceSetTransition.f34718b;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 10:
                Function3<String, JSONObject, ParsingEnvironment, List<DivAppearanceTransition>> function3 = DivAppearanceSetTransitionTemplate.f34721b;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 11:
                Function3<String, JSONObject, ParsingEnvironment, List<DivAppearanceTransition>> function32 = DivAppearanceSetTransitionTemplate.f34721b;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 12:
                DivChangeSetTransition.Companion companion11 = DivChangeSetTransition.f34848b;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 13:
                Function3<String, JSONObject, ParsingEnvironment, List<DivChangeTransition>> function33 = DivChangeSetTransitionTemplate.f34851b;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 14:
                Function3<String, JSONObject, ParsingEnvironment, List<DivChangeTransition>> function34 = DivChangeSetTransitionTemplate.f34851b;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 15:
                DivContainer.Companion companion12 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 16:
                DivContainer.Companion companion13 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 17:
                DivContainer.Companion companion14 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 18:
                DivContainer.Companion companion15 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 19:
                DivContainer.Companion companion16 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 20:
                DivContainer.Companion companion17 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 21:
                DivContainer.Companion companion18 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 22:
                DivContainer.Companion companion19 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 23:
                DivContainer.Companion companion20 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 24:
                DivContainer.Companion companion21 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 25:
                DivContainer.Companion companion22 = DivContainer.f34884N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 26:
                DivAccessibility divAccessibility = DivContainerTemplate.f35007N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 27:
                DivAccessibility divAccessibility2 = DivContainerTemplate.f35007N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 28:
                DivAccessibility divAccessibility3 = DivContainerTemplate.f35007N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
            default:
                DivAccessibility divAccessibility4 = DivContainerTemplate.f35007N;
                Intrinsics.m32179h(it, "it");
                if (it.size() >= 1) {
                }
                break;
        }
        return true;
    }
}
