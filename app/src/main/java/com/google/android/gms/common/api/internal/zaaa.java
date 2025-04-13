package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaaa implements zaca {

    /* renamed from: a */
    public final zabe f15441a;

    /* renamed from: b */
    public final zabi f15442b;

    /* renamed from: c */
    public final zabi f15443c;

    /* renamed from: d */
    public final Set<SignInConnectionListener> f15444d;

    /* renamed from: e */
    @Nullable
    public Bundle f15445e;

    /* renamed from: f */
    @Nullable
    public ConnectionResult f15446f;

    /* renamed from: g */
    @Nullable
    public ConnectionResult f15447g;

    /* renamed from: h */
    public boolean f15448h;

    /* renamed from: i */
    public final Lock f15449i;

    /* renamed from: j */
    @GuardedBy
    public int f15450j;

    /* renamed from: d */
    public static boolean m8011d(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m7914n();
    }

    /* renamed from: e */
    public static void m8012e(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        if (!m8011d(zaaaVar.f15446f)) {
            if (zaaaVar.f15446f != null && m8011d(zaaaVar.f15447g)) {
                zaaaVar.f15443c.m8045b();
                ConnectionResult connectionResult2 = zaaaVar.f15446f;
                Objects.requireNonNull(connectionResult2, "null reference");
                zaaaVar.m8013a(connectionResult2);
                return;
            }
            ConnectionResult connectionResult3 = zaaaVar.f15446f;
            if (connectionResult3 == null || (connectionResult = zaaaVar.f15447g) == null) {
                return;
            }
            if (zaaaVar.f15443c.f15513g < zaaaVar.f15442b.f15513g) {
                connectionResult3 = connectionResult;
            }
            zaaaVar.m8013a(connectionResult3);
            return;
        }
        if (m8011d(zaaaVar.f15447g) || zaaaVar.m8015c()) {
            int i2 = zaaaVar.f15450j;
            if (i2 == 1) {
                zaaaVar.m8014b();
            } else {
                if (i2 == 2) {
                    Objects.requireNonNull(zaaaVar.f15441a, "null reference");
                    throw null;
                }
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            }
            zaaaVar.f15450j = 0;
            return;
        }
        ConnectionResult connectionResult4 = zaaaVar.f15447g;
        if (connectionResult4 != null) {
            if (zaaaVar.f15450j == 1) {
                zaaaVar.m8014b();
            } else {
                zaaaVar.m8013a(connectionResult4);
                zaaaVar.f15442b.m8045b();
            }
        }
    }

    @GuardedBy
    /* renamed from: a */
    public final void m8013a(ConnectionResult connectionResult) {
        int i2 = this.f15450j;
        if (i2 == 1) {
            m8014b();
        } else {
            if (i2 == 2) {
                Objects.requireNonNull(this.f15441a);
                throw null;
            }
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        }
        this.f15450j = 0;
    }

    @GuardedBy
    /* renamed from: b */
    public final void m8014b() {
        Iterator<SignInConnectionListener> it = this.f15444d.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.f15444d.clear();
    }

    @GuardedBy
    /* renamed from: c */
    public final boolean m8015c() {
        ConnectionResult connectionResult = this.f15447g;
        return connectionResult != null && connectionResult.f15315c == 4;
    }
}
