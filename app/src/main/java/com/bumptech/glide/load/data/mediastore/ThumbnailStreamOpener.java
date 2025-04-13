package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.List;

/* loaded from: classes.dex */
class ThumbnailStreamOpener {

    /* renamed from: f */
    public static final FileService f8097f = new FileService();

    /* renamed from: a */
    public final FileService f8098a = f8097f;

    /* renamed from: b */
    public final ThumbnailQuery f8099b;

    /* renamed from: c */
    public final ArrayPool f8100c;

    /* renamed from: d */
    public final ContentResolver f8101d;

    /* renamed from: e */
    public final List<ImageHeaderParser> f8102e;

    public ThumbnailStreamOpener(List<ImageHeaderParser> list, ThumbnailQuery thumbnailQuery, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f8099b = thumbnailQuery;
        this.f8100c = arrayPool;
        this.f8101d = contentResolver;
        this.f8102e = list;
    }
}
