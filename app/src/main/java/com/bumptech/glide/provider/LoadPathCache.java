package com.bumptech.glide.provider;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class LoadPathCache {

    /* renamed from: c */
    public static final LoadPath<?, ?, ?> f8692c = new LoadPath<>(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null)), null);

    /* renamed from: a */
    public final ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> f8693a = new ArrayMap<>();

    /* renamed from: b */
    public final AtomicReference<MultiClassKey> f8694b = new AtomicReference<>();
}
