package com.yandex.div2;

import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div2.StrVariable;
import com.yandex.div2.UrlVariable;
import com.yandex.mobile.ads.exo.drm.C4727n;
import com.yandex.mobile.ads.exo.drm.C4735v;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.exo.drm.InterfaceC4720g;
import com.yandex.mobile.ads.exo.drm.InterfaceC4726m;
import com.yandex.mobile.ads.impl.InterfaceC5499nk;
import java.util.UUID;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.s0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3070s0 implements ValueValidator, InterfaceC5499nk, InterfaceC4720g.b, InterfaceC4726m.c {

    /* renamed from: c */
    public static final /* synthetic */ C3070s0 f42028c = new C3070s0(0);

    /* renamed from: d */
    public static final /* synthetic */ C3070s0 f42029d = new C3070s0(2);

    /* renamed from: e */
    public static final /* synthetic */ C3070s0 f42030e = new C3070s0(3);

    /* renamed from: f */
    public static final /* synthetic */ C3070s0 f42031f = new C3070s0(4);

    /* renamed from: g */
    public static final /* synthetic */ C3070s0 f42032g = new C3070s0(6);

    /* renamed from: h */
    public static final /* synthetic */ C3070s0 f42033h = new C3070s0(7);

    /* renamed from: i */
    public static final /* synthetic */ C3070s0 f42034i = new C3070s0(8);

    /* renamed from: j */
    public static final /* synthetic */ C3070s0 f42035j = new C3070s0(12);

    /* renamed from: k */
    public static final /* synthetic */ C3070s0 f42036k = new C3070s0(13);

    /* renamed from: b */
    public final /* synthetic */ int f42037b;

    public /* synthetic */ C3070s0(int i2) {
        this.f42037b = i2;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4726m.c
    /* renamed from: a */
    public InterfaceC4726m mo17752a(UUID uuid) {
        InterfaceC4726m m22211b;
        m22211b = C4727n.m22211b(uuid);
        return m22211b;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public boolean mo17302a(Object obj) {
        switch (this.f42037b) {
            case 0:
                String it = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function3 = NumberVariableTemplate.f41049c;
                Intrinsics.m32179h(it, "it");
                if (it.length() >= 1) {
                }
                break;
            case 1:
                String it2 = (String) obj;
                StrVariable.Companion companion = StrVariable.f41057c;
                Intrinsics.m32179h(it2, "it");
                if (it2.length() >= 1) {
                }
                break;
            case 2:
                String it3 = (String) obj;
                StrVariable.Companion companion2 = StrVariable.f41057c;
                Intrinsics.m32179h(it3, "it");
                if (it3.length() >= 1) {
                }
                break;
            case 3:
                String it4 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function32 = StrVariableTemplate.f41061c;
                Intrinsics.m32179h(it4, "it");
                if (it4.length() >= 1) {
                }
                break;
            case 4:
                String it5 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function33 = StrVariableTemplate.f41061c;
                Intrinsics.m32179h(it5, "it");
                if (it5.length() >= 1) {
                }
                break;
            case 5:
                String it6 = (String) obj;
                UrlVariable.Companion companion3 = UrlVariable.f41069c;
                Intrinsics.m32179h(it6, "it");
                if (it6.length() >= 1) {
                }
                break;
            case 6:
                String it7 = (String) obj;
                UrlVariable.Companion companion4 = UrlVariable.f41069c;
                Intrinsics.m32179h(it7, "it");
                if (it7.length() >= 1) {
                }
                break;
            case 7:
                String it8 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function34 = UrlVariableTemplate.f41073c;
                Intrinsics.m32179h(it8, "it");
                if (it8.length() >= 1) {
                }
                break;
            default:
                String it9 = (String) obj;
                Function3<String, JSONObject, ParsingEnvironment, String> function35 = UrlVariableTemplate.f41073c;
                Intrinsics.m32179h(it9, "it");
                if (it9.length() >= 1) {
                }
                break;
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5499nk
    public void accept(Object obj) {
        switch (this.f42037b) {
            case 9:
                ((InterfaceC4719f.a) obj).m22183c();
                break;
            case 10:
                ((InterfaceC4719f.a) obj).m22182b();
                break;
            default:
                ((InterfaceC4719f.a) obj).m22178a();
                break;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g.b
    public void release() {
        C4735v.m22232a();
    }
}
