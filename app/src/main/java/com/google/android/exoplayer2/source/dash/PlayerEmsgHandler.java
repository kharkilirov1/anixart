package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class PlayerEmsgHandler implements Handler.Callback {

    /* renamed from: b */
    public final Allocator f12898b;

    /* renamed from: c */
    public final PlayerEmsgCallback f12899c;

    /* renamed from: g */
    public DashManifest f12903g;

    /* renamed from: h */
    public long f12904h;

    /* renamed from: i */
    public boolean f12905i;

    /* renamed from: j */
    public boolean f12906j;

    /* renamed from: k */
    public boolean f12907k;

    /* renamed from: f */
    public final TreeMap<Long, Long> f12902f = new TreeMap<>();

    /* renamed from: e */
    public final Handler f12901e = Util.m7745n(this);

    /* renamed from: d */
    public final EventMessageDecoder f12900d = new EventMessageDecoder();

    public static final class ManifestExpiryEventInfo {

        /* renamed from: a */
        public final long f12908a;

        /* renamed from: b */
        public final long f12909b;

        public ManifestExpiryEventInfo(long j2, long j3) {
            this.f12908a = j2;
            this.f12909b = j3;
        }
    }

    public interface PlayerEmsgCallback {
        /* renamed from: a */
        void mo7009a();

        /* renamed from: b */
        void mo7010b(long j2);
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {

        /* renamed from: a */
        public final SampleQueue f12910a;

        /* renamed from: b */
        public final FormatHolder f12911b = new FormatHolder();

        /* renamed from: c */
        public final MetadataInputBuffer f12912c = new MetadataInputBuffer();

        /* renamed from: d */
        public long f12913d = -9223372036854775807L;

        public PlayerTrackEmsgHandler(Allocator allocator) {
            this.f12910a = new SampleQueue(allocator, null, null, null);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: a */
        public int mo6395a(DataReader dataReader, int i2, boolean z, int i3) throws IOException {
            SampleQueue sampleQueue = this.f12910a;
            Objects.requireNonNull(sampleQueue);
            return C1008a.m6434a(sampleQueue, dataReader, i2, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: b */
        public /* synthetic */ int mo6396b(DataReader dataReader, int i2, boolean z) {
            return C1008a.m6434a(this, dataReader, i2, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: c */
        public /* synthetic */ void mo6397c(ParsableByteArray parsableByteArray, int i2) {
            C1008a.m6435b(this, parsableByteArray, i2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: d */
        public void mo6398d(long j2, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
            MetadataInputBuffer metadataInputBuffer;
            long j3;
            this.f12910a.mo6398d(j2, i2, i3, i4, cryptoData);
            while (true) {
                boolean z = false;
                if (!this.f12910a.m6905w(false)) {
                    this.f12910a.m6892j();
                    return;
                }
                this.f12912c.mo6248l();
                if (this.f12910a.m6882C(this.f12911b, this.f12912c, 0, false) == -4) {
                    this.f12912c.m6251o();
                    metadataInputBuffer = this.f12912c;
                } else {
                    metadataInputBuffer = null;
                }
                if (metadataInputBuffer != null) {
                    long j4 = metadataInputBuffer.f10607f;
                    Metadata mo6701a = PlayerEmsgHandler.this.f12900d.mo6701a(metadataInputBuffer);
                    if (mo6701a != null) {
                        EventMessage eventMessage = (EventMessage) mo6701a.f11986b[0];
                        String str = eventMessage.f12003b;
                        String str2 = eventMessage.f12004c;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            z = true;
                        }
                        if (z) {
                            try {
                                j3 = Util.m7720S(Util.m7748q(eventMessage.f12007f));
                            } catch (ParserException unused) {
                                j3 = -9223372036854775807L;
                            }
                            if (j3 != -9223372036854775807L) {
                                ManifestExpiryEventInfo manifestExpiryEventInfo = new ManifestExpiryEventInfo(j4, j3);
                                Handler handler = PlayerEmsgHandler.this.f12901e;
                                handler.sendMessage(handler.obtainMessage(1, manifestExpiryEventInfo));
                            }
                        }
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: e */
        public void mo6399e(Format format) {
            this.f12910a.mo6399e(format);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        /* renamed from: f */
        public void mo6400f(ParsableByteArray parsableByteArray, int i2, int i3) {
            SampleQueue sampleQueue = this.f12910a;
            Objects.requireNonNull(sampleQueue);
            C1008a.m6435b(sampleQueue, parsableByteArray, i2);
        }
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.f12903g = dashManifest;
        this.f12899c = playerEmsgCallback;
        this.f12898b = allocator;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f12907k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
        long j2 = manifestExpiryEventInfo.f12908a;
        long j3 = manifestExpiryEventInfo.f12909b;
        Long l2 = this.f12902f.get(Long.valueOf(j3));
        if (l2 == null) {
            this.f12902f.put(Long.valueOf(j3), Long.valueOf(j2));
        } else if (l2.longValue() > j2) {
            this.f12902f.put(Long.valueOf(j3), Long.valueOf(j2));
        }
        return true;
    }
}
