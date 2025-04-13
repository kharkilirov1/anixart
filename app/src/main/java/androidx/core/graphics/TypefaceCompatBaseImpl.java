package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes.dex */
public class TypefaceCompatBaseImpl {

    /* renamed from: a */
    @SuppressLint
    public ConcurrentHashMap<Long, FontResourcesParserCompat.FontFamilyFilesResourceEntry> f3395a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$1 */
    public class C02351 implements StyleExtractor<FontsContractCompat.FontInfo> {
        public C02351(TypefaceCompatBaseImpl typefaceCompatBaseImpl) {
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* renamed from: a */
        public int mo1822a(FontsContractCompat.FontInfo fontInfo) {
            return fontInfo.f3498c;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* renamed from: b */
        public boolean mo1823b(FontsContractCompat.FontInfo fontInfo) {
            return fontInfo.f3499d;
        }
    }

    public interface StyleExtractor<T> {
        /* renamed from: a */
        int mo1822a(T t);

        /* renamed from: b */
        boolean mo1823b(T t);
    }

    /* renamed from: e */
    public static <T> T m1820e(T[] tArr, int i2, StyleExtractor<T> styleExtractor) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(styleExtractor.mo1822a(t2) - i3) * 2) + (styleExtractor.mo1823b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    /* renamed from: g */
    public static long m1821g(@Nullable Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    @Nullable
    /* renamed from: a */
    public Typeface mo1802a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = (FontResourcesParserCompat.FontFileResourceEntry) m1820e(fontFamilyFilesResourceEntry.f3326a, i2, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>(this) { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: a */
            public int mo1822a(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry2) {
                return fontFileResourceEntry2.f3328b;
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* renamed from: b */
            public boolean mo1823b(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry2) {
                return fontFileResourceEntry2.f3329c;
            }
        });
        if (fontFileResourceEntry == null) {
            return null;
        }
        Typeface m1796c = TypefaceCompat.m1796c(context, resources, fontFileResourceEntry.f3332f, fontFileResourceEntry.f3327a, 0, i2);
        long m1821g = m1821g(m1796c);
        if (m1821g != 0) {
            this.f3395a.put(Long.valueOf(m1821g), fontFamilyFilesResourceEntry);
        }
        return m1796c;
    }

    @Nullable
    /* renamed from: b */
    public Typeface mo1803b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo1818f(fontInfoArr, i2).f3496a);
            try {
                Typeface mo1817c = mo1817c(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return mo1817c;
            } catch (IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public Typeface mo1817c(Context context, InputStream inputStream) {
        File m1826c = TypefaceCompatUtil.m1826c(context);
        if (m1826c == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.m1825b(m1826c, inputStream)) {
                return Typeface.createFromFile(m1826c.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1826c.delete();
        }
    }

    @Nullable
    /* renamed from: d */
    public Typeface mo1807d(Context context, Resources resources, int i2, String str, int i3) {
        File m1826c = TypefaceCompatUtil.m1826c(context);
        if (m1826c == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.m1824a(m1826c, resources, i2)) {
                return Typeface.createFromFile(m1826c.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1826c.delete();
        }
    }

    /* renamed from: f */
    public FontsContractCompat.FontInfo mo1818f(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        return (FontsContractCompat.FontInfo) m1820e(fontInfoArr, i2, new C02351(this));
    }
}
