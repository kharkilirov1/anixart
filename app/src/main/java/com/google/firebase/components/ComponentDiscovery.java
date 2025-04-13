package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ComponentDiscovery<T> {

    /* renamed from: a */
    public final T f22481a;

    /* renamed from: b */
    public final RegistrarNameRetriever<T> f22482b;

    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f22483a;

        public MetadataRegistrarNameRetriever(Class cls, C20561 c20561) {
            this.f22483a = cls;
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        /* renamed from: a */
        public List mo12342a(Context context) {
            Context context2 = context;
            Bundle bundle = null;
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context2, this.f22483a), 128);
                    if (serviceInfo == null) {
                        Log.w("ComponentDiscovery", this.f22483a + " has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
            }
            if (bundle == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    public interface RegistrarNameRetriever<T> {
        /* renamed from: a */
        List<String> mo12342a(T t);
    }

    @VisibleForTesting
    public ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.f22481a = t;
        this.f22482b = registrarNameRetriever;
    }

    /* renamed from: b */
    public static ComponentDiscovery<Context> m12340b(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls, null));
    }

    /* renamed from: a */
    public List<Provider<ComponentRegistrar>> m12341a() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f22482b.mo12342a(this.f22481a).iterator();
        while (it.hasNext()) {
            arrayList.add(new C2061b(it.next(), 0));
        }
        return arrayList;
    }
}
