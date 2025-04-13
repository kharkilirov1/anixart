package com.bumptech.glide.provider;

import androidx.collection.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ModelToResourceClassCache {

    /* renamed from: a */
    public final AtomicReference<MultiClassKey> f8695a = new AtomicReference<>();

    /* renamed from: b */
    public final ArrayMap<MultiClassKey, List<Class<?>>> f8696b = new ArrayMap<>();
}
