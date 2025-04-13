package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: c */
    public static final /* synthetic */ int f14354c = 0;

    /* renamed from: b */
    public final int f14355b;

    public DataSourceException(int i2) {
        this.f14355b = i2;
    }

    public DataSourceException(@Nullable Throwable th, int i2) {
        super(th);
        this.f14355b = i2;
    }

    public DataSourceException(@Nullable String str, int i2) {
        super(str);
        this.f14355b = i2;
    }

    public DataSourceException(@Nullable String str, @Nullable Throwable th, int i2) {
        super(str, th);
        this.f14355b = i2;
    }
}
