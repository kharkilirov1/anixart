package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class DataCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {

    /* renamed from: b */
    public final List<Key> f8113b;

    /* renamed from: c */
    public final DecodeHelper<?> f8114c;

    /* renamed from: d */
    public final DataFetcherGenerator.FetcherReadyCallback f8115d;

    /* renamed from: e */
    public int f8116e;

    /* renamed from: f */
    public Key f8117f;

    /* renamed from: g */
    public List<ModelLoader<File, ?>> f8118g;

    /* renamed from: h */
    public int f8119h;

    /* renamed from: i */
    public volatile ModelLoader.LoadData<?> f8120i;

    /* renamed from: j */
    public File f8121j;

    public DataCacheGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        List<Key> m4995a = decodeHelper.m4995a();
        this.f8116e = -1;
        this.f8113b = m4995a;
        this.f8114c = decodeHelper;
        this.f8115d = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /* renamed from: b */
    public boolean mo4990b() {
        while (true) {
            List<ModelLoader<File, ?>> list = this.f8118g;
            if (list != null) {
                if (this.f8119h < list.size()) {
                    this.f8120i = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f8119h < this.f8118g.size())) {
                            break;
                        }
                        List<ModelLoader<File, ?>> list2 = this.f8118g;
                        int i2 = this.f8119h;
                        this.f8119h = i2 + 1;
                        ModelLoader<File, ?> modelLoader = list2.get(i2);
                        File file = this.f8121j;
                        DecodeHelper<?> decodeHelper = this.f8114c;
                        this.f8120i = modelLoader.mo5128b(file, decodeHelper.f8131e, decodeHelper.f8132f, decodeHelper.f8135i);
                        if (this.f8120i != null && this.f8114c.m5001g(this.f8120i.f8460c.mo4965a())) {
                            this.f8120i.f8460c.mo4971e(this.f8114c.f8141o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f8116e + 1;
            this.f8116e = i3;
            if (i3 >= this.f8113b.size()) {
                return false;
            }
            Key key = this.f8113b.get(this.f8116e);
            DecodeHelper<?> decodeHelper2 = this.f8114c;
            File mo5105b = decodeHelper2.m4996b().mo5105b(new DataCacheKey(key, decodeHelper2.f8140n));
            this.f8121j = mo5105b;
            if (mo5105b != null) {
                this.f8117f = key;
                this.f8118g = this.f8114c.m4999e(mo5105b);
                this.f8119h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    /* renamed from: c */
    public void mo4973c(@NonNull Exception exc) {
        this.f8115d.mo4992a(this.f8117f, exc, this.f8120i.f8460c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.f8120i;
        if (loadData != null) {
            loadData.f8460c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    /* renamed from: f */
    public void mo4974f(Object obj) {
        this.f8115d.mo4994e(this.f8117f, obj, this.f8120i.f8460c, DataSource.DATA_DISK_CACHE, this.f8117f);
    }

    public DataCacheGenerator(List<Key> list, DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f8116e = -1;
        this.f8113b = list;
        this.f8114c = decodeHelper;
        this.f8115d = fetcherReadyCallback;
    }
}
