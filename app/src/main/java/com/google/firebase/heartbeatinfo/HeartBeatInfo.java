package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        /* JADX INFO: Fake field, exist only in values array */
        SDK(1),
        GLOBAL(2),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(3);


        /* renamed from: b */
        public final int f23045b;

        HeartBeat(int i2) {
            this.f23045b = i2;
        }
    }

    @NonNull
    /* renamed from: b */
    HeartBeat mo12508b(@NonNull String str);
}
