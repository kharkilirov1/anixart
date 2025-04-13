package com.google.firebase.platforminfo;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p027e.C6281a;

/* loaded from: classes2.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* renamed from: a */
    public final String f23454a;

    /* renamed from: b */
    public final GlobalLibraryVersionRegistrar f23455b;

    public DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f23454a = m12720d(set);
        this.f23455b = globalLibraryVersionRegistrar;
    }

    /* renamed from: b */
    public static UserAgentPublisher m12718b(ComponentContainer componentContainer) {
        Set mo12327c = componentContainer.mo12327c(LibraryVersion.class);
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.f23456b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.f23456b;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                    GlobalLibraryVersionRegistrar.f23456b = globalLibraryVersionRegistrar;
                }
            }
        }
        return new DefaultUserAgentPublisher(mo12327c, globalLibraryVersionRegistrar);
    }

    /* renamed from: c */
    public static Component<UserAgentPublisher> m12719c() {
        Component.Builder m12328a = Component.m12328a(UserAgentPublisher.class);
        m12328a.m12333a(new Dependency(LibraryVersion.class, 2, 0));
        m12328a.f22479e = C6281a.f58015g;
        return m12328a.m12334b();
    }

    /* renamed from: d */
    public static String m12720d(Set<LibraryVersion> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb.append(next.mo12716a());
            sb.append(JsonPointer.SEPARATOR);
            sb.append(next.mo12717b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    /* renamed from: a */
    public String mo12721a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = this.f23455b;
        synchronized (globalLibraryVersionRegistrar.f23457a) {
            unmodifiableSet = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f23457a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f23454a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23454a);
        sb.append(' ');
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = this.f23455b;
        synchronized (globalLibraryVersionRegistrar2.f23457a) {
            unmodifiableSet2 = Collections.unmodifiableSet(globalLibraryVersionRegistrar2.f23457a);
        }
        sb.append(m12720d(unmodifiableSet2));
        return sb.toString();
    }
}
