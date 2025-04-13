package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.me */
/* loaded from: classes2.dex */
public class C4132me implements InterfaceC3898de {

    /* renamed from: a */
    @NonNull
    private Set<String> f45957a;

    public C4132me(@Nullable List<C4028ie> list) {
        if (list == null) {
            this.f45957a = new HashSet();
            return;
        }
        this.f45957a = new HashSet(list.size());
        for (C4028ie c4028ie : list) {
            if (c4028ie.f45341b) {
                this.f45957a.add(c4028ie.f45340a);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3898de
    /* renamed from: a */
    public boolean mo19653a(@NonNull String str) {
        return this.f45957a.contains(str);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("StartupBasedPermissionStrategy{mEnabledPermissions=");
        m24u.append(this.f45957a);
        m24u.append('}');
        return m24u.toString();
    }
}
