package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class AbstractComponentContainer implements ComponentContainer {
    @Override // com.google.firebase.components.ComponentContainer
    /* renamed from: c */
    public <T> Set<T> mo12327c(Class<T> cls) {
        return mo12338b(cls).get();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        Provider<T> mo12337a = mo12337a(cls);
        if (mo12337a == null) {
            return null;
        }
        return mo12337a.get();
    }
}
