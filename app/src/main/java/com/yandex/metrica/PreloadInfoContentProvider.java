package com.yandex.metrica;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3184B2;
import com.yandex.metrica.impl.p023ob.C3271Ee;
import com.yandex.metrica.impl.p023ob.C3296Fe;
import com.yandex.metrica.impl.p023ob.C3485N3;
import com.yandex.metrica.impl.p023ob.C3507O0;
import com.yandex.metrica.impl.p023ob.C3510O3;
import com.yandex.metrica.impl.p023ob.C3962g0;
import com.yandex.metrica.impl.p023ob.C3988h0;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: b */
    public boolean f42254b = false;

    /* renamed from: c */
    public final UriMatcher f42255c = new UriMatcher(-1);

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        C3184B2.m17883b("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f42254b = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            if (this.f42254b) {
                return null;
            }
            if (contentValues != null) {
                int match = this.f42255c.match(uri);
                if (match == 1) {
                    C3988h0 c3988h0 = new C3988h0(new C3271Ee(), new C3296Fe(), new C3507O0(), "preload info");
                    Context context = getContext();
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    if (applicationContext != null) {
                        c3988h0.m19993a(applicationContext, contentValues);
                    }
                } else if (match != 2) {
                    C3184B2.m17883b("Bad content provider uri: %s", uri);
                } else {
                    C3988h0 c3988h02 = new C3988h0(new C3485N3(), new C3510O3(), new C3507O0(), "clids");
                    Context context2 = getContext();
                    Context applicationContext2 = context2 == null ? null : context2.getApplicationContext();
                    if (applicationContext2 != null) {
                        c3988h02.m19993a(applicationContext2, contentValues);
                    }
                }
            }
            C3962g0.m19921a();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String m14k = C0000a.m14k(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f42255c.addURI(m14k, "preloadinfo", 1);
        this.f42255c.addURI(m14k, "clids", 2);
        C3962g0.m19923a(this);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        C3184B2.m17883b("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        C3184B2.m17883b("Updating is not supported", new Object[0]);
        return -1;
    }
}
