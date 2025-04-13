package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3568Qb;
import java.io.Closeable;
import java.io.InputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.p033io.ByteStreamsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Rb */
/* loaded from: classes2.dex */
public final class C3592Rb {

    /* renamed from: a */
    private final C3518Ob f43815a;

    /* renamed from: b */
    private final C3568Qb f43816b;

    public C3592Rb(@NotNull C3518Ob c3518Ob, @NotNull C3568Qb c3568Qb) {
        this.f43815a = c3518Ob;
        this.f43816b = c3568Qb;
    }

    /* renamed from: a */
    public final void m18963a() {
        Throwable th;
        int i2;
        HttpsURLConnection m18667a = this.f43815a.m18667a();
        if (m18667a == null) {
            this.f43816b.m18808a();
            return;
        }
        InputStream inputStream = null;
        try {
            m18667a.connect();
            i2 = m18667a.getResponseCode();
            try {
                inputStream = m18667a.getInputStream();
                Intrinsics.m32178g(inputStream, "inputStream");
                int length = ByteStreamsKt.m32137a(inputStream).length;
                m18667a.disconnect();
                C3658U2.m19209a((Closeable) inputStream);
                this.f43816b.m18809a(new C3568Qb.a(i2 == 200, i2, length, null, 8));
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.f43816b.m18809a(new C3568Qb.a(false, i2, 0, Reflection.m32193a(th.getClass()).mo32166d() + ": " + th.getLocalizedMessage(), 5));
                } finally {
                    m18667a.disconnect();
                    C3658U2.m19209a((Closeable) inputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i2 = 0;
        }
    }
}
