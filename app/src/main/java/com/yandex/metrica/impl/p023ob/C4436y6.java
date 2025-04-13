package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4452ym;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.y6 */
/* loaded from: classes2.dex */
public class C4436y6 implements InterfaceC4410x6 {

    /* renamed from: a */
    @NonNull
    private final String f46989a;

    /* renamed from: b */
    @NonNull
    public final C3316G9 f46990b;

    /* renamed from: c */
    @NonNull
    private C4452ym.a f46991c;

    public C4436y6(@NonNull C3316G9 c3316g9, @NonNull String str) {
        this.f46990b = c3316g9;
        this.f46989a = str;
        C4452ym.a aVar = new C4452ym.a();
        try {
            String m18142f = c3316g9.m18142f(str);
            if (!TextUtils.isEmpty(m18142f)) {
                aVar = new C4452ym.a(m18142f);
            }
        } catch (Throwable unused) {
        }
        this.f46991c = aVar;
    }

    /* renamed from: a */
    public C4436y6 m21183a(long j2) {
        m21182a("SESSION_INIT_TIME", Long.valueOf(j2));
        return this;
    }

    /* renamed from: b */
    public C4436y6 m21186b(long j2) {
        m21182a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j2));
        return this;
    }

    @Nullable
    /* renamed from: c */
    public Long m21189c() {
        return this.f46991c.m21275a("SESSION_INIT_TIME");
    }

    /* renamed from: d */
    public C4436y6 m21190d(long j2) {
        m21182a("SESSION_ID", Long.valueOf(j2));
        return this;
    }

    @Nullable
    /* renamed from: e */
    public Long m21193e() {
        return this.f46991c.m21275a("SESSION_COUNTER_ID");
    }

    @Nullable
    /* renamed from: f */
    public Long m21194f() {
        return this.f46991c.m21275a("SESSION_ID");
    }

    @Nullable
    /* renamed from: g */
    public Long m21195g() {
        return this.f46991c.m21275a("SESSION_SLEEP_START");
    }

    /* renamed from: h */
    public boolean m21196h() {
        return this.f46991c.length() > 0;
    }

    @Nullable
    /* renamed from: i */
    public Boolean m21197i() {
        C4452ym.a aVar = this.f46991c;
        Objects.requireNonNull(aVar);
        try {
            return Boolean.valueOf(aVar.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C4436y6 m21184a(boolean z) {
        m21182a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public void m21187b() {
        this.f46990b.m18137c(this.f46989a, this.f46991c.toString());
        this.f46990b.m18227c();
    }

    /* renamed from: c */
    public C4436y6 m21188c(long j2) {
        m21182a("SESSION_COUNTER_ID", Long.valueOf(j2));
        return this;
    }

    @Nullable
    /* renamed from: d */
    public Long m21191d() {
        return this.f46991c.m21275a("SESSION_LAST_EVENT_OFFSET");
    }

    /* renamed from: e */
    public C4436y6 m21192e(long j2) {
        m21182a("SESSION_SLEEP_START", Long.valueOf(j2));
        return this;
    }

    /* renamed from: a */
    private void m21182a(String str, Object obj) {
        try {
            this.f46991c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m21185a() {
        this.f46991c = new C4452ym.a();
        m21187b();
    }
}
