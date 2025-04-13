package com.yandex.mobile.ads.impl;

import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.q */
/* loaded from: classes3.dex */
final class C5611q extends HashMap<String, InterfaceC5560p> {
    public C5611q(C5664r c5664r) {
        e91 e91Var;
        e91 e91Var2;
        e91 e91Var3;
        e91 e91Var4;
        e91Var = c5664r.f54151a;
        put("adtune", new C5060f7(e91Var));
        put("close", new C5126gi());
        e91Var2 = c5664r.f54151a;
        put("deeplink", new C6032xm(e91Var2));
        e91Var3 = c5664r.f54151a;
        put("feedback", new C4939cu(e91Var3));
        e91Var4 = c5664r.f54151a;
        put("social_action", new y21(e91Var4));
    }
}
