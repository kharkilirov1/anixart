package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.um */
/* loaded from: classes2.dex */
public final class C4348um {

    /* renamed from: a */
    private final Context f46661a;

    /* renamed from: b */
    private final C3922ec f46662b;

    /* renamed from: c */
    private final C4026ic f46663c;

    @VisibleForTesting
    public C4348um(@NotNull Context context, @NotNull C3922ec c3922ec, @NotNull C4026ic c4026ic) {
        this.f46661a = context;
        this.f46662b = c3922ec;
        this.f46663c = c4026ic;
    }

    /* renamed from: b */
    private final String m20905b() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.m32178g(uuid, "UUID.randomUUID().toString()");
        String m33891Q = StringsKt.m33891Q(uuid, "-", "", false, 4, null);
        Locale locale = Locale.US;
        Intrinsics.m32178g(locale, "Locale.US");
        String lowerCase = m33891Q.toLowerCase(locale);
        Intrinsics.m32178g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @NotNull
    /* renamed from: a */
    public final String m20906a() {
        boolean z;
        byte[] bArr;
        C3974gc m19806a = this.f46662b.m19806a(this.f46661a, new C4182oc(5, 500));
        Intrinsics.m32178g(m19806a, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C3844bc m19960c = m19806a.m19960c();
        Intrinsics.m32178g(m19960c, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        boolean z2 = false;
        if (m19960c.m19650a()) {
            C3818ac c3818ac = m19960c.f44822a;
            Intrinsics.m32176e(c3818ac);
            String str = c3818ac.f44734b;
            Intrinsics.m32176e(str);
            byte[] bytes = str.getBytes(Charsets.f66855b);
            Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
            try {
                bArr = MessageDigest.getInstance("MD5").digest(bytes);
            } catch (NoSuchAlgorithmException unused) {
                bArr = new byte[0];
            }
            String m18656a = C3509O2.m18656a(bArr);
            Intrinsics.m32178g(m18656a, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
            return m18656a;
        }
        String m20010a = this.f46663c.m20055a().m20010a();
        if (m20010a != null) {
            if (!(m20010a.length() == 0)) {
                try {
                    UUID.fromString(m20010a);
                    z = true;
                } catch (Throwable unused2) {
                    z = false;
                }
                if (z && (!Intrinsics.m32174c(m20010a, "00000000-0000-0000-0000-000000000000"))) {
                    z2 = true;
                }
            }
            if (z2) {
                return StringsKt.m33891Q(m20010a, "-", "", false, 4, null);
            }
        }
        return m20905b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4348um(@org.jetbrains.annotations.NotNull android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p023ob.C3532P0.m18696i()
            java.lang.String r1 = "GlobalServiceLocator.getInstance()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            com.yandex.metrica.impl.ob.ec r0 = r0.m18717t()
            java.lang.String r2 = "GlobalServiceLocator.get…ternalAdvertisingIdGetter"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r2)
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p023ob.C3532P0.m18696i()
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r1)
            com.yandex.metrica.impl.ob.ic r1 = r2.m18700b()
            java.lang.String r2 = "GlobalServiceLocator.getInstance().appSetIdGetter"
            kotlin.jvm.internal.Intrinsics.m32178g(r1, r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4348um.<init>(android.content.Context):void");
    }
}
