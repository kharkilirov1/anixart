package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.TypefaceCompatBaseImpl;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {

    /* renamed from: g */
    public final Class<?> f3388g;

    /* renamed from: h */
    public final Constructor<?> f3389h;

    /* renamed from: i */
    public final Method f3390i;

    /* renamed from: j */
    public final Method f3391j;

    /* renamed from: k */
    public final Method f3392k;

    /* renamed from: l */
    public final Method f3393l;

    /* renamed from: m */
    public final Method f3394m;

    public TypefaceCompatApi26Impl() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m1813p(cls2);
            method4 = m1814q(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = mo1815r(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder m24u = C0000a.m24u("Unable to collect necessary methods for class ");
            m24u.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", m24u.toString(), e2);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3388g = cls;
        this.f3389h = constructor;
        this.f3390i = method3;
        this.f3391j = method4;
        this.f3392k = method5;
        this.f3393l = method2;
        this.f3394m = method;
    }

    @Nullable
    /* renamed from: o */
    private Object m1806o() {
        try {
            return this.f3389h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    /* renamed from: a */
    public Typeface mo1802a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        if (!m1812n()) {
            return super.mo1802a(context, fontFamilyFilesResourceEntry, resources, i2);
        }
        Object m1806o = m1806o();
        if (m1806o == null) {
            return null;
        }
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f3326a) {
            if (!m1809k(context, m1806o, fontFileResourceEntry.f3327a, fontFileResourceEntry.f3331e, fontFileResourceEntry.f3328b, fontFileResourceEntry.f3329c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.f3330d))) {
                m1808j(m1806o);
                return null;
            }
        }
        if (m1811m(m1806o)) {
            return mo1810l(m1806o);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    /* renamed from: b */
    public Typeface mo1803b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface mo1810l;
        boolean z;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (!m1812n()) {
            FontsContractCompat.FontInfo fontInfo = (FontsContractCompat.FontInfo) TypefaceCompatBaseImpl.m1820e(fontInfoArr, i2, new TypefaceCompatBaseImpl.C02351(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(fontInfo.f3496a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(fontInfo.f3498c).setItalic(fontInfo.f3499d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (FontsContractCompat.FontInfo fontInfo2 : fontInfoArr) {
            if (fontInfo2.f3500e == 0) {
                Uri uri = fontInfo2.f3496a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, TypefaceCompatUtil.m1827d(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m1806o = m1806o();
        if (m1806o == null) {
            return null;
        }
        boolean z2 = false;
        for (FontsContractCompat.FontInfo fontInfo3 : fontInfoArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(fontInfo3.f3496a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.f3391j.invoke(m1806o, byteBuffer, Integer.valueOf(fontInfo3.f3497b), null, Integer.valueOf(fontInfo3.f3498c), Integer.valueOf(fontInfo3.f3499d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    m1808j(m1806o);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            m1808j(m1806o);
            return null;
        }
        if (m1811m(m1806o) && (mo1810l = mo1810l(m1806o)) != null) {
            return Typeface.create(mo1810l, i2);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    /* renamed from: d */
    public Typeface mo1807d(Context context, Resources resources, int i2, String str, int i3) {
        if (!m1812n()) {
            return super.mo1807d(context, resources, i2, str, i3);
        }
        Object m1806o = m1806o();
        if (m1806o == null) {
            return null;
        }
        if (!m1809k(context, m1806o, str, 0, -1, -1, null)) {
            m1808j(m1806o);
            return null;
        }
        if (m1811m(m1806o)) {
            return mo1810l(m1806o);
        }
        return null;
    }

    /* renamed from: j */
    public final void m1808j(Object obj) {
        try {
            this.f3393l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: k */
    public final boolean m1809k(Context context, Object obj, String str, int i2, int i3, int i4, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3390i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Nullable
    /* renamed from: l */
    public Typeface mo1810l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3388g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3394m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final boolean m1811m(Object obj) {
        try {
            return ((Boolean) this.f3392k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m1812n() {
        if (this.f3390i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3390i != null;
    }

    /* renamed from: p */
    public Method m1813p(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: q */
    public Method m1814q(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: r */
    public Method mo1815r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
