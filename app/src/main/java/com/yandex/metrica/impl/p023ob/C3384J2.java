package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4371vj;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.J2 */
/* loaded from: classes2.dex */
public class C3384J2 implements InterfaceC3607S1<C4371vj> {

    /* renamed from: a */
    @NonNull
    private final C4345uj f43178a;

    /* renamed from: b */
    @NonNull
    private final C3842ba f43179b;

    public C3384J2() {
        this(new C4345uj(), new C3842ba());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3607S1
    @Nullable
    /* renamed from: a */
    public C4371vj mo18377a(int i2, byte[] bArr, @NonNull Map map) {
        if (200 == i2) {
            List list = (List) map.get("Content-Encoding");
            if (!C3658U2.m19217b(list) && "encrypted".equals(list.get(0))) {
                bArr = this.f43179b.m19648a(bArr, "hBnBQbZrmjPXEWVJ");
            }
            if (bArr != null) {
                C4371vj m20898a = this.f43178a.m20898a(bArr);
                if (C4371vj.a.OK == m20898a.m21062z()) {
                    return m20898a;
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    public C3384J2(@NonNull C4345uj c4345uj, @NonNull C3842ba c3842ba) {
        this.f43178a = c4345uj;
        this.f43179b = c3842ba;
    }
}
