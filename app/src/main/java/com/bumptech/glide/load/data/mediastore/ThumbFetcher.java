package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {

    /* renamed from: b */
    public final Uri f8090b;

    /* renamed from: c */
    public final ThumbnailStreamOpener f8091c;

    /* renamed from: d */
    public InputStream f8092d;

    public static class ImageThumbnailQuery implements ThumbnailQuery {

        /* renamed from: b */
        public static final String[] f8093b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f8094a;

        public ImageThumbnailQuery(ContentResolver contentResolver) {
            this.f8094a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        /* renamed from: a */
        public Cursor mo4987a(Uri uri) {
            return this.f8094a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f8093b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class VideoThumbnailQuery implements ThumbnailQuery {

        /* renamed from: b */
        public static final String[] f8095b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f8096a;

        public VideoThumbnailQuery(ContentResolver contentResolver) {
            this.f8096a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        /* renamed from: a */
        public Cursor mo4987a(Uri uri) {
            return this.f8096a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f8095b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public ThumbFetcher(Uri uri, ThumbnailStreamOpener thumbnailStreamOpener) {
        this.f8090b = uri;
        this.f8091c = thumbnailStreamOpener;
    }

    /* renamed from: c */
    public static ThumbFetcher m4983c(Context context, Uri uri, ThumbnailQuery thumbnailQuery) {
        return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.m4871b(context).f7884e.m4879a(), thumbnailQuery, Glide.m4871b(context).f7885f, context.getContentResolver()));
    }

    /* renamed from: f */
    public static ThumbFetcher m4984f(Context context, Uri uri) {
        return m4983c(context, uri, new ImageThumbnailQuery(context.getContentResolver()));
    }

    /* renamed from: g */
    public static ThumbFetcher m4985g(Context context, Uri uri) {
        return m4983c(context, uri, new VideoThumbnailQuery(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo4965a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    /* renamed from: b */
    public void mo4968b() {
        InputStream inputStream = this.f8092d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    /* renamed from: d */
    public DataSource mo4970d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    /* renamed from: e */
    public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        try {
            InputStream m4986h = m4986h();
            this.f8092d = m4986h;
            dataCallback.mo4974f(m4986h);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            dataCallback.mo4973c(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream m4986h() throws java.io.FileNotFoundException {
        /*
            r10 = this;
            com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener r0 = r10.f8091c
            android.net.Uri r1 = r10.f8090b
            com.bumptech.glide.load.data.mediastore.ThumbnailQuery r2 = r0.f8099b
            android.database.Cursor r2 = r2.mo4987a(r1)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L21
            boolean r5 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L21
            java.lang.String r5 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1c
            r2.close()
            goto L27
        L1c:
            r0 = move-exception
            r2.close()
            throw r0
        L21:
            if (r2 == 0) goto L26
            r2.close()
        L26:
            r5 = r4
        L27:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L2f
        L2d:
            r0 = r4
            goto L61
        L2f:
            com.bumptech.glide.load.data.mediastore.FileService r2 = r0.f8098a
            java.util.Objects.requireNonNull(r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            com.bumptech.glide.load.data.mediastore.FileService r5 = r0.f8098a
            java.util.Objects.requireNonNull(r5)
            boolean r5 = r2.exists()
            if (r5 == 0) goto L54
            r5 = 0
            com.bumptech.glide.load.data.mediastore.FileService r7 = r0.f8098a
            java.util.Objects.requireNonNull(r7)
            long r7 = r2.length()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L54
            r3 = 1
        L54:
            if (r3 != 0) goto L57
            goto L2d
        L57:
            android.net.Uri r2 = android.net.Uri.fromFile(r2)
            android.content.ContentResolver r0 = r0.f8101d     // Catch: java.lang.NullPointerException -> Lb9
            java.io.InputStream r0 = r0.openInputStream(r2)     // Catch: java.lang.NullPointerException -> Lb9
        L61:
            r1 = -1
            if (r0 == 0) goto Laf
            com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener r2 = r10.f8091c
            android.net.Uri r3 = r10.f8090b
            java.util.Objects.requireNonNull(r2)
            java.lang.String r5 = "ThumbStreamOpener"
            android.content.ContentResolver r6 = r2.f8101d     // Catch: java.lang.Throwable -> L83 java.lang.NullPointerException -> L85 java.io.IOException -> L87
            java.io.InputStream r4 = r6.openInputStream(r3)     // Catch: java.lang.Throwable -> L83 java.lang.NullPointerException -> L85 java.io.IOException -> L87
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r6 = r2.f8102e     // Catch: java.lang.Throwable -> L83 java.lang.NullPointerException -> L85 java.io.IOException -> L87
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r2.f8100c     // Catch: java.lang.Throwable -> L83 java.lang.NullPointerException -> L85 java.io.IOException -> L87
            int r2 = com.bumptech.glide.load.ImageHeaderParserUtils.m4954a(r6, r4, r2)     // Catch: java.lang.Throwable -> L83 java.lang.NullPointerException -> L85 java.io.IOException -> L87
            if (r4 == 0) goto Lb0
            r4.close()     // Catch: java.io.IOException -> L81
            goto Lb0
        L81:
            goto Lb0
        L83:
            r0 = move-exception
            goto La9
        L85:
            r2 = move-exception
            goto L88
        L87:
            r2 = move-exception
        L88:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r5, r6)     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto La3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r6.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = "Failed to open uri: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L83
            r6.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L83
            android.util.Log.d(r5, r3, r2)     // Catch: java.lang.Throwable -> L83
        La3:
            if (r4 == 0) goto Laf
            r4.close()     // Catch: java.io.IOException -> Laf
            goto Laf
        La9:
            if (r4 == 0) goto Lae
            r4.close()     // Catch: java.io.IOException -> Lae
        Lae:
            throw r0
        Laf:
            r2 = -1
        Lb0:
            if (r2 == r1) goto Lb8
            com.bumptech.glide.load.data.ExifOrientationStream r1 = new com.bumptech.glide.load.data.ExifOrientationStream
            r1.<init>(r0, r2)
            r0 = r1
        Lb8:
            return r0
        Lb9:
            r0 = move-exception
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " -> "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            java.lang.Throwable r0 = r3.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.ThumbFetcher.m4986h():java.io.InputStream");
    }
}
