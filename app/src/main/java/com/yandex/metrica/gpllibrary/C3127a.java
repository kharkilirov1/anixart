package com.yandex.metrica.gpllibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.yandex.mobile.ads.C4632R;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.gpllibrary.a */
/* loaded from: classes2.dex */
public class C3127a implements InterfaceC3128b {

    /* renamed from: a */
    @NonNull
    public final FusedLocationProviderClient f42464a;

    /* renamed from: b */
    @NonNull
    public final LocationListener f42465b;

    /* renamed from: c */
    @NonNull
    public final LocationCallback f42466c;

    /* renamed from: d */
    @NonNull
    public final Looper f42467d;

    /* renamed from: e */
    @NonNull
    public final Executor f42468e;

    /* renamed from: f */
    public final long f42469f;

    /* renamed from: com.yandex.metrica.gpllibrary.a$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        public final Context f42470a;

        public a(@NonNull Context context) {
            this.f42470a = context;
        }

        @NonNull
        /* renamed from: a */
        public FusedLocationProviderClient m17794a() throws Throwable {
            return new FusedLocationProviderClient(this.f42470a);
        }
    }

    /* renamed from: com.yandex.metrica.gpllibrary.a$b */
    public enum b {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public C3127a(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j2) throws Throwable {
        this.f42464a = new a(context).m17794a();
        this.f42465b = locationListener;
        this.f42467d = looper;
        this.f42468e = executor;
        this.f42469f = j2;
        this.f42466c = new GplLocationCallback(locationListener);
    }

    @Override // com.yandex.metrica.gpllibrary.InterfaceC3128b
    @SuppressLint
    public void startLocationUpdates(@NonNull b bVar) throws Throwable {
        Log.d("[GplLibraryWrapper]", "startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.f42464a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f42469f);
        int ordinal = bVar.ordinal();
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall : 100 : C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu : C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary), this.f42466c, this.f42467d);
    }

    @Override // com.yandex.metrica.gpllibrary.InterfaceC3128b
    public void stopLocationUpdates() throws Throwable {
        Log.d("[GplLibraryWrapper]", "stopLocationUpdates");
        this.f42464a.removeLocationUpdates(this.f42466c);
    }

    @Override // com.yandex.metrica.gpllibrary.InterfaceC3128b
    @SuppressLint
    public void updateLastKnownLocation() throws Throwable {
        Log.d("[GplLibraryWrapper]", "updateLastKnownLocation");
        this.f42464a.getLastLocation().mo9702g(this.f42468e, new GplOnSuccessListener(this.f42465b));
    }
}
