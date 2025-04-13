package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zze implements DynamiteModule.VersionPolicy.IVersions {
    /* JADX WARN: Finally extract failed */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: a */
    public final int mo8294a(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        Field declaredField;
        Throwable th;
        Cursor cursor;
        RemoteException e2;
        int readInt;
        Cursor cursor2;
        DynamiteModule.VersionPolicy versionPolicy = DynamiteModule.f15958b;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = DynamiteModule.f15959c;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String obj = e3.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == null) {
                            if (!DynamiteModule.f15961e) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m8288c = DynamiteModule.m8288c(context, str, z);
                                        String str2 = DynamiteModule.f15960d;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m8296a = zzb.m8296a();
                                            if (m8296a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = DynamiteModule.f15960d;
                                                    Objects.requireNonNull(str3, "null reference");
                                                    m8296a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = DynamiteModule.f15960d;
                                                    Objects.requireNonNull(str4, "null reference");
                                                    m8296a = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            DynamiteModule.m8290e(m8296a);
                                            declaredField.set(null, m8296a);
                                            DynamiteModule.f15959c = bool2;
                                            return m8288c;
                                        }
                                        return m8288c;
                                    } catch (DynamiteModule.LoadingException unused) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                DynamiteModule.m8290e(classLoader);
                            } catch (DynamiteModule.LoadingException unused2) {
                            }
                            bool = Boolean.TRUE;
                        }
                        DynamiteModule.f15959c = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return DynamiteModule.m8288c(context, str, z);
                    } catch (DynamiteModule.LoadingException e4) {
                        String valueOf = String.valueOf(e4.getMessage());
                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                zzq m8292g = DynamiteModule.m8292g(context);
                try {
                    if (m8292g == null) {
                        return 0;
                    }
                    try {
                        Parcel m8542i = m8292g.m8542i(6, m8292g.m8543q());
                        int readInt2 = m8542i.readInt();
                        m8542i.recycle();
                        if (readInt2 >= 3) {
                            zzn zznVar = DynamiteModule.f15963g.get();
                            if (zznVar != null && (cursor2 = zznVar.f15974a) != null) {
                                return cursor2.getInt(0);
                            }
                            cursor = (Cursor) ObjectWrapper.m8284t(m8292g.m8300G2(new ObjectWrapper(context), str, z, DynamiteModule.f15964h.get().longValue()));
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        readInt = cursor.getInt(0);
                                        r2 = (readInt <= 0 || !DynamiteModule.m8291f(cursor)) ? cursor : null;
                                        if (r2 != null) {
                                            r2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    r2 = cursor;
                                    String valueOf2 = String.valueOf(e2.getMessage());
                                    Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                    if (r2 == null) {
                                        return 0;
                                    }
                                    r2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            Parcel m8543q = m8292g.m8543q();
                            com.google.android.gms.internal.common.zzc.m8559b(m8543q, objectWrapper);
                            m8543q.writeString(str);
                            m8543q.writeInt(z ? 1 : 0);
                            Parcel m8542i2 = m8292g.m8542i(5, m8543q);
                            readInt = m8542i2.readInt();
                            m8542i2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel m8543q2 = m8292g.m8543q();
                            com.google.android.gms.internal.common.zzc.m8559b(m8543q2, objectWrapper2);
                            m8543q2.writeString(str);
                            m8543q2.writeInt(z ? 1 : 0);
                            Parcel m8542i3 = m8292g.m8542i(3, m8543q2);
                            readInt = m8542i3.readInt();
                            m8542i3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            }
        } catch (Throwable th4) {
            try {
                Objects.requireNonNull(context, "null reference");
            } catch (Exception e7) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
            }
            throw th4;
        }
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: b */
    public final int mo8295b(Context context, String str) {
        return DynamiteModule.m8286a(context, str);
    }
}
