package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class SourceGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object>, DataFetcherGenerator.FetcherReadyCallback {

    /* renamed from: b */
    public final DecodeHelper<?> f8316b;

    /* renamed from: c */
    public final DataFetcherGenerator.FetcherReadyCallback f8317c;

    /* renamed from: d */
    public int f8318d;

    /* renamed from: e */
    public DataCacheGenerator f8319e;

    /* renamed from: f */
    public Object f8320f;

    /* renamed from: g */
    public volatile ModelLoader.LoadData<?> f8321g;

    /* renamed from: h */
    public DataCacheKey f8322h;

    public SourceGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f8316b = decodeHelper;
        this.f8317c = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    /* renamed from: a */
    public void mo4992a(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        this.f8317c.mo4992a(key, exc, dataFetcher, this.f8321g.f8460c.mo4970d());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /* renamed from: b */
    public boolean mo4990b() {
        Object obj = this.f8320f;
        if (obj != null) {
            this.f8320f = null;
            int i2 = LogTime.f8843b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                Encoder m5244b = this.f8316b.f8129c.f7905b.f7925b.m5244b(obj.getClass());
                if (m5244b == null) {
                    throw new Registry.NoSourceEncoderAvailableException(obj.getClass());
                }
                DataCacheWriter dataCacheWriter = new DataCacheWriter(m5244b, obj, this.f8316b.f8135i);
                Key key = this.f8321g.f8458a;
                DecodeHelper<?> decodeHelper = this.f8316b;
                this.f8322h = new DataCacheKey(key, decodeHelper.f8140n);
                decodeHelper.m4996b().mo5104a(this.f8322h, dataCacheWriter);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f8322h + ", data: " + obj + ", encoder: " + m5244b + ", duration: " + LogTime.m5335a(elapsedRealtimeNanos));
                }
                this.f8321g.f8460c.mo4968b();
                this.f8319e = new DataCacheGenerator(Collections.singletonList(this.f8321g.f8458a), this.f8316b, this);
            } catch (Throwable th) {
                this.f8321g.f8460c.mo4968b();
                throw th;
            }
        }
        DataCacheGenerator dataCacheGenerator = this.f8319e;
        if (dataCacheGenerator != null && dataCacheGenerator.mo4990b()) {
            return true;
        }
        this.f8319e = null;
        this.f8321g = null;
        boolean z = false;
        while (!z) {
            if (!(this.f8318d < this.f8316b.m4997c().size())) {
                break;
            }
            List<ModelLoader.LoadData<?>> m4997c = this.f8316b.m4997c();
            int i3 = this.f8318d;
            this.f8318d = i3 + 1;
            this.f8321g = m4997c.get(i3);
            if (this.f8321g != null && (this.f8316b.f8142p.mo5023c(this.f8321g.f8460c.mo4970d()) || this.f8316b.m5001g(this.f8321g.f8460c.mo4965a()))) {
                this.f8321g.f8460c.mo4971e(this.f8316b.f8141o, this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    /* renamed from: c */
    public void mo4973c(@NonNull Exception exc) {
        this.f8317c.mo4992a(this.f8322h, exc, this.f8321g.f8460c, this.f8321g.f8460c.mo4970d());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.f8321g;
        if (loadData != null) {
            loadData.f8460c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    /* renamed from: d */
    public void mo4993d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    /* renamed from: e */
    public void mo4994e(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.f8317c.mo4994e(key, obj, dataFetcher, this.f8321g.f8460c.mo4970d(), key);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    /* renamed from: f */
    public void mo4974f(Object obj) {
        DiskCacheStrategy diskCacheStrategy = this.f8316b.f8142p;
        if (obj == null || !diskCacheStrategy.mo5023c(this.f8321g.f8460c.mo4970d())) {
            this.f8317c.mo4994e(this.f8321g.f8458a, obj, this.f8321g.f8460c, this.f8321g.f8460c.mo4970d(), this.f8322h);
        } else {
            this.f8320f = obj;
            this.f8317c.mo4993d();
        }
    }
}
