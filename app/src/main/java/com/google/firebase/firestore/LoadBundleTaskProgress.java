package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class LoadBundleTaskProgress {

    /* renamed from: a */
    public final int f22652a;

    /* renamed from: b */
    public final int f22653b;

    /* renamed from: c */
    public final long f22654c;

    /* renamed from: d */
    public final long f22655d;

    /* renamed from: e */
    @NonNull
    public final TaskState f22656e;

    /* renamed from: f */
    @Nullable
    public final Exception f22657f;

    public enum TaskState {
        /* JADX INFO: Fake field, exist only in values array */
        ERROR,
        /* JADX INFO: Fake field, exist only in values array */
        RUNNING,
        SUCCESS
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LoadBundleTaskProgress.class != obj.getClass()) {
            return false;
        }
        LoadBundleTaskProgress loadBundleTaskProgress = (LoadBundleTaskProgress) obj;
        if (this.f22652a != loadBundleTaskProgress.f22652a || this.f22653b != loadBundleTaskProgress.f22653b || this.f22654c != loadBundleTaskProgress.f22654c || this.f22655d != loadBundleTaskProgress.f22655d || this.f22656e != loadBundleTaskProgress.f22656e) {
            return false;
        }
        Exception exc = this.f22657f;
        Exception exc2 = loadBundleTaskProgress.f22657f;
        return exc != null ? exc.equals(exc2) : exc2 == null;
    }

    public int hashCode() {
        int i2 = ((this.f22652a * 31) + this.f22653b) * 31;
        long j2 = this.f22654c;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f22655d;
        int hashCode = (this.f22656e.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        Exception exc = this.f22657f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
