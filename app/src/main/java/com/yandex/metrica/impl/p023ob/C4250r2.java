package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.r2 */
/* loaded from: classes2.dex */
public final class C4250r2 {

    /* renamed from: a */
    @NonNull
    private static final C3432L0 f46265a = new C3432L0();

    /* renamed from: b */
    private static final String[] f46266b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    /* renamed from: a */
    public static int m20614a() {
        return (m20615b() || m20616c()) ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m20615b() {
        try {
            return (C3658U2.m19211a(21) ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m20616c() {
        for (String str : f46266b) {
            try {
            } catch (Throwable unused) {
            }
            if (C3658U2.m19211a(31) ? false : new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
