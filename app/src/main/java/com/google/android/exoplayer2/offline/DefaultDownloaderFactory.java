package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.dash.offline.DashDownloader;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloader;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {

    /* renamed from: a */
    public static final SparseArray<Constructor<? extends Downloader>> f12146a;

    static {
        SparseArray<Constructor<? extends Downloader>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, m6735a(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, m6735a(HlsDownloader.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, m6735a(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f12146a = sparseArray;
    }

    /* renamed from: a */
    public static Constructor<? extends Downloader> m6735a(Class<?> cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Downloader constructor missing", e2);
        }
    }
}
