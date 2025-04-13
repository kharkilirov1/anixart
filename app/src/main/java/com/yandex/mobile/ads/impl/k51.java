package com.yandex.mobile.ads.impl;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k51 implements n91 {
    @Override // com.yandex.mobile.ads.impl.n91
    @NotNull
    /* renamed from: a */
    public final String mo26035a() {
        String str;
        String str2 = null;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            n60.m26810c("Exception during user-agent property read", new Object[0]);
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dalvik/");
        try {
            str2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
            n60.m26810c("Exception during JVM version property read", new Object[0]);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = "1.0.0";
        }
        sb.append(str2);
        sb.append(" (Linux; U; Android ");
        String str3 = Build.VERSION.RELEASE;
        if (str3.length() == 0) {
            str3 = "1.0";
        }
        sb.append(str3);
        if (Intrinsics.m32174c("REL", Build.VERSION.CODENAME)) {
            String model = Build.MODEL;
            Intrinsics.m32178g(model, "model");
            if (model.length() > 0) {
                sb.append("; ");
                sb.append(model);
            }
        }
        String id2 = Build.ID;
        Intrinsics.m32178g(id2, "id");
        if (id2.length() > 0) {
            sb.append(" Build/");
            sb.append(id2);
        }
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "result.toString()");
        return sb2;
    }
}
