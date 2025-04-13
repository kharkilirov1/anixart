package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* loaded from: classes.dex */
public interface DrmSessionManager {

    /* renamed from: a */
    public static final DrmSessionManager f10723a = new DrmSessionManager() { // from class: com.google.android.exoplayer2.drm.DrmSessionManager.1
        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        /* renamed from: a */
        public DrmSessionReference mo6285a(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            return DrmSessionReference.f10724v1;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        @Nullable
        /* renamed from: b */
        public DrmSession mo6286b(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            if (format.f9662p == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        /* renamed from: c */
        public int mo6287c(Format format) {
            return format.f9662p != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void prepare() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void release() {
        }
    };

    public interface DrmSessionReference {

        /* renamed from: v1 */
        public static final DrmSessionReference f10724v1 = C0954j.f10211d;

        void release();
    }

    /* renamed from: a */
    DrmSessionReference mo6285a(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    @Nullable
    /* renamed from: b */
    DrmSession mo6286b(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    /* renamed from: c */
    int mo6287c(Format format);

    void prepare();

    void release();
}
