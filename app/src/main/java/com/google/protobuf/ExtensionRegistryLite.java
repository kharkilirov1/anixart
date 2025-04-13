package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public class ExtensionRegistryLite {

    /* renamed from: b */
    public static volatile ExtensionRegistryLite f24114b;

    /* renamed from: c */
    public static final ExtensionRegistryLite f24115c = new ExtensionRegistryLite(true);

    /* renamed from: a */
    public final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> f24116a;

    public static class ExtensionClassHolder {
        static {
            try {
                Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static final class ObjectIntPair {

        /* renamed from: a */
        public final Object f24117a;

        /* renamed from: b */
        public final int f24118b;

        public ObjectIntPair(Object obj, int i2) {
            this.f24117a = obj;
            this.f24118b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f24117a == objectIntPair.f24117a && this.f24118b == objectIntPair.f24118b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f24117a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f24118b;
        }
    }

    public ExtensionRegistryLite() {
        this.f24116a = new HashMap();
    }

    /* renamed from: a */
    public static ExtensionRegistryLite m13368a() {
        ExtensionRegistryLite extensionRegistryLite = f24114b;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                extensionRegistryLite = f24114b;
                if (extensionRegistryLite == null) {
                    Class<?> cls = ExtensionRegistryFactory.f24113a;
                    ExtensionRegistryLite extensionRegistryLite2 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite2 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (extensionRegistryLite2 == null) {
                        extensionRegistryLite2 = f24115c;
                    }
                    f24114b = extensionRegistryLite2;
                    extensionRegistryLite = extensionRegistryLite2;
                }
            }
        }
        return extensionRegistryLite;
    }

    public ExtensionRegistryLite(boolean z) {
        this.f24116a = Collections.emptyMap();
    }
}
