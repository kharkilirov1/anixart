package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {

    /* renamed from: m */
    public final MetadataDecoderFactory f11989m;

    /* renamed from: n */
    public final MetadataOutput f11990n;

    /* renamed from: o */
    @Nullable
    public final Handler f11991o;

    /* renamed from: p */
    public final MetadataInputBuffer f11992p;

    /* renamed from: q */
    @Nullable
    public MetadataDecoder f11993q;

    /* renamed from: r */
    public boolean f11994r;

    /* renamed from: s */
    public boolean f11995s;

    /* renamed from: t */
    public long f11996t;

    /* renamed from: u */
    public long f11997u;

    /* renamed from: v */
    @Nullable
    public Metadata f11998v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper) {
        super(5);
        Handler handler;
        MetadataDecoderFactory metadataDecoderFactory = MetadataDecoderFactory.f11987a;
        Objects.requireNonNull(metadataOutput);
        this.f11990n = metadataOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i2 = Util.f14736a;
            handler = new Handler(looper, this);
        }
        this.f11991o = handler;
        this.f11989m = metadataDecoderFactory;
        this.f11992p = new MetadataInputBuffer();
        this.f11997u = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        this.f11998v = null;
        this.f11997u = -9223372036854775807L;
        this.f11993q = null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) {
        this.f11998v = null;
        this.f11997u = -9223372036854775807L;
        this.f11994r = false;
        this.f11995s = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: H */
    public void mo5657H(Format[] formatArr, long j2, long j3) {
        this.f11993q = this.f11989m.mo6703b(formatArr[0]);
    }

    /* renamed from: J */
    public final void m6704J(Metadata metadata, List<Metadata.Entry> list) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f11986b;
            if (i2 >= entryArr.length) {
                return;
            }
            Format mo6698Q = entryArr[i2].mo6698Q();
            if (mo6698Q == null || !this.f11989m.mo6702a(mo6698Q)) {
                list.add(metadata.f11986b[i2]);
            } else {
                MetadataDecoder mo6703b = this.f11989m.mo6703b(mo6698Q);
                byte[] mo6700s0 = metadata.f11986b[i2].mo6700s0();
                Objects.requireNonNull(mo6700s0);
                this.f11992p.mo6248l();
                this.f11992p.m6250n(mo6700s0.length);
                ByteBuffer byteBuffer = this.f11992p.f10605d;
                int i3 = Util.f14736a;
                byteBuffer.put(mo6700s0);
                this.f11992p.m6251o();
                Metadata mo6701a = mo6703b.mo6701a(this.f11992p);
                if (mo6701a != null) {
                    m6704J(mo6701a, list);
                }
            }
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public int mo5904a(Format format) {
        if (this.f11989m.mo6702a(format)) {
            return (format.f9646F == 0 ? 4 : 2) | 0 | 0;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return this.f11995s;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f11990n.onMetadata((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: p */
    public void mo5938p(long j2, long j3) {
        boolean z = true;
        while (z) {
            if (!this.f11994r && this.f11998v == null) {
                this.f11992p.mo6248l();
                FormatHolder m5678z = m5678z();
                int m5658I = m5658I(m5678z, this.f11992p, 0);
                if (m5658I == -4) {
                    if (this.f11992p.m6242j()) {
                        this.f11994r = true;
                    } else {
                        MetadataInputBuffer metadataInputBuffer = this.f11992p;
                        metadataInputBuffer.f11988j = this.f11996t;
                        metadataInputBuffer.m6251o();
                        MetadataDecoder metadataDecoder = this.f11993q;
                        int i2 = Util.f14736a;
                        Metadata mo6701a = metadataDecoder.mo6701a(this.f11992p);
                        if (mo6701a != null) {
                            ArrayList arrayList = new ArrayList(mo6701a.f11986b.length);
                            m6704J(mo6701a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f11998v = new Metadata(arrayList);
                                this.f11997u = this.f11992p.f10607f;
                            }
                        }
                    }
                } else if (m5658I == -5) {
                    Format format = m5678z.f9704b;
                    Objects.requireNonNull(format);
                    this.f11996t = format.f9663q;
                }
            }
            Metadata metadata = this.f11998v;
            if (metadata == null || this.f11997u > j2) {
                z = false;
            } else {
                Handler handler = this.f11991o;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    this.f11990n.onMetadata(metadata);
                }
                this.f11998v = null;
                this.f11997u = -9223372036854775807L;
                z = true;
            }
            if (this.f11994r && this.f11998v == null) {
                this.f11995s = true;
            }
        }
    }
}
