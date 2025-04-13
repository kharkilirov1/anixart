package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* renamed from: b */
        public final int f10717b;

        public DrmSessionException(Throwable th, int i2) {
            super(th);
            this.f10717b = i2;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* renamed from: a */
    void mo6262a(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher);

    /* renamed from: b */
    void mo6263b(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher);

    /* renamed from: c */
    UUID mo6264c();

    /* renamed from: d */
    boolean mo6265d();

    /* renamed from: e */
    boolean mo6266e(String str);

    @Nullable
    /* renamed from: f */
    DrmSessionException mo6267f();

    @Nullable
    /* renamed from: g */
    CryptoConfig mo6268g();

    int getState();
}
