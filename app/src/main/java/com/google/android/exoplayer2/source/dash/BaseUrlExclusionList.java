package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class BaseUrlExclusionList {

    /* renamed from: a */
    public final Map<String, Long> f12768a;

    /* renamed from: b */
    public final Map<Integer, Long> f12769b;

    /* renamed from: c */
    public final Map<List<Pair<String, Integer>>, BaseUrl> f12770c;

    /* renamed from: d */
    public final Random f12771d;

    public BaseUrlExclusionList() {
        Random random = new Random();
        this.f12770c = new HashMap();
        this.f12771d = random;
        this.f12768a = new HashMap();
        this.f12769b = new HashMap();
    }

    /* renamed from: a */
    public static <T> void m6988a(T t, long j2, Map<T, Long> map) {
        if (map.containsKey(t)) {
            Long l2 = map.get(t);
            int i2 = Util.f14736a;
            j2 = Math.max(j2, l2.longValue());
        }
        map.put(t, Long.valueOf(j2));
    }

    /* renamed from: c */
    public static <T> void m6989c(long j2, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j2) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.remove(arrayList.get(i2));
        }
    }

    /* renamed from: b */
    public final List<BaseUrl> m6990b(List<BaseUrl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m6989c(elapsedRealtime, this.f12768a);
        m6989c(elapsedRealtime, this.f12769b);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            BaseUrl baseUrl = list.get(i2);
            if (!this.f12768a.containsKey(baseUrl.f12924b) && !this.f12769b.containsKey(Integer.valueOf(baseUrl.f12925c))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: d */
    public BaseUrl m6991d(List<BaseUrl> list) {
        List<BaseUrl> m6990b = m6990b(list);
        ArrayList arrayList = (ArrayList) m6990b;
        if (arrayList.size() < 2) {
            return (BaseUrl) Iterators.m11714i(arrayList.iterator(), null);
        }
        Collections.sort(m6990b, C1062a.f12091c);
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        int i3 = ((BaseUrl) arrayList.get(0)).f12925c;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            BaseUrl baseUrl = (BaseUrl) arrayList.get(i4);
            if (i3 == baseUrl.f12925c) {
                arrayList2.add(new Pair(baseUrl.f12924b, Integer.valueOf(baseUrl.f12926d)));
                i4++;
            } else if (arrayList2.size() == 1) {
                return (BaseUrl) arrayList.get(0);
            }
        }
        BaseUrl baseUrl2 = this.f12770c.get(arrayList2);
        if (baseUrl2 == null) {
            List subList = arrayList.subList(0, arrayList2.size());
            int i5 = 0;
            for (int i6 = 0; i6 < subList.size(); i6++) {
                i5 += ((BaseUrl) subList.get(i6)).f12926d;
            }
            int nextInt = this.f12771d.nextInt(i5);
            int i7 = 0;
            while (true) {
                if (i2 >= subList.size()) {
                    baseUrl2 = (BaseUrl) Iterables.m11700e(subList);
                    break;
                }
                BaseUrl baseUrl3 = (BaseUrl) subList.get(i2);
                i7 += baseUrl3.f12926d;
                if (nextInt < i7) {
                    baseUrl2 = baseUrl3;
                    break;
                }
                i2++;
            }
            this.f12770c.put(arrayList2, baseUrl2);
        }
        return baseUrl2;
    }
}
