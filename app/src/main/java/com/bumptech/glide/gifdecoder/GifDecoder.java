package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface GifDecoder {

    public interface BitmapProvider {
        @NonNull
        /* renamed from: a */
        Bitmap mo4934a(int i2, int i3, @NonNull Bitmap.Config config);

        @NonNull
        /* renamed from: b */
        int[] mo4935b(int i2);

        /* renamed from: c */
        void mo4936c(@NonNull Bitmap bitmap);

        /* renamed from: d */
        void mo4937d(@NonNull byte[] bArr);

        @NonNull
        /* renamed from: e */
        byte[] mo4938e(int i2);

        /* renamed from: f */
        void mo4939f(@NonNull int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    @NonNull
    /* renamed from: a */
    ByteBuffer mo4927a();

    @Nullable
    /* renamed from: b */
    Bitmap mo4928b();

    /* renamed from: c */
    void mo4929c();

    void clear();

    /* renamed from: d */
    int mo4930d();

    /* renamed from: e */
    int mo4931e();

    /* renamed from: f */
    int mo4932f();

    /* renamed from: g */
    int mo4933g();
}
