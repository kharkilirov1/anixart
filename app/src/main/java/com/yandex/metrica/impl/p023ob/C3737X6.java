package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.X6 */
/* loaded from: classes2.dex */
public class C3737X6 implements InterfaceC3712W6 {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3678Um<String>> f44466a;

    /* renamed from: b */
    @NonNull
    private final C3918e8 f44467b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3678Um<String> f44468c;

    /* renamed from: com.yandex.metrica.impl.ob.X6$a */
    public class a implements InterfaceC3678Um<String> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull String str) {
            C3737X6.m19390a(C3737X6.this, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3737X6(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.e8 r0 = new com.yandex.metrica.impl.ob.e8
            java.lang.String r1 = com.yandex.metrica.impl.p023ob.C4013i.m20031a(r4)
            r2 = 21
            boolean r2 = com.yandex.metrica.impl.p023ob.C3658U2.m19211a(r2)
            if (r2 == 0) goto L13
            java.io.File r4 = r4.getNoBackupFilesDir()
            goto L17
        L13:
            java.io.File r4 = r4.getFilesDir()
        L17:
            if (r4 != 0) goto L1b
            r4 = 0
            goto L35
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r4.getAbsolutePath()
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.String r4 = "appmetrica_native_crashes"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L35:
            r0.<init>(r1, r4)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3737X6.<init>(android.content.Context):void");
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3712W6
    /* renamed from: a */
    public synchronized void mo19352a(@NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        this.f44466a.add(interfaceC3678Um);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3712W6
    /* renamed from: b */
    public synchronized void mo19353b(@NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        this.f44466a.remove(interfaceC3678Um);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: a */
    public void mo17988a() {
        this.f44467b.m19795a(this.f44468c);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: b */
    public void mo17990b() {
        this.f44467b.m19796b(this.f44468c);
    }

    /* renamed from: a */
    public static void m19390a(C3737X6 c3737x6, String str) {
        ArrayList arrayList;
        synchronized (c3737x6) {
            arrayList = new ArrayList(c3737x6.f44466a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3678Um) it.next()).mo17875b(str);
        }
    }

    @VisibleForTesting
    public C3737X6(@NonNull C3918e8 c3918e8) {
        this.f44466a = new ArrayList();
        this.f44468c = new a();
        this.f44467b = c3918e8;
    }
}
