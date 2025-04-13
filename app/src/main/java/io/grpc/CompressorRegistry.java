package io.grpc;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.Codec;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public final class CompressorRegistry {

    /* renamed from: b */
    public static final CompressorRegistry f58088b = new CompressorRegistry(new Codec.Gzip(), Codec.Identity.f58087a);

    /* renamed from: a */
    public final ConcurrentMap<String, Compressor> f58089a = new ConcurrentHashMap();

    @VisibleForTesting
    public CompressorRegistry(Compressor... compressorArr) {
        for (Compressor compressor : compressorArr) {
            this.f58089a.put(compressor.mo30824a(), compressor);
        }
    }
}
