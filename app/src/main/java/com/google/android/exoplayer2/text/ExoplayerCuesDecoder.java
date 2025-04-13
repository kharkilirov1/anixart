package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ExoplayerCuesDecoder implements SubtitleDecoder {

    /* renamed from: a */
    public final CueDecoder f13471a = new CueDecoder();

    /* renamed from: b */
    public final SubtitleInputBuffer f13472b = new SubtitleInputBuffer();

    /* renamed from: c */
    public final Deque<SubtitleOutputBuffer> f13473c = new ArrayDeque();

    /* renamed from: d */
    public int f13474d;

    /* renamed from: e */
    public boolean f13475e;

    public static final class SingleEventSubtitle implements Subtitle {

        /* renamed from: b */
        public final long f13477b;

        /* renamed from: c */
        public final ImmutableList<Cue> f13478c;

        public SingleEventSubtitle(long j2, ImmutableList<Cue> immutableList) {
            this.f13477b = j2;
            this.f13478c = immutableList;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        /* renamed from: a */
        public int mo7181a(long j2) {
            return this.f13477b > j2 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        /* renamed from: b */
        public long mo7182b(int i2) {
            Assertions.m7513a(i2 == 0);
            return this.f13477b;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        /* renamed from: c */
        public List<Cue> mo7183c(long j2) {
            return j2 >= this.f13477b ? this.f13478c : ImmutableList.m11627D();
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        /* renamed from: d */
        public int mo7184d() {
            return 1;
        }
    }

    public ExoplayerCuesDecoder() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f13473c.addFirst(new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.ExoplayerCuesDecoder.1
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
                /* renamed from: l */
                public void mo6253l() {
                    ExoplayerCuesDecoder exoplayerCuesDecoder = ExoplayerCuesDecoder.this;
                    Assertions.m7516d(exoplayerCuesDecoder.f13473c.size() < 2);
                    Assertions.m7513a(!exoplayerCuesDecoder.f13473c.contains(this));
                    m7189m();
                    exoplayerCuesDecoder.f13473c.addFirst(this);
                }
            });
        }
        this.f13474d = 0;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    /* renamed from: a */
    public void mo7180a(long j2) {
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: b */
    public SubtitleOutputBuffer mo6245b() throws DecoderException {
        Assertions.m7516d(!this.f13475e);
        if (this.f13474d != 2 || this.f13473c.isEmpty()) {
            return null;
        }
        SubtitleOutputBuffer removeFirst = this.f13473c.removeFirst();
        if (this.f13472b.m6242j()) {
            removeFirst.m6238e(4);
        } else {
            SubtitleInputBuffer subtitleInputBuffer = this.f13472b;
            long j2 = subtitleInputBuffer.f10607f;
            CueDecoder cueDecoder = this.f13471a;
            ByteBuffer byteBuffer = subtitleInputBuffer.f10605d;
            Objects.requireNonNull(byteBuffer);
            byte[] array = byteBuffer.array();
            Objects.requireNonNull(cueDecoder);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            Objects.requireNonNull(parcelableArrayList);
            removeFirst.m7190n(this.f13472b.f10607f, new SingleEventSubtitle(j2, BundleableUtil.m7522a(Cue.f13436t, parcelableArrayList)), 0L);
        }
        this.f13472b.mo6248l();
        this.f13474d = 0;
        return removeFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: c */
    public SubtitleInputBuffer mo6246c() throws DecoderException {
        Assertions.m7516d(!this.f13475e);
        if (this.f13474d != 0) {
            return null;
        }
        this.f13474d = 1;
        return this.f13472b;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    /* renamed from: d */
    public void mo6247d(SubtitleInputBuffer subtitleInputBuffer) throws DecoderException {
        SubtitleInputBuffer subtitleInputBuffer2 = subtitleInputBuffer;
        Assertions.m7516d(!this.f13475e);
        Assertions.m7516d(this.f13474d == 1);
        Assertions.m7513a(this.f13472b == subtitleInputBuffer2);
        this.f13474d = 2;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        Assertions.m7516d(!this.f13475e);
        this.f13472b.mo6248l();
        this.f13474d = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
        this.f13475e = true;
    }
}
