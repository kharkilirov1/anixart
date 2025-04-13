package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;

/* loaded from: classes.dex */
public interface LoadControl {
    /* renamed from: a */
    void mo5687a();

    /* renamed from: b */
    boolean mo5688b();

    /* renamed from: c */
    long mo5689c();

    /* renamed from: d */
    void mo5690d(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    /* renamed from: e */
    void mo5691e();

    /* renamed from: f */
    boolean mo5692f(long j2, float f2, boolean z, long j3);

    /* renamed from: g */
    boolean mo5693g(long j2, long j3, float f2);

    /* renamed from: h */
    Allocator mo5694h();

    /* renamed from: i */
    void mo5695i();
}
