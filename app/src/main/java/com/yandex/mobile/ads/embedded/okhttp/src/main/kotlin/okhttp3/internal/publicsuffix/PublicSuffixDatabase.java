package com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix;

import com.yandex.mobile.ads.impl.t91;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.CloseableKt;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.RealBufferedSource;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/mobile/ads/embedded/okhttp/src/main/kotlin/okhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "mobileads_externalRelease"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    @NotNull
    private static final byte[] f47927e;

    /* renamed from: f */
    @NotNull
    private static final List<String> f47928f;

    /* renamed from: g */
    @NotNull
    private static final PublicSuffixDatabase f47929g;

    /* renamed from: h */
    public static final /* synthetic */ int f47930h = 0;

    /* renamed from: a */
    @NotNull
    private final AtomicBoolean f47931a = new AtomicBoolean(false);

    /* renamed from: b */
    @NotNull
    private final CountDownLatch f47932b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f47933c;

    /* renamed from: d */
    private byte[] f47934d;

    static {
        new C4711a(0);
        f47927e = new byte[]{42};
        f47928f = CollectionsKt.m31993F("*");
        f47929g = new PublicSuffixDatabase();
    }

    /* renamed from: b */
    private final void m22085b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource m34602d = Okio.m34602d(new GzipSource(Okio.m34607i(resourceAsStream)));
        try {
            RealBufferedSource realBufferedSource = (RealBufferedSource) m34602d;
            byte[] mo34523P0 = realBufferedSource.mo34523P0(realBufferedSource.readInt());
            byte[] mo34523P02 = realBufferedSource.mo34523P0(realBufferedSource.readInt());
            CloseableKt.m32138a(m34602d, null);
            synchronized (this) {
                Intrinsics.m32176e(mo34523P0);
                this.f47933c = mo34523P0;
                Intrinsics.m32176e(mo34523P02);
                this.f47934d = mo34523P02;
            }
            this.f47932b.countDown();
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x005d, code lost:
    
        if (r4 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r4 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x005f, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m22086a(@org.jetbrains.annotations.NotNull java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.m22086a(java.lang.String):java.lang.String");
    }

    /* renamed from: com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C4711a {
        private C4711a() {
        }

        public /* synthetic */ C4711a(int i2) {
            this();
        }

        /* renamed from: a */
        public static final String m22088a(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            int m28483a;
            int m28483a2;
            int i4 = PublicSuffixDatabase.f47930h;
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i3 = i7 + i8;
                    if (bArr[i3] == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i3 - i7;
                int i10 = i2;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        m28483a = 46;
                        z = false;
                    } else {
                        z = z2;
                        m28483a = t91.m28483a(bArr2[i10][i11]);
                    }
                    m28483a2 = m28483a - t91.m28483a(bArr[i7 + i12]);
                    if (m28483a2 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                }
                if (m28483a2 >= 0) {
                    if (m28483a2 <= 0) {
                        int i13 = i9 - i12;
                        int length2 = bArr2[i10].length - i11;
                        int length3 = bArr2.length;
                        for (int i14 = i10 + 1; i14 < length3; i14++) {
                            length2 += bArr2[i14].length;
                        }
                        if (length2 >= i13) {
                            if (length2 <= i13) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.m32178g(UTF_8, "UTF_8");
                                return new String(bArr, i7, i9, UTF_8);
                            }
                        }
                    }
                    i5 = i3 + 1;
                }
                length = i7 - 1;
            }
            return null;
        }

        @NotNull
        /* renamed from: a */
        public static PublicSuffixDatabase m22087a() {
            return PublicSuffixDatabase.f47929g;
        }
    }
}
