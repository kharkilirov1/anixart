package com.google.firebase.firestore.local;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class IndexBackfiller {

    public class Scheduler implements com.google.firebase.firestore.local.Scheduler {
    }

    static {
        TimeUnit.SECONDS.toMillis(15L);
        TimeUnit.MINUTES.toMillis(1L);
    }
}
