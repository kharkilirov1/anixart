package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.MediaSource;
import java.util.Objects;

@RequiresApi
/* loaded from: classes.dex */
public final class OfflineLicenseHelper {

    /* renamed from: a */
    public static final /* synthetic */ int f10746a = 0;

    /* renamed from: com.google.android.exoplayer2.drm.OfflineLicenseHelper$1 */
    class C09941 implements DrmSessionEventListener {
        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: C */
        public /* synthetic */ void mo5890C(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: D */
        public /* synthetic */ void mo5891D(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: H */
        public void mo5893H(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f10746a;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: i */
        public void mo5898i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            int i3 = OfflineLicenseHelper.f10746a;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: p */
        public void mo5900p(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f10746a;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: r */
        public /* synthetic */ void mo5901r(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: w */
        public void mo5902w(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            int i3 = OfflineLicenseHelper.f10746a;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f9690n = new DrmInitData(null, true, new DrmInitData.SchemeData[0]);
        builder.m5833a();
    }
}
