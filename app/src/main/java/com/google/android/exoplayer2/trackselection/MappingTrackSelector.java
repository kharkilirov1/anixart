package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class MappingTrackSelector extends TrackSelector {

    /* renamed from: c */
    @Nullable
    public MappedTrackInfo f13960c;

    public static final class MappedTrackInfo {

        /* renamed from: a */
        public final int f13961a;

        /* renamed from: b */
        public final String[] f13962b;

        /* renamed from: c */
        public final int[] f13963c;

        /* renamed from: d */
        public final TrackGroupArray[] f13964d;

        /* renamed from: e */
        public final int[] f13965e;

        /* renamed from: f */
        public final int[][][] f13966f;

        /* renamed from: g */
        public final TrackGroupArray f13967g;

        @VisibleForTesting
        public MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f13962b = strArr;
            this.f13963c = iArr;
            this.f13964d = trackGroupArrayArr;
            this.f13966f = iArr3;
            this.f13965e = iArr2;
            this.f13967g = trackGroupArray;
            this.f13961a = iArr.length;
        }

        /* renamed from: a */
        public int m7327a(int i2, int i3, int i4) {
            return this.f13966f[i2][i3][i4] & 7;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    /* renamed from: a */
    public final void mo7325a(@Nullable Object obj) {
        this.f13960c = (MappedTrackInfo) obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    /* renamed from: b */
    public final TrackSelectorResult mo7326b(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        int[] iArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int[] iArr2 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr3 = new int[rendererCapabilitiesArr.length + 1][][];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = trackGroupArray2.f12594b;
            trackGroupArr[i3] = new TrackGroup[i4];
            iArr3[i3] = new int[i4][];
        }
        int length2 = rendererCapabilitiesArr.length;
        int[] iArr4 = new int[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            iArr4[i5] = rendererCapabilitiesArr[i5].mo5668o();
        }
        int i6 = 0;
        while (i6 < trackGroupArray2.f12594b) {
            TrackGroup trackGroup = trackGroupArray2.f12595c[i6];
            boolean z = MimeTypes.m7601i(trackGroup.f12590c[i2].f9659m) == 5;
            int length3 = rendererCapabilitiesArr.length;
            int i7 = 0;
            int i8 = 0;
            boolean z2 = true;
            while (i7 < rendererCapabilitiesArr.length) {
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i7];
                int i9 = 0;
                while (i2 < trackGroup.f12589b) {
                    i9 = Math.max(i9, rendererCapabilities.mo5904a(trackGroup.f12590c[i2]) & 7);
                    i2++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (i9 > i8 || (i9 == i8 && z && !z2 && z3)) {
                    z2 = z3;
                    i8 = i9;
                    length3 = i7;
                }
                i7++;
                i2 = 0;
            }
            if (length3 == rendererCapabilitiesArr.length) {
                iArr = new int[trackGroup.f12589b];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr5 = new int[trackGroup.f12589b];
                for (int i10 = 0; i10 < trackGroup.f12589b; i10++) {
                    iArr5[i10] = rendererCapabilities2.mo5904a(trackGroup.f12590c[i10]);
                }
                iArr = iArr5;
            }
            int i11 = iArr2[length3];
            trackGroupArr[length3][i11] = trackGroup;
            iArr3[length3][i11] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
            i6++;
            trackGroupArray2 = trackGroupArray;
            i2 = 0;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr6 = new int[rendererCapabilitiesArr.length];
        for (int i12 = 0; i12 < rendererCapabilitiesArr.length; i12++) {
            int i13 = iArr2[i12];
            trackGroupArrayArr[i12] = new TrackGroupArray((TrackGroup[]) Util.m7719R(trackGroupArr[i12], i13));
            iArr3[i12] = (int[][]) Util.m7719R(iArr3[i12], i13);
            strArr[i12] = rendererCapabilitiesArr[i12].getName();
            iArr6[i12] = rendererCapabilitiesArr[i12].mo5661g();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr6, trackGroupArrayArr, iArr4, iArr3, new TrackGroupArray((TrackGroup[]) Util.m7719R(trackGroupArr[rendererCapabilitiesArr.length], iArr2[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> mo7312c = mo7312c(mappedTrackInfo, iArr3, iArr4, mediaPeriodId, timeline);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) mo7312c.second;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i14 = 0; i14 < mappedTrackInfo.f13961a; i14++) {
            TrackGroupArray trackGroupArray3 = mappedTrackInfo.f13964d[i14];
            TrackSelection trackSelection = trackSelectionArr[i14];
            for (int i15 = 0; i15 < trackGroupArray3.f12594b; i15++) {
                TrackGroup trackGroup2 = trackGroupArray3.f12595c[i15];
                int i16 = trackGroup2.f12589b;
                int[] iArr7 = new int[i16];
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 < trackGroup2.f12589b; i17++) {
                    iArr7[i17] = mappedTrackInfo.m7327a(i14, i15, i17);
                    zArr[i17] = (trackSelection == null || trackSelection.mo7294a() != trackGroup2 || trackSelection.mo7306u(i17) == -1) ? false : true;
                }
                builder.m11640d(new TracksInfo.TrackGroupInfo(trackGroup2, iArr7, mappedTrackInfo.f13963c[i14], zArr));
            }
        }
        TrackGroupArray trackGroupArray4 = mappedTrackInfo.f13967g;
        for (int i18 = 0; i18 < trackGroupArray4.f12594b; i18++) {
            TrackGroup trackGroup3 = trackGroupArray4.f12595c[i18];
            int[] iArr8 = new int[trackGroup3.f12589b];
            Arrays.fill(iArr8, 0);
            builder.m11640d(new TracksInfo.TrackGroupInfo(trackGroup3, iArr8, MimeTypes.m7601i(trackGroup3.f12590c[0].f9659m), new boolean[trackGroup3.f12589b]));
        }
        return new TrackSelectorResult((RendererConfiguration[]) mo7312c.first, (ExoTrackSelection[]) mo7312c.second, new TracksInfo(builder.m11641e()), mappedTrackInfo);
    }

    /* renamed from: c */
    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> mo7312c(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException;
}
