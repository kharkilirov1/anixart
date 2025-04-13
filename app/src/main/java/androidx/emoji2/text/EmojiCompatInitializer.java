package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    @RequiresApi
    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
        public BackgroundDefaultConfig(Context context) {
            super(new BackgroundDefaultLoader(context));
            this.f4019b = 1;
        }
    }

    @RequiresApi
    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a */
        public final Context f4026a;

        public BackgroundDefaultLoader(Context context) {
            this.f4026a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        /* renamed from: a */
        public void mo2813a(@NonNull final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor m2788a = ConcurrencyHelpers.m2788a("EmojiCompatInitializer");
            m2788a.execute(new Runnable() { // from class: androidx.emoji2.text.b
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader = EmojiCompatInitializer.BackgroundDefaultLoader.this;
                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = metadataRepoLoaderCallback;
                    ThreadPoolExecutor threadPoolExecutor = m2788a;
                    Objects.requireNonNull(backgroundDefaultLoader);
                    try {
                        FontRequestEmojiCompatConfig m2791a = DefaultEmojiCompatConfig.m2791a(backgroundDefaultLoader.f4026a);
                        if (m2791a == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = (FontRequestEmojiCompatConfig.FontRequestMetadataLoader) m2791a.f4018a;
                        synchronized (fontRequestMetadataLoader.f4054d) {
                            fontRequestMetadataLoader.f4056f = threadPoolExecutor;
                        }
                        m2791a.f4018a.mo2813a(new EmojiCompat.MetadataRepoLoaderCallback(backgroundDefaultLoader, metadataRepoLoaderCallback2, threadPoolExecutor) { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1

                            /* renamed from: a */
                            public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f4027a;

                            /* renamed from: b */
                            public final /* synthetic */ ThreadPoolExecutor f4028b;

                            {
                                this.f4027a = metadataRepoLoaderCallback2;
                                this.f4028b = threadPoolExecutor;
                            }

                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            /* renamed from: a */
                            public void mo2811a(@Nullable Throwable th) {
                                try {
                                    this.f4027a.mo2811a(th);
                                } finally {
                                    this.f4028b.shutdown();
                                }
                            }

                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            /* renamed from: b */
                            public void mo2812b(@NonNull MetadataRepo metadataRepo) {
                                try {
                                    this.f4027a.mo2812b(metadataRepo);
                                } finally {
                                    this.f4028b.shutdown();
                                }
                            }
                        });
                    } catch (Throwable th) {
                        metadataRepoLoaderCallback2.mo2811a(th);
                        threadPoolExecutor.shutdown();
                    }
                }
            });
        }
    }

    public static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                TraceCompat.m1969a("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.m2798d()) {
                    EmojiCompat.m2796a().m2801f();
                }
            } finally {
                TraceCompat.m1970b();
            }
        }
    }

    @Override // androidx.startup.Initializer
    @NonNull
    /* renamed from: a */
    public List<Class<? extends Initializer<?>>> mo2814a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.startup.Initializer
    @NonNull
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Boolean mo2815b(@NonNull Context context) {
        m2816c(context);
        return Boolean.TRUE;
    }

    @NonNull
    /* renamed from: c */
    public Boolean m2816c(@NonNull Context context) {
        Object obj;
        BackgroundDefaultConfig backgroundDefaultConfig = new BackgroundDefaultConfig(context);
        if (EmojiCompat.f4004k == null) {
            synchronized (EmojiCompat.f4003j) {
                if (EmojiCompat.f4004k == null) {
                    EmojiCompat.f4004k = new EmojiCompat(backgroundDefaultConfig);
                }
            }
        }
        AppInitializer m4160c = AppInitializer.m4160c(context);
        Objects.requireNonNull(m4160c);
        synchronized (AppInitializer.f6040e) {
            obj = m4160c.f6041a.get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = m4160c.m4162b(ProcessLifecycleInitializer.class, new HashSet());
            }
        }
        final Lifecycle lifecycle = ((LifecycleOwner) obj).getLifecycle();
        lifecycle.mo3187a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.FullLifecycleObserver
            /* renamed from: a */
            public void mo2817a(@NonNull LifecycleOwner lifecycleOwner) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                ConcurrencyHelpers.m2789b().postDelayed(new LoadEmojiCompatRunnable(), 500L);
                lifecycle.mo3189c(this);
            }

            @Override // androidx.lifecycle.FullLifecycleObserver
            /* renamed from: b */
            public /* synthetic */ void mo2818b(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.FullLifecycleObserver
            /* renamed from: d */
            public /* synthetic */ void mo2819d(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.FullLifecycleObserver
            /* renamed from: e */
            public /* synthetic */ void mo2820e(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.FullLifecycleObserver
            /* renamed from: f */
            public /* synthetic */ void mo2821f(LifecycleOwner lifecycleOwner) {
            }

            @Override // androidx.lifecycle.FullLifecycleObserver
            /* renamed from: g */
            public /* synthetic */ void mo2822g(LifecycleOwner lifecycleOwner) {
            }
        });
        return Boolean.TRUE;
    }
}
