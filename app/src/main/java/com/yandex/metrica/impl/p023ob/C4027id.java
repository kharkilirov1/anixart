package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C3256E;
import com.yandex.metrica.impl.p023ob.C3456M;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.id */
/* loaded from: classes2.dex */
public class C4027id {

    /* renamed from: a */
    @NonNull
    public final List<C3456M.b.a> f45338a;

    /* renamed from: b */
    @NonNull
    public final List<C3256E.a> f45339b;

    public C4027id(@NonNull List<C3456M.b.a> list, @NonNull List<C3256E.a> list2) {
        this.f45338a = list;
        this.f45339b = list2;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Preconditions{possibleChargeTypes=");
        m24u.append(this.f45338a);
        m24u.append(", appStatuses=");
        return C0576a.m4119r(m24u, this.f45339b, '}');
    }
}
