package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class ExtensionRegistryLite {

    /* renamed from: b */
    public static final ExtensionRegistryLite f65645b = new ExtensionRegistryLite(true);

    /* renamed from: a */
    public final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> f65646a;

    public static final class ObjectIntPair {

        /* renamed from: a */
        public final Object f65647a;

        /* renamed from: b */
        public final int f65648b;

        public ObjectIntPair(Object obj, int i2) {
            this.f65647a = obj;
            this.f65648b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f65647a == objectIntPair.f65647a && this.f65648b == objectIntPair.f65648b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f65647a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f65648b;
        }
    }

    public ExtensionRegistryLite() {
        this.f65646a = new HashMap();
    }

    /* renamed from: a */
    public final void m33289a(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f65646a.put(new ObjectIntPair(generatedExtension.f65668a, generatedExtension.f65671d.f65664c), generatedExtension);
    }

    public ExtensionRegistryLite(boolean z) {
        this.f65646a = Collections.emptyMap();
    }
}
