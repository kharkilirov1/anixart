package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p000a.C0000a;

/* loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {

    /* renamed from: d */
    public static final FontProviderHelper f4050d = new FontProviderHelper();

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
    }

    @RestrictTo
    public static class FontProviderHelper {
    }

    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a */
        @NonNull
        public final Context f4051a;

        /* renamed from: b */
        @NonNull
        public final FontRequest f4052b;

        /* renamed from: c */
        @NonNull
        public final FontProviderHelper f4053c;

        /* renamed from: d */
        @NonNull
        public final Object f4054d = new Object();

        /* renamed from: e */
        @Nullable
        @GuardedBy
        public Handler f4055e;

        /* renamed from: f */
        @Nullable
        @GuardedBy
        public Executor f4056f;

        /* renamed from: g */
        @Nullable
        @GuardedBy
        public ThreadPoolExecutor f4057g;

        /* renamed from: h */
        @Nullable
        @GuardedBy
        public EmojiCompat.MetadataRepoLoaderCallback f4058h;

        /* renamed from: i */
        @Nullable
        @GuardedBy
        public ContentObserver f4059i;

        /* renamed from: j */
        @Nullable
        @GuardedBy
        public Runnable f4060j;

        /* renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 */
        class C03151 extends ContentObserver {

            /* renamed from: a */
            public final /* synthetic */ FontRequestMetadataLoader f4061a;

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                this.f4061a.m2834c();
            }
        }

        public FontRequestMetadataLoader(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontProviderHelper fontProviderHelper) {
            Preconditions.m2032e(context, "Context cannot be null");
            Preconditions.m2032e(fontRequest, "FontRequest cannot be null");
            this.f4051a = context.getApplicationContext();
            this.f4052b = fontRequest;
            this.f4053c = fontProviderHelper;
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        @RequiresApi
        /* renamed from: a */
        public void mo2813a(@NonNull EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            synchronized (this.f4054d) {
                this.f4058h = metadataRepoLoaderCallback;
            }
            m2834c();
        }

        /* renamed from: b */
        public final void m2833b() {
            synchronized (this.f4054d) {
                this.f4058h = null;
                ContentObserver contentObserver = this.f4059i;
                if (contentObserver != null) {
                    FontProviderHelper fontProviderHelper = this.f4053c;
                    Context context = this.f4051a;
                    Objects.requireNonNull(fontProviderHelper);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.f4059i = null;
                }
                Handler handler = this.f4055e;
                if (handler != null) {
                    handler.removeCallbacks(this.f4060j);
                }
                this.f4055e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4057g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4056f = null;
                this.f4057g = null;
            }
        }

        @RequiresApi
        /* renamed from: c */
        public void m2834c() {
            synchronized (this.f4054d) {
                if (this.f4058h == null) {
                    return;
                }
                if (this.f4056f == null) {
                    ThreadPoolExecutor m2788a = ConcurrencyHelpers.m2788a("emojiCompat");
                    this.f4057g = m2788a;
                    this.f4056f = m2788a;
                }
                final int i2 = 0;
                this.f4056f.execute(new Runnable(this) { // from class: androidx.emoji2.text.c

                    /* renamed from: c */
                    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f4080c;

                    {
                        this.f4080c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.f4080c;
                                synchronized (fontRequestMetadataLoader.f4054d) {
                                    if (fontRequestMetadataLoader.f4058h == null) {
                                        return;
                                    }
                                    try {
                                        FontsContractCompat.FontInfo m2835d = fontRequestMetadataLoader.m2835d();
                                        int i3 = m2835d.f3500e;
                                        if (i3 == 2) {
                                            synchronized (fontRequestMetadataLoader.f4054d) {
                                            }
                                        }
                                        if (i3 != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                                        }
                                        try {
                                            TraceCompat.m1969a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper = fontRequestMetadataLoader.f4053c;
                                            Context context = fontRequestMetadataLoader.f4051a;
                                            Objects.requireNonNull(fontProviderHelper);
                                            Typeface m1794a = TypefaceCompat.m1794a(context, null, new FontsContractCompat.FontInfo[]{m2835d}, 0);
                                            ByteBuffer m1827d = TypefaceCompatUtil.m1827d(fontRequestMetadataLoader.f4051a, null, m2835d.f3496a);
                                            if (m1827d == null || m1794a == null) {
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            try {
                                                TraceCompat.m1969a("EmojiCompat.MetadataRepo.create");
                                                MetadataRepo metadataRepo = new MetadataRepo(m1794a, MetadataListReader.m2836a(m1827d));
                                                TraceCompat.m1970b();
                                                synchronized (fontRequestMetadataLoader.f4054d) {
                                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = fontRequestMetadataLoader.f4058h;
                                                    if (metadataRepoLoaderCallback != null) {
                                                        metadataRepoLoaderCallback.mo2812b(metadataRepo);
                                                    }
                                                }
                                                fontRequestMetadataLoader.m2833b();
                                                return;
                                            } finally {
                                                TraceCompat.m1970b();
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        synchronized (fontRequestMetadataLoader.f4054d) {
                                            EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = fontRequestMetadataLoader.f4058h;
                                            if (metadataRepoLoaderCallback2 != null) {
                                                metadataRepoLoaderCallback2.mo2811a(th2);
                                            }
                                            fontRequestMetadataLoader.m2833b();
                                            return;
                                        }
                                    }
                                }
                            default:
                                this.f4080c.m2834c();
                                return;
                        }
                    }
                });
            }
        }

        @WorkerThread
        /* renamed from: d */
        public final FontsContractCompat.FontInfo m2835d() {
            try {
                FontProviderHelper fontProviderHelper = this.f4053c;
                Context context = this.f4051a;
                FontRequest fontRequest = this.f4052b;
                Objects.requireNonNull(fontProviderHelper);
                FontsContractCompat.FontFamilyResult m1996a = FontsContractCompat.m1996a(context, null, fontRequest);
                if (m1996a.f3494a != 0) {
                    throw new RuntimeException(C0000a.m18o(C0000a.m24u("fetchFonts failed ("), m1996a.f3494a, ")"));
                }
                FontsContractCompat.FontInfo[] fontInfoArr = m1996a.f3495b;
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fontInfoArr[0];
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }
    }

    public static abstract class RetryPolicy {
    }

    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest) {
        super(new FontRequestMetadataLoader(context, fontRequest, f4050d));
    }
}
