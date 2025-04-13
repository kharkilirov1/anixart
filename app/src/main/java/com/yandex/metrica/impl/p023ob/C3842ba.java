package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.metrica.impl.ob.ba */
/* loaded from: classes2.dex */
public class C3842ba {

    /* renamed from: a */
    @NonNull
    private final a f44814a;

    /* renamed from: b */
    @NonNull
    private final C4374vm f44815b;

    /* renamed from: com.yandex.metrica.impl.ob.ba$a */
    public static class a {
    }

    public C3842ba() {
        this(new a(), new C4374vm());
    }

    @Nullable
    /* renamed from: a */
    public byte[] m19648a(@Nullable byte[] bArr, @NonNull String str) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            a aVar = this.f44814a;
            byte[] bytes = str.getBytes();
            Objects.requireNonNull(aVar);
            C3933en c3933en = new C3933en("AES/CBC/PKCS5Padding", bytes, copyOfRange);
            if (C3658U2.m19214a(bArr)) {
                return null;
            }
            byte[] m19831a = c3933en.m19831a(bArr, 16, bArr.length - 16);
            Objects.requireNonNull(this.f44815b);
            try {
                byteArrayInputStream = new ByteArrayInputStream(m19831a);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] m19265a = C3681V0.m19265a(gZIPInputStream, Integer.MAX_VALUE);
                        C3658U2.m19209a((Closeable) gZIPInputStream);
                        C3658U2.m19209a((Closeable) byteArrayInputStream);
                        return m19265a;
                    } catch (Throwable th2) {
                        th = th2;
                        C3658U2.m19209a((Closeable) gZIPInputStream);
                        C3658U2.m19209a((Closeable) byteArrayInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
                byteArrayInputStream = null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public C3842ba(@NonNull a aVar, @NonNull C4374vm c4374vm) {
        this.f44814a = aVar;
        this.f44815b = c4374vm;
    }
}
