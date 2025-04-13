package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.jpeg.JpegExtractor;
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
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {

    /* renamed from: b */
    public static final int[] f10838b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c */
    public static final FlacExtensionLoader f10839c = new FlacExtensionLoader();

    public static final class FlacExtensionLoader {

        /* renamed from: a */
        public final AtomicBoolean f10840a = new AtomicBoolean(false);

        /* renamed from: b */
        @Nullable
        @GuardedBy
        public Constructor<? extends Extractor> f10841b;
    }

    /* renamed from: a */
    public final void m6391a(int i2, List<Extractor> list) {
        Extractor extractor;
        Constructor<? extends Extractor> constructor;
        switch (i2) {
            case 0:
                list.add(new Ac3Extractor());
                return;
            case 1:
                list.add(new Ac4Extractor());
                return;
            case 2:
                list.add(new AdtsExtractor(0));
                return;
            case 3:
                list.add(new AmrExtractor(0));
                return;
            case 4:
                FlacExtensionLoader flacExtensionLoader = f10839c;
                synchronized (flacExtensionLoader.f10840a) {
                    extractor = null;
                    if (flacExtensionLoader.f10840a.get()) {
                        constructor = flacExtensionLoader.f10841b;
                    } else {
                        try {
                            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                                flacExtensionLoader.f10841b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
                            }
                        } catch (ClassNotFoundException unused) {
                        } catch (Exception e2) {
                            throw new RuntimeException("Error instantiating FLAC extension", e2);
                        }
                        flacExtensionLoader.f10840a.set(true);
                        constructor = flacExtensionLoader.f10841b;
                    }
                }
                if (constructor != null) {
                    try {
                        extractor = constructor.newInstance(0);
                    } catch (Exception e3) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e3);
                    }
                }
                if (extractor != null) {
                    list.add(extractor);
                    return;
                } else {
                    list.add(new FlacExtractor(0));
                    return;
                }
            case 5:
                list.add(new FlvExtractor());
                return;
            case 6:
                list.add(new MatroskaExtractor(0));
                return;
            case 7:
                list.add(new Mp3Extractor(0, -9223372036854775807L));
                return;
            case 8:
                list.add(new FragmentedMp4Extractor(0, null, null, Collections.emptyList(), null));
                list.add(new Mp4Extractor(0));
                return;
            case 9:
                list.add(new OggExtractor());
                return;
            case 10:
                list.add(new PsExtractor());
                return;
            case 11:
                list.add(new TsExtractor(1, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), 112800));
                return;
            case 12:
                list.add(new WavExtractor());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new JpegExtractor());
                return;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    /* renamed from: c */
    public synchronized Extractor[] mo6098c(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int m7547b = FileTypes.m7547b(map);
        if (m7547b != -1) {
            m6391a(m7547b, arrayList);
        }
        int m7548c = FileTypes.m7548c(uri);
        if (m7548c != -1 && m7548c != m7547b) {
            m6391a(m7548c, arrayList);
        }
        for (int i2 : f10838b) {
            if (i2 != m7547b && i2 != m7548c) {
                m6391a(i2, arrayList);
            }
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }
}
