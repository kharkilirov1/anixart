package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* loaded from: classes2.dex */
public interface ComponentContainer {
    /* renamed from: a */
    <T> Provider<T> mo12337a(Class<T> cls);

    /* renamed from: b */
    <T> Provider<Set<T>> mo12338b(Class<T> cls);

    /* renamed from: c */
    <T> Set<T> mo12327c(Class<T> cls);

    /* renamed from: d */
    <T> Deferred<T> mo12339d(Class<T> cls);

    <T> T get(Class<T> cls);
}
