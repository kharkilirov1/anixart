package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.s */
/* loaded from: classes3.dex */
final class C5720s {

    /* renamed from: a */
    @NonNull
    private final nv0 f54462a = new nv0();

    /* renamed from: b */
    @NonNull
    private final jq0 f54463b = new jq0();

    /* renamed from: c */
    @NonNull
    private final qy0<PlaybackControlsContainer> f54464c = new qy0<>();

    @NonNull
    /* renamed from: a */
    public final rk0 m28033a(@NonNull Context context, @NonNull qe1 qe1Var, @LayoutRes int i2) {
        Objects.requireNonNull(this.f54464c);
        PlaybackControlsContainer playbackControlsContainer = (PlaybackControlsContainer) qy0.m27797a(context, PlaybackControlsContainer.class, i2, null);
        lv0 m26959a = this.f54462a.m26959a(context);
        rk0 rk0Var = new rk0(context, m26959a, playbackControlsContainer);
        if (playbackControlsContainer != null) {
            Objects.requireNonNull(this.f54463b);
            CheckBox checkBox = (CheckBox) playbackControlsContainer.findViewById(C4632R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setChecked(qe1Var.m27711a());
            }
            playbackControlsContainer.setVisibility(8);
            rk0Var.addView(playbackControlsContainer);
        }
        m26959a.setVisibility(8);
        rk0Var.addView(m26959a);
        return rk0Var;
    }
}
