package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: c */
    @Nullable
    @GuardedBy
    public static Boolean f15959c = null;

    /* renamed from: d */
    @Nullable
    @GuardedBy
    public static String f15960d = null;

    /* renamed from: e */
    @GuardedBy
    public static boolean f15961e = false;

    /* renamed from: f */
    @GuardedBy
    public static int f15962f = -1;

    /* renamed from: j */
    @Nullable
    @GuardedBy
    public static zzq f15966j;

    /* renamed from: k */
    @Nullable
    @GuardedBy
    public static zzr f15967k;

    /* renamed from: a */
    public final Context f15968a;

    /* renamed from: g */
    public static final ThreadLocal<zzn> f15963g = new ThreadLocal<>();

    /* renamed from: h */
    public static final ThreadLocal<Long> f15964h = new zzd();

    /* renamed from: i */
    public static final VersionPolicy.IVersions f15965i = new zze();

    /* renamed from: b */
    @NonNull
    @KeepForSdk
    public static final VersionPolicy f15958b = new zzj();

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        @GuardedBy
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public interface IVersions {
            /* renamed from: a */
            int mo8294a(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo8295b(@NonNull Context context, @NonNull String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        public static class SelectionResult {

            /* renamed from: a */
            @KeepForSdk
            public int f15969a = 0;

            /* renamed from: b */
            @KeepForSdk
            public int f15970b = 0;

            /* renamed from: c */
            @KeepForSdk
            public int f15971c = 0;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        SelectionResult mo8293a(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.f15968a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m8286a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.Objects.m8123a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x028c A[Catch: all -> 0x032b, TryCatch #8 {all -> 0x032b, blocks: (B:3:0x0023, B:7:0x007d, B:12:0x0085, B:15:0x008b, B:30:0x00ad, B:141:0x0251, B:142:0x025e, B:143:0x0265, B:147:0x0257, B:153:0x027a, B:155:0x028c, B:156:0x0297, B:158:0x029e, B:160:0x02ae, B:170:0x02d4, B:171:0x02db, B:172:0x0291, B:135:0x0269, B:131:0x026d, B:132:0x0274, B:27:0x02dc, B:28:0x02f4, B:175:0x02f5, B:176:0x032a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0291 A[Catch: all -> 0x032b, TryCatch #8 {all -> 0x032b, blocks: (B:3:0x0023, B:7:0x007d, B:12:0x0085, B:15:0x008b, B:30:0x00ad, B:141:0x0251, B:142:0x025e, B:143:0x0265, B:147:0x0257, B:153:0x027a, B:155:0x028c, B:156:0x0297, B:158:0x029e, B:160:0x02ae, B:170:0x02d4, B:171:0x02db, B:172:0x0291, B:135:0x0269, B:131:0x026d, B:132:0x0274, B:27:0x02dc, B:28:0x02f4, B:175:0x02f5, B:176:0x032a), top: B:2:0x0023 }] */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule m8287b(@androidx.annotation.NonNull android.content.Context r19, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r20, @androidx.annotation.NonNull java.lang.String r21) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8287b(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (m8291f(r10) != false) goto L33;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m8288c(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f15964h     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r12.<init>()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            if (r10 == 0) goto La2
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r11 == 0) goto La2
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r12 <= 0) goto L8d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.dynamite.DynamiteModule.f15960d = r2     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.dynamite.DynamiteModule.f15962f = r2     // Catch: java.lang.Throwable -> L8a
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.f15961e = r9     // Catch: java.lang.Throwable -> L8a
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            boolean r1 = m8291f(r10)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            if (r1 == 0) goto L8d
            goto L8e
        L8a:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r11     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
        L8d:
            r0 = r10
        L8e:
            if (r11 != 0) goto L96
            if (r0 == 0) goto L95
            r0.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La0
        L9e:
            r10 = move-exception
            goto Lc6
        La0:
            r10 = move-exception
            goto Lb8
        La2:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
            throw r11     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb5
        Lb1:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto Lc6
        Lb5:
            r11 = move-exception
            r0 = r10
            r10 = r11
        Lb8:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto Lbe
            throw r10     // Catch: java.lang.Throwable -> L9e
        Lbe:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        Lc6:
            if (r0 == 0) goto Lcb
            r0.close()
        Lcb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8288c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: d */
    public static DynamiteModule m8289d(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy
    /* renamed from: e */
    public static void m8290e(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzr(iBinder);
            }
            f15967k = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    /* renamed from: f */
    public static boolean m8291f(Cursor cursor) {
        zzn zznVar = f15963g.get();
        if (zznVar == null || zznVar.f15974a != null) {
            return false;
        }
        zznVar.f15974a = cursor;
        return true;
    }

    @Nullable
    /* renamed from: g */
    public static zzq m8292g(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f15966j;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    f15966j = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }
}
