package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LottieCompositionFactory {

    /* renamed from: a */
    public static final Map<String, LottieTask<LottieComposition>> f7154a = new HashMap();

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$5 */
    class CallableC07345 implements Callable<LottieResult<LottieComposition>> {
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
            Map<String, LottieTask<LottieComposition>> map = LottieCompositionFactory.f7154a;
            throw null;
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$6 */
    class CallableC07356 implements Callable<LottieResult<LottieComposition>> {
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
            return LottieCompositionFactory.m4655e(null, null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$7 */
    class CallableC07367 implements Callable<LottieResult<LottieComposition>> {
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
            return LottieCompositionFactory.m4653c(null, null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$8 */
    class CallableC07378 implements Callable<LottieResult<LottieComposition>> {
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() throws Exception {
            return LottieCompositionFactory.m4656f(null, null);
        }
    }

    /* renamed from: a */
    public static LottieTask<LottieComposition> m4651a(@Nullable final String str, Callable<LottieResult<LottieComposition>> callable) {
        final LottieComposition m1105c;
        if (str == null) {
            m1105c = null;
        } else {
            LottieCompositionCache lottieCompositionCache = LottieCompositionCache.f7493b;
            Objects.requireNonNull(lottieCompositionCache);
            m1105c = lottieCompositionCache.f7494a.m1105c(str);
        }
        if (m1105c != null) {
            return new LottieTask<>(new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.9
                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    return new LottieResult<>(LottieComposition.this);
                }
            });
        }
        if (str != null) {
            HashMap hashMap = (HashMap) f7154a;
            if (hashMap.containsKey(str)) {
                return (LottieTask) hashMap.get(str);
            }
        }
        LottieTask<LottieComposition> lottieTask = new LottieTask<>(callable);
        if (str != null) {
            lottieTask.m4685b(new LottieListener<LottieComposition>() { // from class: com.airbnb.lottie.LottieCompositionFactory.10
                @Override // com.airbnb.lottie.LottieListener
                public void onResult(LottieComposition lottieComposition) {
                    ((HashMap) LottieCompositionFactory.f7154a).remove(str);
                }
            });
            lottieTask.m4684a(new LottieListener<Throwable>() { // from class: com.airbnb.lottie.LottieCompositionFactory.11
                @Override // com.airbnb.lottie.LottieListener
                public void onResult(Throwable th) {
                    ((HashMap) LottieCompositionFactory.f7154a).remove(str);
                }
            });
            ((HashMap) f7154a).put(str, lottieTask);
        }
        return lottieTask;
    }

    @WorkerThread
    /* renamed from: b */
    public static LottieResult<LottieComposition> m4652b(InputStream inputStream, @Nullable String str) {
        try {
            return m4653c(JsonReader.m4786m(Okio.m34602d(Okio.m34607i(inputStream))), str);
        } finally {
            Utils.m4852b(inputStream);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public static LottieResult<LottieComposition> m4653c(JsonReader jsonReader, @Nullable String str) {
        return m4654d(jsonReader, str, true);
    }

    /* renamed from: d */
    public static LottieResult<LottieComposition> m4654d(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            try {
                LottieComposition m4785a = LottieCompositionMoshiParser.m4785a(jsonReader);
                if (str != null) {
                    LottieCompositionCache lottieCompositionCache = LottieCompositionCache.f7493b;
                    Objects.requireNonNull(lottieCompositionCache);
                    lottieCompositionCache.f7494a.m1106d(str, m4785a);
                }
                LottieResult<LottieComposition> lottieResult = new LottieResult<>(m4785a);
                if (z) {
                    Utils.m4852b(jsonReader);
                }
                return lottieResult;
            } catch (Exception e2) {
                LottieResult<LottieComposition> lottieResult2 = new LottieResult<>(e2);
                if (z) {
                    Utils.m4852b(jsonReader);
                }
                return lottieResult2;
            }
        } catch (Throwable th) {
            if (z) {
                Utils.m4852b(jsonReader);
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: e */
    public static LottieResult<LottieComposition> m4655e(String str, @Nullable String str2) {
        return m4653c(JsonReader.m4786m(Okio.m34602d(Okio.m34607i(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    /* renamed from: f */
    public static LottieResult<LottieComposition> m4656f(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return m4657g(zipInputStream, str);
        } finally {
            Utils.m4852b(zipInputStream);
        }
    }

    @WorkerThread
    /* renamed from: g */
    public static LottieResult<LottieComposition> m4657g(ZipInputStream zipInputStream, @Nullable String str) {
        LottieImageAsset lottieImageAsset;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    lottieComposition = m4654d(JsonReader.m4786m(Okio.m34602d(Okio.m34607i(zipInputStream))), null, false).f7259a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<LottieImageAsset> it = lottieComposition.f7142d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        lottieImageAsset = null;
                        break;
                    }
                    lottieImageAsset = it.next();
                    if (lottieImageAsset.f7227d.equals(str2)) {
                        break;
                    }
                }
                if (lottieImageAsset != null) {
                    lottieImageAsset.f7228e = Utils.m4855e((Bitmap) entry.getValue(), lottieImageAsset.f7224a, lottieImageAsset.f7225b);
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry2 : lottieComposition.f7142d.entrySet()) {
                if (entry2.getValue().f7228e == null) {
                    StringBuilder m24u = C0000a.m24u("There is no image for ");
                    m24u.append(entry2.getValue().f7227d);
                    return new LottieResult<>((Throwable) new IllegalStateException(m24u.toString()));
                }
            }
            if (str != null) {
                LottieCompositionCache lottieCompositionCache = LottieCompositionCache.f7493b;
                Objects.requireNonNull(lottieCompositionCache);
                lottieCompositionCache.f7494a.m1106d(str, lottieComposition);
            }
            return new LottieResult<>(lottieComposition);
        } catch (IOException e2) {
            return new LottieResult<>((Throwable) e2);
        }
    }

    /* renamed from: h */
    public static String m4658h(Context context, @RawRes int i2) {
        StringBuilder m24u = C0000a.m24u("rawRes");
        m24u.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        m24u.append(i2);
        return m24u.toString();
    }
}
