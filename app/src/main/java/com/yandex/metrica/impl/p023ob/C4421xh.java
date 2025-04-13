package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.EnumC3124e;
import com.yandex.metrica.rtm.wrapper.InterfaceC4625i;
import com.yandex.metrica.rtm.wrapper.InterfaceC4626j;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.xh */
/* loaded from: classes2.dex */
public class C4421xh {

    /* renamed from: a */
    private final C3432L0 f46943a;

    /* renamed from: com.yandex.metrica.impl.ob.xh$a */
    public class a implements InterfaceC4625i {
        public a() {
        }

        @Nullable
        public File getCrashesDirectory(@NonNull Context context) {
            return C4421xh.this.f46943a.m18469a(context, "appmetrica_rtm_crashes");
        }

        @Nullable
        public File getCrashesTriggerDirectory(@NonNull Context context) {
            return C4421xh.this.f46943a.m18469a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$b */
    public class b implements InterfaceC4626j {
        public b(C4421xh c4421xh) {
        }

        @Nullable
        public String getDeviceType(@NonNull Context context) {
            EnumC3124e m21075a = C3532P0.m18696i().m18713p().m21177a().m21075a();
            if (m21075a == null) {
                return null;
            }
            return m21075a.f42437b;
        }

        @Nullable
        public String getVersion(@NonNull Context context) {
            return C3658U2.m19198a(context, context.getPackageName());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xh$c */
    public class c implements InterfaceC4625i {
        public c() {
        }

        @Nullable
        public File getCrashesDirectory(@NonNull Context context) {
            return C4421xh.this.f46943a.m18469a(context, "appmetrica_rtm_crashes");
        }

        @Nullable
        public File getCrashesTriggerDirectory(@NonNull Context context) {
            return C4421xh.this.f46943a.m18469a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public C4421xh() {
        this(new C3432L0());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.rtm.wrapper.InterfaceC4622f m21155b(@androidx.annotation.NonNull android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p023ob.C3184B2.m17879a(r0)
            if (r0 == 0) goto L24
            com.yandex.metrica.rtm.wrapper.l r0 = new com.yandex.metrica.rtm.wrapper.l     // Catch: java.lang.Throwable -> L24
            com.yandex.metrica.impl.ob.xh$a r1 = new com.yandex.metrica.impl.ob.xh$a     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p023ob.C3532P0.m18696i()     // Catch: java.lang.Throwable -> L24
            com.yandex.metrica.impl.ob.zn r2 = r2.m18716s()     // Catch: java.lang.Throwable -> L24
            com.yandex.metrica.impl.ob.sn r2 = r2.m21322g()     // Catch: java.lang.Throwable -> L24
            com.yandex.metrica.impl.ob.xh$b r3 = new com.yandex.metrica.impl.ob.xh$b     // Catch: java.lang.Throwable -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24
            r0.<init>(r1, r5, r2, r3)     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L2c
            com.yandex.metrica.impl.ob.uh r0 = new com.yandex.metrica.impl.ob.uh
            r0.<init>()
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4421xh.m21155b(android.content.Context):com.yandex.metrica.rtm.wrapper.f");
    }

    @VisibleForTesting
    public C4421xh(@NonNull C3432L0 c3432l0) {
        this.f46943a = c3432l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.rtm.wrapper.InterfaceC4621e m21154a(@androidx.annotation.NonNull android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p023ob.C3184B2.m17879a(r0)
            if (r0 == 0) goto L13
            com.yandex.metrica.rtm.wrapper.h r0 = new com.yandex.metrica.rtm.wrapper.h     // Catch: java.lang.Throwable -> L13
            com.yandex.metrica.impl.ob.xh$c r1 = new com.yandex.metrica.impl.ob.xh$c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L1b
            com.yandex.metrica.impl.ob.th r0 = new com.yandex.metrica.impl.ob.th
            r0.<init>()
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4421xh.m21154a(android.content.Context):com.yandex.metrica.rtm.wrapper.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.rtm.wrapper.InterfaceC4620d m21153a(@androidx.annotation.NonNull com.yandex.metrica.rtm.wrapper.InterfaceC4627k r2, @androidx.annotation.NonNull java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p023ob.C3184B2.m17879a(r0)
            if (r0 == 0) goto Le
            com.yandex.metrica.rtm.wrapper.g r0 = new com.yandex.metrica.rtm.wrapper.g     // Catch: java.lang.Throwable -> Le
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L16
            com.yandex.metrica.impl.ob.sh r0 = new com.yandex.metrica.impl.ob.sh
            r0.<init>()
        L16:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4421xh.m21153a(com.yandex.metrica.rtm.wrapper.k, java.lang.String, boolean):com.yandex.metrica.rtm.wrapper.d");
    }
}
