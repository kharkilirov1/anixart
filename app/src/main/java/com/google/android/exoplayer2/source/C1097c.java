package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.text.SubtitleDecoderFactory;
import com.google.android.exoplayer2.text.SubtitleExtractor;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1097c implements ExtractorsFactory, ProgressiveMediaExtractor.Factory, DrmSessionManagerProvider {

    /* renamed from: b */
    public final /* synthetic */ Object f12670b;

    public /* synthetic */ C1097c(Object obj) {
        this.f12670b = obj;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    /* renamed from: a */
    public ProgressiveMediaExtractor mo6849a() {
        return new BundledExtractorsAdapter((ExtractorsFactory) this.f12670b);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    /* renamed from: b */
    public DrmSessionManager mo2562b(MediaItem mediaItem) {
        return (DrmSessionManager) this.f12670b;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    /* renamed from: c */
    public Extractor[] mo6098c(Uri uri, Map map) {
        return m6955d();
    }

    /* renamed from: d */
    public Extractor[] m6955d() {
        Format format = (Format) this.f12670b;
        Extractor[] extractorArr = new Extractor[1];
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.f13481a;
        extractorArr[0] = subtitleDecoderFactory.mo7186a(format) ? new SubtitleExtractor(subtitleDecoderFactory.mo7187b(format), format) : new DefaultMediaSourceFactory.UnknownSubtitlesExtractor(format);
        return extractorArr;
    }
}
