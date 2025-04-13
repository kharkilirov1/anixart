package com.bumptech.glide;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class GlideBuilder {

    /* renamed from: b */
    public Engine f7890b;

    /* renamed from: c */
    public BitmapPool f7891c;

    /* renamed from: d */
    public ArrayPool f7892d;

    /* renamed from: e */
    public MemoryCache f7893e;

    /* renamed from: f */
    public GlideExecutor f7894f;

    /* renamed from: g */
    public GlideExecutor f7895g;

    /* renamed from: h */
    public DiskCache.Factory f7896h;

    /* renamed from: i */
    public MemorySizeCalculator f7897i;

    /* renamed from: j */
    public ConnectivityMonitorFactory f7898j;

    /* renamed from: l */
    @Nullable
    public RequestManagerRetriever.RequestManagerFactory f7900l;

    /* renamed from: m */
    public GlideExecutor f7901m;

    /* renamed from: n */
    @Nullable
    public List<RequestListener<Object>> f7902n;

    /* renamed from: a */
    public final Map<Class<?>, TransitionOptions<?, ?>> f7889a = new ArrayMap();

    /* renamed from: k */
    public RequestOptions f7899k = new RequestOptions();
}
