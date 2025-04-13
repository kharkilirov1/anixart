package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@WorkerThread
/* loaded from: classes.dex */
public interface zacs {
    /* renamed from: b */
    void mo8066b(ConnectionResult connectionResult);

    /* renamed from: c */
    void mo8067c(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set);
}
