package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3718Wc;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.zd */
/* loaded from: classes2.dex */
class C4469zd extends AbstractC3884d0 {

    /* renamed from: b */
    @NonNull
    private C3190B8 f47111b;

    /* renamed from: c */
    @NonNull
    private C3219Cc f47112c;

    /* renamed from: d */
    @NonNull
    private C3504Nm f47113d;

    /* renamed from: e */
    @NonNull
    private final C3456M f47114e;

    /* renamed from: f */
    @NonNull
    private final C3256E f47115f;

    public C4469zd(@Nullable AbstractC3884d0 abstractC3884d0, @NonNull C3190B8 c3190b8, @NonNull C3219Cc c3219Cc, @NonNull C3504Nm c3504Nm, @NonNull C3456M c3456m, @NonNull C3256E c3256e) {
        super(abstractC3884d0);
        this.f47111b = c3190b8;
        this.f47112c = c3219Cc;
        this.f47113d = c3504Nm;
        this.f47114e = c3456m;
        this.f47115f = c3256e;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3884d0
    /* renamed from: b */
    public void mo18099b(@Nullable Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            C3718Wc.a m19354a = C3718Wc.a.m19354a(this.f47115f.m17992c());
            Objects.requireNonNull(this.f47113d);
            long currentTimeMillis = System.currentTimeMillis();
            Objects.requireNonNull(this.f47113d);
            C4209pd c4209pd = new C4209pd(m19354a, currentTimeMillis, SystemClock.elapsedRealtime(), location, this.f47114e.m18535b(), null);
            String m17933a = this.f47112c.m17933a(c4209pd);
            if (TextUtils.isEmpty(m17933a)) {
                return;
            }
            this.f47111b.m20646a(c4209pd.m20548e(), m17933a);
        }
    }
}
