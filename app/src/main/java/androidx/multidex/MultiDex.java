package androidx.multidex;

import android.content.Context;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MultiDex {

    /* renamed from: a */
    public static final Set<File> f4881a = new HashSet();

    /* renamed from: b */
    public static final boolean f4882b;

    public static final class V14 {

        /* renamed from: a */
        public final ElementConstructor f4883a;

        public interface ElementConstructor {
        }

        public static class ICSElementConstructor implements ElementConstructor {

            /* renamed from: a */
            public final Constructor<?> f4884a;

            public ICSElementConstructor(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f4884a = constructor;
                constructor.setAccessible(true);
            }
        }

        public static class JBMR11ElementConstructor implements ElementConstructor {

            /* renamed from: a */
            public final Constructor<?> f4885a;

            public JBMR11ElementConstructor(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f4885a = constructor;
                constructor.setAccessible(true);
            }
        }

        public static class JBMR2ElementConstructor implements ElementConstructor {

            /* renamed from: a */
            public final Constructor<?> f4886a;

            public JBMR2ElementConstructor(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f4886a = constructor;
                constructor.setAccessible(true);
            }
        }

        public V14() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
            ElementConstructor jBMR2ElementConstructor;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    jBMR2ElementConstructor = new ICSElementConstructor(cls);
                } catch (NoSuchMethodException unused) {
                    jBMR2ElementConstructor = new JBMR11ElementConstructor(cls);
                }
            } catch (NoSuchMethodException unused2) {
                jBMR2ElementConstructor = new JBMR2ElementConstructor(cls);
            }
            this.f4883a = jBMR2ElementConstructor;
        }
    }

    public static final class V19 {
    }

    /* renamed from: androidx.multidex.MultiDex$V4 */
    public static final class C0458V4 {
    }

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder m27x = C0000a.m27x("VM with version ", property);
        m27x.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", m27x.toString());
        f4882b = z;
    }

    /* renamed from: a */
    public static void m3321a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field m3324d = m3324d(obj, str);
        Object[] objArr2 = (Object[]) m3324d.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m3324d.set(obj, objArr3);
    }

    /* renamed from: b */
    public static void m3322b(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder m24u = C0000a.m24u("Clearing old secondary dex dir (");
            m24u.append(file.getPath());
            m24u.append(").");
            Log.i("MultiDex", m24u.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder m24u2 = C0000a.m24u("Failed to list secondary dex dir content (");
                m24u2.append(file.getPath());
                m24u2.append(").");
                Log.w("MultiDex", m24u2.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder m24u3 = C0000a.m24u("Trying to delete old file ");
                m24u3.append(file2.getPath());
                m24u3.append(" of size ");
                m24u3.append(file2.length());
                Log.i("MultiDex", m24u3.toString());
                if (file2.delete()) {
                    StringBuilder m24u4 = C0000a.m24u("Deleted old file ");
                    m24u4.append(file2.getPath());
                    Log.i("MultiDex", m24u4.toString());
                } else {
                    StringBuilder m24u5 = C0000a.m24u("Failed to delete old file ");
                    m24u5.append(file2.getPath());
                    Log.w("MultiDex", m24u5.toString());
                }
            }
            if (file.delete()) {
                StringBuilder m24u6 = C0000a.m24u("Deleted old secondary dex dir ");
                m24u6.append(file.getPath());
                Log.i("MultiDex", m24u6.toString());
            } else {
                StringBuilder m24u7 = C0000a.m24u("Failed to delete secondary dex dir ");
                m24u7.append(file.getPath());
                Log.w("MultiDex", m24u7.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x00cb, DONT_GENERATE, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x000e, B:12:0x0056, B:13:0x005a, B:17:0x006e, B:21:0x007c, B:23:0x0083, B:24:0x0093, B:32:0x00bb, B:34:0x00c2, B:36:0x00c4, B:45:0x00c7, B:46:0x00ca, B:50:0x0087, B:53:0x0075, B:54:0x005f, B:58:0x0066, B:20:0x0070, B:27:0x00a1, B:29:0x00a5, B:41:0x00ac, B:42:0x00c5), top: B:3:0x0003, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3323c(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = androidx.multidex.MultiDex.f4881a
            monitor-enter(r0)
            r1 = r0
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.contains(r7)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcb
            return
        Le:
            r1 = r0
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch: java.lang.Throwable -> Lcb
            r1.add(r7)     // Catch: java.lang.Throwable -> Lcb
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r3.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = "MultiDex is not guaranteed to work in SDK version "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lcb
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = ": SDK version higher than "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            r1 = 20
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = " should be backed by "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "case here: java.vm.version=\""
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lcb
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "\""
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lcb
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.RuntimeException -> L65 java.lang.Throwable -> Lcb
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L5f
            goto L6c
        L5f:
            java.lang.String r3 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            goto L6b
        L65:
            r3 = move-exception
            java.lang.String r4 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r4, r3)     // Catch: java.lang.Throwable -> Lcb
        L6b:
            r3 = r2
        L6c:
            if (r3 != 0) goto L70
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcb
            return
        L70:
            m3322b(r6)     // Catch: java.lang.Throwable -> L74
            goto L7c
        L74:
            r1 = move-exception
            java.lang.String r4 = "MultiDex"
            java.lang.String r5 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
        L7c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = "code_cache"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> Lcb
            m3326f(r1)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lcb
            goto L93
        L87:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lcb
            java.io.File r8 = r6.getFilesDir()     // Catch: java.lang.Throwable -> Lcb
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> Lcb
            m3326f(r1)     // Catch: java.lang.Throwable -> Lcb
        L93:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Lcb
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> Lcb
            m3326f(r8)     // Catch: java.lang.Throwable -> Lcb
            androidx.multidex.MultiDexExtractor r9 = new androidx.multidex.MultiDexExtractor     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lcb
            r7 = 0
            java.util.List r7 = r9.m3332g(r6, r10, r7)     // Catch: java.lang.Throwable -> Lc6
            m3325e(r3, r8, r7)     // Catch: java.io.IOException -> La9 java.lang.Throwable -> Lc6
            goto Lbb
        La9:
            r7 = move-exception
            if (r11 == 0) goto Lc5
            java.lang.String r11 = "MultiDex"
            java.lang.String r1 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r11, r1, r7)     // Catch: java.lang.Throwable -> Lc6
            r7 = 1
            java.util.List r6 = r9.m3332g(r6, r10, r7)     // Catch: java.lang.Throwable -> Lc6
            m3325e(r3, r8, r6)     // Catch: java.lang.Throwable -> Lc6
        Lbb:
            r9.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Lcb
            goto Lc0
        Lbf:
            r2 = move-exception
        Lc0:
            if (r2 != 0) goto Lc4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcb
            return
        Lc4:
            throw r2     // Catch: java.lang.Throwable -> Lcb
        Lc5:
            throw r7     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r6 = move-exception
            r9.close()     // Catch: java.io.IOException -> Lca java.lang.Throwable -> Lcb
        Lca:
            throw r6     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcb
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.m3323c(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: d */
    public static Field m3324d(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder m28y = C0000a.m28y("Field ", str, " not found in ");
        m28y.append(obj.getClass());
        throw new NoSuchFieldException(m28y.toString());
    }

    /* renamed from: e */
    public static void m3325e(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        Object obj = m3324d(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                m3321a(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                    }
                    Field m3324d = m3324d(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) m3324d.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                        arrayList.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    m3324d.set(obj, iOExceptionArr);
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder m28y = C0000a.m28y("Method ", "makeDexElements", " with parameters ");
        m28y.append(Arrays.asList(clsArr));
        m28y.append(" not found in ");
        m28y.append(obj.getClass());
        throw new NoSuchMethodException(m28y.toString());
    }

    /* renamed from: f */
    public static void m3326f(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder m24u = C0000a.m24u("Failed to create dir ");
            m24u.append(file.getPath());
            m24u.append(". Parent file is null.");
            Log.e("MultiDex", m24u.toString());
        } else {
            StringBuilder m24u2 = C0000a.m24u("Failed to create dir ");
            m24u2.append(file.getPath());
            m24u2.append(". parent file is a dir ");
            m24u2.append(parentFile.isDirectory());
            m24u2.append(", a file ");
            m24u2.append(parentFile.isFile());
            m24u2.append(", exists ");
            m24u2.append(parentFile.exists());
            m24u2.append(", readable ");
            m24u2.append(parentFile.canRead());
            m24u2.append(", writable ");
            m24u2.append(parentFile.canWrite());
            Log.e("MultiDex", m24u2.toString());
        }
        StringBuilder m24u3 = C0000a.m24u("Failed to create directory ");
        m24u3.append(file.getPath());
        throw new IOException(m24u3.toString());
    }
}
