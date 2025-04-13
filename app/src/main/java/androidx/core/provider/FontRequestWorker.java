package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.RequestExecutor;
import androidx.core.util.Consumer;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class FontRequestWorker {

    /* renamed from: a */
    public static final LruCache<String, Typeface> f3478a = new LruCache<>(16);

    /* renamed from: b */
    public static final ExecutorService f3479b;

    /* renamed from: c */
    public static final Object f3480c;

    /* renamed from: d */
    @GuardedBy
    public static final SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> f3481d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new RequestExecutor.DefaultThreadFactory("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3479b = threadPoolExecutor;
        f3480c = new Object();
        f3481d = new SimpleArrayMap<>();
    }

    @NonNull
    /* renamed from: a */
    public static TypefaceResult m1995a(@NonNull String str, @NonNull Context context, @NonNull FontRequest fontRequest, int i2) {
        int i3;
        Typeface m1105c = f3478a.m1105c(str);
        if (m1105c != null) {
            return new TypefaceResult(m1105c);
        }
        try {
            FontsContractCompat.FontFamilyResult m1993a = FontProvider.m1993a(context, fontRequest, null);
            int i4 = m1993a.f3494a;
            int i5 = 1;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                }
                i3 = -3;
            } else {
                FontsContractCompat.FontInfo[] fontInfoArr = m1993a.f3495b;
                if (fontInfoArr != null && fontInfoArr.length != 0) {
                    for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                        int i6 = fontInfo.f3500e;
                        if (i6 != 0) {
                            if (i6 >= 0) {
                                i3 = i6;
                            }
                            i3 = -3;
                        }
                    }
                    i5 = 0;
                }
                i3 = i5;
            }
            if (i3 != 0) {
                return new TypefaceResult(i3);
            }
            Typeface m1794a = TypefaceCompat.m1794a(context, null, m1993a.f3495b, i2);
            if (m1794a == null) {
                return new TypefaceResult(-3);
            }
            f3478a.m1106d(str, m1794a);
            return new TypefaceResult(m1794a);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        }
    }

    public static final class TypefaceResult {

        /* renamed from: a */
        public final Typeface f3492a;

        /* renamed from: b */
        public final int f3493b;

        public TypefaceResult(int i2) {
            this.f3492a = null;
            this.f3493b = i2;
        }

        @SuppressLint
        public TypefaceResult(@NonNull Typeface typeface) {
            this.f3492a = typeface;
            this.f3493b = 0;
        }
    }
}
