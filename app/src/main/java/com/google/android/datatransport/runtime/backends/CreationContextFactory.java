package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;

/* loaded from: classes.dex */
class CreationContextFactory {

    /* renamed from: a */
    public final Context f9190a;

    /* renamed from: b */
    public final Clock f9191b;

    /* renamed from: c */
    public final Clock f9192c;

    @Inject
    public CreationContextFactory(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
        this.f9190a = context;
        this.f9191b = clock;
        this.f9192c = clock2;
    }
}
