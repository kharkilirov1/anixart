package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class TypefaceCompat {

    /* renamed from: a */
    public static final TypefaceCompatBaseImpl f3376a;

    /* renamed from: b */
    public static final LruCache<String, Typeface> f3377b;

    @RestrictTo
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* renamed from: a */
        @Nullable
        public ResourcesCompat.FontCallback f3378a;

        public ResourcesCallbackAdapter(@Nullable ResourcesCompat.FontCallback fontCallback) {
            this.f3378a = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        /* renamed from: a */
        public void mo1798a(int i2) {
            ResourcesCompat.FontCallback fontCallback = this.f3378a;
            if (fontCallback != null) {
                fontCallback.mo795d(i2);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        /* renamed from: b */
        public void mo1799b(@NonNull Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.f3378a;
            if (fontCallback != null) {
                fontCallback.mo796e(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f3376a = new TypefaceCompatApi29Impl();
        } else if (i2 >= 28) {
            f3376a = new TypefaceCompatApi28Impl();
        } else if (i2 >= 26) {
            f3376a = new TypefaceCompatApi26Impl();
        } else {
            if (i2 >= 24) {
                Method method = TypefaceCompatApi24Impl.f3386d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f3376a = new TypefaceCompatApi24Impl();
                }
            }
            f3376a = new TypefaceCompatApi21Impl();
        }
        f3377b = new LruCache<>(16);
    }

    @Nullable
    @RestrictTo
    /* renamed from: a */
    public static Typeface m1794a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        return f3376a.mo1803b(context, cancellationSignal, fontInfoArr, i2);
    }

    @Nullable
    @RestrictTo
    /* renamed from: b */
    public static Typeface m1795b(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, @NonNull Resources resources, int i2, @Nullable String str, int i3, int i4, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z) {
        Typeface mo1802a;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            String str2 = providerResourceEntry.f3336d;
            Typeface typeface = null;
            if (str2 != null && !str2.isEmpty()) {
                Typeface create = Typeface.create(str2, 0);
                Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                if (create != null && !create.equals(create2)) {
                    typeface = create;
                }
            }
            if (typeface != null) {
                if (fontCallback != null) {
                    fontCallback.m1745b(typeface, handler);
                }
                return typeface;
            }
            mo1802a = FontsContractCompat.m1997b(context, providerResourceEntry.f3333a, i4, !z ? fontCallback != null : providerResourceEntry.f3335c != 0, z ? providerResourceEntry.f3334b : -1, ResourcesCompat.FontCallback.m1743c(handler), new ResourcesCallbackAdapter(fontCallback));
        } else {
            mo1802a = f3376a.mo1802a(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i4);
            if (fontCallback != null) {
                if (mo1802a != null) {
                    fontCallback.m1745b(mo1802a, handler);
                } else {
                    fontCallback.m1744a(-3, handler);
                }
            }
        }
        if (mo1802a != null) {
            f3377b.m1106d(m1797d(resources, i2, str, i3, i4), mo1802a);
        }
        return mo1802a;
    }

    @Nullable
    @RestrictTo
    /* renamed from: c */
    public static Typeface m1796c(@NonNull Context context, @NonNull Resources resources, int i2, String str, int i3, int i4) {
        Typeface mo1807d = f3376a.mo1807d(context, resources, i2, str, i4);
        if (mo1807d != null) {
            f3377b.m1106d(m1797d(resources, i2, str, i3, i4), mo1807d);
        }
        return mo1807d;
    }

    /* renamed from: d */
    public static String m1797d(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
