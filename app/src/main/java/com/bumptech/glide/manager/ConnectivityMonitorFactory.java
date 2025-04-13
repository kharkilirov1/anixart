package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.ConnectivityMonitor;

/* loaded from: classes.dex */
public interface ConnectivityMonitorFactory {
    @NonNull
    /* renamed from: a */
    ConnectivityMonitor mo5222a(@NonNull Context context, @NonNull ConnectivityMonitor.ConnectivityListener connectivityListener);
}
