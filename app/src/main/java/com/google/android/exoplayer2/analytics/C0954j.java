package com.google.android.exoplayer2.analytics;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.drm.C0999e;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.p008ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.p008ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.p008ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.p008ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.p008ts.PsExtractor;
import com.google.android.exoplayer2.extractor.p008ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.HlsExtractorFactory;
import com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor;
import com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.analytics.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0954j implements ListenerSet.IterationFinishedEvent, Bundleable.Creator, Consumer, DrmSessionManager.DrmSessionReference, ExtractorsFactory, Id3Decoder.FramePredicate, ChunkExtractor.Factory, HlsExtractorFactory, HlsPlaylistTracker.Factory {

    /* renamed from: c */
    public static final /* synthetic */ C0954j f10210c = new C0954j(0);

    /* renamed from: d */
    public static final /* synthetic */ C0954j f10211d = new C0954j(5);

    /* renamed from: e */
    public static final /* synthetic */ C0954j f10212e = new C0954j(6);

    /* renamed from: f */
    public static final /* synthetic */ C0954j f10213f = new C0954j(8);

    /* renamed from: g */
    public static final /* synthetic */ C0954j f10214g = new C0954j(9);

    /* renamed from: h */
    public static final /* synthetic */ C0954j f10215h = new C0954j(11);

    /* renamed from: i */
    public static final /* synthetic */ C0954j f10216i = new C0954j(12);

    /* renamed from: j */
    public static final /* synthetic */ C0954j f10217j = new C0954j(14);

    /* renamed from: k */
    public static final /* synthetic */ C0954j f10218k = new C0954j(15);

    /* renamed from: l */
    public static final /* synthetic */ C0954j f10219l = new C0954j(16);

    /* renamed from: m */
    public static final /* synthetic */ C0954j f10220m = new C0954j(17);

    /* renamed from: n */
    public static final /* synthetic */ C0954j f10221n = new C0954j(18);

    /* renamed from: o */
    public static final /* synthetic */ C0954j f10222o = new C0954j(19);

    /* renamed from: p */
    public static final /* synthetic */ C0954j f10223p = new C0954j(20);

    /* renamed from: q */
    public static final /* synthetic */ C0954j f10224q = new C0954j(21);

    /* renamed from: r */
    public static final /* synthetic */ C0954j f10225r = new C0954j(22);

    /* renamed from: s */
    public static final /* synthetic */ C0954j f10226s = new C0954j(23);

    /* renamed from: t */
    public static final /* synthetic */ C0954j f10227t = new C0954j(24);

    /* renamed from: u */
    public static final /* synthetic */ C0954j f10228u = new C0954j(25);

    /* renamed from: v */
    public static final /* synthetic */ C0954j f10229v = new C0954j(26);

    /* renamed from: w */
    public static final /* synthetic */ C0954j f10230w = new C0954j(27);

    /* renamed from: x */
    public static final /* synthetic */ C0954j f10231x = new C0954j(28);

    /* renamed from: y */
    public static final /* synthetic */ C0954j f10232y = new C0954j(29);

    /* renamed from: b */
    public final /* synthetic */ int f10233b;

    public /* synthetic */ C0954j(int i2) {
        this.f10233b = i2;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    /* renamed from: a */
    public HlsMediaChunkExtractor mo6096a(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) {
        return MediaParserHlsMediaChunkExtractor.m7124g(uri, format, list, timestampAdjuster, map, extractorInput);
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        switch (this.f10233b) {
            case 2:
                ((DrmSessionEventListener.EventDispatcher) obj).m6302c();
                break;
            case 3:
                ((DrmSessionEventListener.EventDispatcher) obj).m6301b();
                break;
            default:
                ((DrmSessionEventListener.EventDispatcher) obj).m6303d();
                break;
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.Factory
    /* renamed from: b */
    public HlsPlaylistTracker mo6097b(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    /* renamed from: c */
    public Extractor[] mo6098c(Uri uri, Map map) {
        switch (this.f10233b) {
        }
        return m6100f();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
    /* renamed from: d */
    public boolean mo6099d(int i2, int i3, int i4, int i5, int i6) {
        switch (this.f10233b) {
            case 12:
                Id3Decoder.FramePredicate framePredicate = Mp3Extractor.f11125u;
                if (i3 != 67 || i4 != 79 || i5 != 77 || (i6 != 77 && i2 != 2)) {
                    if (i3 == 77 && i4 == 76 && i5 == 76) {
                        if (i6 == 84 || i2 == 2) {
                        }
                    }
                }
                break;
            default:
                Id3Decoder.FramePredicate framePredicate2 = Id3Decoder.f12056b;
                break;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    /* renamed from: e */
    public void mo5568e(Object obj, FlagSet flagSet) {
    }

    /* renamed from: f */
    public Extractor[] m6100f() {
        switch (this.f10233b) {
            case 6:
                return new Extractor[0];
            case 7:
                return new Extractor[]{new AmrExtractor(0)};
            case 8:
                return new Extractor[]{new FlacExtractor(0)};
            case 9:
                return new Extractor[]{new FlvExtractor()};
            case 10:
                return new Extractor[]{new MatroskaExtractor(0)};
            case 11:
                return new Extractor[]{new Mp3Extractor(0, -9223372036854775807L)};
            case 12:
            default:
                return new Extractor[]{new WavExtractor()};
            case 13:
                return new Extractor[]{new FragmentedMp4Extractor(0, null, null, Collections.emptyList(), null)};
            case 14:
                return new Extractor[]{new Mp4Extractor(0)};
            case 15:
                return new Extractor[]{new OggExtractor()};
            case 16:
                return new Extractor[]{new Ac3Extractor()};
            case 17:
                return new Extractor[]{new Ac4Extractor()};
            case 18:
                return new Extractor[]{new AdtsExtractor(0)};
            case 19:
                return new Extractor[]{new PsExtractor()};
            case 20:
                return new Extractor[]{new TsExtractor(1, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), 112800)};
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        AdPlaybackState.AdGroup[] adGroupArr;
        switch (this.f10233b) {
            case 1:
                AudioAttributes audioAttributes = AudioAttributes.f10284g;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                if (bundle.containsKey(AudioAttributes.m6107c(0))) {
                    builder.f10290a = bundle.getInt(AudioAttributes.m6107c(0));
                }
                if (bundle.containsKey(AudioAttributes.m6107c(1))) {
                    builder.f10291b = bundle.getInt(AudioAttributes.m6107c(1));
                }
                if (bundle.containsKey(AudioAttributes.m6107c(2))) {
                    builder.f10292c = bundle.getInt(AudioAttributes.m6107c(2));
                }
                if (bundle.containsKey(AudioAttributes.m6107c(3))) {
                    builder.f10293d = bundle.getInt(AudioAttributes.m6107c(3));
                }
                return new AudioAttributes(builder.f10290a, builder.f10291b, builder.f10292c, builder.f10293d, null);
            case 23:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(AdPlaybackState.m6924f(1));
                if (parcelableArrayList == null) {
                    adGroupArr = new AdPlaybackState.AdGroup[0];
                } else {
                    AdPlaybackState.AdGroup[] adGroupArr2 = new AdPlaybackState.AdGroup[parcelableArrayList.size()];
                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                        adGroupArr2[i2] = (AdPlaybackState.AdGroup) ((C0954j) AdPlaybackState.AdGroup.f12608i).fromBundle((Bundle) parcelableArrayList.get(i2));
                    }
                    adGroupArr = adGroupArr2;
                }
                return new AdPlaybackState(null, adGroupArr, bundle.getLong(AdPlaybackState.m6924f(2), 0L), bundle.getLong(AdPlaybackState.m6924f(3), -9223372036854775807L), bundle.getInt(AdPlaybackState.m6924f(4)));
            case 24:
                long j2 = bundle.getLong(AdPlaybackState.AdGroup.m6935f(0));
                int i3 = bundle.getInt(AdPlaybackState.AdGroup.m6935f(1), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(AdPlaybackState.AdGroup.m6935f(2));
                int[] intArray = bundle.getIntArray(AdPlaybackState.AdGroup.m6935f(3));
                long[] longArray = bundle.getLongArray(AdPlaybackState.AdGroup.m6935f(4));
                long j3 = bundle.getLong(AdPlaybackState.AdGroup.m6935f(5));
                boolean z = bundle.getBoolean(AdPlaybackState.AdGroup.m6935f(6));
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new AdPlaybackState.AdGroup(j2, i3, intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j3, z);
            default:
                Cue cue = Cue.f13435s;
                Cue.Builder builder2 = new Cue.Builder();
                CharSequence charSequence = bundle.getCharSequence(Cue.m7176c(0));
                if (charSequence != null) {
                    builder2.f13454a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Cue.m7176c(1));
                if (alignment != null) {
                    builder2.f13456c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Cue.m7176c(2));
                if (alignment2 != null) {
                    builder2.f13457d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Cue.m7176c(3));
                if (bitmap != null) {
                    builder2.f13455b = bitmap;
                }
                if (bundle.containsKey(Cue.m7176c(4)) && bundle.containsKey(Cue.m7176c(5))) {
                    float f2 = bundle.getFloat(Cue.m7176c(4));
                    int i4 = bundle.getInt(Cue.m7176c(5));
                    builder2.f13458e = f2;
                    builder2.f13459f = i4;
                }
                if (bundle.containsKey(Cue.m7176c(6))) {
                    builder2.f13460g = bundle.getInt(Cue.m7176c(6));
                }
                if (bundle.containsKey(Cue.m7176c(7))) {
                    builder2.f13461h = bundle.getFloat(Cue.m7176c(7));
                }
                if (bundle.containsKey(Cue.m7176c(8))) {
                    builder2.f13462i = bundle.getInt(Cue.m7176c(8));
                }
                if (bundle.containsKey(Cue.m7176c(10)) && bundle.containsKey(Cue.m7176c(9))) {
                    float f3 = bundle.getFloat(Cue.m7176c(10));
                    int i5 = bundle.getInt(Cue.m7176c(9));
                    builder2.f13464k = f3;
                    builder2.f13463j = i5;
                }
                if (bundle.containsKey(Cue.m7176c(11))) {
                    builder2.f13465l = bundle.getFloat(Cue.m7176c(11));
                }
                if (bundle.containsKey(Cue.m7176c(12))) {
                    builder2.f13466m = bundle.getFloat(Cue.m7176c(12));
                }
                if (bundle.containsKey(Cue.m7176c(13))) {
                    builder2.f13468o = bundle.getInt(Cue.m7176c(13));
                    builder2.f13467n = true;
                }
                if (!bundle.getBoolean(Cue.m7176c(14), false)) {
                    builder2.f13467n = false;
                }
                if (bundle.containsKey(Cue.m7176c(15))) {
                    builder2.f13469p = bundle.getInt(Cue.m7176c(15));
                }
                if (bundle.containsKey(Cue.m7176c(16))) {
                    builder2.f13470q = bundle.getFloat(Cue.m7176c(16));
                }
                return builder2.m7178a();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        int i2 = C0999e.f10757a;
    }
}
