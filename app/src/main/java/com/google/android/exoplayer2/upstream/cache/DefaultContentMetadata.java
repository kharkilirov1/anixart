package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class DefaultContentMetadata implements ContentMetadata {

    /* renamed from: c */
    public static final DefaultContentMetadata f14600c = new DefaultContentMetadata(Collections.emptyMap());

    /* renamed from: a */
    public int f14601a;

    /* renamed from: b */
    public final Map<String, byte[]> f14602b;

    public DefaultContentMetadata() {
        this(Collections.emptyMap());
    }

    /* renamed from: c */
    public static boolean m7510c(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @Nullable
    /* renamed from: a */
    public final String mo7507a(String str, @Nullable String str2) {
        byte[] bArr = this.f14602b.get(str);
        if (bArr != null) {
            return new String(bArr, Charsets.f20504c);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    /* renamed from: b */
    public final long mo7508b(String str, long j2) {
        byte[] bArr = this.f14602b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        return m7510c(this.f14602b, ((DefaultContentMetadata) obj).f14602b);
    }

    public int hashCode() {
        if (this.f14601a == 0) {
            int i2 = 0;
            for (Map.Entry<String, byte[]> entry : this.f14602b.entrySet()) {
                i2 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f14601a = i2;
        }
        return this.f14601a;
    }

    public DefaultContentMetadata(Map<String, byte[]> map) {
        this.f14602b = Collections.unmodifiableMap(map);
    }
}
