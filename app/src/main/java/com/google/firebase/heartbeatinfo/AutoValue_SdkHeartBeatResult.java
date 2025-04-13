package com.google.firebase.heartbeatinfo;

/* loaded from: classes2.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {
    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    /* renamed from: a */
    public long mo12505a() {
        return 0L;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    /* renamed from: b */
    public String mo12506b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        ((SdkHeartBeatResult) obj).mo12506b();
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=null, millis=0}";
    }
}
