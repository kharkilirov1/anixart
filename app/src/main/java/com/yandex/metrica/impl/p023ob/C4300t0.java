package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4352v0;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.t0 */
/* loaded from: classes2.dex */
public class C4300t0 implements InterfaceC3607S1<C4352v0.a> {

    /* renamed from: a */
    @NonNull
    private final C4352v0 f46482a;

    public C4300t0() {
        this(new C4352v0());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3607S1
    @Nullable
    /* renamed from: a */
    public C4352v0.a mo18377a(int i2, @Nullable byte[] bArr, @Nullable Map map) {
        if (200 == i2) {
            Objects.requireNonNull(this.f46482a);
            try {
                if (!C3658U2.m19214a(bArr)) {
                    return new C4352v0.a(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @VisibleForTesting
    public C4300t0(@NonNull C4352v0 c4352v0) {
        this.f46482a = c4352v0;
    }
}
