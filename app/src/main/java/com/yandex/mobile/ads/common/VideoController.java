package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ke1;

@MainThread
/* loaded from: classes2.dex */
public final class VideoController {

    /* renamed from: a */
    @NonNull
    private final ke1 f47798a;

    public VideoController(@NonNull ke1 ke1Var) {
        this.f47798a = ke1Var;
    }

    public void setVideoEventListener(@Nullable VideoEventListener videoEventListener) {
        this.f47798a.m26116a(videoEventListener);
    }
}
