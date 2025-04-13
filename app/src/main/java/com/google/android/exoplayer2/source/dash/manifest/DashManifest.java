package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class DashManifest implements FilterableManifest<DashManifest> {

    /* renamed from: a */
    public final long f12927a;

    /* renamed from: b */
    public final long f12928b;

    /* renamed from: c */
    public final long f12929c;

    /* renamed from: d */
    public final boolean f12930d;

    /* renamed from: e */
    public final long f12931e;

    /* renamed from: f */
    public final long f12932f;

    /* renamed from: g */
    public final long f12933g;

    /* renamed from: h */
    public final long f12934h;

    /* renamed from: i */
    @Nullable
    public final UtcTimingElement f12935i;

    /* renamed from: j */
    @Nullable
    public final ServiceDescriptionElement f12936j;

    /* renamed from: k */
    @Nullable
    public final Uri f12937k;

    /* renamed from: l */
    @Nullable
    public final ProgramInformation f12938l;

    /* renamed from: m */
    public final List<Period> f12939m;

    public DashManifest(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        this.f12927a = j2;
        this.f12928b = j3;
        this.f12929c = j4;
        this.f12930d = z;
        this.f12931e = j5;
        this.f12932f = j6;
        this.f12933g = j7;
        this.f12934h = j8;
        this.f12938l = programInformation;
        this.f12935i = utcTimingElement;
        this.f12937k = uri;
        this.f12936j = serviceDescriptionElement;
        this.f12939m = list == null ? Collections.emptyList() : list;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: a */
    public DashManifest mo6751a(List list) {
        DashManifest dashManifest = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= m7040c()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f12206b != i2) {
                long m7041d = dashManifest.m7041d(i2);
                if (m7041d != -9223372036854775807L) {
                    j2 += m7041d;
                }
            } else {
                Period m7039b = dashManifest.m7039b(i2);
                List<AdaptationSet> list2 = m7039b.f12963c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i3 = streamKey.f12206b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = streamKey.f12207c;
                    AdaptationSet adaptationSet = list2.get(i4);
                    List<Representation> list3 = adaptationSet.f12919c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(streamKey.f12208d));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f12206b != i3) {
                            break;
                        }
                    } while (streamKey.f12207c == i4);
                    List<AdaptationSet> list4 = list2;
                    arrayList2.add(new AdaptationSet(adaptationSet.f12917a, adaptationSet.f12918b, arrayList3, adaptationSet.f12920d, adaptationSet.f12921e, adaptationSet.f12922f));
                    if (streamKey.f12206b != i3) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new Period(m7039b.f12961a, m7039b.f12962b - j2, arrayList2, m7039b.f12964d));
            }
            i2++;
            dashManifest = this;
        }
        long j3 = dashManifest.f12928b;
        return new DashManifest(dashManifest.f12927a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, dashManifest.f12929c, dashManifest.f12930d, dashManifest.f12931e, dashManifest.f12932f, dashManifest.f12933g, dashManifest.f12934h, dashManifest.f12938l, dashManifest.f12935i, dashManifest.f12936j, dashManifest.f12937k, arrayList);
    }

    /* renamed from: b */
    public final Period m7039b(int i2) {
        return this.f12939m.get(i2);
    }

    /* renamed from: c */
    public final int m7040c() {
        return this.f12939m.size();
    }

    /* renamed from: d */
    public final long m7041d(int i2) {
        if (i2 != this.f12939m.size() - 1) {
            return this.f12939m.get(i2 + 1).f12962b - this.f12939m.get(i2).f12962b;
        }
        long j2 = this.f12928b;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - this.f12939m.get(i2).f12962b;
    }

    /* renamed from: e */
    public final long m7042e(int i2) {
        return Util.m7717P(m7041d(i2));
    }
}
