package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    /* renamed from: a */
    public abstract long mo12505a();

    /* renamed from: b */
    public abstract String mo12506b();

    @Override // java.lang.Comparable
    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        return mo12505a() < sdkHeartBeatResult.mo12505a() ? -1 : 1;
    }
}
