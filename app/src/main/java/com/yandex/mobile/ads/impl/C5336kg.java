package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rw0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kg */
/* loaded from: classes3.dex */
public final class C5336kg {

    /* renamed from: a */
    @Nullable
    private final aw0 f51963a;

    /* renamed from: b */
    @Nullable
    private final rw0 f51964b;

    /* renamed from: com.yandex.mobile.ads.impl.kg$a */
    public static final class a {
        /* renamed from: a */
        public static boolean m26121a(@NotNull aw0 request, @NotNull rw0 response) {
            Intrinsics.m32179h(response, "response");
            Intrinsics.m32179h(request, "request");
            int m27997e = response.m27997e();
            if (m27997e != 200 && m27997e != 410 && m27997e != 414 && m27997e != 501 && m27997e != 203 && m27997e != 204) {
                if (m27997e != 307) {
                    if (m27997e != 308 && m27997e != 404 && m27997e != 405) {
                        switch (m27997e) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (rw0.m27992a(response, "Expires") == null && response.m27994b().m29925c() == -1 && !response.m27994b().m29924b() && !response.m27994b().m29923a()) {
                    return false;
                }
            }
            return (response.m27994b().m29930h() || request.m22634b().m29930h()) ? false : true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kg$b */
    public static final class b {

        /* renamed from: a */
        private final long f51965a;

        /* renamed from: b */
        @NotNull
        private final aw0 f51966b;

        /* renamed from: c */
        @Nullable
        private final rw0 f51967c;

        /* renamed from: d */
        private int f51968d;

        public b(long j2, @NotNull aw0 request) {
            Intrinsics.m32179h(request, "request");
            this.f51965a = j2;
            this.f51966b = request;
            this.f51967c = null;
            this.f51968d = -1;
        }

        @NotNull
        /* renamed from: a */
        public final C5336kg m26122a() {
            C5336kg c5336kg;
            if (this.f51967c == null) {
                c5336kg = new C5336kg(this.f51966b, null);
            } else if (this.f51966b.m22637e() && this.f51967c.m27999g() == null) {
                c5336kg = new C5336kg(this.f51966b, null);
            } else {
                if (a.m26121a(this.f51966b, this.f51967c)) {
                    C6074yf m22634b = this.f51966b.m22634b();
                    if (!m22634b.m29929g()) {
                        aw0 aw0Var = this.f51966b;
                        if (!((aw0Var.m22633a("If-Modified-Since") == null && aw0Var.m22633a("If-None-Match") == null) ? false : true)) {
                            C6074yf m27994b = this.f51967c.m27994b();
                            int i2 = this.f51968d;
                            long j2 = 0;
                            long max = (i2 != -1 ? Math.max(0L, TimeUnit.SECONDS.toMillis(i2)) : 0L) + 0 + (this.f51965a - 0);
                            rw0 rw0Var = this.f51967c;
                            Intrinsics.m32176e(rw0Var);
                            long millis = rw0Var.m27994b().m29925c() != -1 ? TimeUnit.SECONDS.toMillis(r3.m29925c()) : 0L;
                            if (m22634b.m29925c() != -1) {
                                millis = Math.min(millis, TimeUnit.SECONDS.toMillis(m22634b.m29925c()));
                            }
                            long millis2 = m22634b.m29927e() != -1 ? TimeUnit.SECONDS.toMillis(m22634b.m29927e()) : 0L;
                            if (!m27994b.m29928f() && m22634b.m29926d() != -1) {
                                j2 = TimeUnit.SECONDS.toMillis(m22634b.m29926d());
                            }
                            if (!m27994b.m29929g()) {
                                long j3 = millis2 + max;
                                if (j3 < j2 + millis) {
                                    rw0.C5716a m28004l = this.f51967c.m28004l();
                                    if (j3 >= millis) {
                                        m28004l.m28021a("110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (max > 86400000) {
                                        rw0 rw0Var2 = this.f51967c;
                                        Intrinsics.m32176e(rw0Var2);
                                        if (rw0Var2.m27994b().m29925c() == -1) {
                                            m28004l.m28021a("113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                    }
                                    c5336kg = new C5336kg(null, m28004l.m28019a());
                                }
                            }
                            c5336kg = new C5336kg(this.f51966b, null);
                        }
                    }
                    c5336kg = new C5336kg(this.f51966b, null);
                } else {
                    c5336kg = new C5336kg(this.f51966b, null);
                }
            }
            return (c5336kg.m26120b() == null || !this.f51966b.m22634b().m29931i()) ? c5336kg : new C5336kg(null, null);
        }
    }

    public C5336kg(@Nullable aw0 aw0Var, @Nullable rw0 rw0Var) {
        this.f51963a = aw0Var;
        this.f51964b = rw0Var;
    }

    @Nullable
    /* renamed from: a */
    public final rw0 m26119a() {
        return this.f51964b;
    }

    @Nullable
    /* renamed from: b */
    public final aw0 m26120b() {
        return this.f51963a;
    }
}
