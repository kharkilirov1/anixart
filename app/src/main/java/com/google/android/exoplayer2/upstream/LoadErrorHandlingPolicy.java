package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface LoadErrorHandlingPolicy {

    public static final class FallbackOptions {

        /* renamed from: a */
        public final int f14464a;

        /* renamed from: b */
        public final int f14465b;

        /* renamed from: c */
        public final int f14466c;

        /* renamed from: d */
        public final int f14467d;

        public FallbackOptions(int i2, int i3, int i4, int i5) {
            this.f14464a = i2;
            this.f14465b = i3;
            this.f14466c = i4;
            this.f14467d = i5;
        }

        /* renamed from: a */
        public boolean m7468a(int i2) {
            if (i2 == 1) {
                if (this.f14464a - this.f14465b <= 1) {
                    return false;
                }
            } else if (this.f14466c - this.f14467d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class FallbackSelection {

        /* renamed from: a */
        public final int f14468a;

        /* renamed from: b */
        public final long f14469b;

        public FallbackSelection(int i2, long j2) {
            Assertions.m7513a(j2 >= 0);
            this.f14468a = i2;
            this.f14469b = j2;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    public static final class LoadErrorInfo {

        /* renamed from: a */
        public final IOException f14470a;

        /* renamed from: b */
        public final int f14471b;

        public LoadErrorInfo(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, int i2) {
            this.f14470a = iOException;
            this.f14471b = i2;
        }
    }

    /* renamed from: a */
    long mo7457a(LoadErrorInfo loadErrorInfo);

    @Nullable
    /* renamed from: b */
    FallbackSelection mo7458b(FallbackOptions fallbackOptions, LoadErrorInfo loadErrorInfo);

    /* renamed from: c */
    void mo7459c(long j2);

    /* renamed from: d */
    int mo7460d(int i2);
}
