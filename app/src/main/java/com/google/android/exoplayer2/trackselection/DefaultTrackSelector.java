package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverrides;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.p038ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class DefaultTrackSelector extends MappingTrackSelector {

    /* renamed from: f */
    public static final int[] f13887f = new int[0];

    /* renamed from: g */
    public static final Ordering<Integer> f13888g = Ordering.m11854a(C1062a.f12093e);

    /* renamed from: h */
    public static final Ordering<Integer> f13889h = Ordering.m11854a(C1062a.f12094f);

    /* renamed from: d */
    public final ExoTrackSelection.Factory f13890d;

    /* renamed from: e */
    public final AtomicReference<Parameters> f13891e;

    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {

        /* renamed from: b */
        public final boolean f13892b;

        /* renamed from: c */
        @Nullable
        public final String f13893c;

        /* renamed from: d */
        public final Parameters f13894d;

        /* renamed from: e */
        public final boolean f13895e;

        /* renamed from: f */
        public final int f13896f;

        /* renamed from: g */
        public final int f13897g;

        /* renamed from: h */
        public final int f13898h;

        /* renamed from: i */
        public final int f13899i;

        /* renamed from: j */
        public final int f13900j;

        /* renamed from: k */
        public final boolean f13901k;

        /* renamed from: l */
        public final int f13902l;

        /* renamed from: m */
        public final int f13903m;

        /* renamed from: n */
        public final int f13904n;

        /* renamed from: o */
        public final int f13905o;

        public AudioTrackScore(Format format, Parameters parameters, int i2) {
            int i3;
            int i4;
            String[] strArr;
            int i5;
            this.f13894d = parameters;
            this.f13893c = DefaultTrackSelector.m7311i(format.f9650d);
            int i6 = 0;
            this.f13895e = DefaultTrackSelector.m7309f(i2, false);
            int i7 = 0;
            while (true) {
                i3 = Integer.MAX_VALUE;
                if (i7 >= parameters.f13993n.size()) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                } else {
                    i4 = DefaultTrackSelector.m7307d(format, parameters.f13993n.get(i7), false);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f13897g = i7;
            this.f13896f = i4;
            this.f13898h = Integer.bitCount(format.f9652f & parameters.f13994o);
            this.f13901k = (format.f9651e & 1) != 0;
            int i8 = format.f9672z;
            this.f13902l = i8;
            this.f13903m = format.f9641A;
            int i9 = format.f9655i;
            this.f13904n = i9;
            this.f13892b = (i9 == -1 || i9 <= parameters.f13996q) && (i8 == -1 || i8 <= parameters.f13995p);
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i10 = Util.f14736a;
            if (i10 >= 24) {
                strArr = Util.m7725X(configuration.getLocales().toLanguageTags(), ",");
            } else {
                String[] strArr2 = new String[1];
                Locale locale = configuration.locale;
                strArr2[0] = i10 >= 21 ? locale.toLanguageTag() : locale.toString();
                strArr = strArr2;
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                strArr[i11] = Util.m7718Q(strArr[i11]);
            }
            int i12 = 0;
            while (true) {
                if (i12 >= strArr.length) {
                    i12 = Integer.MAX_VALUE;
                    i5 = 0;
                    break;
                } else {
                    i5 = DefaultTrackSelector.m7307d(format, strArr[i12], false);
                    if (i5 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f13899i = i12;
            this.f13900j = i5;
            while (true) {
                if (i6 >= parameters.f13997r.size()) {
                    break;
                }
                String str = format.f9659m;
                if (str != null && str.equals(parameters.f13997r.get(i6))) {
                    i3 = i6;
                    break;
                }
                i6++;
            }
            this.f13905o = i3;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(AudioTrackScore audioTrackScore) {
            Object mo11416h = (this.f13892b && this.f13895e) ? DefaultTrackSelector.f13888g : DefaultTrackSelector.f13888g.mo11416h();
            ComparisonChain mo11482d = ComparisonChain.f20928a.mo11483e(this.f13895e, audioTrackScore.f13895e).mo11482d(Integer.valueOf(this.f13897g), Integer.valueOf(audioTrackScore.f13897g), Ordering.m11855d().mo11416h()).mo11479a(this.f13896f, audioTrackScore.f13896f).mo11479a(this.f13898h, audioTrackScore.f13898h).mo11483e(this.f13892b, audioTrackScore.f13892b).mo11482d(Integer.valueOf(this.f13905o), Integer.valueOf(audioTrackScore.f13905o), Ordering.m11855d().mo11416h()).mo11482d(Integer.valueOf(this.f13904n), Integer.valueOf(audioTrackScore.f13904n), this.f13894d.f14001v ? DefaultTrackSelector.f13888g.mo11416h() : DefaultTrackSelector.f13889h).mo11483e(this.f13901k, audioTrackScore.f13901k).mo11482d(Integer.valueOf(this.f13899i), Integer.valueOf(audioTrackScore.f13899i), Ordering.m11855d().mo11416h()).mo11479a(this.f13900j, audioTrackScore.f13900j).mo11482d(Integer.valueOf(this.f13902l), Integer.valueOf(audioTrackScore.f13902l), mo11416h).mo11482d(Integer.valueOf(this.f13903m), Integer.valueOf(audioTrackScore.f13903m), mo11416h);
            Integer valueOf = Integer.valueOf(this.f13904n);
            Integer valueOf2 = Integer.valueOf(audioTrackScore.f13904n);
            if (!Util.m7728a(this.f13893c, audioTrackScore.f13893c)) {
                mo11416h = DefaultTrackSelector.f13889h;
            }
            return mo11482d.mo11482d(valueOf, valueOf2, mo11416h).mo11485g();
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {

        /* renamed from: b */
        public final boolean f13906b;

        /* renamed from: c */
        public final boolean f13907c;

        public OtherTrackScore(Format format, int i2) {
            this.f13906b = (format.f9651e & 1) != 0;
            this.f13907c = DefaultTrackSelector.m7309f(i2, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(OtherTrackScore otherTrackScore) {
            return ComparisonChain.f20928a.mo11483e(this.f13907c, otherTrackScore.f13907c).mo11483e(this.f13906b, otherTrackScore.f13906b).mo11485g();
        }
    }

    public static final class Parameters extends TrackSelectionParameters {

        /* renamed from: N */
        public static final Parameters f13908N = new ParametersBuilder().m7320f();

        /* renamed from: A */
        public final int f13909A;

        /* renamed from: B */
        public final boolean f13910B;

        /* renamed from: C */
        public final boolean f13911C;

        /* renamed from: D */
        public final boolean f13912D;

        /* renamed from: E */
        public final boolean f13913E;

        /* renamed from: F */
        public final boolean f13914F;

        /* renamed from: G */
        public final boolean f13915G;

        /* renamed from: H */
        public final boolean f13916H;

        /* renamed from: I */
        public final boolean f13917I;

        /* renamed from: J */
        public final boolean f13918J;

        /* renamed from: K */
        public final boolean f13919K;

        /* renamed from: L */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f13920L;

        /* renamed from: M */
        public final SparseBooleanArray f13921M;

        public Parameters(ParametersBuilder parametersBuilder, C11341 c11341) {
            super(parametersBuilder);
            this.f13910B = parametersBuilder.f13933y;
            this.f13911C = parametersBuilder.f13934z;
            this.f13912D = parametersBuilder.f13922A;
            this.f13913E = parametersBuilder.f13923B;
            this.f13914F = parametersBuilder.f13924C;
            this.f13915G = parametersBuilder.f13925D;
            this.f13916H = parametersBuilder.f13926E;
            this.f13909A = parametersBuilder.f13927F;
            this.f13917I = parametersBuilder.f13928G;
            this.f13918J = parametersBuilder.f13929H;
            this.f13919K = parametersBuilder.f13930I;
            this.f13920L = parametersBuilder.f13931J;
            this.f13921M = parametersBuilder.f13932K;
        }

        /* renamed from: b */
        public static String m7316b(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle mo5679a = super.mo5679a();
            mo5679a.putBoolean(m7316b(1000), this.f13910B);
            mo5679a.putBoolean(m7316b(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), this.f13911C);
            mo5679a.putBoolean(m7316b(1002), this.f13912D);
            mo5679a.putBoolean(m7316b(1003), this.f13913E);
            mo5679a.putBoolean(m7316b(1004), this.f13914F);
            mo5679a.putBoolean(m7316b(WebSocketProtocol.CLOSE_NO_STATUS_CODE), this.f13915G);
            mo5679a.putBoolean(m7316b(1006), this.f13916H);
            mo5679a.putInt(m7316b(1007), this.f13909A);
            mo5679a.putBoolean(m7316b(1008), this.f13917I);
            mo5679a.putBoolean(m7316b(1009), this.f13918J);
            mo5679a.putBoolean(m7316b(1010), this.f13919K);
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = this.f13920L;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int keyAt = sparseArray.keyAt(i2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i2).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                mo5679a.putIntArray(m7316b(1011), Ints.m12085g(arrayList));
                mo5679a.putParcelableArrayList(m7316b(1012), BundleableUtil.m7525d(arrayList2));
                String m7316b = m7316b(1013);
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray2.size());
                for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                    sparseArray3.put(sparseArray2.keyAt(i3), ((Bundleable) sparseArray2.valueAt(i3)).mo5679a());
                }
                mo5679a.putSparseParcelableArray(m7316b, sparseArray3);
            }
            String m7316b2 = m7316b(1014);
            SparseBooleanArray sparseBooleanArray = this.f13921M;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
                iArr[i4] = sparseBooleanArray.keyAt(i4);
            }
            mo5679a.putIntArray(m7316b2, iArr);
            return mo5679a;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00e7 A[LOOP:0: B:43:0x0090->B:61:0x00e7, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x008d A[SYNTHETIC] */
        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(@androidx.annotation.Nullable java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.equals(java.lang.Object):boolean");
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13910B ? 1 : 0)) * 31) + (this.f13911C ? 1 : 0)) * 31) + (this.f13912D ? 1 : 0)) * 31) + (this.f13913E ? 1 : 0)) * 31) + (this.f13914F ? 1 : 0)) * 31) + (this.f13915G ? 1 : 0)) * 31) + (this.f13916H ? 1 : 0)) * 31) + this.f13909A) * 31) + (this.f13917I ? 1 : 0)) * 31) + (this.f13918J ? 1 : 0)) * 31) + (this.f13919K ? 1 : 0);
        }
    }

    public static final class SelectionOverride implements Bundleable {

        /* renamed from: e */
        public static final Bundleable.Creator<SelectionOverride> f13935e = C1136a.f14036c;

        /* renamed from: b */
        public final int f13936b;

        /* renamed from: c */
        public final int[] f13937c;

        /* renamed from: d */
        public final int f13938d;

        public SelectionOverride(int i2, int[] iArr, int i3) {
            this.f13936b = i2;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13937c = copyOf;
            this.f13938d = i3;
            Arrays.sort(copyOf);
        }

        /* renamed from: b */
        public static String m7322b(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putInt(m7322b(0), this.f13936b);
            bundle.putIntArray(m7322b(1), this.f13937c);
            bundle.putInt(m7322b(2), this.f13938d);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.f13936b == selectionOverride.f13936b && Arrays.equals(this.f13937c, selectionOverride.f13937c) && this.f13938d == selectionOverride.f13938d;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f13937c) + (this.f13936b * 31)) * 31) + this.f13938d;
        }
    }

    public static final class TextTrackScore implements Comparable<TextTrackScore> {

        /* renamed from: b */
        public final boolean f13939b;

        /* renamed from: c */
        public final boolean f13940c;

        /* renamed from: d */
        public final boolean f13941d;

        /* renamed from: e */
        public final boolean f13942e;

        /* renamed from: f */
        public final int f13943f;

        /* renamed from: g */
        public final int f13944g;

        /* renamed from: h */
        public final int f13945h;

        /* renamed from: i */
        public final int f13946i;

        /* renamed from: j */
        public final boolean f13947j;

        public TextTrackScore(Format format, Parameters parameters, int i2, @Nullable String str) {
            int i3;
            boolean z = false;
            this.f13940c = DefaultTrackSelector.m7309f(i2, false);
            int i4 = format.f9651e & (~parameters.f13909A);
            this.f13941d = (i4 & 1) != 0;
            this.f13942e = (i4 & 2) != 0;
            int i5 = Integer.MAX_VALUE;
            ImmutableList<String> m11628E = parameters.f13998s.isEmpty() ? ImmutableList.m11628E("") : parameters.f13998s;
            int i6 = 0;
            while (true) {
                if (i6 >= m11628E.size()) {
                    i3 = 0;
                    break;
                }
                i3 = DefaultTrackSelector.m7307d(format, m11628E.get(i6), parameters.f14000u);
                if (i3 > 0) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
            this.f13943f = i5;
            this.f13944g = i3;
            int bitCount = Integer.bitCount(format.f9652f & parameters.f13999t);
            this.f13945h = bitCount;
            this.f13947j = (format.f9652f & 1088) != 0;
            int m7307d = DefaultTrackSelector.m7307d(format, str, DefaultTrackSelector.m7311i(str) == null);
            this.f13946i = m7307d;
            if (i3 > 0 || ((parameters.f13998s.isEmpty() && bitCount > 0) || this.f13941d || (this.f13942e && m7307d > 0))) {
                z = true;
            }
            this.f13939b = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(TextTrackScore textTrackScore) {
            ComparisonChain mo11479a = ComparisonChain.f20928a.mo11483e(this.f13940c, textTrackScore.f13940c).mo11482d(Integer.valueOf(this.f13943f), Integer.valueOf(textTrackScore.f13943f), Ordering.m11855d().mo11416h()).mo11479a(this.f13944g, textTrackScore.f13944g).mo11479a(this.f13945h, textTrackScore.f13945h).mo11483e(this.f13941d, textTrackScore.f13941d).mo11482d(Boolean.valueOf(this.f13942e), Boolean.valueOf(textTrackScore.f13942e), this.f13944g == 0 ? Ordering.m11855d() : Ordering.m11855d().mo11416h()).mo11479a(this.f13946i, textTrackScore.f13946i);
            if (this.f13945h == 0) {
                mo11479a = mo11479a.mo11484f(this.f13947j, textTrackScore.f13947j);
            }
            return mo11479a.mo11485g();
        }
    }

    public static final class VideoTrackScore implements Comparable<VideoTrackScore> {

        /* renamed from: b */
        public final boolean f13948b;

        /* renamed from: c */
        public final Parameters f13949c;

        /* renamed from: d */
        public final boolean f13950d;

        /* renamed from: e */
        public final boolean f13951e;

        /* renamed from: f */
        public final int f13952f;

        /* renamed from: g */
        public final int f13953g;

        /* renamed from: h */
        public final int f13954h;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        
            if (r10 < r8.f13987h) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        
            if (r10 < r8.f13988i) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0098 A[EDGE_INSN: B:58:0x0098->B:52:0x0098 BREAK  A[LOOP:0: B:44:0x007b->B:56:0x0095], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public VideoTrackScore(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f13949c = r8
                r0 = 0
                r1 = 1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f9664r
                if (r4 == r3) goto L14
                int r5 = r8.f13981b
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f9665s
                if (r4 == r3) goto L1c
                int r5 = r8.f13982c
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f9666t
                int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f13983d
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f9655i
                if (r4 == r3) goto L31
                int r5 = r8.f13984e
                if (r4 > r5) goto L33
            L31:
                r4 = 1
                goto L34
            L33:
                r4 = 0
            L34:
                r6.f13948b = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f9664r
                if (r10 == r3) goto L40
                int r4 = r8.f13985f
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f9665s
                if (r10 == r3) goto L48
                int r4 = r8.f13986g
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f9666t
                int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r2 == 0) goto L55
                int r2 = r8.f13987h
                float r2 = (float) r2
                int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f9655i
                if (r10 == r3) goto L5f
                int r2 = r8.f13988i
                if (r10 < r2) goto L5e
                goto L5f
            L5e:
                r1 = 0
            L5f:
                r6.f13950d = r1
                boolean r9 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m7309f(r9, r0)
                r6.f13951e = r9
                int r9 = r7.f9655i
                r6.f13952f = r9
                int r9 = r7.f9664r
                if (r9 == r3) goto L76
                int r10 = r7.f9665s
                if (r10 != r3) goto L74
                goto L76
            L74:
                int r3 = r9 * r10
            L76:
                r6.f13953g = r3
                r9 = 2147483647(0x7fffffff, float:NaN)
            L7b:
                com.google.common.collect.ImmutableList<java.lang.String> r10 = r8.f13992m
                int r10 = r10.size()
                if (r0 >= r10) goto L98
                java.lang.String r10 = r7.f9659m
                if (r10 == 0) goto L95
                com.google.common.collect.ImmutableList<java.lang.String> r1 = r8.f13992m
                java.lang.Object r1 = r1.get(r0)
                boolean r10 = r10.equals(r1)
                if (r10 == 0) goto L95
                r9 = r0
                goto L98
            L95:
                int r0 = r0 + 1
                goto L7b
            L98:
                r6.f13954h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackScore.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(VideoTrackScore videoTrackScore) {
            Object mo11416h = (this.f13948b && this.f13951e) ? DefaultTrackSelector.f13888g : DefaultTrackSelector.f13888g.mo11416h();
            return ComparisonChain.f20928a.mo11483e(this.f13951e, videoTrackScore.f13951e).mo11483e(this.f13948b, videoTrackScore.f13948b).mo11483e(this.f13950d, videoTrackScore.f13950d).mo11482d(Integer.valueOf(this.f13954h), Integer.valueOf(videoTrackScore.f13954h), Ordering.m11855d().mo11416h()).mo11482d(Integer.valueOf(this.f13952f), Integer.valueOf(videoTrackScore.f13952f), this.f13949c.f14001v ? DefaultTrackSelector.f13888g.mo11416h() : DefaultTrackSelector.f13889h).mo11482d(Integer.valueOf(this.f13953g), Integer.valueOf(videoTrackScore.f13953g), mo11416h).mo11482d(Integer.valueOf(this.f13952f), Integer.valueOf(videoTrackScore.f13952f), mo11416h).mo11485g();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        Parameters parameters = Parameters.f13908N;
        this.f13890d = new AdaptiveTrackSelection.Factory();
        this.f13891e = new AtomicReference<>(parameters);
    }

    /* renamed from: d */
    public static int m7307d(Format format, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f9650d)) {
            return 4;
        }
        String m7311i = m7311i(str);
        String m7311i2 = m7311i(format.f9650d);
        if (m7311i2 == null || m7311i == null) {
            return (z && m7311i2 == null) ? 1 : 0;
        }
        if (m7311i2.startsWith(m7311i) || m7311i.startsWith(m7311i2)) {
            return 3;
        }
        return m7311i2.split("-", 2)[0].equals(m7311i.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Integer> m7308e(com.google.android.exoplayer2.source.TrackGroup r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f12589b
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.f12589b
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto Laf
            if (r14 != r2) goto L20
            goto Laf
        L20:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L24:
            int r5 = r12.f12589b
            r6 = 1
            if (r3 >= r5) goto L80
            com.google.android.exoplayer2.Format[] r5 = r12.f12590c
            r5 = r5[r3]
            int r7 = r5.f9664r
            if (r7 <= 0) goto L7d
            int r8 = r5.f9665s
            if (r8 <= 0) goto L7d
            if (r15 == 0) goto L45
            if (r7 <= r8) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r13 <= r14) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 == r6) goto L45
            r6 = r13
            r9 = r14
            goto L47
        L45:
            r9 = r13
            r6 = r14
        L47:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L57
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.google.android.exoplayer2.util.Util.m7738g(r11, r7)
            r6.<init>(r9, r7)
            goto L61
        L57:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.google.android.exoplayer2.util.Util.m7738g(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L61:
            int r7 = r5.f9664r
            int r5 = r5.f9665s
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L7d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7d
            if (r8 >= r4) goto L7d
            r4 = r8
        L7d:
            int r3 = r3 + 1
            goto L24
        L80:
            if (r4 == r2) goto Laf
            int r13 = r0.size()
            int r13 = r13 - r6
        L87:
            if (r13 < 0) goto Laf
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.google.android.exoplayer2.Format[] r15 = r12.f12590c
            r14 = r15[r14]
            int r15 = r14.f9664r
            r1 = -1
            if (r15 == r1) goto La4
            int r14 = r14.f9665s
            if (r14 != r1) goto La1
            goto La4
        La1:
            int r15 = r15 * r14
            goto La5
        La4:
            r15 = -1
        La5:
            if (r15 == r1) goto La9
            if (r15 <= r4) goto Lac
        La9:
            r0.remove(r13)
        Lac:
            int r13 = r13 + (-1)
            goto L87
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m7308e(com.google.android.exoplayer2.source.TrackGroup, int, int, boolean):java.util.List");
    }

    /* renamed from: f */
    public static boolean m7309f(int i2, boolean z) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    /* renamed from: g */
    public static boolean m7310g(Format format, @Nullable String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        if ((format.f9652f & 16384) != 0 || !m7309f(i2, false) || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !Util.m7728a(format.f9659m, str)) {
            return false;
        }
        int i13 = format.f9664r;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        int i14 = format.f9665s;
        if (i14 != -1 && (i9 > i14 || i14 > i5)) {
            return false;
        }
        float f2 = format.f9666t;
        return (f2 == -1.0f || (((float) i10) <= f2 && f2 <= ((float) i6))) && (i12 = format.f9655i) != -1 && i11 <= i12 && i12 <= i7;
    }

    @Nullable
    /* renamed from: i */
    public static String m7311i(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x065e, code lost:
    
        if (r7 != 2) goto L343;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171 A[LOOP:1: B:20:0x0045->B:28:0x0171, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016b A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> mo7312c(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo r44, int[][][] r45, int[] r46, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r47, com.google.android.exoplayer2.Timeline r48) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 1723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.mo7312c(com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo, int[][][], int[], com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.Timeline):android.util.Pair");
    }

    /* renamed from: h */
    public final void m7313h(SparseArray<Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer>> sparseArray, @Nullable TrackSelectionOverrides.TrackSelectionOverride trackSelectionOverride, int i2) {
        if (trackSelectionOverride == null) {
            return;
        }
        int m7330b = trackSelectionOverride.m7330b();
        Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer> pair = sparseArray.get(m7330b);
        if (pair == null || ((TrackSelectionOverrides.TrackSelectionOverride) pair.first).f13979c.isEmpty()) {
            sparseArray.put(m7330b, Pair.create(trackSelectionOverride, Integer.valueOf(i2)));
        }
    }

    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {

        /* renamed from: A */
        public boolean f13922A;

        /* renamed from: B */
        public boolean f13923B;

        /* renamed from: C */
        public boolean f13924C;

        /* renamed from: D */
        public boolean f13925D;

        /* renamed from: E */
        public boolean f13926E;

        /* renamed from: F */
        public int f13927F;

        /* renamed from: G */
        public boolean f13928G;

        /* renamed from: H */
        public boolean f13929H;

        /* renamed from: I */
        public boolean f13930I;

        /* renamed from: J */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f13931J;

        /* renamed from: K */
        public final SparseBooleanArray f13932K;

        /* renamed from: y */
        public boolean f13933y;

        /* renamed from: z */
        public boolean f13934z;

        @Deprecated
        public ParametersBuilder() {
            this.f13931J = new SparseArray<>();
            this.f13932K = new SparseBooleanArray();
            m7321g();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        /* renamed from: c */
        public TrackSelectionParameters.Builder mo7317c(Context context) {
            super.mo7317c(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        /* renamed from: d */
        public TrackSelectionParameters.Builder mo7318d(int i2, int i3, boolean z) {
            this.f14013i = i2;
            this.f14014j = i3;
            this.f14015k = z;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        /* renamed from: e */
        public TrackSelectionParameters.Builder mo7319e(Context context, boolean z) {
            super.mo7319e(context, z);
            return this;
        }

        /* renamed from: f */
        public Parameters m7320f() {
            return new Parameters(this, null);
        }

        /* renamed from: g */
        public final void m7321g() {
            this.f13933y = true;
            this.f13934z = false;
            this.f13922A = true;
            this.f13923B = true;
            this.f13924C = false;
            this.f13925D = false;
            this.f13926E = false;
            this.f13927F = 0;
            this.f13928G = true;
            this.f13929H = false;
            this.f13930I = true;
        }

        public ParametersBuilder(Context context) {
            mo7317c(context);
            mo7319e(context, true);
            this.f13931J = new SparseArray<>();
            this.f13932K = new SparseBooleanArray();
            m7321g();
        }

        public ParametersBuilder(Parameters parameters, C11341 c11341) {
            super(parameters);
            this.f13927F = parameters.f13909A;
            this.f13933y = parameters.f13910B;
            this.f13934z = parameters.f13911C;
            this.f13922A = parameters.f13912D;
            this.f13923B = parameters.f13913E;
            this.f13924C = parameters.f13914F;
            this.f13925D = parameters.f13915G;
            this.f13926E = parameters.f13916H;
            this.f13928G = parameters.f13917I;
            this.f13929H = parameters.f13918J;
            this.f13930I = parameters.f13919K;
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = parameters.f13920L;
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray2.put(sparseArray.keyAt(i2), new HashMap(sparseArray.valueAt(i2)));
            }
            this.f13931J = sparseArray2;
            this.f13932K = parameters.f13921M.clone();
        }

        public ParametersBuilder(Bundle bundle, C11341 c11341) {
            super(bundle);
            SparseBooleanArray sparseBooleanArray;
            Parameters parameters = Parameters.f13908N;
            this.f13933y = bundle.getBoolean(Parameters.m7316b(1000), parameters.f13910B);
            this.f13934z = bundle.getBoolean(Parameters.m7316b(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), parameters.f13911C);
            this.f13922A = bundle.getBoolean(Parameters.m7316b(1002), parameters.f13912D);
            this.f13923B = bundle.getBoolean(Parameters.m7316b(1003), parameters.f13913E);
            this.f13924C = bundle.getBoolean(Parameters.m7316b(1004), parameters.f13914F);
            this.f13925D = bundle.getBoolean(Parameters.m7316b(WebSocketProtocol.CLOSE_NO_STATUS_CODE), parameters.f13915G);
            this.f13926E = bundle.getBoolean(Parameters.m7316b(1006), parameters.f13916H);
            this.f13927F = bundle.getInt(Parameters.m7316b(1007), parameters.f13909A);
            this.f13928G = bundle.getBoolean(Parameters.m7316b(1008), parameters.f13917I);
            this.f13929H = bundle.getBoolean(Parameters.m7316b(1009), parameters.f13918J);
            this.f13930I = bundle.getBoolean(Parameters.m7316b(1010), parameters.f13919K);
            this.f13931J = new SparseArray<>();
            int[] intArray = bundle.getIntArray(Parameters.m7316b(1011));
            List m7523b = BundleableUtil.m7523b(TrackGroupArray.f12593f, bundle.getParcelableArrayList(Parameters.m7316b(1012)), ImmutableList.m11627D());
            Bundleable.Creator<SelectionOverride> creator = SelectionOverride.f13935e;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.m7316b(1013));
            SparseArray sparseArray = new SparseArray();
            if (sparseParcelableArray != null) {
                sparseArray = new SparseArray(sparseParcelableArray.size());
                for (int i2 = 0; i2 < sparseParcelableArray.size(); i2++) {
                    sparseArray.put(sparseParcelableArray.keyAt(i2), ((C1136a) creator).fromBundle((Bundle) sparseParcelableArray.valueAt(i2)));
                }
            }
            if (intArray != null && intArray.length == m7523b.size()) {
                for (int i3 = 0; i3 < intArray.length; i3++) {
                    int i4 = intArray[i3];
                    TrackGroupArray trackGroupArray = (TrackGroupArray) m7523b.get(i3);
                    SelectionOverride selectionOverride = (SelectionOverride) sparseArray.get(i3);
                    Map<TrackGroupArray, SelectionOverride> map = this.f13931J.get(i4);
                    if (map == null) {
                        map = new HashMap<>();
                        this.f13931J.put(i4, map);
                    }
                    if (!map.containsKey(trackGroupArray) || !Util.m7728a(map.get(trackGroupArray), selectionOverride)) {
                        map.put(trackGroupArray, selectionOverride);
                    }
                }
            }
            int[] intArray2 = bundle.getIntArray(Parameters.m7316b(1014));
            if (intArray2 == null) {
                sparseBooleanArray = new SparseBooleanArray();
            } else {
                SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray2.length);
                for (int i5 : intArray2) {
                    sparseBooleanArray2.append(i5, true);
                }
                sparseBooleanArray = sparseBooleanArray2;
            }
            this.f13932K = sparseBooleanArray;
        }
    }

    public DefaultTrackSelector(Context context) {
        AdaptiveTrackSelection.Factory factory = new AdaptiveTrackSelection.Factory();
        Parameters parameters = Parameters.f13908N;
        Parameters m7320f = new ParametersBuilder(context).m7320f();
        this.f13890d = factory;
        this.f13891e = new AtomicReference<>(m7320f);
    }
}
