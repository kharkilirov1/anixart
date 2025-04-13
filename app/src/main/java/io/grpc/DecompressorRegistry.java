package io.grpc;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import io.grpc.Codec;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public final class DecompressorRegistry {

    /* renamed from: c */
    public static final Joiner f58128c = Joiner.m11159c(',');

    /* renamed from: d */
    public static final DecompressorRegistry f58129d = new DecompressorRegistry(Codec.Identity.f58087a, false, new DecompressorRegistry(new Codec.Gzip(), true, new DecompressorRegistry()));

    /* renamed from: a */
    public final Map<String, DecompressorInfo> f58130a;

    /* renamed from: b */
    public final byte[] f58131b;

    public static final class DecompressorInfo {

        /* renamed from: a */
        public final Decompressor f58132a;

        /* renamed from: b */
        public final boolean f58133b;

        public DecompressorInfo(Decompressor decompressor, boolean z) {
            Preconditions.m11187k(decompressor, "decompressor");
            this.f58132a = decompressor;
            this.f58133b = z;
        }
    }

    public DecompressorRegistry(Decompressor decompressor, boolean z, DecompressorRegistry decompressorRegistry) {
        String mo30824a = decompressor.mo30824a();
        Preconditions.m11179c(!mo30824a.contains(","), "Comma is currently not allowed in message encoding");
        int size = decompressorRegistry.f58130a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(decompressorRegistry.f58130a.containsKey(decompressor.mo30824a()) ? size : size + 1);
        for (DecompressorInfo decompressorInfo : decompressorRegistry.f58130a.values()) {
            String mo30824a2 = decompressorInfo.f58132a.mo30824a();
            if (!mo30824a2.equals(mo30824a)) {
                linkedHashMap.put(mo30824a2, new DecompressorInfo(decompressorInfo.f58132a, decompressorInfo.f58133b));
            }
        }
        linkedHashMap.put(mo30824a, new DecompressorInfo(decompressor, z));
        Map<String, DecompressorInfo> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f58130a = unmodifiableMap;
        Joiner joiner = f58128c;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry<String, DecompressorInfo> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().f58133b) {
                hashSet.add(entry.getKey());
            }
        }
        this.f58131b = joiner.m11161b(Collections.unmodifiableSet(hashSet)).getBytes(StandardCharsets.US_ASCII);
    }

    @Nullable
    /* renamed from: a */
    public Decompressor m30857a(String str) {
        DecompressorInfo decompressorInfo = this.f58130a.get(str);
        if (decompressorInfo != null) {
            return decompressorInfo.f58132a;
        }
        return null;
    }

    public DecompressorRegistry() {
        this.f58130a = new LinkedHashMap(0);
        this.f58131b = new byte[0];
    }
}
