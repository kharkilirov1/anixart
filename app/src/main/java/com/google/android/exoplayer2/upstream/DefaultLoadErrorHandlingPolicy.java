package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {

    /* renamed from: a */
    public final int f14451a = -1;

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    /* renamed from: a */
    public long mo7457a(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        boolean z;
        Throwable th = loadErrorInfo.f14470a;
        if (!(th instanceof ParserException) && !(th instanceof FileNotFoundException) && !(th instanceof HttpDataSource.CleartextNotPermittedException) && !(th instanceof Loader.UnexpectedLoaderException)) {
            int i2 = DataSourceException.f14354c;
            while (true) {
                if (th == null) {
                    z = false;
                    break;
                }
                if ((th instanceof DataSourceException) && ((DataSourceException) th).f14355b == 2008) {
                    z = true;
                    break;
                }
                th = th.getCause();
            }
            if (!z) {
                return Math.min((loadErrorInfo.f14471b - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    @Nullable
    /* renamed from: b */
    public LoadErrorHandlingPolicy.FallbackSelection mo7458b(LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        int i2;
        IOException iOException = loadErrorInfo.f14470a;
        if (!((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i2 = ((HttpDataSource.InvalidResponseCodeException) iOException).f14458d) == 403 || i2 == 404 || i2 == 410 || i2 == 416 || i2 == 500 || i2 == 503))) {
            return null;
        }
        if (fallbackOptions.m7468a(1)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (fallbackOptions.m7468a(2)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    /* renamed from: c */
    public /* synthetic */ void mo7459c(long j2) {
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    /* renamed from: d */
    public int mo7460d(int i2) {
        int i3 = this.f14451a;
        return i3 == -1 ? i2 == 7 ? 6 : 3 : i3;
    }
}
