package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.mediacodec.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1032a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ int f11974a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f11975b;

    /* renamed from: c */
    public final /* synthetic */ Object f11976c;

    public /* synthetic */ C1032a(Object obj, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i2) {
        this.f11974a = i2;
        this.f11976c = obj;
        this.f11975b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        switch (this.f11974a) {
            case 0:
                AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = (AsynchronousMediaCodecAdapter) this.f11976c;
                MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener = this.f11975b;
                Objects.requireNonNull(asynchronousMediaCodecAdapter);
                onFrameRenderedListener.mo6637a(asynchronousMediaCodecAdapter, j2, j3);
                break;
            default:
                SynchronousMediaCodecAdapter synchronousMediaCodecAdapter = (SynchronousMediaCodecAdapter) this.f11976c;
                MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener2 = this.f11975b;
                Objects.requireNonNull(synchronousMediaCodecAdapter);
                onFrameRenderedListener2.mo6637a(synchronousMediaCodecAdapter, j2, j3);
                break;
        }
    }
}
