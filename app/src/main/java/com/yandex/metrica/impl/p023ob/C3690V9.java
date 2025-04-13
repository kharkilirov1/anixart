package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.V9 */
/* loaded from: classes2.dex */
public class C3690V9<T> implements InterfaceC3715W9<T> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3715W9<T> f44223a;

    /* renamed from: b */
    @NonNull
    private final C3933en f44224b;

    public C3690V9(@NonNull InterfaceC3715W9<T> interfaceC3715W9, @NonNull C3933en c3933en) {
        this.f44223a = interfaceC3715W9;
        this.f44224b = c3933en;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3715W9
    @NonNull
    /* renamed from: a */
    public byte[] mo18483a(@NonNull T t) {
        try {
            return this.f44224b.m19830a(this.f44223a.mo18483a((InterfaceC3715W9<T>) t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3715W9
    @NonNull
    /* renamed from: a */
    public T mo18165a(@NonNull byte[] bArr) throws IOException {
        try {
            C3933en c3933en = this.f44224b;
            Objects.requireNonNull(c3933en);
            return this.f44223a.mo18165a(c3933en.m19831a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3715W9
    @NonNull
    /* renamed from: a */
    public T mo18164a() {
        return this.f44223a.mo18164a();
    }
}
