package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;

/* loaded from: classes2.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        /* renamed from: c */
        String mo7339c(T t);
    }

    /* renamed from: a */
    public static Component<?> m12722a(String str, String str2) {
        return Component.m12330c(new AutoValue_LibraryVersion(str, str2), LibraryVersion.class);
    }

    /* renamed from: b */
    public static Component<?> m12723b(final String str, final VersionExtractor<Context> versionExtractor) {
        Component.Builder m12328a = Component.m12328a(LibraryVersion.class);
        m12328a.f22478d = 1;
        m12328a.m12333a(new Dependency(Context.class, 1, 0));
        m12328a.f22479e = new ComponentFactory() { // from class: com.google.firebase.platforminfo.a
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: a */
            public final Object mo12326a(ComponentContainer componentContainer) {
                return new AutoValue_LibraryVersion(str, versionExtractor.mo7339c((Context) componentContainer.get(Context.class)));
            }
        };
        return m12328a.m12334b();
    }
}
