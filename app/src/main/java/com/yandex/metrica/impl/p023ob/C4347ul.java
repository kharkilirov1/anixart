package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3352Hk;
import com.yandex.metrica.impl.p023ob.C3702Vl;
import java.util.Collections;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.ul */
/* loaded from: classes2.dex */
class C4347ul {

    /* renamed from: a */
    @NonNull
    private final C3702Vl.a f46654a;

    /* renamed from: b */
    @NonNull
    private final C3452Lk f46655b;

    /* renamed from: c */
    @NonNull
    private final C3291F9 f46656c;

    /* renamed from: d */
    @Nullable
    private volatile C3378Il f46657d;

    /* renamed from: e */
    @NonNull
    private final C3984gm f46658e;

    /* renamed from: f */
    @NonNull
    private final C3352Hk.b f46659f;

    /* renamed from: g */
    @NonNull
    private final C3377Ik f46660g;

    public C4347ul(@Nullable C3378Il c3378Il, @NonNull C3452Lk c3452Lk, @NonNull C3291F9 c3291f9, @NonNull C3984gm c3984gm, @NonNull C3377Ik c3377Ik) {
        this(c3378Il, c3452Lk, c3291f9, new C3702Vl.a(), c3984gm, c3377Ik, new C3352Hk.b());
    }

    /* renamed from: a */
    public void m20904a(@NonNull C3378Il c3378Il) {
        this.f46657d = c3378Il;
    }

    @VisibleForTesting
    public C4347ul(@Nullable C3378Il c3378Il, @NonNull C3452Lk c3452Lk, @NonNull C3291F9 c3291f9, @NonNull C3702Vl.a aVar, @NonNull C3984gm c3984gm, @NonNull C3377Ik c3377Ik, @NonNull C3352Hk.b bVar) {
        this.f46657d = c3378Il;
        this.f46655b = c3452Lk;
        this.f46656c = c3291f9;
        this.f46654a = aVar;
        this.f46658e = c3984gm;
        this.f46660g = c3377Ik;
        this.f46659f = bVar;
    }

    /* renamed from: a */
    public void m20903a(@Nullable Activity activity, @NonNull InterfaceC3528Ol interfaceC3528Ol, boolean z) {
        Objects.requireNonNull(this.f46654a);
        C3702Vl c3702Vl = new C3702Vl(interfaceC3528Ol, new C3677Ul(z));
        C3378Il c3378Il = this.f46657d;
        if ((!z && !this.f46655b.m18517b().isEmpty()) || activity == null) {
            c3702Vl.onResult(this.f46655b.m18515a());
            return;
        }
        c3702Vl.m19347a(true);
        EnumC4451yl m18336a = this.f46660g.m18336a(activity, c3378Il);
        if (m18336a != EnumC4451yl.OK) {
            int ordinal = m18336a.ordinal();
            interfaceC3528Ol.onError(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application" : String.format("feature %s disabled", "ui_parsing") : String.format("no %s_config", "ui_parsing") : String.format("no %s_config", "ui_access"));
            return;
        }
        if (!c3378Il.f43143c) {
            interfaceC3528Ol.onError(String.format("feature %s disabled", "ui_collecting_for_bridge"));
            return;
        }
        if (c3378Il.f43147g == null) {
            interfaceC3528Ol.onError(String.format("no %s_config", "ui_collecting_for_bridge"));
            return;
        }
        C3984gm c3984gm = this.f46658e;
        C3854bm c3854bm = c3378Il.f43145e;
        C3352Hk.b bVar = this.f46659f;
        C3452Lk c3452Lk = this.f46655b;
        C3291F9 c3291f9 = this.f46656c;
        Objects.requireNonNull(bVar);
        c3984gm.m19982a(activity, 0L, c3378Il, c3854bm, Collections.singletonList(new C3352Hk(c3452Lk, c3291f9, z, c3702Vl, new C3352Hk.a())));
    }
}
