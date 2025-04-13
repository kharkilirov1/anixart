package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class LocationManagerCompat {

    /* renamed from: a */
    @GuardedBy
    public static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> f3430a = new WeakHashMap<>();

    @RequiresApi
    public static class Api19Impl {

        /* renamed from: a */
        public static Class<?> f3431a;

        /* renamed from: b */
        public static Method f3432b;

        @DoNotInline
        /* renamed from: a */
        public static boolean m1919a(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (f3431a == null) {
                    f3431a = Class.forName("android.location.LocationRequest");
                }
                if (f3432b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3431a, LocationListener.class, Looper.class);
                    f3432b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest m1931a = locationRequestCompat.m1931a(str);
                if (m1931a != null) {
                    f3432b.invoke(locationManager, m1931a, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @RequiresPermission
        @DoNotInline
        /* renamed from: b */
        public static boolean m1920b(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerTransport locationListenerTransport) {
            LocationRequest m1931a;
            try {
                if (f3431a == null) {
                    f3431a = Class.forName("android.location.LocationRequest");
                }
                if (f3432b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3431a, LocationListener.class, Looper.class);
                    f3432b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                m1931a = locationRequestCompat.m1931a(str);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            if (m1931a == null) {
                return false;
            }
            synchronized (LocationManagerCompat.f3430a) {
                f3432b.invoke(locationManager, m1931a, locationListenerTransport, Looper.getMainLooper());
                Objects.requireNonNull(locationListenerTransport);
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @RequiresPermission
        @DoNotInline
        /* renamed from: a */
        public static boolean m1921a(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            if (!(handler != null)) {
                throw new IllegalArgumentException();
            }
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssLazyLoader.f3436a;
            synchronized (simpleArrayMap) {
                PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap.getOrDefault(callback, null);
                if (preRGnssStatusTransport == null) {
                    preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                } else {
                    preRGnssStatusTransport.f3439b = null;
                }
                Preconditions.m2028a(executor != null, "invalid null executor");
                Preconditions.m2033f(preRGnssStatusTransport.f3439b == null, null);
                preRGnssStatusTransport.f3439b = executor;
                if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                    return false;
                }
                simpleArrayMap.put(callback, preRGnssStatusTransport);
                return true;
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1922b(LocationManager locationManager, Object obj) {
            if (obj instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) obj).f3439b = null;
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m1923a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m1924b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1925c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @RequiresApi
    public static class Api30Impl {

        /* renamed from: a */
        public static Class<?> f3433a;

        /* renamed from: b */
        public static Method f3434b;

        @RequiresPermission
        @DoNotInline
        /* renamed from: a */
        public static void m1926a(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
            android.os.CancellationSignal cancellationSignal2 = cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.m1946b() : null;
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal2, executor, new java.util.function.Consumer() { // from class: androidx.core.location.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Consumer.this.accept((Location) obj);
                }
            });
        }

        @RequiresPermission
        @DoNotInline
        /* renamed from: b */
        public static boolean m1927b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssLazyLoader.f3436a;
            synchronized (simpleArrayMap) {
                GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.getOrDefault(callback, null);
                if (gnssStatusTransport == null) {
                    gnssStatusTransport = new GnssStatusTransport(callback);
                }
                if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                    return false;
                }
                simpleArrayMap.put(callback, gnssStatusTransport);
                return true;
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1928c(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f3433a == null) {
                        f3433a = Class.forName("android.location.LocationRequest");
                    }
                    if (f3434b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f3433a, Executor.class, LocationListener.class);
                        f3434b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest m1931a = locationRequestCompat.m1931a(str);
                    if (m1931a != null) {
                        f3434b.invoke(locationManager, m1931a, executor, locationListenerCompat);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @RequiresApi
    public static class Api31Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1929a(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission
        @DoNotInline
        /* renamed from: b */
        public static void m1930b(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    public static final class CancellableLocationListener implements LocationListener {

        /* renamed from: a */
        @GuardedBy
        public boolean f3435a;

        @Override // android.location.LocationListener
        @RequiresPermission
        public void onLocationChanged(@Nullable Location location) {
            synchronized (this) {
                if (this.f3435a) {
                    return;
                }
                this.f3435a = true;
                throw null;
            }
        }

        @Override // android.location.LocationListener
        @RequiresPermission
        public void onProviderDisabled(@NonNull String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@NonNull String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    public static class GnssLazyLoader {

        /* renamed from: a */
        @GuardedBy
        public static final SimpleArrayMap<Object, Object> f3436a = new SimpleArrayMap<>();
    }

    @RequiresApi
    public static class GnssStatusTransport extends GnssStatus.Callback {

        /* renamed from: a */
        public final GnssStatusCompat.Callback f3437a;

        public GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.m2028a(callback != null, "invalid null callback");
            this.f3437a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i2) {
            Objects.requireNonNull(this.f3437a);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            GnssStatusCompat.Callback callback = this.f3437a;
            new GnssStatusWrapper(gnssStatus);
            Objects.requireNonNull(callback);
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            Objects.requireNonNull(this.f3437a);
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            Objects.requireNonNull(this.f3437a);
        }
    }

    public static class GpsStatusTransport implements GpsStatus.Listener {
        @Override // android.location.GpsStatus.Listener
        @RequiresPermission
        public void onGpsStatusChanged(int i2) {
        }
    }

    public static final class InlineHandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            Looper.myLooper();
            throw null;
        }
    }

    public static class LocationListenerKey {
        public boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            Objects.requireNonNull((LocationListenerKey) obj);
            throw null;
        }

        public int hashCode() {
            return ObjectsCompat.m2023b(null, null);
        }
    }

    public static class LocationListenerTransport implements LocationListener {
        @Override // android.location.LocationListener
        public void onFlushComplete(int i2) {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@NonNull Location location) {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@NonNull List<Location> list) {
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@NonNull String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@NonNull String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    @RequiresApi
    public static class PreRGnssStatusTransport extends GnssStatus.Callback {

        /* renamed from: a */
        public final GnssStatusCompat.Callback f3438a;

        /* renamed from: b */
        @Nullable
        public volatile Executor f3439b;

        public PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.m2028a(callback != null, "invalid null callback");
            this.f3438a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i2) {
            final Executor executor = this.f3439b;
            if (executor == null) {
                return;
            }
            final int i3 = 1;
            executor.execute(new Runnable(this, executor, i2, i3) { // from class: androidx.core.location.b

                /* renamed from: b */
                public final /* synthetic */ Executor f3447b;

                /* renamed from: c */
                public final /* synthetic */ Object f3448c;

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (LocationManagerCompat.PreRGnssStatusTransport) this.f3448c;
                    if (preRGnssStatusTransport.f3439b != this.f3447b) {
                        return;
                    }
                    Objects.requireNonNull(preRGnssStatusTransport.f3438a);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f3439b;
            if (executor == null) {
                return;
            }
            final int i2 = 1;
            executor.execute(new Runnable(this, executor, gnssStatus, i2) { // from class: androidx.core.location.c

                /* renamed from: b */
                public final /* synthetic */ Executor f3449b;

                /* renamed from: c */
                public final /* synthetic */ Object f3450c;

                /* renamed from: d */
                public final /* synthetic */ Object f3451d;

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (LocationManagerCompat.PreRGnssStatusTransport) this.f3450c;
                    Executor executor2 = this.f3449b;
                    GnssStatus gnssStatus2 = (GnssStatus) this.f3451d;
                    if (preRGnssStatusTransport.f3439b != executor2) {
                        return;
                    }
                    GnssStatusCompat.Callback callback = preRGnssStatusTransport.f3438a;
                    new GnssStatusWrapper(gnssStatus2);
                    Objects.requireNonNull(callback);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            Executor executor = this.f3439b;
            if (executor == null) {
                return;
            }
            executor.execute(new RunnableC0242d(this, executor, 1));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            Executor executor = this.f3439b;
            if (executor == null) {
                return;
            }
            executor.execute(new RunnableC0242d(this, executor, 0));
        }
    }
}
