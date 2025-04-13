package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a */
    public final ModelLoaderRegistry f7924a;

    /* renamed from: b */
    public final EncoderRegistry f7925b;

    /* renamed from: c */
    public final ResourceDecoderRegistry f7926c;

    /* renamed from: d */
    public final ResourceEncoderRegistry f7927d;

    /* renamed from: e */
    public final DataRewinderRegistry f7928e;

    /* renamed from: f */
    public final TranscoderRegistry f7929f;

    /* renamed from: g */
    public final ImageHeaderParserRegistry f7930g;

    /* renamed from: h */
    public final ModelToResourceClassCache f7931h = new ModelToResourceClassCache();

    /* renamed from: i */
    public final LoadPathCache f7932i = new LoadPathCache();

    /* renamed from: j */
    public final Pools.Pool<List<Throwable>> f7933j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> m5354b = FactoryPools.m5354b();
        this.f7933j = m5354b;
        this.f7924a = new ModelLoaderRegistry(m5354b);
        this.f7925b = new EncoderRegistry();
        ResourceDecoderRegistry resourceDecoderRegistry = new ResourceDecoderRegistry();
        this.f7926c = resourceDecoderRegistry;
        this.f7927d = new ResourceEncoderRegistry();
        this.f7928e = new DataRewinderRegistry();
        this.f7929f = new TranscoderRegistry();
        this.f7930g = new ImageHeaderParserRegistry();
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (resourceDecoderRegistry) {
            ArrayList arrayList2 = new ArrayList(resourceDecoderRegistry.f8697a);
            resourceDecoderRegistry.f8697a.clear();
            resourceDecoderRegistry.f8697a.addAll(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!arrayList.contains(str)) {
                    resourceDecoderRegistry.f8697a.add(str);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public List<ImageHeaderParser> m4879a() {
        List<ImageHeaderParser> list;
        ImageHeaderParserRegistry imageHeaderParserRegistry = this.f7930g;
        synchronized (imageHeaderParserRegistry) {
            list = imageHeaderParserRegistry.f8691a;
        }
        if (list.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return list;
    }

    @NonNull
    /* renamed from: b */
    public Registry m4880b(@NonNull DataRewinder.Factory<?> factory) {
        DataRewinderRegistry dataRewinderRegistry = this.f7928e;
        synchronized (dataRewinderRegistry) {
            dataRewinderRegistry.f8071a.put(factory.mo4977a(), factory);
        }
        return this;
    }
}
