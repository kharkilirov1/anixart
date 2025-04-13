package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {

    /* renamed from: n */
    public final String f13479n;

    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.f13479n = str;
        Assertions.m7516d(this.f10624g == this.f10622e.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f10622e) {
            decoderInputBuffer.m6250n(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        }
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    /* renamed from: a */
    public void mo7180a(long j2) {
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: e */
    public SubtitleOutputBuffer mo6255e() {
        return new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.SimpleSubtitleDecoder.1
            @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
            /* renamed from: l */
            public void mo6253l() {
                SimpleSubtitleDecoder simpleSubtitleDecoder = SimpleSubtitleDecoder.this;
                synchronized (simpleSubtitleDecoder.f10619b) {
                    m7189m();
                    O[] oArr = simpleSubtitleDecoder.f10623f;
                    int i2 = simpleSubtitleDecoder.f10625h;
                    simpleSubtitleDecoder.f10625h = i2 + 1;
                    oArr[i2] = this;
                    simpleSubtitleDecoder.m6259i();
                }
            }
        };
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    /* renamed from: f */
    public SubtitleDecoderException mo6256f(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // com.google.android.exoplayer2.decoder.SimpleDecoder
    @Nullable
    /* renamed from: g */
    public SubtitleDecoderException mo6257g(SubtitleInputBuffer subtitleInputBuffer, SubtitleOutputBuffer subtitleOutputBuffer, boolean z) {
        SubtitleInputBuffer subtitleInputBuffer2 = subtitleInputBuffer;
        SubtitleOutputBuffer subtitleOutputBuffer2 = subtitleOutputBuffer;
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer2.f10605d;
            Objects.requireNonNull(byteBuffer);
            subtitleOutputBuffer2.m7190n(subtitleInputBuffer2.f10607f, mo7185l(byteBuffer.array(), byteBuffer.limit(), z), subtitleInputBuffer2.f13493j);
            subtitleOutputBuffer2.f10580b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e2) {
            return e2;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final String getName() {
        return this.f13479n;
    }

    /* renamed from: l */
    public abstract Subtitle mo7185l(byte[] bArr, int i2, boolean z) throws SubtitleDecoderException;
}
