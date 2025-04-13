package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f8198a;

    /* renamed from: b */
    public final List<? extends ResourceDecoder<DataType, ResourceType>> f8199b;

    /* renamed from: c */
    public final ResourceTranscoder<ResourceType, Transcode> f8200c;

    /* renamed from: d */
    public final Pools.Pool<List<Throwable>> f8201d;

    /* renamed from: e */
    public final String f8202e;

    public interface DecodeCallback<ResourceType> {
        @NonNull
        /* renamed from: a */
        Resource<ResourceType> mo5017a(@NonNull Resource<ResourceType> resource);
    }

    public DecodePath(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, Pools.Pool<List<Throwable>> pool) {
        this.f8198a = cls;
        this.f8199b = list;
        this.f8200c = resourceTranscoder;
        this.f8201d = pool;
        StringBuilder m24u = C0000a.m24u("Failed DecodePath{");
        m24u.append(cls.getSimpleName());
        m24u.append("->");
        m24u.append(cls2.getSimpleName());
        m24u.append("->");
        m24u.append(cls3.getSimpleName());
        m24u.append("}");
        this.f8202e = m24u.toString();
    }

    @NonNull
    /* renamed from: a */
    public final Resource<ResourceType> m5020a(DataRewinder<DataType> dataRewinder, int i2, int i3, @NonNull Options options, List<Throwable> list) throws GlideException {
        int size = this.f8199b.size();
        Resource<ResourceType> resource = null;
        for (int i4 = 0; i4 < size; i4++) {
            ResourceDecoder<DataType, ResourceType> resourceDecoder = this.f8199b.get(i4);
            try {
                if (resourceDecoder.mo4962a(dataRewinder.mo4975a(), options)) {
                    resource = resourceDecoder.mo4963b(dataRewinder.mo4975a(), i2, i3, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + resourceDecoder, e2);
                }
                list.add(e2);
            }
            if (resource != null) {
                break;
            }
        }
        if (resource != null) {
            return resource;
        }
        throw new GlideException(this.f8202e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DecodePath{ dataClass=");
        m24u.append(this.f8198a);
        m24u.append(", decoders=");
        m24u.append(this.f8199b);
        m24u.append(", transcoder=");
        m24u.append(this.f8200c);
        m24u.append('}');
        return m24u.toString();
    }
}
