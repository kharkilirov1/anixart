package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream.StreamCallback;

/* loaded from: classes2.dex */
public interface Stream<CallbackType extends StreamCallback> {

    public enum State {
        Initial,
        /* JADX INFO: Fake field, exist only in values array */
        Starting,
        Open,
        /* JADX INFO: Fake field, exist only in values array */
        Healthy,
        Error,
        Backoff
    }

    public interface StreamCallback {
    }
}
