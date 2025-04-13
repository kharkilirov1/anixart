package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.provider.BaseColumns;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.RequestExecutor;
import androidx.core.util.Consumer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class FontsContractCompat {

    public static final class Columns implements BaseColumns {
    }

    public static class FontFamilyResult {

        /* renamed from: a */
        public final int f3494a;

        /* renamed from: b */
        public final FontInfo[] f3495b;

        @RestrictTo
        @Deprecated
        public FontFamilyResult(int i2, @Nullable FontInfo[] fontInfoArr) {
            this.f3494a = i2;
            this.f3495b = fontInfoArr;
        }
    }

    public static class FontInfo {

        /* renamed from: a */
        public final Uri f3496a;

        /* renamed from: b */
        public final int f3497b;

        /* renamed from: c */
        public final int f3498c;

        /* renamed from: d */
        public final boolean f3499d;

        /* renamed from: e */
        public final int f3500e;

        @RestrictTo
        @Deprecated
        public FontInfo(@NonNull Uri uri, @IntRange int i2, @IntRange int i3, boolean z, int i4) {
            Objects.requireNonNull(uri);
            this.f3496a = uri;
            this.f3497b = i2;
            this.f3498c = i3;
            this.f3499d = z;
            this.f3500e = i4;
        }
    }

    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface FontRequestFailReason {
        }

        /* renamed from: a */
        public void mo1798a(int i2) {
        }

        /* renamed from: b */
        public void mo1799b(Typeface typeface) {
        }
    }

    @NonNull
    /* renamed from: a */
    public static FontFamilyResult m1996a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        return FontProvider.m1993a(context, fontRequest, null);
    }

    @Nullable
    @RestrictTo
    /* renamed from: b */
    public static Typeface m1997b(@NonNull final Context context, @NonNull final FontRequest fontRequest, final int i2, boolean z, @IntRange int i3, @NonNull Handler handler, @NonNull FontRequestCallback fontRequestCallback) {
        final CallbackWithHandler callbackWithHandler = new CallbackWithHandler(fontRequestCallback, handler);
        if (z) {
            LruCache<String, Typeface> lruCache = FontRequestWorker.f3478a;
            final String str = fontRequest.f3477e + "-" + i2;
            Typeface m1105c = FontRequestWorker.f3478a.m1105c(str);
            if (m1105c != null) {
                callbackWithHandler.m1979a(new FontRequestWorker.TypefaceResult(m1105c));
                return m1105c;
            }
            if (i3 == -1) {
                FontRequestWorker.TypefaceResult m1995a = FontRequestWorker.m1995a(str, context, fontRequest, i2);
                callbackWithHandler.m1979a(m1995a);
                return m1995a.f3492a;
            }
            try {
                try {
                    try {
                        FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) FontRequestWorker.f3479b.submit(new Callable<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                            @Override // java.util.concurrent.Callable
                            public TypefaceResult call() throws Exception {
                                return FontRequestWorker.m1995a(str, context, fontRequest, i2);
                            }
                        }).get(i3, TimeUnit.MILLISECONDS);
                        callbackWithHandler.m1979a(typefaceResult);
                        return typefaceResult.f3492a;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (ExecutionException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (InterruptedException unused2) {
                callbackWithHandler.m1979a(new FontRequestWorker.TypefaceResult(-3));
                return null;
            }
        }
        LruCache<String, Typeface> lruCache2 = FontRequestWorker.f3478a;
        final String str2 = fontRequest.f3477e + "-" + i2;
        Typeface m1105c2 = FontRequestWorker.f3478a.m1105c(str2);
        if (m1105c2 != null) {
            callbackWithHandler.m1979a(new FontRequestWorker.TypefaceResult(m1105c2));
            return m1105c2;
        }
        Consumer<FontRequestWorker.TypefaceResult> consumer = new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public void accept(TypefaceResult typefaceResult2) {
                TypefaceResult typefaceResult3 = typefaceResult2;
                if (typefaceResult3 == null) {
                    typefaceResult3 = new TypefaceResult(-3);
                }
                CallbackWithHandler.this.m1979a(typefaceResult3);
            }
        };
        synchronized (FontRequestWorker.f3480c) {
            SimpleArrayMap<String, ArrayList<Consumer<FontRequestWorker.TypefaceResult>>> simpleArrayMap = FontRequestWorker.f3481d;
            ArrayList<Consumer<FontRequestWorker.TypefaceResult>> orDefault = simpleArrayMap.getOrDefault(str2, null);
            if (orDefault != null) {
                orDefault.add(consumer);
            } else {
                ArrayList<Consumer<FontRequestWorker.TypefaceResult>> arrayList = new ArrayList<>();
                arrayList.add(consumer);
                simpleArrayMap.put(str2, arrayList);
                ((ThreadPoolExecutor) FontRequestWorker.f3479b).execute(new RequestExecutor.ReplyRunnable(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new Callable<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                    @Override // java.util.concurrent.Callable
                    public TypefaceResult call() throws Exception {
                        try {
                            return FontRequestWorker.m1995a(str2, context, fontRequest, i2);
                        } catch (Throwable unused3) {
                            return new TypefaceResult(-3);
                        }
                    }
                }, new Consumer<FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                    @Override // androidx.core.util.Consumer
                    public void accept(TypefaceResult typefaceResult2) {
                        TypefaceResult typefaceResult3 = typefaceResult2;
                        synchronized (FontRequestWorker.f3480c) {
                            SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> simpleArrayMap2 = FontRequestWorker.f3481d;
                            ArrayList<Consumer<TypefaceResult>> arrayList2 = simpleArrayMap2.get(str2);
                            if (arrayList2 == null) {
                                return;
                            }
                            simpleArrayMap2.remove(str2);
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                arrayList2.get(i4).accept(typefaceResult3);
                            }
                        }
                    }
                }));
            }
        }
        return null;
    }
}
