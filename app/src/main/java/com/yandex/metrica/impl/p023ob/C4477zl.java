package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3352Hk;
import java.util.Collections;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zl */
/* loaded from: classes2.dex */
class C4477zl {

    /* renamed from: a */
    private final InterfaceC4139ml f47134a;

    /* renamed from: b */
    @NonNull
    private final C3452Lk f47135b;

    /* renamed from: c */
    @NonNull
    private final C3291F9 f47136c;

    /* renamed from: d */
    @Nullable
    private volatile C3378Il f47137d;

    /* renamed from: e */
    @NonNull
    private final C3984gm f47138e;

    /* renamed from: f */
    @NonNull
    private final C3352Hk.b f47139f;

    /* renamed from: g */
    @NonNull
    private final C3377Ik f47140g;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    public class a implements InterfaceC4139ml {
        public a(C4477zl c4477zl) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC4139ml
        public void onError(@NonNull String str) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC4139ml
        public void onResult(@NonNull JSONObject jSONObject) {
        }
    }

    public C4477zl(@Nullable C3378Il c3378Il, @NonNull C3452Lk c3452Lk, @NonNull C3291F9 c3291f9, @NonNull C3984gm c3984gm, @NonNull C3377Ik c3377Ik) {
        this(c3378Il, c3452Lk, c3291f9, c3984gm, c3377Ik, new C3352Hk.b());
    }

    /* renamed from: a */
    public void m21309a(@NonNull C3378Il c3378Il) {
        this.f47137d = c3378Il;
    }

    /* renamed from: b */
    public void m21310b(@NonNull Activity activity) {
        C3378Il c3378Il = this.f47137d;
        if (this.f47140g.m18336a(activity, c3378Il) == EnumC4451yl.OK) {
            m21307a(activity, 0L, c3378Il, c3378Il.f43145e);
        }
    }

    @VisibleForTesting
    public C4477zl(@Nullable C3378Il c3378Il, @NonNull C3452Lk c3452Lk, @NonNull C3291F9 c3291f9, @NonNull C3984gm c3984gm, @NonNull C3377Ik c3377Ik, @NonNull C3352Hk.b bVar) {
        this.f47134a = new a(this);
        this.f47137d = c3378Il;
        this.f47135b = c3452Lk;
        this.f47136c = c3291f9;
        this.f47138e = c3984gm;
        this.f47139f = bVar;
        this.f47140g = c3377Ik;
    }

    /* renamed from: a */
    public void m21308a(@NonNull Activity activity) {
        C3378Il c3378Il = this.f47137d;
        if (this.f47140g.m18336a(activity, c3378Il) == EnumC4451yl.OK) {
            C3854bm c3854bm = c3378Il.f43145e;
            m21307a(activity, c3854bm.f44844d, c3378Il, c3854bm);
        }
    }

    /* renamed from: a */
    private void m21307a(@NonNull Activity activity, long j2, @NonNull C3378Il c3378Il, @NonNull C3854bm c3854bm) {
        C3984gm c3984gm = this.f47138e;
        C3352Hk.b bVar = this.f47139f;
        C3452Lk c3452Lk = this.f47135b;
        C3291F9 c3291f9 = this.f47136c;
        InterfaceC4139ml interfaceC4139ml = this.f47134a;
        Objects.requireNonNull(bVar);
        c3984gm.m19982a(activity, j2, c3378Il, c3854bm, Collections.singletonList(new C3352Hk(c3452Lk, c3291f9, false, interfaceC4139ml, new C3352Hk.a())));
    }
}
