package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DrmUtil {

    @RequiresApi
    public static final class Api18 {
        @DoNotInline
        /* renamed from: a */
        public static boolean m6309a(@Nullable Throwable th) {
            return th instanceof DeniedByServerException;
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m6310b(@Nullable Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    @RequiresApi
    public static final class Api21 {
        @DoNotInline
        /* renamed from: a */
        public static boolean m6311a(@Nullable Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @DoNotInline
        /* renamed from: b */
        public static int m6312b(Throwable th) {
            String[] split;
            int length;
            String diagnosticInfo = ((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo();
            int i2 = Util.f14736a;
            int i3 = 0;
            if (diagnosticInfo != null && (length = (split = diagnosticInfo.split("_", -1)).length) >= 2) {
                String str = split[length - 1];
                boolean z = length >= 3 && "neg".equals(split[length - 2]);
                try {
                    Objects.requireNonNull(str);
                    i3 = Integer.parseInt(str);
                    if (z) {
                        i3 = -i3;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return Util.m7754w(i3);
        }
    }

    @RequiresApi
    public static final class Api23 {
        @DoNotInline
        /* renamed from: a */
        public static boolean m6313a(@Nullable Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }
}
