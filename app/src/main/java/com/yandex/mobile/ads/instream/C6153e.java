package com.yandex.mobile.ads.instream;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.cr0;
import com.yandex.mobile.ads.impl.nf1;
import com.yandex.mobile.ads.impl.ze1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;

/* renamed from: com.yandex.mobile.ads.instream.e */
/* loaded from: classes3.dex */
public final class C6153e implements cr0 {

    /* renamed from: a */
    @NonNull
    private final VideoPlayer f57449a;

    /* renamed from: b */
    @NonNull
    private final nf1 f57450b = new nf1();

    /* renamed from: c */
    @NonNull
    private final ze1 f57451c = new ze1();

    public C6153e(@NonNull VideoPlayer videoPlayer) {
        this.f57449a = videoPlayer;
    }

    /* renamed from: a */
    public final nf1 m30392a() {
        return this.f57450b;
    }

    /* renamed from: b */
    public final long m30394b() {
        return this.f57449a.getVideoDuration();
    }

    /* renamed from: c */
    public final long m30395c() {
        return this.f57449a.getVideoPosition();
    }

    /* renamed from: d */
    public final void m30396d() {
        this.f57449a.pauseVideo();
    }

    /* renamed from: e */
    public final void m30397e() {
        this.f57449a.prepareVideo();
    }

    /* renamed from: f */
    public final void m30398f() {
        this.f57449a.resumeVideo();
    }

    /* renamed from: g */
    public final void m30399g() {
        this.f57449a.setVideoPlayerListener(this.f57451c);
    }

    @Override // com.yandex.mobile.ads.impl.cr0
    public final float getVolume() {
        return this.f57449a.getVolume();
    }

    /* renamed from: h */
    public final void m30400h() {
        this.f57449a.setVideoPlayerListener(null);
        this.f57451c.m30163a();
    }

    /* renamed from: a */
    public final void m30393a(@NonNull C6152d c6152d) {
        this.f57451c.m30164a(c6152d);
    }
}
