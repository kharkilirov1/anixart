package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;

@Deprecated
/* loaded from: classes.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {

    /* renamed from: a */
    public final Context f14428a;

    /* renamed from: b */
    @Nullable
    public final TransferListener f14429b;

    /* renamed from: c */
    public final DataSource.Factory f14430c;

    public DefaultDataSourceFactory(Context context, @Nullable TransferListener transferListener, DataSource.Factory factory) {
        this.f14428a = context.getApplicationContext();
        this.f14429b = transferListener;
        this.f14430c = factory;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    /* renamed from: a */
    public DataSource mo6355a() {
        DefaultDataSource defaultDataSource = new DefaultDataSource(this.f14428a, this.f14430c.mo6355a());
        TransferListener transferListener = this.f14429b;
        if (transferListener != null) {
            defaultDataSource.mo6818c(transferListener);
        }
        return defaultDataSource;
    }
}
