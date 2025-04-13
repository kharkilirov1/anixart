package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class df1 implements id1 {

    /* renamed from: a */
    @NonNull
    private final zf1 f49645a;

    /* renamed from: b */
    @NonNull
    private final C4910c9 f49646b = new C4910c9();

    /* renamed from: c */
    @NonNull
    private final C5032el f49647c = new C5032el();

    public df1(@NonNull zf1 zf1Var) {
        this.f49645a = zf1Var;
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        sl0 m23881b = this.f49645a.m23881b();
        if (m23881b != null) {
            PlaybackControlsContainer m27939a = m23881b.m28319a().m27939a();
            ProgressBar progressBar = m27939a != null ? (ProgressBar) m27939a.findViewById(C4632R.id.video_progress_control) : null;
            if (progressBar != null) {
                Objects.requireNonNull(this.f49646b);
                C4910c9.m23077a(progressBar, j2, j3);
            }
            PlaybackControlsContainer m27939a2 = m23881b.m28319a().m27939a();
            TextView textView = m27939a2 != null ? (TextView) m27939a2.findViewById(C4632R.id.video_count_down_control) : null;
            if (textView != null) {
                this.f49647c.m24190a(textView, j2, j3);
            }
        }
    }
}
