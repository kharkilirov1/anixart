package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p027e.C6281a;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    public static String m12221a(String str) {
        return str.replace(' ', '_').replace(JsonPointer.SEPARATOR, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.m12719c());
        int i2 = DefaultHeartBeatController.f23036f;
        Component.Builder m12329b = Component.m12329b(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class);
        m12329b.m12333a(new Dependency(Context.class, 1, 0));
        m12329b.m12333a(new Dependency(FirebaseApp.class, 1, 0));
        m12329b.m12333a(new Dependency(HeartBeatConsumer.class, 2, 0));
        m12329b.m12333a(new Dependency(UserAgentPublisher.class, 1, 1));
        m12329b.m12335c(C6281a.f58012d);
        arrayList.add(m12329b.m12334b());
        arrayList.add(LibraryVersionComponent.m12722a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.m12722a("fire-core", "20.1.1"));
        arrayList.add(LibraryVersionComponent.m12722a("device-name", m12221a(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.m12722a("device-model", m12221a(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.m12722a("device-brand", m12221a(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.m12723b("android-target-sdk", C1136a.f14042i));
        arrayList.add(LibraryVersionComponent.m12723b("android-min-sdk", C1136a.f14043j));
        arrayList.add(LibraryVersionComponent.m12723b("android-platform", C1136a.f14044k));
        arrayList.add(LibraryVersionComponent.m12723b("android-installer", C1136a.f14045l));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(LibraryVersionComponent.m12722a("kotlin", str));
        }
        return arrayList;
    }
}
