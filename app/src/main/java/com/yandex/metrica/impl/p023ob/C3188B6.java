package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.B6 */
/* loaded from: classes2.dex */
class C3188B6 {

    /* renamed from: a */
    @NonNull
    private String f42612a;

    /* renamed from: b */
    @NonNull
    private C3366I9 f42613b;

    /* renamed from: c */
    @NonNull
    private C3163A6 f42614c;

    public C3188B6(@NonNull Context context) {
        this(context.getPackageName(), C3532P0.m18696i().m18718u(), new C3163A6());
    }

    @NonNull
    /* renamed from: a */
    public Bundle m17892a() {
        Bundle bundle = new Bundle();
        C3163A6 c3163a6 = this.f42614c;
        String str = this.f42612a;
        boolean m18295f = this.f42613b.m18295f();
        Objects.requireNonNull(c3163a6);
        bundle.putString("package_name", str);
        bundle.putBoolean("clte", m18295f);
        return bundle;
    }

    @VisibleForTesting
    public C3188B6(@NonNull String str, @NonNull C3366I9 c3366i9, @NonNull C3163A6 c3163a6) {
        this.f42612a = str;
        this.f42613b = c3366i9;
        this.f42614c = c3163a6;
    }
}
