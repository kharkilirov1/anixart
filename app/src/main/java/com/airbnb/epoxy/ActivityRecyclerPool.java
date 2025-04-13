package com.airbnb.epoxy;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityRecyclerPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/ActivityRecyclerPool;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ActivityRecyclerPool {

    /* renamed from: a */
    public final ArrayList<PoolReference> f6842a = new ArrayList<>(5);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Lifecycle m4473a(Context context) {
        if (context instanceof LifecycleOwner) {
            return ((LifecycleOwner) context).getLifecycle();
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.m32178g(baseContext, "baseContext");
        return m4473a(baseContext);
    }
}
