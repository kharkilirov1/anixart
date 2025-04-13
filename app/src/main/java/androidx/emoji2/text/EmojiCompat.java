package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
/* loaded from: classes.dex */
public class EmojiCompat {

    /* renamed from: j */
    public static final Object f4003j = new Object();

    /* renamed from: k */
    @Nullable
    @GuardedBy
    public static volatile EmojiCompat f4004k;

    /* renamed from: a */
    @NonNull
    public final ReadWriteLock f4005a;

    /* renamed from: b */
    @NonNull
    @GuardedBy
    public final Set<InitCallback> f4006b;

    /* renamed from: c */
    @GuardedBy
    public volatile int f4007c;

    /* renamed from: d */
    @NonNull
    public final Handler f4008d;

    /* renamed from: e */
    @NonNull
    public final CompatInternal f4009e;

    /* renamed from: f */
    @NonNull
    public final MetadataRepoLoader f4010f;

    /* renamed from: g */
    public final int f4011g;

    /* renamed from: h */
    public final int f4012h;

    /* renamed from: i */
    public final GlyphChecker f4013i;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CodepointSequenceMatchResult {
    }

    public static class CompatInternal {

        /* renamed from: a */
        public final EmojiCompat f4014a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.f4014a = emojiCompat;
        }

        /* renamed from: a */
        public void mo2808a() {
            this.f4014a.m2803h();
        }

        /* renamed from: b */
        public CharSequence mo2809b(@NonNull CharSequence charSequence, @IntRange int i2, @IntRange int i3, @IntRange int i4, boolean z) {
            return charSequence;
        }

        /* renamed from: c */
        public void mo2810c(@NonNull EditorInfo editorInfo) {
        }
    }

    @RequiresApi
    public static final class CompatInternal19 extends CompatInternal {

        /* renamed from: b */
        public volatile EmojiProcessor f4015b;

        /* renamed from: c */
        public volatile MetadataRepo f4016c;

        public CompatInternal19(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        /* renamed from: a */
        public void mo2808a() {
            try {
                this.f4014a.f4010f.mo2813a(new MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal19.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    /* renamed from: a */
                    public void mo2811a(@Nullable Throwable th) {
                        CompatInternal19.this.f4014a.m2802g(th);
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    /* renamed from: b */
                    public void mo2812b(@NonNull MetadataRepo metadataRepo) {
                        CompatInternal19 compatInternal19 = CompatInternal19.this;
                        if (metadataRepo == null) {
                            compatInternal19.f4014a.m2802g(new IllegalArgumentException("metadataRepo cannot be null"));
                            return;
                        }
                        compatInternal19.f4016c = metadataRepo;
                        MetadataRepo metadataRepo2 = compatInternal19.f4016c;
                        SpanFactory spanFactory = new SpanFactory();
                        EmojiCompat emojiCompat = compatInternal19.f4014a;
                        GlyphChecker glyphChecker = emojiCompat.f4013i;
                        Objects.requireNonNull(emojiCompat);
                        compatInternal19.f4015b = new EmojiProcessor(metadataRepo2, spanFactory, glyphChecker, false, null);
                        compatInternal19.f4014a.m2803h();
                    }
                });
            } catch (Throwable th) {
                this.f4014a.m2802g(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:93:0x014f, code lost:
        
            if (r6 != false) goto L87;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:101:0x001c, B:104:0x0021, B:106:0x0025, B:108:0x0034, B:9:0x0045, B:11:0x004f, B:13:0x0052, B:15:0x0056, B:17:0x0062, B:19:0x0065, B:23:0x0072, B:29:0x0081, B:30:0x008f, B:35:0x00ab, B:45:0x00b9, B:50:0x00c5, B:51:0x00cf, B:53:0x00e5, B:55:0x00ec, B:58:0x00f1, B:60:0x00fc, B:64:0x0103, B:66:0x0107, B:68:0x010d, B:70:0x0111, B:76:0x0120, B:79:0x012c, B:80:0x0132, B:82:0x0145, B:6:0x003a), top: B:100:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f1 A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:101:0x001c, B:104:0x0021, B:106:0x0025, B:108:0x0034, B:9:0x0045, B:11:0x004f, B:13:0x0052, B:15:0x0056, B:17:0x0062, B:19:0x0065, B:23:0x0072, B:29:0x0081, B:30:0x008f, B:35:0x00ab, B:45:0x00b9, B:50:0x00c5, B:51:0x00cf, B:53:0x00e5, B:55:0x00ec, B:58:0x00f1, B:60:0x00fc, B:64:0x0103, B:66:0x0107, B:68:0x010d, B:70:0x0111, B:76:0x0120, B:79:0x012c, B:80:0x0132, B:82:0x0145, B:6:0x003a), top: B:100:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x012c A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:101:0x001c, B:104:0x0021, B:106:0x0025, B:108:0x0034, B:9:0x0045, B:11:0x004f, B:13:0x0052, B:15:0x0056, B:17:0x0062, B:19:0x0065, B:23:0x0072, B:29:0x0081, B:30:0x008f, B:35:0x00ab, B:45:0x00b9, B:50:0x00c5, B:51:0x00cf, B:53:0x00e5, B:55:0x00ec, B:58:0x00f1, B:60:0x00fc, B:64:0x0103, B:66:0x0107, B:68:0x010d, B:70:0x0111, B:76:0x0120, B:79:0x012c, B:80:0x0132, B:82:0x0145, B:6:0x003a), top: B:100:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0145 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #0 {all -> 0x015c, blocks: (B:101:0x001c, B:104:0x0021, B:106:0x0025, B:108:0x0034, B:9:0x0045, B:11:0x004f, B:13:0x0052, B:15:0x0056, B:17:0x0062, B:19:0x0065, B:23:0x0072, B:29:0x0081, B:30:0x008f, B:35:0x00ab, B:45:0x00b9, B:50:0x00c5, B:51:0x00cf, B:53:0x00e5, B:55:0x00ec, B:58:0x00f1, B:60:0x00fc, B:64:0x0103, B:66:0x0107, B:68:0x010d, B:70:0x0111, B:76:0x0120, B:79:0x012c, B:80:0x0132, B:82:0x0145, B:6:0x003a), top: B:100:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.CharSequence mo2809b(@androidx.annotation.NonNull java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiCompat.CompatInternal19.mo2809b(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        /* renamed from: c */
        public void mo2810c(@NonNull EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            MetadataList metadataList = this.f4016c.f4063a;
            int m2864a = metadataList.m2864a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", m2864a != 0 ? metadataList.f4104b.getInt(m2864a + metadataList.f4103a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.f4014a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public static abstract class Config {

        /* renamed from: a */
        @NonNull
        public final MetadataRepoLoader f4018a;

        /* renamed from: b */
        public int f4019b = 0;

        /* renamed from: c */
        @NonNull
        public GlyphChecker f4020c = new DefaultGlyphChecker();

        public Config(@NonNull MetadataRepoLoader metadataRepoLoader) {
            this.f4018a = metadataRepoLoader;
        }
    }

    public interface GlyphChecker {
        /* renamed from: a */
        boolean mo2795a(@NonNull CharSequence charSequence, @IntRange int i2, @IntRange int i3, @IntRange int i4);
    }

    public static abstract class InitCallback {
        /* renamed from: a */
        public void mo943a(@Nullable Throwable th) {
        }

        /* renamed from: b */
        public void mo944b() {
        }
    }

    public static class ListenerDispatcher implements Runnable {

        /* renamed from: b */
        public final List<InitCallback> f4021b;

        /* renamed from: c */
        public final Throwable f4022c;

        /* renamed from: d */
        public final int f4023d;

        public ListenerDispatcher(@NonNull Collection<InitCallback> collection, int i2, @Nullable Throwable th) {
            Preconditions.m2032e(collection, "initCallbacks cannot be null");
            this.f4021b = new ArrayList(collection);
            this.f4023d = i2;
            this.f4022c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4021b.size();
            int i2 = 0;
            if (this.f4023d != 1) {
                while (i2 < size) {
                    this.f4021b.get(i2).mo943a(this.f4022c);
                    i2++;
                }
            } else {
                while (i2 < size) {
                    this.f4021b.get(i2).mo944b();
                    i2++;
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        /* renamed from: a */
        void mo2813a(@NonNull MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        /* renamed from: a */
        public abstract void mo2811a(@Nullable Throwable th);

        /* renamed from: b */
        public abstract void mo2812b(@NonNull MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ReplaceStrategy {
    }

    @RequiresApi
    @RestrictTo
    public static class SpanFactory {
    }

    public EmojiCompat(@NonNull Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4005a = reentrantReadWriteLock;
        this.f4007c = 3;
        Objects.requireNonNull(config);
        this.f4011g = -16711936;
        this.f4010f = config.f4018a;
        int i2 = config.f4019b;
        this.f4012h = i2;
        this.f4013i = config.f4020c;
        this.f4008d = new Handler(Looper.getMainLooper());
        this.f4006b = new ArraySet(0);
        CompatInternal19 compatInternal19 = new CompatInternal19(this);
        this.f4009e = compatInternal19;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f4007c = 0;
            } catch (Throwable th) {
                this.f4005a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m2799b() == 0) {
            compatInternal19.mo2808a();
        }
    }

    @NonNull
    /* renamed from: a */
    public static EmojiCompat m2796a() {
        EmojiCompat emojiCompat;
        synchronized (f4003j) {
            emojiCompat = f4004k;
            Preconditions.m2033f(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    /* renamed from: c */
    public static boolean m2797c(@NonNull Editable editable, int i2, @NonNull KeyEvent keyEvent) {
        if (!(i2 != 67 ? i2 != 112 ? false : EmojiProcessor.m2828a(editable, keyEvent, true) : EmojiProcessor.m2828a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: d */
    public static boolean m2798d() {
        return f4004k != null;
    }

    /* renamed from: b */
    public int m2799b() {
        this.f4005a.readLock().lock();
        try {
            return this.f4007c;
        } finally {
            this.f4005a.readLock().unlock();
        }
    }

    /* renamed from: e */
    public final boolean m2800e() {
        return m2799b() == 1;
    }

    /* renamed from: f */
    public void m2801f() {
        Preconditions.m2033f(this.f4012h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m2800e()) {
            return;
        }
        this.f4005a.writeLock().lock();
        try {
            if (this.f4007c == 0) {
                return;
            }
            this.f4007c = 0;
            this.f4005a.writeLock().unlock();
            this.f4009e.mo2808a();
        } finally {
            this.f4005a.writeLock().unlock();
        }
    }

    /* renamed from: g */
    public void m2802g(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4005a.writeLock().lock();
        try {
            this.f4007c = 2;
            arrayList.addAll(this.f4006b);
            this.f4006b.clear();
            this.f4005a.writeLock().unlock();
            this.f4008d.post(new ListenerDispatcher(arrayList, this.f4007c, th));
        } catch (Throwable th2) {
            this.f4005a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: h */
    public void m2803h() {
        ArrayList arrayList = new ArrayList();
        this.f4005a.writeLock().lock();
        try {
            this.f4007c = 1;
            arrayList.addAll(this.f4006b);
            this.f4006b.clear();
            this.f4005a.writeLock().unlock();
            this.f4008d.post(new ListenerDispatcher(arrayList, this.f4007c, null));
        } catch (Throwable th) {
            this.f4005a.writeLock().unlock();
            throw th;
        }
    }

    @Nullable
    @CheckResult
    /* renamed from: i */
    public CharSequence m2804i(@Nullable CharSequence charSequence) {
        return m2805j(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    @Nullable
    @CheckResult
    /* renamed from: j */
    public CharSequence m2805j(@Nullable CharSequence charSequence, @IntRange int i2, @IntRange int i3, @IntRange int i4, int i5) {
        Preconditions.m2033f(m2800e(), "Not initialized yet");
        Preconditions.m2031d(i2, "start cannot be negative");
        Preconditions.m2031d(i3, "end cannot be negative");
        Preconditions.m2031d(i4, "maxEmojiCount cannot be negative");
        Preconditions.m2028a(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        Preconditions.m2028a(i2 <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.m2028a(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.f4009e.mo2809b(charSequence, i2, i3, i4, i5 == 1);
    }

    /* renamed from: k */
    public void m2806k(@NonNull InitCallback initCallback) {
        Preconditions.m2032e(initCallback, "initCallback cannot be null");
        this.f4005a.writeLock().lock();
        try {
            if (this.f4007c != 1 && this.f4007c != 2) {
                this.f4006b.add(initCallback);
            }
            this.f4008d.post(new ListenerDispatcher(Arrays.asList(initCallback), this.f4007c, null));
        } finally {
            this.f4005a.writeLock().unlock();
        }
    }

    /* renamed from: l */
    public void m2807l(@NonNull EditorInfo editorInfo) {
        if (!m2800e() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f4009e.mo2810c(editorInfo);
    }
}
