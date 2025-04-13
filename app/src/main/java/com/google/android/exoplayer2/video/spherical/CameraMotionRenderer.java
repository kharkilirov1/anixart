package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class CameraMotionRenderer extends BaseRenderer {

    /* renamed from: m */
    public final DecoderInputBuffer f14916m;

    /* renamed from: n */
    public final ParsableByteArray f14917n;

    /* renamed from: o */
    public long f14918o;

    /* renamed from: p */
    @Nullable
    public CameraMotionListener f14919p;

    /* renamed from: q */
    public long f14920q;

    public CameraMotionRenderer() {
        super(6);
        this.f14916m = new DecoderInputBuffer(1);
        this.f14917n = new ParsableByteArray();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        CameraMotionListener cameraMotionListener = this.f14919p;
        if (cameraMotionListener != null) {
            cameraMotionListener.mo5977d();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) {
        this.f14920q = Long.MIN_VALUE;
        CameraMotionListener cameraMotionListener = this.f14919p;
        if (cameraMotionListener != null) {
            cameraMotionListener.mo5977d();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: H */
    public void mo5657H(Format[] formatArr, long j2, long j3) {
        this.f14918o = j3;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public int mo5904a(Format format) {
        return "application/x-camera-motion".equals(format.f9659m) ? 4 : 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return mo5662h();
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: p */
    public void mo5938p(long j2, long j3) {
        float[] fArr;
        while (!mo5662h() && this.f14920q < 100000 + j2) {
            this.f14916m.mo6248l();
            if (m5658I(m5678z(), this.f14916m, 0) != -4 || this.f14916m.m6242j()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f14916m;
            this.f14920q = decoderInputBuffer.f10607f;
            if (this.f14919p != null && !decoderInputBuffer.m6241i()) {
                this.f14916m.m6251o();
                ByteBuffer byteBuffer = this.f14916m.f10605d;
                int i2 = Util.f14736a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f14917n.m7633D(byteBuffer.array(), byteBuffer.limit());
                    this.f14917n.m7635F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i3 = 0; i3 < 3; i3++) {
                        fArr2[i3] = Float.intBitsToFloat(this.f14917n.m7644h());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f14919p.mo5976a(this.f14920q - this.f14918o, fArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    /* renamed from: q */
    public void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException {
        if (i2 == 8) {
            this.f14919p = (CameraMotionListener) obj;
        }
    }
}
