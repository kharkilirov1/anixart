package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.xd */
/* loaded from: classes2.dex */
class C4417xd {

    /* renamed from: a */
    @NonNull
    private c f46930a;

    /* renamed from: b */
    @NonNull
    private a f46931b;

    /* renamed from: c */
    @NonNull
    private b f46932c;

    /* renamed from: d */
    @NonNull
    private Context f46933d;

    /* renamed from: e */
    @Nullable
    private C3668Uc f46934e;

    /* renamed from: f */
    @Nullable
    private C4469zd f46935f;

    /* renamed from: g */
    @NonNull
    private C3170Ad f46936g;

    /* renamed from: h */
    @NonNull
    private C4442yc f46937h;

    /* renamed from: i */
    @NonNull
    private final C3949fd f46938i;

    /* renamed from: j */
    @Nullable
    private C3294Fc f46939j;

    /* renamed from: k */
    @NonNull
    private Map<String, C3975gd> f46940k;

    /* renamed from: com.yandex.metrica.impl.ob.xd$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$b */
    public static class b {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$c */
    public static class c {
    }

    public C4417xd(@NonNull Context context, @Nullable C3668Uc c3668Uc, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc, @Nullable C4214pi c4214pi) {
        this(context, c3668Uc, new c(), new C3949fd(c4214pi), new a(), new b(), c3170Ad, c4442yc);
    }

    /* renamed from: a */
    public void m21143a(@NonNull Location location) {
        String provider = location.getProvider();
        C3975gd c3975gd = this.f46940k.get(provider);
        if (c3975gd == null) {
            if (this.f46935f == null) {
                c cVar = this.f46930a;
                Context context = this.f46933d;
                Objects.requireNonNull(cVar);
                this.f46935f = new C4469zd(null, C3567Qa.m18783a(context).m18798f(), new C3219Cc(context), new C3504Nm(), C3532P0.m18696i().m18702d(), C3532P0.m18696i().m18701c());
            }
            if (this.f46939j == null) {
                a aVar = this.f46931b;
                C4469zd c4469zd = this.f46935f;
                C3949fd c3949fd = this.f46938i;
                Objects.requireNonNull(aVar);
                this.f46939j = new C3294Fc(c4469zd, c3949fd);
            }
            b bVar = this.f46932c;
            C3668Uc c3668Uc = this.f46934e;
            C3294Fc c3294Fc = this.f46939j;
            C3170Ad c3170Ad = this.f46936g;
            C4442yc c4442yc = this.f46937h;
            Objects.requireNonNull(bVar);
            c3975gd = new C3975gd(c3668Uc, c3294Fc, null, 0L, new C3583R2(), c3170Ad, c4442yc);
            this.f46940k.put(provider, c3975gd);
        } else {
            c3975gd.m19963a(this.f46934e);
        }
        c3975gd.m19962a(location);
    }

    @NonNull
    /* renamed from: b */
    public C3949fd m21146b() {
        return this.f46938i;
    }

    @VisibleForTesting
    public C4417xd(@NonNull Context context, @Nullable C3668Uc c3668Uc, @NonNull c cVar, @NonNull C3949fd c3949fd, @NonNull a aVar, @NonNull b bVar, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this.f46940k = new HashMap();
        this.f46933d = context;
        this.f46934e = c3668Uc;
        this.f46930a = cVar;
        this.f46938i = c3949fd;
        this.f46931b = aVar;
        this.f46932c = bVar;
        this.f46936g = c3170Ad;
        this.f46937h = c4442yc;
    }

    @Nullable
    /* renamed from: a */
    public Location m21142a() {
        return this.f46938i.mo18725a();
    }

    /* renamed from: a */
    public void m21145a(@Nullable C3668Uc c3668Uc) {
        this.f46934e = c3668Uc;
    }

    /* renamed from: a */
    public void m21144a(@NonNull C3575Qi c3575Qi) {
        if (c3575Qi.m18846d() != null) {
            this.f46938i.m18774c(c3575Qi.m18846d());
        }
    }
}
