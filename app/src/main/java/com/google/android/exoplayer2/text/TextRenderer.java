package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {

    /* renamed from: A */
    public long f13496A;

    /* renamed from: m */
    @Nullable
    public final Handler f13497m;

    /* renamed from: n */
    public final TextOutput f13498n;

    /* renamed from: o */
    public final SubtitleDecoderFactory f13499o;

    /* renamed from: p */
    public final FormatHolder f13500p;

    /* renamed from: q */
    public boolean f13501q;

    /* renamed from: r */
    public boolean f13502r;

    /* renamed from: s */
    public boolean f13503s;

    /* renamed from: t */
    public int f13504t;

    /* renamed from: u */
    @Nullable
    public Format f13505u;

    /* renamed from: v */
    @Nullable
    public SubtitleDecoder f13506v;

    /* renamed from: w */
    @Nullable
    public SubtitleInputBuffer f13507w;

    /* renamed from: x */
    @Nullable
    public SubtitleOutputBuffer f13508x;

    /* renamed from: y */
    @Nullable
    public SubtitleOutputBuffer f13509y;

    /* renamed from: z */
    public int f13510z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRenderer(TextOutput textOutput, @Nullable Looper looper) {
        super(3);
        Handler handler;
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.f13481a;
        Objects.requireNonNull(textOutput);
        this.f13498n = textOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i2 = Util.f14736a;
            handler = new Handler(looper, this);
        }
        this.f13497m = handler;
        this.f13499o = subtitleDecoderFactory;
        this.f13500p = new FormatHolder();
        this.f13496A = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        this.f13505u = null;
        this.f13496A = -9223372036854775807L;
        m7191J();
        m7194M();
        SubtitleDecoder subtitleDecoder = this.f13506v;
        Objects.requireNonNull(subtitleDecoder);
        subtitleDecoder.release();
        this.f13506v = null;
        this.f13504t = 0;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) {
        m7191J();
        this.f13501q = false;
        this.f13502r = false;
        this.f13496A = -9223372036854775807L;
        if (this.f13504t != 0) {
            m7195N();
            return;
        }
        m7194M();
        SubtitleDecoder subtitleDecoder = this.f13506v;
        Objects.requireNonNull(subtitleDecoder);
        subtitleDecoder.flush();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: H */
    public void mo5657H(Format[] formatArr, long j2, long j3) {
        Format format = formatArr[0];
        this.f13505u = format;
        if (this.f13506v != null) {
            this.f13504t = 1;
            return;
        }
        this.f13503s = true;
        SubtitleDecoderFactory subtitleDecoderFactory = this.f13499o;
        Objects.requireNonNull(format);
        this.f13506v = subtitleDecoderFactory.mo7187b(format);
    }

    /* renamed from: J */
    public final void m7191J() {
        List<Cue> emptyList = Collections.emptyList();
        Handler handler = this.f13497m;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f13498n.onCues(emptyList);
        }
    }

    /* renamed from: K */
    public final long m7192K() {
        if (this.f13510z == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.f13508x);
        if (this.f13510z >= this.f13508x.mo7184d()) {
            return Long.MAX_VALUE;
        }
        return this.f13508x.mo7182b(this.f13510z);
    }

    /* renamed from: L */
    public final void m7193L(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.f13505u);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        Log.m7585b("TextRenderer", sb.toString(), subtitleDecoderException);
        m7191J();
        m7195N();
    }

    /* renamed from: M */
    public final void m7194M() {
        this.f13507w = null;
        this.f13510z = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.f13508x;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.mo6253l();
            this.f13508x = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.f13509y;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.mo6253l();
            this.f13509y = null;
        }
    }

    /* renamed from: N */
    public final void m7195N() {
        m7194M();
        SubtitleDecoder subtitleDecoder = this.f13506v;
        Objects.requireNonNull(subtitleDecoder);
        subtitleDecoder.release();
        this.f13506v = null;
        this.f13504t = 0;
        this.f13503s = true;
        SubtitleDecoderFactory subtitleDecoderFactory = this.f13499o;
        Format format = this.f13505u;
        Objects.requireNonNull(format);
        this.f13506v = subtitleDecoderFactory.mo7187b(format);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public int mo5904a(Format format) {
        if (this.f13499o.mo7186a(format)) {
            return (format.f9646F == 0 ? 4 : 2) | 0 | 0;
        }
        return MimeTypes.m7606n(format.f9659m) ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return this.f13502r;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f13498n.onCues((List) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: p */
    public void mo5938p(long j2, long j3) {
        boolean z;
        if (this.f9452k) {
            long j4 = this.f13496A;
            if (j4 != -9223372036854775807L && j2 >= j4) {
                m7194M();
                this.f13502r = true;
            }
        }
        if (this.f13502r) {
            return;
        }
        if (this.f13509y == null) {
            SubtitleDecoder subtitleDecoder = this.f13506v;
            Objects.requireNonNull(subtitleDecoder);
            subtitleDecoder.mo7180a(j2);
            try {
                SubtitleDecoder subtitleDecoder2 = this.f13506v;
                Objects.requireNonNull(subtitleDecoder2);
                this.f13509y = subtitleDecoder2.mo6245b();
            } catch (SubtitleDecoderException e2) {
                m7193L(e2);
                return;
            }
        }
        if (this.f9447f != 2) {
            return;
        }
        if (this.f13508x != null) {
            long m7192K = m7192K();
            z = false;
            while (m7192K <= j2) {
                this.f13510z++;
                m7192K = m7192K();
                z = true;
            }
        } else {
            z = false;
        }
        SubtitleOutputBuffer subtitleOutputBuffer = this.f13509y;
        if (subtitleOutputBuffer != null) {
            if (subtitleOutputBuffer.m6242j()) {
                if (!z && m7192K() == Long.MAX_VALUE) {
                    if (this.f13504t == 2) {
                        m7195N();
                    } else {
                        m7194M();
                        this.f13502r = true;
                    }
                }
            } else if (subtitleOutputBuffer.f10611c <= j2) {
                SubtitleOutputBuffer subtitleOutputBuffer2 = this.f13508x;
                if (subtitleOutputBuffer2 != null) {
                    subtitleOutputBuffer2.mo6253l();
                }
                Subtitle subtitle = subtitleOutputBuffer.f13494e;
                Objects.requireNonNull(subtitle);
                this.f13510z = subtitle.mo7181a(j2 - subtitleOutputBuffer.f13495f);
                this.f13508x = subtitleOutputBuffer;
                this.f13509y = null;
                z = true;
            }
        }
        if (z) {
            Objects.requireNonNull(this.f13508x);
            SubtitleOutputBuffer subtitleOutputBuffer3 = this.f13508x;
            Subtitle subtitle2 = subtitleOutputBuffer3.f13494e;
            Objects.requireNonNull(subtitle2);
            List<Cue> mo7183c = subtitle2.mo7183c(j2 - subtitleOutputBuffer3.f13495f);
            Handler handler = this.f13497m;
            if (handler != null) {
                handler.obtainMessage(0, mo7183c).sendToTarget();
            } else {
                this.f13498n.onCues(mo7183c);
            }
        }
        if (this.f13504t == 2) {
            return;
        }
        while (!this.f13501q) {
            try {
                SubtitleInputBuffer subtitleInputBuffer = this.f13507w;
                if (subtitleInputBuffer == null) {
                    SubtitleDecoder subtitleDecoder3 = this.f13506v;
                    Objects.requireNonNull(subtitleDecoder3);
                    subtitleInputBuffer = subtitleDecoder3.mo6246c();
                    if (subtitleInputBuffer == null) {
                        return;
                    } else {
                        this.f13507w = subtitleInputBuffer;
                    }
                }
                if (this.f13504t == 1) {
                    subtitleInputBuffer.f10580b = 4;
                    SubtitleDecoder subtitleDecoder4 = this.f13506v;
                    Objects.requireNonNull(subtitleDecoder4);
                    subtitleDecoder4.mo6247d(subtitleInputBuffer);
                    this.f13507w = null;
                    this.f13504t = 2;
                    return;
                }
                int m5658I = m5658I(this.f13500p, subtitleInputBuffer, 0);
                if (m5658I == -4) {
                    if (subtitleInputBuffer.m6242j()) {
                        this.f13501q = true;
                        this.f13503s = false;
                    } else {
                        Format format = this.f13500p.f9704b;
                        if (format == null) {
                            return;
                        }
                        subtitleInputBuffer.f13493j = format.f9663q;
                        subtitleInputBuffer.m6251o();
                        this.f13503s &= !subtitleInputBuffer.m6243k();
                    }
                    if (!this.f13503s) {
                        SubtitleDecoder subtitleDecoder5 = this.f13506v;
                        Objects.requireNonNull(subtitleDecoder5);
                        subtitleDecoder5.mo6247d(subtitleInputBuffer);
                        this.f13507w = null;
                    }
                } else if (m5658I == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e3) {
                m7193L(e3);
                return;
            }
        }
    }
}
