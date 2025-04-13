package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.fn */
/* loaded from: classes2.dex */
public class C3959fn implements InterfaceC4089kn {

    /* renamed from: a */
    @NonNull
    private final C3933en f45148a;

    public C3959fn() {
        this(new C3907dn(C3532P0.m18696i().m18704f()));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4089kn
    @NonNull
    /* renamed from: a */
    public C4063jn mo19917a(@NonNull C4066k0 c4066k0) {
        byte[] m19830a;
        String encodeToString;
        String m20214p = c4066k0.m20214p();
        if (!TextUtils.isEmpty(m20214p)) {
            try {
                m19830a = this.f45148a.m19830a(m20214p.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (m19830a != null) {
                encodeToString = Base64.encodeToString(m19830a, 0);
                return new C4063jn(c4066k0.mo19071f(encodeToString), EnumC4141mn.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        return new C4063jn(c4066k0.mo19071f(encodeToString), EnumC4141mn.AES_VALUE_ENCRYPTION);
    }

    public C3959fn(@NonNull C3907dn c3907dn) {
        this(new C3933en("AES/CBC/PKCS5Padding", c3907dn.m19775b(), c3907dn.m19774a()));
    }

    @VisibleForTesting
    public C3959fn(@NonNull C3933en c3933en) {
        this.f45148a = c3933en;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4089kn
    @NonNull
    /* renamed from: a */
    public byte[] mo19918a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            C3933en c3933en = this.f45148a;
            Objects.requireNonNull(c3933en);
            return c3933en.m19831a(decode, 0, decode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
