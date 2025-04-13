package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Fk */
/* loaded from: classes2.dex */
class C3302Fk implements InterfaceC4243ql {

    /* renamed from: a */
    @Nullable
    private final Bundle f42926a;

    public C3302Fk(@NonNull Context context) {
        this(context, new C3729Wn());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4243ql
    @Nullable
    /* renamed from: a */
    public Bundle mo17980a(@NonNull Activity activity) {
        return this.f42926a;
    }

    @VisibleForTesting
    public C3302Fk(@NonNull Context context, @NonNull C3729Wn c3729Wn) {
        ApplicationInfo m19371a = c3729Wn.m19371a(context, context.getPackageName(), 128);
        if (m19371a != null) {
            this.f42926a = m19371a.metaData;
        } else {
            this.f42926a = null;
        }
    }
}
