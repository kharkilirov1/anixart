package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HlsMasterPlaylist extends HlsPlaylist {

    /* renamed from: n */
    public static final HlsMasterPlaylist f13275n = new HlsMasterPlaylist("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f13276d;

    /* renamed from: e */
    public final List<Variant> f13277e;

    /* renamed from: f */
    public final List<Rendition> f13278f;

    /* renamed from: g */
    public final List<Rendition> f13279g;

    /* renamed from: h */
    public final List<Rendition> f13280h;

    /* renamed from: i */
    public final List<Rendition> f13281i;

    /* renamed from: j */
    @Nullable
    public final Format f13282j;

    /* renamed from: k */
    @Nullable
    public final List<Format> f13283k;

    /* renamed from: l */
    public final Map<String, String> f13284l;

    /* renamed from: m */
    public final List<DrmInitData> f13285m;

    public static final class Rendition {

        /* renamed from: a */
        @Nullable
        public final Uri f13286a;

        /* renamed from: b */
        public final Format f13287b;

        /* renamed from: c */
        public final String f13288c;

        public Rendition(@Nullable Uri uri, Format format, String str, String str2) {
            this.f13286a = uri;
            this.f13287b = format;
            this.f13288c = str2;
        }
    }

    public static final class Variant {

        /* renamed from: a */
        public final Uri f13289a;

        /* renamed from: b */
        public final Format f13290b;

        /* renamed from: c */
        @Nullable
        public final String f13291c;

        /* renamed from: d */
        @Nullable
        public final String f13292d;

        /* renamed from: e */
        @Nullable
        public final String f13293e;

        /* renamed from: f */
        @Nullable
        public final String f13294f;

        public Variant(Uri uri, Format format, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f13289a = uri;
            this.f13290b = format;
            this.f13291c = str;
            this.f13292d = str2;
            this.f13293e = str3;
            this.f13294f = str4;
        }
    }

    public HlsMasterPlaylist(String str, List<String> list, List<Variant> list2, List<Rendition> list3, List<Rendition> list4, List<Rendition> list5, List<Rendition> list6, @Nullable Format format, @Nullable List<Format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Uri uri = list2.get(i2).f13289a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m7148b(list3, arrayList);
        m7148b(list4, arrayList);
        m7148b(list5, arrayList);
        m7148b(list6, arrayList);
        this.f13276d = Collections.unmodifiableList(arrayList);
        this.f13277e = Collections.unmodifiableList(list2);
        this.f13278f = Collections.unmodifiableList(list3);
        this.f13279g = Collections.unmodifiableList(list4);
        this.f13280h = Collections.unmodifiableList(list5);
        this.f13281i = Collections.unmodifiableList(list6);
        this.f13282j = format;
        this.f13283k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f13284l = Collections.unmodifiableMap(map);
        this.f13285m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m7148b(List<Rendition> list, List<Uri> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).f13286a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: c */
    public static <T> List<T> m7149c(List<T> list, int i2, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            T t = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 < list2.size()) {
                    StreamKey streamKey = list2.get(i4);
                    if (streamKey.f12207c == i2 && streamKey.f12208d == i3) {
                        arrayList.add(t);
                        break;
                    }
                    i4++;
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: a */
    public HlsPlaylist mo6751a(List list) {
        return new HlsMasterPlaylist(this.f13337a, this.f13338b, m7149c(this.f13277e, 0, list), Collections.emptyList(), m7149c(this.f13279g, 1, list), m7149c(this.f13280h, 2, list), Collections.emptyList(), this.f13282j, this.f13283k, this.f13339c, this.f13284l, this.f13285m);
    }
}
