package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p022ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.b8 */
/* loaded from: classes2.dex */
public class C3840b8 implements InterfaceC3464M7<String> {

    /* renamed from: a */
    @NonNull
    private final C3892d8 f44809a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3703Vm<String, Bundle> f44810b;

    /* renamed from: c */
    @NonNull
    private final Callable<List<Bundle>> f44811c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3678Um<String> f44812d;

    /* renamed from: e */
    @NonNull
    private final C3814a8 f44813e;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    public class a implements InterfaceC3703Vm<String, Bundle> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public Bundle mo17917a(@NonNull String str) {
            return CrashpadServiceHelper.readCrash(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$b */
    public class b implements Callable<List<Bundle>> {
        @Override // java.util.concurrent.Callable
        public List<Bundle> call() throws Exception {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$c */
    public class c implements InterfaceC3678Um<String> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(String str) {
            CrashpadServiceHelper.m17803a(str);
        }
    }

    public C3840b8(@NonNull C3892d8 c3892d8) {
        this(c3892d8, new C3814a8(), new a(), new b(), new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3464M7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo18574a(@androidx.annotation.NonNull java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            com.yandex.metrica.impl.ob.Vm<java.lang.String, android.os.Bundle> r0 = r2.f44810b     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.mo17917a(r3)     // Catch: java.lang.Throwable -> L13
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L13
            com.yandex.metrica.impl.ob.a8 r1 = r2.f44813e     // Catch: java.lang.Throwable -> L13
            com.yandex.metrica.impl.ob.Z7 r0 = r1.mo17948a(r3, r0)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1c
            com.yandex.metrica.impl.ob.d8 r3 = r2.f44809a
            r3.a2(r0)
            goto L21
        L1c:
            com.yandex.metrica.impl.ob.Um<java.lang.String> r0 = r2.f44812d
            r0.mo17875b(r3)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3840b8.mo18574a(java.lang.Object):void");
    }

    @VisibleForTesting
    public C3840b8(@NonNull C3892d8 c3892d8, @NonNull C3814a8 c3814a8, @NonNull InterfaceC3703Vm<String, Bundle> interfaceC3703Vm, @NonNull Callable<List<Bundle>> callable, @NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        this.f44809a = c3892d8;
        this.f44813e = c3814a8;
        this.f44810b = interfaceC3703Vm;
        this.f44811c = callable;
        this.f44812d = interfaceC3678Um;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3464M7
    /* renamed from: a */
    public void mo18573a() {
        try {
            for (Bundle bundle : this.f44811c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    C3788Z7 mo17948a = this.f44813e.mo17948a(string, bundle);
                    if (mo17948a != null) {
                        this.f44809a.b2(mo17948a);
                    } else {
                        this.f44812d.mo17875b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
