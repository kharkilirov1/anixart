package com.google.firebase.components;

import java.util.List;

/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: b */
    public final List<Component<?>> f22502b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Dependency cycle detected: "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.lang.Object[] r1 = r3.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.f22502b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }
}
