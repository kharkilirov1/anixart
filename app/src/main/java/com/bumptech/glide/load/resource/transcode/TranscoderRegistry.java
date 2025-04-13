package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TranscoderRegistry {

    /* renamed from: a */
    public final List<Entry<?, ?>> f8647a = new ArrayList();

    public static final class Entry<Z, R> {

        /* renamed from: a */
        public final Class<Z> f8648a;

        /* renamed from: b */
        public final Class<R> f8649b;

        /* renamed from: c */
        public final ResourceTranscoder<Z, R> f8650c;

        public Entry(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
            this.f8648a = cls;
            this.f8649b = cls2;
            this.f8650c = resourceTranscoder;
        }

        /* renamed from: a */
        public boolean m5216a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f8648a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f8649b);
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <Z, R> ResourceTranscoder<Z, R> m5213a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.f8651a;
        }
        for (Entry<?, ?> entry : this.f8647a) {
            if (entry.m5216a(cls, cls2)) {
                return (ResourceTranscoder<Z, R>) entry.f8650c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m5214b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<Entry<?, ?>> it = this.f8647a.iterator();
        while (it.hasNext()) {
            if (it.next().m5216a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void m5215c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
        this.f8647a.add(new Entry<>(cls, cls2, resourceTranscoder));
    }
}
