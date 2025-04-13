package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityRecyclerPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"epoxy-adapter_release"}, m31885k = 2, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ActivityRecyclerPoolKt {
    /* renamed from: a */
    public static final boolean m4474a(@Nullable Context context) {
        Context baseContext;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return true;
            }
            return activity.isDestroyed();
        }
        if (!(context instanceof ContextWrapper)) {
            context = null;
        }
        ContextWrapper contextWrapper = (ContextWrapper) context;
        if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return false;
        }
        return m4474a(baseContext);
    }
}
