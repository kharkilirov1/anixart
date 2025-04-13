package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

@SuppressLint
/* loaded from: classes3.dex */
public final class rk0 extends FrameLayout {

    /* renamed from: a */
    @NonNull
    private final lv0 f54335a;

    /* renamed from: b */
    @Nullable
    private final PlaybackControlsContainer f54336b;

    public rk0(@NonNull Context context, @NonNull lv0 lv0Var, @Nullable PlaybackControlsContainer playbackControlsContainer) {
        super(context);
        this.f54335a = lv0Var;
        this.f54336b = playbackControlsContainer;
    }

    @Nullable
    /* renamed from: a */
    public final PlaybackControlsContainer m27939a() {
        return this.f54336b;
    }

    @NonNull
    /* renamed from: b */
    public final lv0 m27940b() {
        return this.f54335a;
    }
}
