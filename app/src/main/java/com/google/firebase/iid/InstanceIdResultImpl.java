package com.google.firebase.iid;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* loaded from: classes2.dex */
final class InstanceIdResultImpl implements InstanceIdResult {

    /* renamed from: a */
    public final String f23090a;

    public InstanceIdResultImpl(String str, String str2) {
        this.f23090a = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public String getToken() {
        return this.f23090a;
    }
}
