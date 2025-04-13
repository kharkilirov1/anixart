package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.TypefaceCompatBaseImpl;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {

    /* renamed from: b */
    public static Class<?> f3379b = null;

    /* renamed from: c */
    public static Constructor<?> f3380c = null;

    /* renamed from: d */
    public static Method f3381d = null;

    /* renamed from: e */
    public static Method f3382e = null;

    /* renamed from: f */
    public static boolean f3383f = false;

    /* renamed from: h */
    public static boolean m1800h(Object obj, String str, int i2, boolean z) {
        m1801i();
        try {
            return ((Boolean) f3381d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: i */
    public static void m1801i() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3383f) {
            return;
        }
        f3383f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3380c = constructor;
        f3379b = cls;
        f3381d = method2;
        f3382e = method;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* renamed from: a */
    public Typeface mo1802a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        m1801i();
        try {
            Object newInstance = f3380c.newInstance(new Object[0]);
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f3326a) {
                File m1826c = TypefaceCompatUtil.m1826c(context);
                if (m1826c == null) {
                    return null;
                }
                try {
                    if (!TypefaceCompatUtil.m1824a(m1826c, resources, fontFileResourceEntry.f3332f)) {
                        return null;
                    }
                    if (!m1800h(newInstance, m1826c.getPath(), fontFileResourceEntry.f3328b, fontFileResourceEntry.f3329c)) {
                        return null;
                    }
                    m1826c.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m1826c.delete();
                }
            }
            m1801i();
            try {
                Object newInstance2 = Array.newInstance(f3379b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3382e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* renamed from: b */
    public Typeface mo1803b(Context context, CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        File file;
        String readlink;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(((FontsContractCompat.FontInfo) TypefaceCompatBaseImpl.m1820e(fontInfoArr, i2, new TypefaceCompatBaseImpl.C02351(this))).f3496a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface mo1817c = mo1817c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return mo1817c;
                }
                Typeface mo1817c2 = mo1817c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return mo1817c2;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
