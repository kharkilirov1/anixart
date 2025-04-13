package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class MediaItem implements Bundleable {

    /* renamed from: g */
    public static final MediaItem f9711g = new Builder().m5839a();

    /* renamed from: h */
    public static final Bundleable.Creator<MediaItem> f9712h = C1026l.f11806i;

    /* renamed from: b */
    public final String f9713b;

    /* renamed from: c */
    @Nullable
    public final LocalConfiguration f9714c;

    /* renamed from: d */
    public final LiveConfiguration f9715d;

    /* renamed from: e */
    public final MediaMetadata f9716e;

    /* renamed from: f */
    public final ClippingConfiguration f9717f;

    public static final class AdsConfiguration {

        public static final class Builder {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            Objects.requireNonNull((AdsConfiguration) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        public String f9718a;

        /* renamed from: b */
        @Nullable
        public Uri f9719b;

        /* renamed from: c */
        @Nullable
        public String f9720c;

        /* renamed from: g */
        @Nullable
        public String f9724g;

        /* renamed from: i */
        @Nullable
        public AdsConfiguration f9726i;

        /* renamed from: j */
        @Nullable
        public Object f9727j;

        /* renamed from: k */
        @Nullable
        public MediaMetadata f9728k;

        /* renamed from: d */
        public ClippingConfiguration.Builder f9721d = new ClippingConfiguration.Builder();

        /* renamed from: e */
        public DrmConfiguration.Builder f9722e = new DrmConfiguration.Builder(null);

        /* renamed from: f */
        public List<StreamKey> f9723f = Collections.emptyList();

        /* renamed from: h */
        public ImmutableList<SubtitleConfiguration> f9725h = ImmutableList.m11627D();

        /* renamed from: l */
        public LiveConfiguration.Builder f9729l = new LiveConfiguration.Builder();

        /* renamed from: a */
        public MediaItem m5839a() {
            PlaybackProperties playbackProperties;
            DrmConfiguration.Builder builder = this.f9722e;
            Assertions.m7516d(builder.f9751b == null || builder.f9750a != null);
            Uri uri = this.f9719b;
            if (uri != null) {
                String str = this.f9720c;
                DrmConfiguration.Builder builder2 = this.f9722e;
                playbackProperties = new PlaybackProperties(uri, str, builder2.f9750a != null ? new DrmConfiguration(builder2, null) : null, this.f9726i, this.f9723f, this.f9724g, this.f9725h, this.f9727j, null);
            } else {
                playbackProperties = null;
            }
            String str2 = this.f9718a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingProperties m5842a = this.f9721d.m5842a();
            LiveConfiguration m5845a = this.f9729l.m5845a();
            MediaMetadata mediaMetadata = this.f9728k;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.f9790I;
            }
            return new MediaItem(str3, m5842a, playbackProperties, m5845a, mediaMetadata, null);
        }

        /* renamed from: b */
        public Builder m5840b(@Nullable List<StreamKey> list) {
            this.f9723f = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }
    }

    public static class ClippingConfiguration implements Bundleable {

        /* renamed from: g */
        public static final Bundleable.Creator<ClippingProperties> f9730g;

        /* renamed from: b */
        @IntRange
        public final long f9731b;

        /* renamed from: c */
        public final long f9732c;

        /* renamed from: d */
        public final boolean f9733d;

        /* renamed from: e */
        public final boolean f9734e;

        /* renamed from: f */
        public final boolean f9735f;

        static {
            new Builder().m5842a();
            f9730g = C1026l.f11807j;
        }

        public ClippingConfiguration(Builder builder, C09371 c09371) {
            this.f9731b = builder.f9736a;
            this.f9732c = builder.f9737b;
            this.f9733d = builder.f9738c;
            this.f9734e = builder.f9739d;
            this.f9735f = builder.f9740e;
        }

        /* renamed from: b */
        public static String m5841b(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putLong(m5841b(0), this.f9731b);
            bundle.putLong(m5841b(1), this.f9732c);
            bundle.putBoolean(m5841b(2), this.f9733d);
            bundle.putBoolean(m5841b(3), this.f9734e);
            bundle.putBoolean(m5841b(4), this.f9735f);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            return this.f9731b == clippingConfiguration.f9731b && this.f9732c == clippingConfiguration.f9732c && this.f9733d == clippingConfiguration.f9733d && this.f9734e == clippingConfiguration.f9734e && this.f9735f == clippingConfiguration.f9735f;
        }

        public int hashCode() {
            long j2 = this.f9731b;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.f9732c;
            return ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f9733d ? 1 : 0)) * 31) + (this.f9734e ? 1 : 0)) * 31) + (this.f9735f ? 1 : 0);
        }

        public static final class Builder {

            /* renamed from: a */
            public long f9736a;

            /* renamed from: b */
            public long f9737b;

            /* renamed from: c */
            public boolean f9738c;

            /* renamed from: d */
            public boolean f9739d;

            /* renamed from: e */
            public boolean f9740e;

            public Builder() {
                this.f9737b = Long.MIN_VALUE;
            }

            @Deprecated
            /* renamed from: a */
            public ClippingProperties m5842a() {
                return new ClippingProperties(this, null);
            }

            public Builder(ClippingConfiguration clippingConfiguration, C09371 c09371) {
                this.f9736a = clippingConfiguration.f9731b;
                this.f9737b = clippingConfiguration.f9732c;
                this.f9738c = clippingConfiguration.f9733d;
                this.f9739d = clippingConfiguration.f9734e;
                this.f9740e = clippingConfiguration.f9735f;
            }
        }
    }

    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {

        /* renamed from: h */
        public static final ClippingProperties f9741h = new ClippingConfiguration.Builder().m5842a();

        public ClippingProperties(ClippingConfiguration.Builder builder, C09371 c09371) {
            super(builder, null);
        }
    }

    public static class LocalConfiguration {

        /* renamed from: a */
        public final Uri f9770a;

        /* renamed from: b */
        @Nullable
        public final String f9771b;

        /* renamed from: c */
        @Nullable
        public final DrmConfiguration f9772c;

        /* renamed from: d */
        @Nullable
        public final AdsConfiguration f9773d;

        /* renamed from: e */
        public final List<StreamKey> f9774e;

        /* renamed from: f */
        @Nullable
        public final String f9775f;

        /* renamed from: g */
        public final ImmutableList<SubtitleConfiguration> f9776g;

        /* renamed from: h */
        @Nullable
        public final Object f9777h;

        /* JADX WARN: Multi-variable type inference failed */
        public LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List list, String str2, ImmutableList immutableList, Object obj, C09371 c09371) {
            this.f9770a = uri;
            this.f9771b = str;
            this.f9772c = drmConfiguration;
            this.f9773d = adsConfiguration;
            this.f9774e = list;
            this.f9775f = str2;
            this.f9776g = immutableList;
            UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                builder.m11640d(new Subtitle(new SubtitleConfiguration.Builder((SubtitleConfiguration) immutableList.get(i2), null), null));
            }
            builder.m11641e();
            this.f9777h = obj;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.f9770a.equals(localConfiguration.f9770a) && Util.m7728a(this.f9771b, localConfiguration.f9771b) && Util.m7728a(this.f9772c, localConfiguration.f9772c) && Util.m7728a(this.f9773d, localConfiguration.f9773d) && this.f9774e.equals(localConfiguration.f9774e) && Util.m7728a(this.f9775f, localConfiguration.f9775f) && this.f9776g.equals(localConfiguration.f9776g) && Util.m7728a(this.f9777h, localConfiguration.f9777h);
        }

        public int hashCode() {
            int hashCode = this.f9770a.hashCode() * 31;
            String str = this.f9771b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration = this.f9772c;
            int hashCode3 = (hashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            AdsConfiguration adsConfiguration = this.f9773d;
            if (adsConfiguration != null) {
                Objects.requireNonNull(adsConfiguration);
                throw null;
            }
            int hashCode4 = (this.f9774e.hashCode() + ((hashCode3 + 0) * 31)) * 31;
            String str2 = this.f9775f;
            int hashCode5 = (this.f9776g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f9777h;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class PlaybackProperties extends LocalConfiguration {
        public PlaybackProperties(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List list, String str2, ImmutableList immutableList, Object obj, C09371 c09371) {
            super(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj, null);
        }
    }

    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
        public Subtitle(SubtitleConfiguration.Builder builder, C09371 c09371) {
            super(builder, null);
        }
    }

    public static class SubtitleConfiguration {

        /* renamed from: a */
        public final Uri f9778a;

        /* renamed from: b */
        @Nullable
        public final String f9779b;

        /* renamed from: c */
        @Nullable
        public final String f9780c;

        /* renamed from: d */
        public final int f9781d;

        /* renamed from: e */
        public final int f9782e;

        /* renamed from: f */
        @Nullable
        public final String f9783f;

        public static final class Builder {

            /* renamed from: a */
            public Uri f9784a;

            /* renamed from: b */
            @Nullable
            public String f9785b;

            /* renamed from: c */
            @Nullable
            public String f9786c;

            /* renamed from: d */
            public int f9787d;

            /* renamed from: e */
            public int f9788e;

            /* renamed from: f */
            @Nullable
            public String f9789f;

            public Builder(SubtitleConfiguration subtitleConfiguration, C09371 c09371) {
                this.f9784a = subtitleConfiguration.f9778a;
                this.f9785b = subtitleConfiguration.f9779b;
                this.f9786c = subtitleConfiguration.f9780c;
                this.f9787d = subtitleConfiguration.f9781d;
                this.f9788e = subtitleConfiguration.f9782e;
                this.f9789f = subtitleConfiguration.f9783f;
            }
        }

        public SubtitleConfiguration(Builder builder, C09371 c09371) {
            this.f9778a = builder.f9784a;
            this.f9779b = builder.f9785b;
            this.f9780c = builder.f9786c;
            this.f9781d = builder.f9787d;
            this.f9782e = builder.f9788e;
            this.f9783f = builder.f9789f;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleConfiguration)) {
                return false;
            }
            SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) obj;
            return this.f9778a.equals(subtitleConfiguration.f9778a) && Util.m7728a(this.f9779b, subtitleConfiguration.f9779b) && Util.m7728a(this.f9780c, subtitleConfiguration.f9780c) && this.f9781d == subtitleConfiguration.f9781d && this.f9782e == subtitleConfiguration.f9782e && Util.m7728a(this.f9783f, subtitleConfiguration.f9783f);
        }

        public int hashCode() {
            int hashCode = this.f9778a.hashCode() * 31;
            String str = this.f9779b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9780c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9781d) * 31) + this.f9782e) * 31;
            String str3 = this.f9783f;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    public MediaItem(String str, ClippingProperties clippingProperties, @Nullable PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata) {
        this.f9713b = str;
        this.f9714c = null;
        this.f9715d = liveConfiguration;
        this.f9716e = mediaMetadata;
        this.f9717f = clippingProperties;
    }

    /* renamed from: c */
    public static String m5837c(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putString(m5837c(0), this.f9713b);
        bundle.putBundle(m5837c(1), this.f9715d.mo5679a());
        bundle.putBundle(m5837c(2), this.f9716e.mo5679a());
        bundle.putBundle(m5837c(3), this.f9717f.mo5679a());
        return bundle;
    }

    /* renamed from: b */
    public Builder m5838b() {
        Builder builder = new Builder();
        builder.f9721d = new ClippingConfiguration.Builder(this.f9717f, null);
        builder.f9718a = this.f9713b;
        builder.f9728k = this.f9716e;
        builder.f9729l = this.f9715d.m5844b();
        LocalConfiguration localConfiguration = this.f9714c;
        if (localConfiguration != null) {
            builder.f9724g = localConfiguration.f9775f;
            builder.f9720c = localConfiguration.f9771b;
            builder.f9719b = localConfiguration.f9770a;
            builder.f9723f = localConfiguration.f9774e;
            builder.f9725h = localConfiguration.f9776g;
            builder.f9727j = localConfiguration.f9777h;
            DrmConfiguration drmConfiguration = localConfiguration.f9772c;
            builder.f9722e = drmConfiguration != null ? new DrmConfiguration.Builder(drmConfiguration, null) : new DrmConfiguration.Builder(null);
            builder.f9726i = localConfiguration.f9773d;
        }
        return builder;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Util.m7728a(this.f9713b, mediaItem.f9713b) && this.f9717f.equals(mediaItem.f9717f) && Util.m7728a(this.f9714c, mediaItem.f9714c) && Util.m7728a(this.f9715d, mediaItem.f9715d) && Util.m7728a(this.f9716e, mediaItem.f9716e);
    }

    public int hashCode() {
        int hashCode = this.f9713b.hashCode() * 31;
        LocalConfiguration localConfiguration = this.f9714c;
        return this.f9716e.hashCode() + ((this.f9717f.hashCode() + ((this.f9715d.hashCode() + ((hashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public static final class DrmConfiguration {

        /* renamed from: a */
        public final UUID f9742a;

        /* renamed from: b */
        @Nullable
        public final Uri f9743b;

        /* renamed from: c */
        public final ImmutableMap<String, String> f9744c;

        /* renamed from: d */
        public final boolean f9745d;

        /* renamed from: e */
        public final boolean f9746e;

        /* renamed from: f */
        public final boolean f9747f;

        /* renamed from: g */
        public final ImmutableList<Integer> f9748g;

        /* renamed from: h */
        @Nullable
        public final byte[] f9749h;

        public DrmConfiguration(Builder builder, C09371 c09371) {
            Assertions.m7516d((builder.f9755f && builder.f9751b == null) ? false : true);
            UUID uuid = builder.f9750a;
            Objects.requireNonNull(uuid);
            this.f9742a = uuid;
            this.f9743b = builder.f9751b;
            this.f9744c = builder.f9752c;
            this.f9745d = builder.f9753d;
            this.f9747f = builder.f9755f;
            this.f9746e = builder.f9754e;
            this.f9748g = builder.f9756g;
            byte[] bArr = builder.f9757h;
            this.f9749h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
            return this.f9742a.equals(drmConfiguration.f9742a) && Util.m7728a(this.f9743b, drmConfiguration.f9743b) && Util.m7728a(this.f9744c, drmConfiguration.f9744c) && this.f9745d == drmConfiguration.f9745d && this.f9747f == drmConfiguration.f9747f && this.f9746e == drmConfiguration.f9746e && this.f9748g.equals(drmConfiguration.f9748g) && Arrays.equals(this.f9749h, drmConfiguration.f9749h);
        }

        public int hashCode() {
            int hashCode = this.f9742a.hashCode() * 31;
            Uri uri = this.f9743b;
            return Arrays.hashCode(this.f9749h) + ((this.f9748g.hashCode() + ((((((((this.f9744c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f9745d ? 1 : 0)) * 31) + (this.f9747f ? 1 : 0)) * 31) + (this.f9746e ? 1 : 0)) * 31)) * 31);
        }

        public static final class Builder {

            /* renamed from: a */
            @Nullable
            public UUID f9750a;

            /* renamed from: b */
            @Nullable
            public Uri f9751b;

            /* renamed from: c */
            public ImmutableMap<String, String> f9752c;

            /* renamed from: d */
            public boolean f9753d;

            /* renamed from: e */
            public boolean f9754e;

            /* renamed from: f */
            public boolean f9755f;

            /* renamed from: g */
            public ImmutableList<Integer> f9756g;

            /* renamed from: h */
            @Nullable
            public byte[] f9757h;

            @Deprecated
            public Builder() {
                this.f9752c = ImmutableMap.m11650l();
                this.f9756g = ImmutableList.m11627D();
            }

            public Builder(C09371 c09371) {
                this.f9752c = ImmutableMap.m11650l();
                this.f9756g = ImmutableList.m11627D();
            }

            public Builder(DrmConfiguration drmConfiguration, C09371 c09371) {
                this.f9750a = drmConfiguration.f9742a;
                this.f9751b = drmConfiguration.f9743b;
                this.f9752c = drmConfiguration.f9744c;
                this.f9753d = drmConfiguration.f9745d;
                this.f9754e = drmConfiguration.f9746e;
                this.f9755f = drmConfiguration.f9747f;
                this.f9756g = drmConfiguration.f9748g;
                this.f9757h = drmConfiguration.f9749h;
            }
        }
    }

    public static final class LiveConfiguration implements Bundleable {

        /* renamed from: g */
        public static final LiveConfiguration f9758g = new Builder().m5845a();

        /* renamed from: h */
        public static final Bundleable.Creator<LiveConfiguration> f9759h = C1026l.f11808k;

        /* renamed from: b */
        public final long f9760b;

        /* renamed from: c */
        public final long f9761c;

        /* renamed from: d */
        public final long f9762d;

        /* renamed from: e */
        public final float f9763e;

        /* renamed from: f */
        public final float f9764f;

        public LiveConfiguration(Builder builder, C09371 c09371) {
            long j2 = builder.f9765a;
            long j3 = builder.f9766b;
            long j4 = builder.f9767c;
            float f2 = builder.f9768d;
            float f3 = builder.f9769e;
            this.f9760b = j2;
            this.f9761c = j3;
            this.f9762d = j4;
            this.f9763e = f2;
            this.f9764f = f3;
        }

        /* renamed from: c */
        public static String m5843c(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putLong(m5843c(0), this.f9760b);
            bundle.putLong(m5843c(1), this.f9761c);
            bundle.putLong(m5843c(2), this.f9762d);
            bundle.putFloat(m5843c(3), this.f9763e);
            bundle.putFloat(m5843c(4), this.f9764f);
            return bundle;
        }

        /* renamed from: b */
        public Builder m5844b() {
            return new Builder(this, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.f9760b == liveConfiguration.f9760b && this.f9761c == liveConfiguration.f9761c && this.f9762d == liveConfiguration.f9762d && this.f9763e == liveConfiguration.f9763e && this.f9764f == liveConfiguration.f9764f;
        }

        public int hashCode() {
            long j2 = this.f9760b;
            long j3 = this.f9761c;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f9762d;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            float f2 = this.f9763e;
            int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f9764f;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        public static final class Builder {

            /* renamed from: a */
            public long f9765a;

            /* renamed from: b */
            public long f9766b;

            /* renamed from: c */
            public long f9767c;

            /* renamed from: d */
            public float f9768d;

            /* renamed from: e */
            public float f9769e;

            public Builder() {
                this.f9765a = -9223372036854775807L;
                this.f9766b = -9223372036854775807L;
                this.f9767c = -9223372036854775807L;
                this.f9768d = -3.4028235E38f;
                this.f9769e = -3.4028235E38f;
            }

            /* renamed from: a */
            public LiveConfiguration m5845a() {
                return new LiveConfiguration(this, null);
            }

            public Builder(LiveConfiguration liveConfiguration, C09371 c09371) {
                this.f9765a = liveConfiguration.f9760b;
                this.f9766b = liveConfiguration.f9761c;
                this.f9767c = liveConfiguration.f9762d;
                this.f9768d = liveConfiguration.f9763e;
                this.f9769e = liveConfiguration.f9764f;
            }
        }

        @Deprecated
        public LiveConfiguration(long j2, long j3, long j4, float f2, float f3) {
            this.f9760b = j2;
            this.f9761c = j3;
            this.f9762d = j4;
            this.f9763e = f2;
            this.f9764f = f3;
        }
    }

    public MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, C09371 c09371) {
        this.f9713b = str;
        this.f9714c = playbackProperties;
        this.f9715d = liveConfiguration;
        this.f9716e = mediaMetadata;
        this.f9717f = clippingProperties;
    }
}
